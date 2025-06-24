package VistaHotel;

import ConexionBaseDeDatos.ConexionBD;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Factura_1 extends javax.swing.JFrame {

    public Factura_1() {
        initComponents();

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtFa_IDReserva = new javax.swing.JTextField();
        Btn_Buscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        TxtFa_ReservaID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxtFa_Entrada = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtFa_FechaReserva = new javax.swing.JTextField();
        TxtFa_Salida = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        TxtFa_SubTotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtFa_IGV = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TxtFa_Total = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        TxtFa_Nombre = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TxtFa_DNI = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TxtFa_Telefono = new javax.swing.JTextField();
        TxtFa_Correo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        TxtFa_Nhab = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TxtFa_Tipo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TxtFa_Precio = new javax.swing.JTextField();
        Sp_ServiciosAdicionales = new javax.swing.JScrollPane();
        Jt_ServiciosAdicionales = new javax.swing.JTable();
        Btn_RegistrarPago = new javax.swing.JButton();
        Btn_GenerarPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FACTURA DE RESERVA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 30));

        jLabel2.setText("ID de Reserva:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, -1));
        getContentPane().add(TxtFa_IDReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 160, -1));

        Btn_Buscar.setText("Buscar");
        Btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles de Reserva"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Reserva ID:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, 72, -1));

        TxtFa_ReservaID.setEnabled(false);
        jPanel2.add(TxtFa_ReservaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 24, 98, 16));

        jLabel8.setText("Entrada:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 46, 84, -1));

        TxtFa_Entrada.setEnabled(false);
        jPanel2.add(TxtFa_Entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 46, 98, 16));

        jLabel9.setText("Fecha/Reserva");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 68, 84, -1));

        jLabel10.setText("Salida:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 90, 84, -1));

        TxtFa_FechaReserva.setEnabled(false);
        jPanel2.add(TxtFa_FechaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 68, 98, 16));

        TxtFa_Salida.setEnabled(false);
        jPanel2.add(TxtFa_Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 90, 98, 16));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 220, 120));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumen de Factura"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Sub Total");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, -1, -1));

        TxtFa_SubTotal.setEnabled(false);
        jPanel3.add(TxtFa_SubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 24, 98, 16));

        jLabel12.setText("IGV:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 46, -1, -1));

        TxtFa_IGV.setEnabled(false);
        jPanel3.add(TxtFa_IGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 46, 98, 16));

        jLabel13.setText("Total:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 68, -1, -1));

        TxtFa_Total.setEnabled(false);
        jPanel3.add(TxtFa_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 68, 98, 16));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 180, 100));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Cliente"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Nombre:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, 52, -1));

        TxtFa_Nombre.setEnabled(false);
        jPanel4.add(TxtFa_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 20, 100, 20));

        jLabel16.setText("DNI/Pasaporte:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 46, 84, -1));

        TxtFa_DNI.setEnabled(false);
        jPanel4.add(TxtFa_DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 42, 100, 20));

        jLabel17.setText("Telefono:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 68, 84, -1));

        jLabel18.setText("Correo:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 90, 84, -1));

        TxtFa_Telefono.setEnabled(false);
        jPanel4.add(TxtFa_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 64, 100, 20));

        TxtFa_Correo.setEnabled(false);
        jPanel4.add(TxtFa_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 86, 100, 20));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 220, 120));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Habitaciones"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setText("N hab:");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, -1, -1));

        TxtFa_Nhab.setEnabled(false);
        jPanel5.add(TxtFa_Nhab, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 24, 98, 16));

        jLabel20.setText("Tipo:");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 46, -1, -1));

        TxtFa_Tipo.setEnabled(false);
        jPanel5.add(TxtFa_Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 46, 98, 16));

        jLabel21.setText("Precio:");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 68, -1, -1));

        TxtFa_Precio.setEnabled(false);
        jPanel5.add(TxtFa_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 68, 98, 16));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 170, 100));

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

        getContentPane().add(Sp_ServiciosAdicionales, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 350, 120));

        Btn_RegistrarPago.setText("Registrar Pago");
        getContentPane().add(Btn_RegistrarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 250, -1));

        Btn_GenerarPDF.setText("Generar PDF / Imprimir");
        getContentPane().add(Btn_GenerarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 250, -1));

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
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
