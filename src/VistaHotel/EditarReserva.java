package VistaHotel;

import ConexionBaseDeDatos.ConexionBD;
import GestionReservas.Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JPanel;
import java.sql.Date;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;

public class EditarReserva extends javax.swing.JFrame {

    private String dniGlobal;
    private String fechaEntradaGlobal;

    public EditarReserva() {
        initComponents();

    }

    public EditarReserva(String nombre, String apellido, String dni,
            String telefono, String correo, String direccion,
            String numHabitacion, String tipo, String descripcion, String precioPorNoche, String estado,
            String fechaEntrada, String fechaSalida, String precioTotal) {
        initComponents();
        this.setLocationRelativeTo(null);

        // CLIENTE
        TxtNombre.setText(nombre);
        TxtApellido.setText(apellido);
        TxtDni.setText(dni);
        TxtTelefono.setText(telefono);
        TxtCorreo.setText(correo);
        TxtDireccion.setText(direccion);

        // HABITACIÓN
        TxtNumHabitacion.setText(numHabitacion);
        TxtTipoH.setText(tipo);
        TxtDescripcion.setText(descripcion);
        TxtPrecioPorNoche.setText(precioPorNoche);
        CbEstado.setSelectedItem(estado);

        // RESERVA
        jDateChooserEntrada.setDate(java.sql.Date.valueOf(fechaEntrada));
        jDateChooserSalida.setDate(java.sql.Date.valueOf(fechaSalida));
      

        // Guardar variables para actualizar después
        dniGlobal = dni;
        fechaEntradaGlobal = fechaEntrada;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnGuardarCambios = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BtnRegresar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TxtDni = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        TxtApellido = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        TxtNombre = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        TxtTipoH = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        TxtPrecioPorNoche = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        TxtNumHabitacion = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        TxtDireccion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        TxtCorreo = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        TxtDescripcion = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jDateChooserSalida = new com.toedter.calendar.JDateChooser();
        jDateChooserEntrada = new com.toedter.calendar.JDateChooser();
        CbEstado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        TxtResPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 440));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(17, 50, 77));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtTelefono.setBackground(new java.awt.Color(17, 50, 77));
        TxtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        TxtTelefono.setBorder(null);
        jPanel1.add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 170, 20));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("APELLIDOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 20));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TELEFONO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 30));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DNI");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, 20));

        BtnGuardarCambios.setBackground(new java.awt.Color(17, 50, 77));
        BtnGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarEV.png"))); // NOI18N
        BtnGuardarCambios.setText("GUARDAR");
        BtnGuardarCambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGuardarCambiosMouseClicked(evt);
            }
        });
        BtnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarCambiosActionPerformed(evt);
            }
        });
        jPanel1.add(BtnGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 150, 40));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOMBRE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, 20));

        BtnRegresar1.setBackground(new java.awt.Color(17, 50, 77));
        BtnRegresar1.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RegresarEV.png"))); // NOI18N
        BtnRegresar1.setText("REGRESAR");
        BtnRegresar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegresar1MouseClicked(evt);
            }
        });
        jPanel1.add(BtnRegresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 150, 40));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DETALLE CLIENTE");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 170, 10));

        TxtDni.setBackground(new java.awt.Color(17, 50, 77));
        TxtDni.setForeground(new java.awt.Color(255, 255, 255));
        TxtDni.setBorder(null);
        jPanel1.add(TxtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 170, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, 10));

        TxtApellido.setBackground(new java.awt.Color(17, 50, 77));
        TxtApellido.setForeground(new java.awt.Color(255, 255, 255));
        TxtApellido.setBorder(null);
        jPanel1.add(TxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 170, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, 10));

        TxtNombre.setBackground(new java.awt.Color(17, 50, 77));
        TxtNombre.setForeground(new java.awt.Color(255, 255, 255));
        TxtNombre.setBorder(null);
        jPanel1.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 170, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 170, 10));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 10, 440));

        TxtTipoH.setBackground(new java.awt.Color(17, 50, 77));
        TxtTipoH.setForeground(new java.awt.Color(255, 255, 255));
        TxtTipoH.setBorder(null);
        jPanel1.add(TxtTipoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 170, 20));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PRECIO NOCHE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 110, 30));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TIPO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 50, 30));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ESTADO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, 30));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("N. HABITACION");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 170, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 170, 10));

        TxtPrecioPorNoche.setBackground(new java.awt.Color(17, 50, 77));
        TxtPrecioPorNoche.setForeground(new java.awt.Color(255, 255, 255));
        TxtPrecioPorNoche.setBorder(null);
        jPanel1.add(TxtPrecioPorNoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 170, 20));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 170, 10));

        TxtNumHabitacion.setBackground(new java.awt.Color(17, 50, 77));
        TxtNumHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        TxtNumHabitacion.setBorder(null);
        jPanel1.add(TxtNumHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 170, 20));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 170, 10));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("DETALLE HABITACION");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 380, -1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("DETALLE RESERVACION");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 390, -1));

        jLabel15.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("F. SALIDA");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, 30));

        jLabel18.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("F. ENTRADA");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, 30));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 170, -1));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 170, 0));

        TxtDireccion.setBackground(new java.awt.Color(17, 50, 77));
        TxtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        TxtDireccion.setBorder(null);
        jPanel1.add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 170, 20));

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DIRECCION");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 80, 30));

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CORREO");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 80, 30));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 170, 10));

        TxtCorreo.setBackground(new java.awt.Color(17, 50, 77));
        TxtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        TxtCorreo.setBorder(null);
        jPanel1.add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 170, 20));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 170, 10));

        TxtDescripcion.setBackground(new java.awt.Color(17, 50, 77));
        TxtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        TxtDescripcion.setBorder(null);
        jPanel1.add(TxtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 170, 20));

        jLabel20.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("DESCRIPCION");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 100, 30));
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 170, 10));
        jPanel1.add(jDateChooserSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 170, -1));
        jPanel1.add(jDateChooserEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 170, -1));

        CbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OCUPADO", " " }));
        jPanel1.add(CbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 170, -1));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, -1, -1));

        TxtResPrecio.setText("jTextField1");
        jPanel1.add(TxtResPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegresar1MouseClicked

        this.dispose(); // finaliza el  jframe pero no cierra el programa por completo
    }//GEN-LAST:event_BtnRegresar1MouseClicked

    private void BtnGuardarCambiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarCambiosMouseClicked
        try (Connection con = ConexionBD.conectar()) {
            java.util.Date nuevaFechaSalidaUtil = jDateChooserSalida.getDate();

            if (nuevaFechaSalidaUtil == null) {
                JOptionPane.showMessageDialog(null, "Seleccione la nueva fecha de salida.");
                return;
            }

            String nuevaFechaSalida = new java.sql.Date(nuevaFechaSalidaUtil.getTime()).toString();

            // Buscar ID de reserva
            String sqlBuscar = "SELECT r.id_reserva FROM Clientes c "
                    + "JOIN Reservas r ON c.id_cliente = r.id_cliente "
                    + "WHERE c.dni_pasaporte = ? AND r.fecha_entrada = ?";
            PreparedStatement psBuscar = con.prepareStatement(sqlBuscar);
            psBuscar.setString(1, dniGlobal);
            psBuscar.setString(2, fechaEntradaGlobal);
            ResultSet rs = psBuscar.executeQuery();

            if (rs.next()) {
                int idReserva = rs.getInt("id_reserva");

                // Actualizar fecha de salida
                String sqlActualizar = "UPDATE Reservas SET fecha_salida = ? WHERE id_reserva = ?";
                PreparedStatement psActualizar = con.prepareStatement(sqlActualizar);
                psActualizar.setString(1, nuevaFechaSalida);
                psActualizar.setInt(2, idReserva);

                int filas = psActualizar.executeUpdate();

                if (filas > 0) {
                    JOptionPane.showMessageDialog(null, "Fecha de salida actualizada correctamente.");
                    this.dispose(); // opcional: cerrar la ventana
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar la fecha de salida.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la reserva con el DNI y fecha de entrada.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar: " + ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_BtnGuardarCambiosMouseClicked

    private void BtnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarCambiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGuardarCambiosActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EditarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardarCambios;
    private javax.swing.JButton BtnRegresar1;
    private javax.swing.JComboBox<String> CbEstado;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtDescripcion;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtDni;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtNumHabitacion;
    private javax.swing.JTextField TxtPrecioPorNoche;
    private javax.swing.JTextField TxtResPrecio;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JTextField TxtTipoH;
    private com.toedter.calendar.JDateChooser jDateChooserEntrada;
    private com.toedter.calendar.JDateChooser jDateChooserSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
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
