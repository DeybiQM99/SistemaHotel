package VistaHotel;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import ConexionBaseDeDatos.ConexionBD;
import Interfaz.Limpiable;
import java.sql.ResultSet;

public class NuevoUsuario extends javax.swing.JFrame implements Limpiable {

    public NuevoUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @Override
    public void limpiarDatos() {
        TxtUsuario.setText("");
        TxtContrasena.setText("");
        CbRoll.setSelectedIndex(0); // Asume que el primer ítem es válido
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblTipoUsuario = new javax.swing.JLabel();
        LblUsuario = new javax.swing.JLabel();
        LblContrasena = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        CbRoll = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        BtnGuardarUsuario = new javax.swing.JButton();
        LblCerrar = new javax.swing.JLabel();
        LblMinimizar = new javax.swing.JLabel();
        TxtContrasena = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(17, 50, 77));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(17, 50, 77));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblTipoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LblTipoUsuario.setText("ROLL");
        jPanel1.add(LblTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 70, 20));

        LblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario.setText("USUARIO");
        jPanel1.add(LblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 90, -1));

        LblContrasena.setForeground(new java.awt.Color(255, 255, 255));
        LblContrasena.setText("CONTRASEÑA");
        jPanel1.add(LblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 110, -1));

        TxtUsuario.setBackground(new java.awt.Color(17, 50, 77));
        TxtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TxtUsuario.setBorder(null);
        jPanel1.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 150, 20));

        CbRoll.setBackground(new java.awt.Color(17, 50, 77));
        CbRoll.setForeground(new java.awt.Color(255, 255, 255));
        CbRoll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "gerente", "recepcion ", "rrhh" }));
        jPanel1.add(CbRoll, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 170, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 170, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 150, 10));

        BtnGuardarUsuario.setBackground(new java.awt.Color(17, 50, 77));
        BtnGuardarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarEV.png"))); // NOI18N
        BtnGuardarUsuario.setText("GUARDAR");
        BtnGuardarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGuardarUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(BtnGuardarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 140, 40));

        LblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarEV.png"))); // NOI18N
        LblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(LblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        LblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MinimizarEV.png"))); // NOI18N
        LblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(LblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        TxtContrasena.setBackground(new java.awt.Color(17, 50, 77));
        TxtContrasena.setForeground(new java.awt.Color(255, 255, 255));
        TxtContrasena.setBorder(null);
        jPanel1.add(TxtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 150, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 150, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblCerrarMouseClicked
        //cogido para preguntar si se desea salir o no del programa
        int respuesta = JOptionPane.showConfirmDialog(
         NuevoUsuario.this, // Referencia al componente la ventana actual
         "¿Deseas realmente salir?", // Mensaje que se muestra al usuario
         "Confirmación", // Título de la ventana de diálogo
         JOptionPane.YES_NO_OPTION // Tipo de opciones que se presentan al usuario (Sí y No)
        );

        if (respuesta == JOptionPane.YES_OPTION) { // Verifica si el usuario seleccionó "Sí"
            dispose(); // Cierra la ventana y libera los recursos

            VentanaPrincipal vp = new VentanaPrincipal();
            vp.setVisible(true);

        }
    }//GEN-LAST:event_LblCerrarMouseClicked

    private void LblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblMinimizarMouseClicked
        this.setExtendedState(ICONIFIED); // PARA MINIMIZAR EL PROGRAMA
    }//GEN-LAST:event_LblMinimizarMouseClicked

    private void BtnGuardarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarUsuarioMouseClicked

        String nombreUsuario = TxtUsuario.getText().trim();
        String contrasena = new String(TxtContrasena.getPassword()).trim(); // Recomendado con JPasswordField
        String rol = CbRoll.getSelectedItem() != null ? CbRoll.getSelectedItem().toString().toLowerCase() : "";
        // Validación básica
        if (nombreUsuario.isEmpty() || contrasena.isEmpty() || rol.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos: usuario, contraseña y rol.");
            return;
        }

        // Validación de usuario repetido (opcional pero recomendable)
        try (Connection conn = ConexionBD.conectar()) {
            if (conn != null) {

                // Verificar si el usuario ya existe
                String verificarSql = "SELECT COUNT(*) FROM Usuarios WHERE NombreUsuario = ?";
                PreparedStatement verificarPs = conn.prepareStatement(verificarSql);
                verificarPs.setString(1, nombreUsuario);
                ResultSet rs = verificarPs.executeQuery();
                if (rs.next() && rs.getInt(1) > 0) {
                    JOptionPane.showMessageDialog(null, "El nombre de usuario ya está en uso. Usa otro.");
                    return;
                }

                // Insertar nuevo usuario
                String insertarSql = "INSERT INTO Usuarios (NombreUsuario, contrasena, rol) VALUES (?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(insertarSql);
                ps.setString(1, nombreUsuario);
                ps.setString(2, contrasena);
                ps.setString(3, rol);

                int filas = ps.executeUpdate();

                if (filas > 0) {
                    JOptionPane.showMessageDialog(null, "Usuario registrado correctamente.");
                    limpiarDatos(); // Método de limpiar nuestros datos        
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo registrar el usuario.");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar usuario: " + e.getMessage());
        }


    }//GEN-LAST:event_BtnGuardarUsuarioMouseClicked

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
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardarUsuario;
    private javax.swing.JComboBox<String> CbRoll;
    private javax.swing.JLabel LblCerrar;
    private javax.swing.JLabel LblContrasena;
    private javax.swing.JLabel LblMinimizar;
    private javax.swing.JLabel LblTipoUsuario;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JPasswordField TxtContrasena;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
