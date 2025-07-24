package VistaHotel;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblMinimizar = new javax.swing.JLabel();
        LblCerrar = new javax.swing.JLabel();
        LTitulo = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnCambiarContraseña = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnIniciarSesion = new javax.swing.JButton();
        TxtContraseña = new javax.swing.JPasswordField();
        PanelIzquierdo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(17, 50, 77));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MinimizarEV.png"))); // NOI18N
        LblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(LblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, 20));

        LblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarEV.png"))); // NOI18N
        LblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(LblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, 20));

        LTitulo.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        LTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LTitulo.setText("INICIO DE SESION");
        jPanel1.add(LTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 260, 50));

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
        TxtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtUsuarioKeyPressed(evt);
            }
        });
        jPanel1.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 240, 20));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USUARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTRASEÑA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        BtnCambiarContraseña.setBackground(new java.awt.Color(17, 50, 77));
        BtnCambiarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        BtnCambiarContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LlaveEV.png"))); // NOI18N
        BtnCambiarContraseña.setText("CAMBIAR CONTRASEÑA");
        BtnCambiarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCambiarContraseñaMouseClicked(evt);
            }
        });
        jPanel1.add(BtnCambiarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 190, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ContraseñaEV.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 50, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioEV.png"))); // NOI18N
        jLabel4.setText("jLabel3");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 50, -1));

        BtnIniciarSesion.setBackground(new java.awt.Color(17, 50, 77));
        BtnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BtnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IniciarEV.png"))); // NOI18N
        BtnIniciarSesion.setText("INICIAR SESION");
        BtnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnIniciarSesionMouseClicked(evt);
            }
        });
        jPanel1.add(BtnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 190, 40));

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
        TxtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtContraseñaActionPerformed(evt);
            }
        });
        TxtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtContraseñaKeyPressed(evt);
            }
        });
        jPanel1.add(TxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 240, 20));

        PanelIzquierdo.setBackground(new java.awt.Color(0, 0, 0));
        PanelIzquierdo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogLogin.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        PanelIzquierdo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 260, 320));

        jPanel1.add(PanelIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 450));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 240, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 240, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblMinimizarMouseClicked
        this.setExtendedState(ICONIFIED); // PARA MINIMIZAR EL PROGRAMA
    }//GEN-LAST:event_LblMinimizarMouseClicked

    private void LblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblCerrarMouseClicked
        //cogido para preguntar si se desea salir o no del programa
        int respuesta = JOptionPane.showConfirmDialog(
         Login.this, // Referencia al componente la ventana actual 
         "¿Deseas realmente salir?", // Mensaje que se muestra al usuario
         "Confirmación", // Título de la ventana de diálogo
         JOptionPane.YES_NO_OPTION // Tipo de opciones que se presentan al usuario (Sí y No)
        );

        if (respuesta == JOptionPane.YES_OPTION) { // Verifica si el usuario seleccionó "Sí"
            dispose(); // Cierra la ventana y libera los recursos
            System.exit(0); // Termina la aplicación por completo
        }
    }//GEN-LAST:event_LblCerrarMouseClicked

    private void BtnCambiarContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCambiarContraseñaMouseClicked
      
        CambioContraseña nuevoFormulario = new CambioContraseña();
        nuevoFormulario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnCambiarContraseñaMouseClicked

    private void TxtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtContraseñaActionPerformed

    private void TxtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtUsuarioKeyPressed
 
        // Verificar si se presionó la tecla Enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Verificar si el campo de texto está vacío
            if (TxtUsuario.getText().trim().isEmpty()) {
                // Mostrar mensaje si el campo está vacío
                JOptionPane.showMessageDialog(this, "Por favor, ingrese su usuario antes de continuar.");
                TxtUsuario.requestFocus();  // Enfocar nuevamente en el campo TxtUsuario
            } else {
                // Si hay texto, cambiar al siguiente campo de texto
                TxtContraseña.requestFocus();
            }
        }
    }//GEN-LAST:event_TxtUsuarioKeyPressed

    private void TxtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtContraseñaKeyPressed
        // Verificar si se presionó la tecla Enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Verificar si el campo de texto está vacío
            if (TxtContraseña.getText().trim().isEmpty()) {
                // Mostrar mensaje si el campo está vacío
                JOptionPane.showMessageDialog(this, "Por favor, ingrese su contraseña antes de continuar.");
                TxtContraseña.requestFocus();  // Enfocar nuevamente en el campo TxtUsuario
            } else {
                // Si hay texto llamar a validar ingreso   CREAR EL METODO VALIDAR 
            }
        }
    }//GEN-LAST:event_TxtContraseñaKeyPressed

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

    private void TxtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtContraseñaFocusGained
        // TODO add your handling code here:
        if (TxtContraseña.getText().equals("*****")) {
            TxtContraseña.setText(""); // Borra el texto por defecto al hacer clic
        }
    }//GEN-LAST:event_TxtContraseñaFocusGained

    private void TxtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtContraseñaFocusLost
        // TODO add your handling code here:

        if (TxtContraseña.getText().isEmpty()) {
            TxtContraseña.setText("*****"); // Reestablece el texto por defecto si está vacío
        }
    }//GEN-LAST:event_TxtContraseñaFocusLost

    private void BtnIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIniciarSesionMouseClicked
        validarIngreso();
    }//GEN-LAST:event_BtnIniciarSesionMouseClicked

    private int intentos = 0; //Variable para controlar el intentos de accesos incorrectos

// METODO VALIDAR INGRESO - INICIO
    private void validarIngreso() {  // Obtiene datos de los txt
        String usuario = TxtUsuario.getText();
        String contrasena = new String(TxtContraseña.getPassword());

        // Validación de campos vacíos o con texto por defecto
        if (usuario.equals("Ingrese su nombre de usuario") || contrasena.equals("*****")
         || usuario.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese sus datos.");
            return;// Sale del método si faltan datos
        }

        try {
            // Se usa la clase ConexionBD para no repetir código
            Connection connection = ConexionBaseDeDatos.ConexionBD.conectar();

            // Consulta para obtener el rol del usuario
            String query = "SELECT rol FROM usuarios WHERE NombreUsuario = ? AND contrasena = ?";
            // ejecutar sentencias de java .   preparara la consulta 
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, usuario);  //Verifica si hay coincidencia
            statement.setString(2, contrasena);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) { // Si hay resultado, el usuario es válido
                String rol = resultSet.getString("rol"); // Obtiene el rol del usuario
                JOptionPane.showMessageDialog(this, "¡Acceso correcto como " + rol + "!");
                intentos = 0; 
                      // Abre la ventana principal del sistema creando instancia de ese objeto 
                VentanaPrincipal nuevoFormulario = new VentanaPrincipal();
                   // Configura accesos según el rol del usuario 
                nuevoFormulario.configurarAccesoPorRol(rol);
                nuevoFormulario.setVisible(true); // formulario vista principal
                this.dispose();  // Cierra la ventana actual

            } else {
                intentos++;
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos. Intento " + intentos + " de 3.");
                TxtUsuario.setText("Ingrese su nombre de usuario");
                TxtContraseña.setText("*****");

                // Validar número de intentos
                if (intentos >= 3) {
                    JOptionPane.showMessageDialog(this, "Demasiados intentos fallidos. El sistema se cerrará.");
                    System.exit(0);
                }
            }

            // Cierre de recursos
            resultSet.close(); // liberar memoria
            statement.close(); // no saturar el servidor 
            connection.close(); // cierra la conexion 

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + e.getMessage());
        }
    }
// METODO VALIDAR INGRESO - FIN

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCambiarContraseña;
    private javax.swing.JButton BtnIniciarSesion;
    private javax.swing.JLabel LTitulo;
    private javax.swing.JLabel LblCerrar;
    private javax.swing.JLabel LblMinimizar;
    private javax.swing.JPanel PanelIzquierdo;
    private javax.swing.JPasswordField TxtContraseña;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
