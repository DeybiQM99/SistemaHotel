package VistaHotel;

import ConexionBaseDeDatos.ConexionBD;
import GestionReservas.Factura;
import GestionReservas.FacturaDAO;
import GestionReservas.GestorFacturas;
import GestionReservas.Pago;
import GestionReservas.PagoDAO;
import Interfaz.Bloqueable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import java.awt.Color;
import java.math.BigDecimal;

public class Factura_1 extends javax.swing.JFrame implements Bloqueable {

    public Factura_1() {
        initComponents();
         bloquearCampos();
        this.setLocationRelativeTo(null);
        inicializarMetodosPago();        // Llenar el ComboBox
    }
    @Override
    public void bloquearCampos() {
        TxtFa_Nombre.setEditable(false);
        TxtFa_DNI.setEditable(false);
        TxtFa_Telefono.setEditable(false);
        TxtFa_Correo.setEditable(false);
        TxtFa_ReservaID.setEditable(false);
        TxtFa_Entrada.setEditable(false);
        TxtFa_FechaReserva.setEditable(false);
        TxtFa_Salida.setEditable(false);
        TxtFa_Nhab.setEditable(false);
        TxtFa_Tipo.setEditable(false);
        TxtFa_Precio.setEditable(false); 
        TxtFa_SubTotal.setEditable(false); 
        TxtFa_IGV.setEditable(false); 
        TxtFa_Total.setEditable(false); 
    }
    
    private void inicializarMetodosPago() {
        CboFa_MetodoPago.addItem("Efectivo");
        CboFa_MetodoPago.addItem("Tarjeta");
        CboFa_MetodoPago.addItem("Transferencia");
    }

    private void cargarServicios(int idReserva) {
        DefaultTableModel modelo = (DefaultTableModel) Jt_ServiciosAdicionales.getModel();
        modelo.setRowCount(0);

        String sql = """
SELECT p.nombre AS nombre_servicio, dv.cantidad, (dv.precio_unitario * dv.cantidad) AS subtotal
FROM Ventas v
JOIN Detalle_Venta dv ON v.id_venta = dv.id_venta
JOIN Productos p ON dv.id_producto = p.id_producto
WHERE v.id_reserva = ?
""";

        try (Connection conn = ConexionBaseDeDatos.ConexionBD.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idReserva);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Object[] fila = {
                    rs.getString("nombre_servicio"),
                    rs.getInt("cantidad"),
                    rs.getBigDecimal("subtotal")
                };
                modelo.addRow(fila);
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar servicios.");
        }
    }

    private void calcularFactura(int idReserva) {
        try (Connection conn = ConexionBaseDeDatos.ConexionBD.conectar()) {
            GestorFacturas gestor = new GestorFacturas(conn);
            double subtotal = gestor.calcularSubtotal(idReserva);
            double igv = gestor.calcularIGV(subtotal);
            double total = gestor.calcularTotal(subtotal, igv);

            TxtFa_SubTotal.setText(String.format("%.2f", subtotal));
            TxtFa_IGV.setText(String.format("%.2f", igv));
            TxtFa_Total.setText(String.format("%.2f", total));

            Factura factura = new Factura(idReserva, BigDecimal.valueOf(subtotal), BigDecimal.valueOf(igv), BigDecimal.valueOf(total));
            FacturaDAO facturaDAO = new FacturaDAO(conn);

            if (facturaDAO.obtenerFacturaPorReserva(idReserva) == null) {
                facturaDAO.registrarFactura(factura);
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al calcular factura.");
        }
    }

    //Liberar Habitacion
    private void liberarHabitacion(int idReserva) {
    String sql = """
        UPDATE Habitaciones
        SET estado = 'libre'
        WHERE id_habitacion = (
            SELECT id_habitacion
            FROM Reservas
            WHERE id_reserva = ?
        )
    """;

    try (Connection conn = ConexionBaseDeDatos.ConexionBD.conectar();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setInt(1, idReserva);
        int filasActualizadas = ps.executeUpdate();
        if (filasActualizadas > 0) {
            System.out.println("Habitación liberada correctamente.");
        } else {
            System.out.println("No se pudo liberar la habitación.");
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al liberar habitación.");
    }
}
    
    public void generarPDF(int idReserva) {
        try {
            Document doc = new Document(PageSize.A4, 50, 50, 50, 50);
            String nombreArchivo = "Factura_Reserva_" + idReserva + ".pdf";
            PdfWriter.getInstance(doc, new FileOutputStream(nombreArchivo));
            doc.open();

            // Fuente personalizada
            Font tituloFont = new Font(Font.HELVETICA, 20, Font.BOLD);
            Font seccionFont = new Font(Font.HELVETICA, 14, Font.BOLD);
            Font normalFont = new Font(Font.HELVETICA, 12);
            Font negrita = new Font(Font.HELVETICA, 12, Font.BOLD);

            // Título centrado
            Paragraph titulo = new Paragraph("FACTURA DE RESERVA", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);
            doc.add(titulo);
            doc.add(Chunk.NEWLINE);

            // Datos cliente
            doc.add(new Paragraph("Datos del Cliente:", seccionFont));
            doc.add(new Paragraph("ID Reserva: " + TxtFa_ReservaID.getText(), normalFont));
            doc.add(new Paragraph("Nombre: " + TxtFa_Nombre.getText(), normalFont));
            doc.add(new Paragraph("DNI/Pasaporte: " + TxtFa_DNI.getText(), normalFont));
            doc.add(new Paragraph("Teléfono: " + TxtFa_Telefono.getText(), normalFont));
            doc.add(new Paragraph("Correo: " + TxtFa_Correo.getText(), normalFont));
            doc.add(new Paragraph("Fecha de Reserva: " + TxtFa_FechaReserva.getText(), normalFont));
            doc.add(Chunk.NEWLINE);

            // Datos habitación
            doc.add(new Paragraph("Datos de la Habitación:", seccionFont));
            doc.add(new Paragraph("N° Habitación: " + TxtFa_Nhab.getText(), normalFont));
            doc.add(new Paragraph("Tipo: " + TxtFa_Tipo.getText(), normalFont));
            doc.add(new Paragraph("Precio por noche: S/ " + TxtFa_Precio.getText(), normalFont));
            doc.add(new Paragraph("Entrada: " + TxtFa_Entrada.getText(), normalFont));
            doc.add(new Paragraph("Salida: " + TxtFa_Salida.getText(), normalFont));
            doc.add(Chunk.NEWLINE);

            // Tabla servicios adicionales
            doc.add(new Paragraph("Servicios Adicionales:", seccionFont));
            PdfPTable tabla = new PdfPTable(3);
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(10f);
            tabla.setSpacingAfter(10f);

            // Cabeceras
            String[] headers = {"Producto", "Cantidad", "SubTotal"};
            for (String h : headers) {
                PdfPCell cell = new PdfPCell(new Phrase(h, negrita));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setBackgroundColor(new Color(230, 230, 250));
                tabla.addCell(cell);
            }

            DefaultTableModel modelo = (DefaultTableModel) Jt_ServiciosAdicionales.getModel();
            for (int i = 0; i < modelo.getRowCount(); i++) {
                tabla.addCell(new Phrase(modelo.getValueAt(i, 0).toString(), normalFont));
                tabla.addCell(new Phrase(modelo.getValueAt(i, 1).toString(), normalFont));
                tabla.addCell(new Phrase("S/ " + modelo.getValueAt(i, 2).toString(), normalFont));
            }

            doc.add(tabla);

            // Subtotales y totales
            Paragraph totales = new Paragraph();
            totales.setAlignment(Element.ALIGN_RIGHT);
            totales.add(new Phrase("Subtotal: S/ " + TxtFa_SubTotal.getText() + "\n", negrita));
            totales.add(new Phrase("IGV: S/ " + TxtFa_IGV.getText() + "\n", negrita));
            totales.add(new Phrase("Total: S/ " + TxtFa_Total.getText(), negrita));
            doc.add(totales);

            doc.close();

            JOptionPane.showMessageDialog(null, "Factura PDF generada con éxito.");
            Desktop.getDesktop().open(new File(nombreArchivo));

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al generar el PDF: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblMinimizar = new javax.swing.JLabel();
        LblCerrar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtFa_DNI_ = new javax.swing.JTextField();
        Btn_Buscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtFa_Entrada = new javax.swing.JTextField();
        TxtFa_ReservaID = new javax.swing.JTextField();
        TxtFa_Salida = new javax.swing.JTextField();
        TxtFa_FechaReserva = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TxtFa_IGV = new javax.swing.JTextField();
        TxtFa_SubTotal = new javax.swing.JTextField();
        TxtFa_Total = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TxtFa_DNI = new javax.swing.JTextField();
        TxtFa_Telefono = new javax.swing.JTextField();
        TxtFa_Correo = new javax.swing.JTextField();
        TxtFa_Nombre = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        TxtFa_Nhab = new javax.swing.JTextField();
        TxtFa_Tipo = new javax.swing.JTextField();
        TxtFa_Precio = new javax.swing.JTextField();
        Sp_ServiciosAdicionales = new javax.swing.JScrollPane();
        Jt_ServiciosAdicionales = new javax.swing.JTable();
        Btn_RegistrarPago = new javax.swing.JButton();
        Btn_GenerarPDF = new javax.swing.JButton();
        CboFa_MetodoPago = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(17, 50, 77));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MinimizarEV.png"))); // NOI18N
        LblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(LblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, 20));

        LblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarEV.png"))); // NOI18N
        LblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(LblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DNI");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 90, -1));
        jPanel1.add(TxtFa_DNI_, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 160, -1));

        Btn_Buscar.setBackground(new java.awt.Color(17, 50, 77));
        Btn_Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BuscarTalentoEV.png"))); // NOI18N
        Btn_Buscar.setText("BUSCAR");
        Btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 140, 40));

        jPanel2.setBackground(new java.awt.Color(17, 50, 77));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles de Reserva"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Reserva ID:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, 72, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Entrada:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 84, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha/Reserva");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 84, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Salida:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 84, -1));
        jPanel2.add(TxtFa_Entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, -1));
        jPanel2.add(TxtFa_ReservaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 100, -1));
        jPanel2.add(TxtFa_Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 100, -1));
        jPanel2.add(TxtFa_FechaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 220, 150));

        jPanel3.setBackground(new java.awt.Color(17, 50, 77));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumen de Factura"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Sub Total");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("IGV:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        jPanel3.add(TxtFa_IGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 100, -1));
        jPanel3.add(TxtFa_SubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 100, -1));
        jPanel3.add(TxtFa_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 100, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 180, 120));

        jPanel4.setBackground(new java.awt.Color(17, 50, 77));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Cliente"));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, 52, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("DNI/Pasaporte:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 84, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Telefono:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 84, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Correo:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 84, -1));
        jPanel4.add(TxtFa_DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, -1));
        jPanel4.add(TxtFa_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 100, -1));
        jPanel4.add(TxtFa_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 100, -1));
        jPanel4.add(TxtFa_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 100, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 220, 150));

        jPanel5.setBackground(new java.awt.Color(17, 50, 77));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Habitaciones"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("N hab:");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, -1, -1));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Tipo:");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Precio:");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        jPanel5.add(TxtFa_Nhab, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, -1));
        jPanel5.add(TxtFa_Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 100, -1));
        jPanel5.add(TxtFa_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 100, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 170, 120));

        Sp_ServiciosAdicionales.setBorder(javax.swing.BorderFactory.createTitledBorder("Servicios Adicionales"));

        Jt_ServiciosAdicionales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Sub Total"
            }
        ));
        Sp_ServiciosAdicionales.setViewportView(Jt_ServiciosAdicionales);

        jPanel1.add(Sp_ServiciosAdicionales, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 350, 150));

        Btn_RegistrarPago.setBackground(new java.awt.Color(17, 50, 77));
        Btn_RegistrarPago.setForeground(new java.awt.Color(255, 255, 255));
        Btn_RegistrarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Factura.png"))); // NOI18N
        Btn_RegistrarPago.setText("REGISTRAR PAGO");
        Btn_RegistrarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegistrarPagoActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_RegistrarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 180, 40));

        Btn_GenerarPDF.setBackground(new java.awt.Color(17, 50, 77));
        Btn_GenerarPDF.setForeground(new java.awt.Color(255, 255, 255));
        Btn_GenerarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/archivo-pdf.png"))); // NOI18N
        Btn_GenerarPDF.setText("GENERAR PDF");
        Btn_GenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GenerarPDFActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_GenerarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 170, 40));

        jPanel1.add(CboFa_MetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_GenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GenerarPDFActionPerformed
        int idReserva;
        try {
            idReserva = Integer.parseInt(TxtFa_ReservaID.getText());
            generarPDF(idReserva);  // Llama al método que genera el PDF
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID de Reserva inválido.");
        }
    }//GEN-LAST:event_Btn_GenerarPDFActionPerformed

    private void LblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblMinimizarMouseClicked
        this.setExtendedState(ICONIFIED); // PARA MINIMIZAR EL PROGRAMA
    }//GEN-LAST:event_LblMinimizarMouseClicked

    private void LblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblCerrarMouseClicked
        //cogido para preguntar si se desea salir o no del programa
        int respuesta = JOptionPane.showConfirmDialog(
                Factura_1.this, // Referencia al componente la ventana actual (Login)
                "¿Deseas realmente salir?", // Mensaje que se muestra al usuario
                "Confirmación", // Título de la ventana de diálogo
                JOptionPane.YES_NO_OPTION // Tipo de opciones que se presentan al usuario (Sí y No)
        );

        if (respuesta == JOptionPane.YES_OPTION) { // Verifica si el usuario seleccionó "Sí"
            dispose(); // Cierra la ventana y libera los recursos
            System.exit(0); // Termina la aplicación por completo
        }
    }//GEN-LAST:event_LblCerrarMouseClicked

    private void Btn_RegistrarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegistrarPagoActionPerformed
        int idReserva = Integer.parseInt(TxtFa_ReservaID.getText());
    BigDecimal total = new BigDecimal(TxtFa_Total.getText());
    String metodo = CboFa_MetodoPago.getSelectedItem().toString();

    try (Connection conn = ConexionBaseDeDatos.ConexionBD.conectar()) {
        Pago pago = new Pago(idReserva, total, metodo);
        PagoDAO pagoDAO = new PagoDAO(conn);

        if (pagoDAO.obtenerPagoPorReserva(idReserva) == null) {
            boolean ok = pagoDAO.registrarPago(pago);
            if (ok) {
                JOptionPane.showMessageDialog(this, "Pago registrado correctamente.");

                liberarHabitacion(idReserva);

            } else {
                JOptionPane.showMessageDialog(this, "No se pudo registrar el pago.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ya existe un pago registrado para esta reserva.");
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al registrar pago.");
    }

    }//GEN-LAST:event_Btn_RegistrarPagoActionPerformed

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
        String dni = TxtFa_DNI_.getText().trim();
        if (dni.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un DNI válido.");
            return;
        }

        try (Connection conn = ConexionBaseDeDatos.ConexionBD.conectar()) {
            String sql = """
    SELECT TOP 1 c.nombre, c.dni_pasaporte, c.telefono, c.correo,
                 r.id_reserva, r.fecha_entrada, r.fecha_salida, r.fecha_reserva,
                 h.numero_habitacion, h.tipo, h.precio_por_noche
    FROM Clientes c
    JOIN Reservas r ON c.id_cliente = r.id_cliente
    JOIN Detalle_Reserva dr ON r.id_reserva = dr.id_reserva
    JOIN Habitaciones h ON dr.id_habitacion = h.id_habitacion
    WHERE c.dni_pasaporte = ?
    ORDER BY r.fecha_reserva DESC
""";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, dni);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                TxtFa_Nombre.setText(rs.getString("nombre"));
                TxtFa_DNI.setText(rs.getString("dni_pasaporte"));
                TxtFa_Telefono.setText(rs.getString("telefono"));
                TxtFa_Correo.setText(rs.getString("correo"));

                int idReserva = rs.getInt("id_reserva");
                TxtFa_ReservaID.setText(String.valueOf(idReserva));
                TxtFa_Entrada.setText(rs.getDate("fecha_entrada").toString());
                TxtFa_Salida.setText(rs.getDate("fecha_salida").toString());
                TxtFa_FechaReserva.setText(rs.getTimestamp("fecha_reserva").toString());

                TxtFa_Nhab.setText(rs.getString("numero_habitacion"));
                TxtFa_Tipo.setText(rs.getString("tipo"));
                TxtFa_Precio.setText(rs.getBigDecimal("precio_por_noche").toPlainString());

                cargarServicios(idReserva);
                calcularFactura(idReserva);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ninguna reserva para el DNI ingresado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al buscar datos: " + e.getMessage());
        }
    }//GEN-LAST:event_Btn_BuscarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_GenerarPDF;
    private javax.swing.JButton Btn_RegistrarPago;
    private javax.swing.JComboBox<String> CboFa_MetodoPago;
    private javax.swing.JTable Jt_ServiciosAdicionales;
    private javax.swing.JLabel LblCerrar;
    private javax.swing.JLabel LblMinimizar;
    private javax.swing.JScrollPane Sp_ServiciosAdicionales;
    private javax.swing.JTextField TxtFa_Correo;
    private javax.swing.JTextField TxtFa_DNI;
    private javax.swing.JTextField TxtFa_DNI_;
    private javax.swing.JTextField TxtFa_Entrada;
    private javax.swing.JTextField TxtFa_FechaReserva;
    private javax.swing.JTextField TxtFa_IGV;
    private javax.swing.JTextField TxtFa_Nhab;
    private javax.swing.JTextField TxtFa_Nombre;
    private javax.swing.JTextField TxtFa_Precio;
    private javax.swing.JTextField TxtFa_ReservaID;
    private javax.swing.JTextField TxtFa_Salida;
    private javax.swing.JTextField TxtFa_SubTotal;
    private javax.swing.JTextField TxtFa_Telefono;
    private javax.swing.JTextField TxtFa_Tipo;
    private javax.swing.JTextField TxtFa_Total;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
