package VistaHotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import ConexionBaseDeDatos.ConexionBD;
import Interfaz.Bloqueable;
import javax.swing.JOptionPane;

import java.sql.ResultSet;

import java.sql.*;

public class SalidaHabitacion extends javax.swing.JPanel implements Bloqueable {

    ReservarHabitacion panelReservas;

    public SalidaHabitacion() {
        initComponents();
        panelReservas = new ReservarHabitacion(); // Creamos una instancia para acceder a los paneles ya diseñados
        bloquearCampos();   //INICIALIZAMOS EL METODO BLOQUEAR CAMPOS
    }

    //SOBREESCRITURA PARA BLOQUEAR CAMPOS DE NUESTRO JPANEL
    @Override
    public void bloquearCampos() {
        TxtCliente.setEditable(false);
        TxtEstado.setEditable(false);
        TxtEstadoPago.setEditable(false);
        TxtFechEntrada.setEditable(false);
        TxtFechSalida.setEditable(false);

        TxtTotalPagar.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CLIENTE = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JButton();
        TxtDni = new javax.swing.JTextField();
        TxtCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TxtEstado = new javax.swing.JTextField();
        CLIENTE1 = new javax.swing.JLabel();
        CLIENTE2 = new javax.swing.JLabel();
        TxtFechSalida = new javax.swing.JTextField();
        TxtEstadoPago = new javax.swing.JTextField();
        CLIENTE3 = new javax.swing.JLabel();
        TxtFechEntrada = new javax.swing.JTextField();
        CLIENTE4 = new javax.swing.JLabel();
        CLIENTE5 = new javax.swing.JLabel();
        CbTipoPago = new javax.swing.JComboBox<>();
        TxtTotalPagar = new javax.swing.JTextField();
        BtnAlargarReserva = new javax.swing.JButton();
        BtnConfirmarSalida = new javax.swing.JButton();
        BtnCancelarReserva = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(17, 50, 77));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CLIENTE.setForeground(new java.awt.Color(255, 255, 255));
        CLIENTE.setText("FECHA SALIDA");
        add(CLIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 120, 30));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DIN");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 50, 30));

        BtnBuscar.setBackground(new java.awt.Color(17, 50, 77));
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BuscarTalentoEV.png"))); // NOI18N
        BtnBuscar.setText("BUSCAR");
        BtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnBuscarMouseClicked(evt);
            }
        });
        add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 150, 40));

        TxtDni.setBackground(new java.awt.Color(17, 50, 77));
        TxtDni.setForeground(new java.awt.Color(255, 255, 255));
        TxtDni.setBorder(null);
        TxtDni.setPreferredSize(new java.awt.Dimension(64, 64));
        add(TxtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 170, 20));

        TxtCliente.setBackground(new java.awt.Color(17, 50, 77));
        TxtCliente.setForeground(new java.awt.Color(255, 255, 255));
        TxtCliente.setBorder(null);
        add(TxtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 170, 20));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ESTADO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 70, -1));

        TxtEstado.setBackground(new java.awt.Color(17, 50, 77));
        TxtEstado.setForeground(new java.awt.Color(255, 255, 255));
        TxtEstado.setBorder(null);
        add(TxtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 170, 20));

        CLIENTE1.setForeground(new java.awt.Color(255, 255, 255));
        CLIENTE1.setText("CLIENTE");
        add(CLIENTE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 60, 30));

        CLIENTE2.setForeground(new java.awt.Color(255, 255, 255));
        CLIENTE2.setText("METODO DE PAGO");
        add(CLIENTE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 120, 30));

        TxtFechSalida.setBackground(new java.awt.Color(17, 50, 77));
        TxtFechSalida.setForeground(new java.awt.Color(255, 255, 255));
        TxtFechSalida.setBorder(null);
        add(TxtFechSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 170, 20));

        TxtEstadoPago.setBackground(new java.awt.Color(17, 50, 77));
        TxtEstadoPago.setForeground(new java.awt.Color(255, 255, 255));
        TxtEstadoPago.setBorder(null);
        add(TxtEstadoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 170, 20));

        CLIENTE3.setForeground(new java.awt.Color(255, 255, 255));
        CLIENTE3.setText("FECHA ENTRADA");
        add(CLIENTE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 110, 30));

        TxtFechEntrada.setBackground(new java.awt.Color(17, 50, 77));
        TxtFechEntrada.setForeground(new java.awt.Color(255, 255, 255));
        TxtFechEntrada.setBorder(null);
        add(TxtFechEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, 20));

        CLIENTE4.setForeground(new java.awt.Color(255, 255, 255));
        CLIENTE4.setText("ESTADO DE PAGO");
        add(CLIENTE4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 120, 30));

        CLIENTE5.setForeground(new java.awt.Color(255, 255, 255));
        CLIENTE5.setText("TOTAL A PAGAR");
        add(CLIENTE5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 100, 30));

        CbTipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EFECTIVO", "TARJETA" }));
        add(CbTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 170, 30));

        TxtTotalPagar.setBackground(new java.awt.Color(17, 50, 77));
        TxtTotalPagar.setForeground(new java.awt.Color(255, 255, 255));
        TxtTotalPagar.setBorder(null);
        add(TxtTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 170, 20));

        BtnAlargarReserva.setBackground(new java.awt.Color(17, 50, 77));
        BtnAlargarReserva.setForeground(new java.awt.Color(255, 255, 255));
        BtnAlargarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reserva.png"))); // NOI18N
        BtnAlargarReserva.setText("ALARGAR FECHA");
        BtnAlargarReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAlargarReservaMouseClicked(evt);
            }
        });
        add(BtnAlargarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 170, 40));

        BtnConfirmarSalida.setBackground(new java.awt.Color(17, 50, 77));
        BtnConfirmarSalida.setForeground(new java.awt.Color(255, 255, 255));
        BtnConfirmarSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarEV.png"))); // NOI18N
        BtnConfirmarSalida.setText("CONFIRMAR SALIDA");
        add(BtnConfirmarSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 180, 40));

        BtnCancelarReserva.setBackground(new java.awt.Color(17, 50, 77));
        BtnCancelarReserva.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        BtnCancelarReserva.setText("CANCELAR RESERVA");
        add(BtnCancelarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 200, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 170, 20));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 170, 20));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 170, 20));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 170, 20));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 170, 20));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 170, 20));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, 20));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 170, 20));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 170, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAlargarReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAlargarReservaMouseClicked
        String dniCliente = TxtDni.getText().trim();

        if (dniCliente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el DNI del cliente.");
            return;
        }

        try (Connection con = ConexionBD.conectar()) {
            String sql = "SELECT "
                    + "c.nombre, c.apellido, c.telefono, c.correo, c.direccion, "
                    + "r.fecha_entrada, r.fecha_salida, r.id_reserva, "
                    + "ISNULL(p.monto, 0) AS total_pagar, "
                    + "h.numero_habitacion, h.tipo, h.descripcion AS descripcion_habitacion, "
                    + "h.precio_por_noche, h.estado AS estado_habitacion "
                    + "FROM Clientes c "
                    + "JOIN Reservas r ON c.id_cliente = r.id_cliente "
                    + "JOIN Detalle_Reserva dr ON r.id_reserva = dr.id_reserva "
                    + "JOIN Habitaciones h ON dr.id_habitacion = h.id_habitacion "
                    + "LEFT JOIN Pagos p ON r.id_reserva = p.id_reserva "
                    + "WHERE c.dni_pasaporte = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dniCliente);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");
                String direccion = rs.getString("direccion");

                String numHabitacion = rs.getString("numero_habitacion");
                String tipo = rs.getString("tipo");
                String descripcion = rs.getString("descripcion_habitacion");
                String precioPorNoche = rs.getString("precio_por_noche");
                String estado = rs.getString("estado_habitacion");

                String fechaEntrada = rs.getString("fecha_entrada");
                String fechaSalida = rs.getString("fecha_salida");
                String precio = rs.getString("total_pagar");

                // Llamamos a la ventana de edición y le pasamos los datos
                EditarReserva editRes = new EditarReserva(
                        nombre, apellido, dniCliente,
                        telefono, correo, direccion,
                        numHabitacion, tipo, descripcion,
                        precioPorNoche, estado,
                        fechaEntrada, fechaSalida, precio
                );
                editRes.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron datos para el DNI ingresado.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos del cliente: " + e.getMessage());
            e.printStackTrace();
        }

    }//GEN-LAST:event_BtnAlargarReservaMouseClicked

    private void BtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMouseClicked

        String dniCliente = TxtDni.getText().trim();

        if (dniCliente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el DNI del cliente.");
            return;
        }

        try (Connection con = ConexionBD.conectar()) {
            String sql = "SELECT c.nombre + ' ' + c.apellido AS cliente, "
                    + "r.fecha_entrada, r.fecha_salida, er.descripcion AS estado_reserva, "
                    + "ISNULL(p.monto, 0) AS total_pagar, "
                    + "ISNULL(mp.descripcion, 'Efectivo') AS metodo_pago, "
                    + "ISNULL(ep.descripcion, 'Pendiente') AS estado_pago "
                    + "FROM Clientes c "
                    + "JOIN Reservas r ON c.id_cliente = r.id_cliente "
                    + "JOIN Estados_Reserva er ON r.id_estado = er.id_estado "
                    + "LEFT JOIN Pagos p ON r.id_reserva = p.id_reserva "
                    + "LEFT JOIN Metodos_Pago mp ON p.id_metodo = mp.id_metodo "
                    + "LEFT JOIN Estados_Pago ep ON p.id_estado_pago = ep.id_estado_pago "
                    + "WHERE c.dni_pasaporte = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dniCliente);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Establecer valores en tus campos
                TxtCliente.setText(rs.getString("cliente"));
                TxtFechEntrada.setText(rs.getString("fecha_entrada"));
                TxtFechSalida.setText(rs.getString("fecha_salida"));
                TxtEstado.setText(rs.getString("estado_reserva"));
                TxtTotalPagar.setText(String.valueOf(rs.getDouble("total_pagar")));
                CbTipoPago.setSelectedItem(rs.getString("metodo_pago"));
                TxtEstadoPago.setText(rs.getString("estado_pago"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró una reserva para el DNI ingresado.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar la reserva: " + e.getMessage());
            e.printStackTrace();
        }


    }//GEN-LAST:event_BtnBuscarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlargarReserva;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelarReserva;
    private javax.swing.JButton BtnConfirmarSalida;
    private javax.swing.JLabel CLIENTE;
    private javax.swing.JLabel CLIENTE1;
    private javax.swing.JLabel CLIENTE2;
    private javax.swing.JLabel CLIENTE3;
    private javax.swing.JLabel CLIENTE4;
    private javax.swing.JLabel CLIENTE5;
    private javax.swing.JComboBox<String> CbTipoPago;
    private javax.swing.JTextField TxtCliente;
    private javax.swing.JTextField TxtDni;
    private javax.swing.JTextField TxtEstado;
    private javax.swing.JTextField TxtEstadoPago;
    private javax.swing.JTextField TxtFechEntrada;
    private javax.swing.JTextField TxtFechSalida;
    private javax.swing.JTextField TxtTotalPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
