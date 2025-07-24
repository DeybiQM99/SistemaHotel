package VistaHotel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class CargaInicio extends javax.swing.JFrame {
    // Variables para la barra, progreso y el temporizador
    private JProgressBar progressBar; // para referenciar la barra de progreso del formulario,
    private int progreso = 0; // inicia en 0
    private Timer timer; // Para manejar la actualización del progreso

    public CargaInicio() {
        initComponents();
        this.setLocationRelativeTo(null); // centra el Jframe

        // Asigna el progressBar al jProgressBar1
        progressBar = jProgressBar1;

        // Configuración del Timer para actualizar la ProgressBar
        timer = new Timer(50, new ActionListener() { // cada 50 milisegundos
            @Override
            public void actionPerformed(ActionEvent e) {
                progreso += 1; // Incrementa el valor  'progreso' en 1
                progressBar.setValue(progreso); // Actualiza el valor de la ProgressBar
                if (progreso >= 100) { // verifica si el progres bar a llegado al 100%
                    timer.stop();  //Si es así, detiene el Timer para que deje de ejecutarse
                    openNextForm();
                }
            }
        });
        timer.start(); // Inicia el Timer
    }

    private void openNextForm() {
     
        // Cierra el formulario actual
        this.dispose();
        // Crea y muestra el siguiente formulario
        Login login = new Login();// Reemplaza con tu clase de formulario
        login.setVisible(true); //  Hace visible la instancia de 'Login2',
        // FIN
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 153));
        setMaximumSize(new java.awt.Dimension(520, 450));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(17, 50, 77));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 420));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 420, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoHotel.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 10, 820, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CargaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
