package VistaHotel;

import VistaGestorEmpleados.MenuEmpleado;
import VistaGestorEmpleados.MenuGerente;
import VistaGestorEmpleados.Prueba;
import javax.swing.JOptionPane;
import javax.swing.UIClientPropertyKey;
import javax.swing.UIManager;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        LblModoRol.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbGerente = new javax.swing.JLabel();
        lbRecepcion = new javax.swing.JLabel();
        BtnRegresar = new javax.swing.JButton();
        LblMinimizar = new javax.swing.JLabel();
        LblCerrar = new javax.swing.JLabel();
        lbEmpleado = new javax.swing.JLabel();
        LblModoRol = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BtnCrearUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(17, 50, 77));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbGerente.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        lbGerente.setForeground(new java.awt.Color(255, 255, 255));
        lbGerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/revisar (3).png"))); // NOI18N
        lbGerente.setText("GERENTE");
        lbGerente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbGerente.setMaximumSize(new java.awt.Dimension(40, 16));
        lbGerente.setMinimumSize(new java.awt.Dimension(40, 16));
        lbGerente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbGerenteMouseClicked(evt);
            }
        });
        jPanel1.add(lbGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 240, 200));

        lbRecepcion.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        lbRecepcion.setForeground(new java.awt.Color(255, 255, 255));
        lbRecepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reservar-mas.png"))); // NOI18N
        lbRecepcion.setText("RESERVACION");
        lbRecepcion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbRecepcion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lbRecepcion.setMaximumSize(new java.awt.Dimension(40, 16));
        lbRecepcion.setMinimumSize(new java.awt.Dimension(40, 16));
        lbRecepcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRecepcionMouseClicked(evt);
            }
        });
        jPanel1.add(lbRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 260, 200));

        BtnRegresar.setBackground(new java.awt.Color(17, 50, 77));
        BtnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RegresarEV.png"))); // NOI18N
        BtnRegresar.setText("Regresar");
        BtnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegresarMouseClicked(evt);
            }
        });
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, 150, 40));

        LblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MinimizarEV.png"))); // NOI18N
        LblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(LblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, 20));

        LblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarEV.png"))); // NOI18N
        LblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(LblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, 20));

        lbEmpleado.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        lbEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        lbEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/revisar (3).png"))); // NOI18N
        lbEmpleado.setText("EMPLEADOS");
        lbEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbEmpleado.setMaximumSize(new java.awt.Dimension(40, 16));
        lbEmpleado.setMinimumSize(new java.awt.Dimension(40, 16));
        lbEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEmpleadoMouseClicked(evt);
            }
        });
        jPanel1.add(lbEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 240, 200));

        LblModoRol.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LblModoRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 140, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ROLL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 60, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 140, -1));

        BtnCrearUsuario.setBackground(new java.awt.Color(17, 50, 77));
        BtnCrearUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BtnCrearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarUsuario.png"))); // NOI18N
        BtnCrearUsuario.setText("Nuevo Usuario");
        BtnCrearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCrearUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(BtnCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegresarMouseClicked
        // TODO add your handling code here:
        /* Ir al formulario Login2*/
        Login retornologin = new Login();
        retornologin.setVisible(true);
        /*CIERRA EL FORMULARIO ACTUAL*/
        this.dispose(); // finaliza el  jframe pero no cierra el programa por completo

    }//GEN-LAST:event_BtnRegresarMouseClicked

    private void LblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblMinimizarMouseClicked
        this.setExtendedState(ICONIFIED); // PARA MINIMIZAR EL PROGRAMA
    }//GEN-LAST:event_LblMinimizarMouseClicked

    private void LblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblCerrarMouseClicked
        //cogido para preguntar si se desea salir o no del programa
        int respuesta = JOptionPane.showConfirmDialog(
         VentanaPrincipal.this, // Referencia al componente la ventana actual (Login)
         "¿Deseas realmente salir?", // Mensaje que se muestra al usuario
         "Confirmación", // Título de la ventana de diálogo
         JOptionPane.YES_NO_OPTION // Tipo de opciones que se presentan al usuario (Sí y No)
        );

        if (respuesta == JOptionPane.YES_OPTION) { // Verifica si el usuario seleccionó "Sí"
            dispose(); // Cierra la ventana y libera los recursos
            System.exit(0); // Termina la aplicación por completo
        }
    }//GEN-LAST:event_LblCerrarMouseClicked

    private void lbRecepcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRecepcionMouseClicked

        if (!lbRecepcion.isEnabled()) {
            return;
        }

        // Cierra el formulario actual
        this.dispose();
        // Crea y muestra el siguiente formulario
        Reservacion reserv = new Reservacion();// Reemplaza con tu clase de formulario
        reserv.setVisible(true); //  Hace visible la instancia de 'Login2',


    }//GEN-LAST:event_lbRecepcionMouseClicked

    private void lbGerenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGerenteMouseClicked

        if (!lbGerente.isEnabled()) {
            return;
        }
        this.dispose();
        // Crea y muestra el siguiente formulario
        MenuGerente reserwv = new MenuGerente();// Reemplaza con tu clase de formulario
        reserwv.setVisible(true); //  Hace visible la instancia. 

        // ESTA MAL 
    }//GEN-LAST:event_lbGerenteMouseClicked

    private void lbEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEmpleadoMouseClicked

        if (!lbEmpleado.isEnabled()) {
            return; // Bloquea el clic si está desactivado
        }
        this.dispose();
        // Crea y muestra el siguiente formulario
        MenuEmpleado reserwv = new MenuEmpleado();// Reemplaza con tu clase de formulario
        reserwv.setVisible(true); //  Hace visible la instancia.


    }//GEN-LAST:event_lbEmpleadoMouseClicked

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnCrearUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCrearUsuarioMouseClicked
    
        NuevoUsuario numUsu = new NuevoUsuario();
        numUsu.setVisible(true);
 this.dispose();

    }//GEN-LAST:event_BtnCrearUsuarioMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // MÉTODO PÚBLICO para configurar accesos según rol
    public void configurarAccesoPorRol(String rol) {

        // Desactivar todos por defecto
        lbEmpleado.setEnabled(false);
        lbGerente.setEnabled(false);
        lbRecepcion.setEnabled(false);
        switch (rol.toLowerCase()) {
            case "gerente":
                lbRecepcion.setEnabled(true);
                lbEmpleado.setEnabled(true);
                lbGerente.setEnabled(true);
                BtnCrearUsuario.setVisible(true);
                LblModoRol.setText("GERENTE");

                break;
            case "recepcion":
                lbRecepcion.setEnabled(true);
                lbEmpleado.setEnabled(false);
                lbGerente.setEnabled(false);
                BtnCrearUsuario.setVisible(false);
                LblModoRol.setText("RECEPCIONISTA");
                break;
            case "rrhh":
                lbRecepcion.setEnabled(false);
                lbEmpleado.setEnabled(true);
                lbGerente.setEnabled(false);
                BtnCrearUsuario.setVisible(false);
                LblModoRol.setText("RR.HH");
                break;
            default:

                JOptionPane.showMessageDialog(this, "Rol no reconocido: " + rol);
                LblModoRol.setVisible(false); // Ocultar si el rol no es válido
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrearUsuario;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JLabel LblCerrar;
    private javax.swing.JLabel LblMinimizar;
    private javax.swing.JLabel LblModoRol;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbEmpleado;
    private javax.swing.JLabel lbGerente;
    private javax.swing.JLabel lbRecepcion;
    // End of variables declaration//GEN-END:variables
}
