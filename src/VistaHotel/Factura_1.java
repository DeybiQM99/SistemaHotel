package VistaHotel;

import ConexionBaseDeDatos.ConexionBD;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//OPEN PDF
//////--------------------//////////////
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
//////--------------------//////////////
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;

import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import java.awt.Color;

public class Factura_1 extends javax.swing.JFrame {

    public Factura_1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    //botón “Buscar”
    private void buscarReserva(int idReserva) {
        try (Connection conn = ConexionBaseDeDatos.ConexionBD.conectar()) {
            if (conn == null) {
                JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
                return;
            }

            // ========== DATOS DEL CLIENTE Y RESERVA ==========
            String sqlClienteReserva = "SELECT c.nombre, c.dni_pasaporte, c.telefono, c.correo, "
             + "r.id_reserva, r.fecha_entrada, r.fecha_salida, r.fecha_reserva "
             + "FROM Reservas r "
             + "JOIN Clientes c ON r.id_cliente = c.id_cliente "
             + "WHERE r.id_reserva = ?";
            try (PreparedStatement psCliente = conn.prepareStatement(sqlClienteReserva)) {
                psCliente.setInt(1, idReserva);
                try (ResultSet rs = psCliente.executeQuery()) {
                    if (rs.next()) {
                        TxtFa_Nombre.setText(rs.getString("nombre"));
                        TxtFa_DNI.setText(rs.getString("dni_pasaporte"));
                        TxtFa_Telefono.setText(rs.getString("telefono"));
                        TxtFa_Correo.setText(rs.getString("correo"));
                        TxtFa_ReservaID.setText(String.valueOf(rs.getInt("id_reserva")));
                        TxtFa_Entrada.setText(rs.getDate("fecha_entrada").toString());
                        TxtFa_Salida.setText(rs.getDate("fecha_salida").toString());
                        TxtFa_FechaReserva.setText(rs.getTimestamp("fecha_reserva").toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró la reserva con ID: " + idReserva);
                        return;
                    }
                }
            }

            // ========== DATOS DE LA HABITACIÓN ==========
            String sqlHabitacion = "SELECT h.numero_habitacion, h.tipo, dr.precio "
             + "FROM Detalle_Reserva dr "
             + "JOIN Habitaciones h ON dr.id_habitacion = h.id_habitacion "
             + "WHERE dr.id_reserva = ?";
            try (PreparedStatement psHab = conn.prepareStatement(sqlHabitacion)) {
                psHab.setInt(1, idReserva);
                try (ResultSet rs = psHab.executeQuery()) {
                    if (rs.next()) {
                        TxtFa_Nhab.setText(rs.getString("numero_habitacion"));
                        TxtFa_Tipo.setText(rs.getString("tipo"));
                        TxtFa_Precio.setText(String.valueOf(rs.getBigDecimal("precio")));
                    } else {
                        TxtFa_Nhab.setText("");
                        TxtFa_Tipo.setText("");
                        TxtFa_Precio.setText("");
                    }
                }
            }

            // ========== SERVICIOS ADICIONALES ==========
            DefaultTableModel modeloTabla = (DefaultTableModel) Jt_ServiciosAdicionales.getModel();
            modeloTabla.setRowCount(0); // Limpiar tabla
            String sqlServicios = "SELECT s.nombre_servicio, rs.cantidad, (s.precio * rs.cantidad) AS subtotal "
             + "FROM Reserva_Servicios rs "
             + "JOIN Servicios_Adicionales s ON rs.id_servicio = s.id_servicio "
             + "WHERE rs.id_reserva = ?";
            try (PreparedStatement psServ = conn.prepareStatement(sqlServicios)) {
                psServ.setInt(1, idReserva);
                try (ResultSet rs = psServ.executeQuery()) {
                    while (rs.next()) {
                        Object[] fila = {
                            rs.getString("nombre_servicio"),
                            rs.getInt("cantidad"),
                            rs.getBigDecimal("subtotal")
                        };
                        modeloTabla.addRow(fila);
                    }
                }
            }

            /*
            // ======== PRODUCTOS RESERVADOS ========
            String sqlProductos = """
    SELECT p.nombre, rp.cantidad, (p.precio * rp.cantidad) AS subtotal
    FROM Reserva_Productos rp
    JOIN Productos p ON rp.id_producto = p.id_producto
    WHERE rp.id_reserva = ?
""";

            try (PreparedStatement psProd = conn.prepareStatement(sqlProductos)) {
                psProd.setInt(1, idReserva);
                ResultSet rsProd = psProd.executeQuery();

                while (rsProd.next()) {
                    Object[] filaProducto = {
                        rsProd.getString("nombre"),
                        rsProd.getInt("cantidad"),
                        rsProd.getBigDecimal("subtotal")
                    };
                    modeloTabla.addRow(filaProducto); // Se agrega a la misma tabla Jt_ServiciosAdicionales
                }
            }*/
            // ========== DATOS DE LA FACTURA ==========
            String sqlFactura = "SELECT subtotal, igv, monto_total FROM Facturas WHERE id_reserva = ?";
            try (PreparedStatement psFact = conn.prepareStatement(sqlFactura)) {
                psFact.setInt(1, idReserva);
                try (ResultSet rs = psFact.executeQuery()) {
                    if (rs.next()) {
                        TxtFa_SubTotal.setText(String.valueOf(rs.getBigDecimal("subtotal")));
                        TxtFa_IGV.setText(String.valueOf(rs.getBigDecimal("igv")));
                        TxtFa_Total.setText(String.valueOf(rs.getBigDecimal("monto_total")));
                    } else {
                        TxtFa_SubTotal.setText("0.00");
                        TxtFa_IGV.setText("0.00");
                        TxtFa_Total.setText("0.00");
                    }
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la reserva: " + ex.getMessage());
        }
    }

    /*
    //METODO PARA IMPORTAR EL PDF
    
    
    public void generarPDF(int idReserva) {
    try {
        Document doc = new Document();
        String nombreArchivo = "Factura_Reserva_" + idReserva + ".pdf";
        PdfWriter.getInstance(doc, new FileOutputStream(nombreArchivo));
        doc.open();

        doc.add(new Paragraph("Factura de Reserva", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18)));
        doc.add(new Paragraph(" "));

        doc.add(new Paragraph("ID Reserva: " + TxtFa_ReservaID.getText()));
        doc.add(new Paragraph("Nombre Cliente: " + TxtFa_Nombre.getText()));
        doc.add(new Paragraph("DNI/Pasaporte: " + TxtFa_DNI.getText()));
        doc.add(new Paragraph("Teléfono: " + TxtFa_Telefono.getText()));
        doc.add(new Paragraph("Correo: " + TxtFa_Correo.getText()));
        doc.add(new Paragraph("Entrada: " + TxtFa_Entrada.getText()));
        doc.add(new Paragraph("Salida: " + TxtFa_Salida.getText()));
        doc.add(new Paragraph("Fecha de Reserva: " + TxtFa_FechaReserva.getText()));
        doc.add(new Paragraph(" "));

        doc.add(new Paragraph("Habitación: " + TxtFa_Nhab.getText() + " - " + TxtFa_Tipo.getText()));
        doc.add(new Paragraph("Precio: S/ " + TxtFa_Precio.getText()));
        doc.add(new Paragraph(" "));

        doc.add(new Paragraph("Servicios Adicionales:"));
        PdfPTable tabla = new PdfPTable(3);
        tabla.addCell("Producto");
        tabla.addCell("Cantidad");
        tabla.addCell("SubTotal");

        DefaultTableModel modelo = (DefaultTableModel) Jt_ServiciosAdicionales.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            tabla.addCell(modelo.getValueAt(i, 0).toString());
            tabla.addCell(modelo.getValueAt(i, 1).toString());
            tabla.addCell(modelo.getValueAt(i, 2).toString());
        }
        doc.add(tabla);

        doc.add(new Paragraph(" "));
        doc.add(new Paragraph("Subtotal: S/ " + TxtFa_SubTotal.getText()));
        doc.add(new Paragraph("IGV: S/ " + TxtFa_IGV.getText()));
        doc.add(new Paragraph("Total: S/ " + TxtFa_Total.getText()));

        doc.close();

        JOptionPane.showMessageDialog(null, "Factura PDF generada correctamente.");

        // Abrir automáticamente el PDF
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            Desktop.getDesktop().open(archivo);
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al generar el PDF: " + e.getMessage());
    }
}
    
     */

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
        TxtFa_IDReserva = new javax.swing.JTextField();
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
        jLabel2.setText("ID de Reserva:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 90, -1));
        jPanel1.add(TxtFa_IDReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 160, -1));

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

        TxtFa_Entrada.setEnabled(false);
        jPanel2.add(TxtFa_Entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, -1));

        TxtFa_ReservaID.setEnabled(false);
        jPanel2.add(TxtFa_ReservaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 100, -1));

        TxtFa_Salida.setEnabled(false);
        jPanel2.add(TxtFa_Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 100, -1));

        TxtFa_FechaReserva.setEnabled(false);
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

        TxtFa_IGV.setEnabled(false);
        jPanel3.add(TxtFa_IGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 100, -1));

        TxtFa_SubTotal.setEnabled(false);
        jPanel3.add(TxtFa_SubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 100, -1));

        TxtFa_Total.setEnabled(false);
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

        TxtFa_DNI.setEnabled(false);
        jPanel4.add(TxtFa_DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, -1));

        TxtFa_Telefono.setEnabled(false);
        jPanel4.add(TxtFa_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 100, -1));

        TxtFa_Correo.setEnabled(false);
        jPanel4.add(TxtFa_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 100, -1));

        TxtFa_Nombre.setEnabled(false);
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

        TxtFa_Nhab.setEnabled(false);
        jPanel5.add(TxtFa_Nhab, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, -1));

        TxtFa_Tipo.setEnabled(false);
        jPanel5.add(TxtFa_Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 100, -1));

        TxtFa_Precio.setEnabled(false);
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
        jPanel1.add(Btn_RegistrarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 250, 40));

        Btn_GenerarPDF.setBackground(new java.awt.Color(17, 50, 77));
        Btn_GenerarPDF.setForeground(new java.awt.Color(255, 255, 255));
        Btn_GenerarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/archivo-pdf.png"))); // NOI18N
        Btn_GenerarPDF.setText("GENERAR PDF");
        Btn_GenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GenerarPDFActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_GenerarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 250, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
        String textoId = TxtFa_IDReserva.getText(); // ← este es el campo donde ingresas el ID de reserva
        if (!textoId.isEmpty()) {
            try {
                int idReserva = Integer.parseInt(textoId);
                buscarReserva(idReserva);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "El ID de reserva debe ser un número entero.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un ID de reserva.");
        }
    }//GEN-LAST:event_Btn_BuscarActionPerformed

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

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Factura_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
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
    private javax.swing.JTable Jt_ServiciosAdicionales;
    private javax.swing.JLabel LblCerrar;
    private javax.swing.JLabel LblMinimizar;
    private javax.swing.JScrollPane Sp_ServiciosAdicionales;
    private javax.swing.JTextField TxtFa_Correo;
    private javax.swing.JTextField TxtFa_DNI;
    private javax.swing.JTextField TxtFa_Entrada;
    private javax.swing.JTextField TxtFa_FechaReserva;
    private javax.swing.JTextField TxtFa_IDReserva;
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
