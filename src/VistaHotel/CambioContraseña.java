package VistaHotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*PARA IMPORTAER DE GESTION USUARIOS PARA LA CONSULTA Y ACTUALIZACION DE LAS CREDENCIALES DE ACCESO*/
import GestionReservas.Usuario;
import GestionReservas.GestorUsuarios;

public class CambioContraseña extends javax.swing.JFrame {

    public CambioContraseña() {
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR EL JFRAME
        // OCULTAMOS LAS IMAGENES DE VISIBILIDAD AL INICIALIZAR EL PROGRAMA
        this.ocultar.setVisible(false);
        this.ocultar1.setVisible(false);
        this.ocultar2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblUsuario2 = new javax.swing.JLabel();
        LblUsuario1 = new javax.swing.JLabel();
        LblUsuario3 = new javax.swing.JLabel();
        LblUsuario = new javax.swing.JLabel();
        TxtContraseña = new javax.swing.JPasswordField();
        TxtNContraseña1 = new javax.swing.JPasswordField();
        TxtNContraseña2 = new javax.swing.JPasswordField();
        TxtUsuario = new javax.swing.JTextField();
        ver = new javax.swing.JLabel();
        ver1 = new javax.swing.JLabel();
        ver2 = new javax.swing.JLabel();
        ocultar = new javax.swing.JLabel();
        ocultar1 = new javax.swing.JLabel();
        ocultar2 = new javax.swing.JLabel();
        BtnAceptar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(17, 50, 77));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblUsuario2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario2.setText("CONTRASEÑA ACTUAL");
        jPanel1.add(LblUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 210, 33));

        LblUsuario1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario1.setText("USUARIO");
        jPanel1.add(LblUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 90, 33));

        LblUsuario3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblUsuario3.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario3.setText("NUEVA CONTRASEÑA");
        jPanel1.add(LblUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 200, 33));

        LblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario.setText("REPETIR CONTRASEÑA");
        jPanel1.add(LblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 210, 33));

        TxtContraseña.setBackground(new java.awt.Color(17, 50, 77));
        TxtContraseña.setForeground(new java.awt.Color(204, 204, 255));
        TxtContraseña.setText("*****");
        TxtContraseña.setBorder(null);
        TxtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtContraseñaFocusLost(evt);
            }
        });
        jPanel1.add(TxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 270, 20));

        TxtNContraseña1.setBackground(new java.awt.Color(17, 50, 77));
        TxtNContraseña1.setForeground(new java.awt.Color(204, 204, 255));
        TxtNContraseña1.setText("*****");
        TxtNContraseña1.setBorder(null);
        TxtNContraseña1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtNContraseña1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtNContraseña1FocusLost(evt);
            }
        });
        jPanel1.add(TxtNContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 270, 20));

        TxtNContraseña2.setBackground(new java.awt.Color(17, 50, 77));
        TxtNContraseña2.setForeground(new java.awt.Color(204, 204, 255));
        TxtNContraseña2.setText("*****");
        TxtNContraseña2.setBorder(null);
        TxtNContraseña2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtNContraseña2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtNContraseña2FocusLost(evt);
            }
        });
        jPanel1.add(TxtNContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 270, 20));

        TxtUsuario.setBackground(new java.awt.Color(17, 50, 77));
        TxtUsuario.setForeground(new java.awt.Color(204, 204, 255));
        TxtUsuario.setText("Ingrese su nombre de usuario");
        TxtUsuario.setBorder(null);
        TxtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtUsuarioFocusLost(evt);
            }
        });
        jPanel1.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 270, 20));

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver.png"))); // NOI18N
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });
        jPanel1.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, -1));

        ver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver.png"))); // NOI18N
        ver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ver1MouseClicked(evt);
            }
        });
        jPanel1.add(ver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));

        ver2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver.png"))); // NOI18N
        ver2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ver2MouseClicked(evt);
            }
        });
        jPanel1.add(ver2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, -1));

        ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ocultar.png"))); // NOI18N
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });
        jPanel1.add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, -1));

        ocultar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ocultar.png"))); // NOI18N
        ocultar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultar1MouseClicked(evt);
            }
        });
        jPanel1.add(ocultar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));

        ocultar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ocultar.png"))); // NOI18N
        ocultar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultar2MouseClicked(evt);
            }
        });
        jPanel1.add(ocultar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, -1));

        BtnAceptar.setBackground(new java.awt.Color(17, 50, 77));
        BtnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        BtnAceptar.setText("GUARDAR");
        BtnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAceptarMouseClicked(evt);
            }
        });
        jPanel1.add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 150, 40));

        BtnRegresar.setBackground(new java.awt.Color(17, 50, 77));
        BtnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RegresarEV.png"))); // NOI18N
        BtnRegresar.setText("REGRESAR");
        BtnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 150, 40));

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 40, 420));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CAMBIAR CONTRASEÑA");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 380, 53));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 680, 70));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 270, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 270, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 270, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 270, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtContraseñaFocusGained
        // TODO add your handling code here:

        if (TxtContraseña.getText().equals("*****")) {
            TxtContraseña.setText(""); // Borra el texto por defecto al hacer clic
        }
    }//GEN-LAST:event_TxtContraseñaFocusGained

    private void TxtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtContraseñaFocusLost
        // TODO add your handling code here:
        if (TxtContraseña.getText().isEmpty()) {  // Si el campo de la contraseña está vacío
            TxtContraseña.setText("*****"); // Reestablece el texto por defecto si está vacío       
        }
    }//GEN-LAST:event_TxtContraseñaFocusLost

    private void TxtNContraseña1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNContraseña1FocusGained
        // TODO add your handling code here:
        if (TxtNContraseña1.getText().equals("*****")) {
            TxtNContraseña1.setText(""); // Borra el texto por defecto al hacer clic
        }

    }//GEN-LAST:event_TxtNContraseña1FocusGained

    private void TxtNContraseña1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNContraseña1FocusLost
        // TODO add your handling code here:
        if (TxtNContraseña1.getText().isEmpty()) { // si esta vacio
            TxtNContraseña1.setText("*****"); // Reestablece el texto por defecto si está vacío       
        }
    }//GEN-LAST:event_TxtNContraseña1FocusLost

    private void TxtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtUsuarioFocusGained
        // TODO add your handling code here:
        if (TxtUsuario.getText().equals("Ingrese su nombre de usuario")) {
            TxtUsuario.setText(""); // Borra el texto por defecto al hacer clic
        }
    }//GEN-LAST:event_TxtUsuarioFocusGained

    private void TxtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtUsuarioFocusLost
        // TODO add your handling code here:
        if (TxtUsuario.getText().isEmpty()) {
            TxtUsuario.setText("Ingrese su nombre de usuario"); // Reestablece el texto por defecto si está vacío
        }
    }//GEN-LAST:event_TxtUsuarioFocusLost

    private void TxtNContraseña2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNContraseña2FocusGained
        // TODO add your handling code here:

        if (TxtNContraseña2.getText().equals("*****")) {
            TxtNContraseña2.setText(""); // Borra el texto por defecto al hacer clic
        }
    }//GEN-LAST:event_TxtNContraseña2FocusGained

    private void TxtNContraseña2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNContraseña2FocusLost
        // TODO add your handling code here:
        if (TxtNContraseña2.getText().isEmpty()) {
            TxtNContraseña2.setText("*****"); // Reestablece el texto por defecto si está vacío       
        }
    }//GEN-LAST:event_TxtNContraseña2FocusLost

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        // TODO add your handling code here:
        ver.setVisible(false);
        ocultar.setVisible(true);
        TxtContraseña.setEchoChar((char) 0);
        //se usa para hacer que no se muestre ningún carácter de eco (como *) en el campo de contraseña,

    }//GEN-LAST:event_verMouseClicked

    private void ver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver1MouseClicked
        // TODO add your handling code here:

        ver1.setVisible(false);
        ocultar1.setVisible(true);
        TxtNContraseña1.setEchoChar((char) 0);
    }//GEN-LAST:event_ver1MouseClicked

    private void ver2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver2MouseClicked
        // TODO add your handling code here:
        ver2.setVisible(false);
        ocultar2.setVisible(true);
        TxtNContraseña2.setEchoChar((char) 0);

    }//GEN-LAST:event_ver2MouseClicked

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMouseClicked
        // setEchoChar se utiliza para establecer un carácter de "eco" en un JPasswordField

        TxtContraseña.setEchoChar('*'); // para poner la contraseña de nuevo en caracter
        ver.setVisible(true);
        ocultar.setVisible(false);
    }//GEN-LAST:event_ocultarMouseClicked

    private void ocultar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultar1MouseClicked
        TxtNContraseña1.setEchoChar('*'); // para poner la contraseña de nuevo en caracter
        ver1.setVisible(true);
        ocultar1.setVisible(false);
    }//GEN-LAST:event_ocultar1MouseClicked

    private void ocultar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultar2MouseClicked
        TxtNContraseña2.setEchoChar('*'); // para poner la contraseña de nuevo en caracter
        ver2.setVisible(true);
        ocultar2.setVisible(false);
    }//GEN-LAST:event_ocultar2MouseClicked

    private void BtnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegresarMouseClicked
        // TODO add your handling code here:

        Login retornologin = new Login();
        retornologin.setVisible(true);
        /*CIERRA EL FORMULARIO ACTUAL*/
        this.dispose(); // finaliza el  jframe pero no cierra el programa por completo 


    }//GEN-LAST:event_BtnRegresarMouseClicked

    private void BtnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAceptarMouseClicked
        CambioContrasena();
    }//GEN-LAST:event_BtnAceptarMouseClicked

// METODO CAMBIO DE CONTRASEÑA - INICIO
    private void CambioContrasena() {

        String usuario = TxtUsuario.getText();
        String contrasena = new String(TxtContraseña.getPassword());
        String ncontrasena1 = new String(TxtNContraseña1.getPassword());
        String ncontrasena2 = new String(TxtNContraseña2.getPassword());
        String contrasenactual;

        // Validación de campos vacíos o con valores por defecto
        if (usuario.equals("Ingrese su nombre de usuario") || contrasena.equals("*****")
         || ncontrasena1.equals("*****") || ncontrasena2.equals("*****")
         || usuario.isEmpty() || contrasena.isEmpty() || ncontrasena1.isEmpty() || ncontrasena2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese sus datos.");
            return;
        }

        // Validar que las nuevas contraseñas coincidan
        if (!ncontrasena1.equals(ncontrasena2)) {
            JOptionPane.showMessageDialog(this, "Contraseñas no coinciden");
            TxtNContraseña1.setText("");
            TxtNContraseña2.setText("");
            return;
        }

        contrasenactual = ncontrasena1;

        // Crear objeto Usuario con los datos ingresados
        Usuario usuarioObj = new Usuario(usuario, contrasena);

        // Crear instancia del gestor que maneja la lógica con la BD
        GestorUsuarios gestor = new GestorUsuarios();

        // Verificar si el usuario y contraseña actuales son correctos
        if (!gestor.validarUsuario(usuarioObj.getNombreUsuario(), usuarioObj.getContrasena())) {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña actual incorrectos");
            TxtUsuario.setText("Ingrese su nombre de usuario");
            TxtContraseña.setText("*****");
            TxtNContraseña1.setText("*****");
            TxtNContraseña2.setText("*****");
            return;
        }

        // Intentar actualizar la contraseña
        if (gestor.actualizarContraseña(usuarioObj.getNombreUsuario(), usuarioObj.getContrasena(), contrasenactual)) {
            JOptionPane.showMessageDialog(this, "La contraseña se actualizó correctamente.");
            Login retornologin = new Login();
            retornologin.setVisible(true);
            this.dispose();  // Cierra esta ventana
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar la contraseña.");
        }

    }
// METODO CAMBIO DE CONTRASEÑA - FIN

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
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambioContraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JLabel LblUsuario1;
    private javax.swing.JLabel LblUsuario2;
    private javax.swing.JLabel LblUsuario3;
    private javax.swing.JPasswordField TxtContraseña;
    private javax.swing.JPasswordField TxtNContraseña1;
    private javax.swing.JPasswordField TxtNContraseña2;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel ocultar;
    private javax.swing.JLabel ocultar1;
    private javax.swing.JLabel ocultar2;
    private javax.swing.JLabel ver;
    private javax.swing.JLabel ver1;
    private javax.swing.JLabel ver2;
    // End of variables declaration//GEN-END:variables
}
