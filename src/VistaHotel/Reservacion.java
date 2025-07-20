package VistaHotel;

import com.mysql.cj.log.Log;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class Reservacion extends javax.swing.JFrame {
    // Variable de instancia para guardar la instancia actual de ReservarHabitacion
    private ReservarHabitacion rh;
    
    public Reservacion() {
        initComponents();
        this.setLocationRelativeTo(null); // centra el Jframe
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BtnRegresar = new javax.swing.JButton();
        BtnReservacion = new javax.swing.JButton();
        BtnServicioAdicional = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtnProductos = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        BtnSalidaHabitacion = new javax.swing.JButton();
        JpContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(17, 50, 77));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnRegresar.setBackground(new java.awt.Color(17, 50, 77));
        BtnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RegresarEV.png"))); // NOI18N
        BtnRegresar.setText("SALIR");
        BtnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegresarMouseClicked(evt);
            }
        });
        jPanel2.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 130, 40));

        BtnReservacion.setBackground(new java.awt.Color(17, 50, 77));
        BtnReservacion.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reserva.png"))); // NOI18N
        BtnReservacion.setText("RESERVACION");
        BtnReservacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnReservacionMouseClicked(evt);
            }
        });
        jPanel2.add(BtnReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, 40));

        BtnServicioAdicional.setBackground(new java.awt.Color(17, 50, 77));
        BtnServicioAdicional.setForeground(new java.awt.Color(255, 255, 255));
        BtnServicioAdicional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/servicio-de-habitaciones.png"))); // NOI18N
        BtnServicioAdicional.setText("SERVICIO ADICIONAL");
        BtnServicioAdicional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnServicioAdicionalMouseClicked(evt);
            }
        });
        jPanel2.add(BtnServicioAdicional, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 180, 40));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogRecepcion.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, 110));

        BtnProductos.setBackground(new java.awt.Color(17, 50, 77));
        BtnProductos.setForeground(new java.awt.Color(255, 255, 255));
        BtnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carrito.png"))); // NOI18N
        BtnProductos.setText("PRODUCTOS");
        BtnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnProductosMouseClicked(evt);
            }
        });
        jPanel2.add(BtnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 180, 40));

        jButton8.setBackground(new java.awt.Color(17, 50, 77));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Factura.png"))); // NOI18N
        jButton8.setText("FACTURA");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 180, 40));

        BtnSalidaHabitacion.setBackground(new java.awt.Color(17, 50, 77));
        BtnSalidaHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        BtnSalidaHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SalidaHabitacion.png"))); // NOI18N
        BtnSalidaHabitacion.setText("SALIDAS");
        BtnSalidaHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalidaHabitacionMouseClicked(evt);
            }
        });
        jPanel2.add(BtnSalidaHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 180, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 490));

        JpContent.setBackground(new java.awt.Color(255, 255, 255));
        JpContent.setLayout(new java.awt.CardLayout());
        jPanel1.add(JpContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 760, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProductosMouseClicked
        Producto pr = new Producto();
        pr.setSize(750, 450);
        pr.setLocation(0, 0);
        JpContent.removeAll();
        JpContent.add(pr, BorderLayout.CENTER);
        JpContent.revalidate();
        JpContent.repaint();
    }//GEN-LAST:event_BtnProductosMouseClicked

    private void BtnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegresarMouseClicked
        int respuesta = JOptionPane.showConfirmDialog(
         Reservacion.this, // Referencia al componente la ventana actual 
         "¿Deseas realmente salir?", // Mensaje que se muestra al usuario
         "Confirmación", // Título de la ventana de diálogo
         JOptionPane.YES_NO_OPTION // Tipo de opciones que se presentan al usuario (Sí y No)
        );
        if (respuesta == JOptionPane.YES_OPTION) { // Verifica si el usuario seleccionó "Sí"
            dispose(); // Cierra la ventana y libera los recursos
            Login log = new Login();
            log.setVisible(true);
        }
        
        
    }//GEN-LAST:event_BtnRegresarMouseClicked

    private void BtnReservacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnReservacionMouseClicked
        rh = new ReservarHabitacion();
        rh.setSize(750, 450);
        rh.setLocation(0, 0);
        JpContent.removeAll();
        JpContent.add(rh, BorderLayout.CENTER);
        JpContent.revalidate();
        JpContent.repaint();
    }//GEN-LAST:event_BtnReservacionMouseClicked

    private void BtnServicioAdicionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnServicioAdicionalMouseClicked
        ServicioAdicional sradicional = new ServicioAdicional();
        sradicional.setSize(750, 450);
        sradicional.setLocation(0, 0);
        JpContent.removeAll();
        JpContent.add(sradicional, BorderLayout.CENTER); // SE ESTA CAMBINDO EL JPANEL COMO CARD LAYAUT PARAQ UE DESAPARESCA EL BLANCO 
        JpContent.revalidate();
        JpContent.repaint();
    }//GEN-LAST:event_BtnServicioAdicionalMouseClicked

    private void BtnSalidaHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalidaHabitacionMouseClicked
        // TODO add your handling code here:
        SalidaHabitacion salidaPanel = new SalidaHabitacion();
        salidaPanel.setSize(750, 450);
        salidaPanel.setLocation(0, 0);
      
        JpContent.removeAll();
        JpContent.add(salidaPanel, BorderLayout.CENTER);
        JpContent.revalidate();
        JpContent.repaint();
    }//GEN-LAST:event_BtnSalidaHabitacionMouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
     
        
        Factura_1 facttura = new Factura_1();
        facttura.setVisible(true); 
        
        
        
    }//GEN-LAST:event_jButton8MouseClicked

//Método para obtener la instancia actual de ReservarHabitacion
    public ReservarHabitacion getReservarHabitacion() {
        return rh;
    }

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
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnProductos;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton BtnReservacion;
    private javax.swing.JButton BtnSalidaHabitacion;
    private javax.swing.JButton BtnServicioAdicional;
    private javax.swing.JPanel JpContent;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
