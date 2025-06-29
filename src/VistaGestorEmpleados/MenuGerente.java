
package VistaGestorEmpleados;




import VistaHotel.Reservacion;
import VistaHotel.VentanaPrincipal;
import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import java.util.*;
import javax.swing.*;


public class MenuGerente extends javax.swing.JFrame {

    public MenuGerente() {
        initComponents();
        
                        
    }
    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelGerente = new javax.swing.JPanel();
        Empleados = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Pagos = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ContenidoGerente = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelGerente.setBackground(new java.awt.Color(0, 0, 0));

        Empleados.setBackground(new java.awt.Color(0, 0, 153));
        Empleados.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        Empleados.setForeground(new java.awt.Color(255, 255, 255));
        Empleados.setText("Empleados");
        Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadosActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Areas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 153));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Pagos.setBackground(new java.awt.Color(0, 0, 153));
        Pagos.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        Pagos.setForeground(new java.awt.Color(255, 255, 255));
        Pagos.setText("Pagos");
        Pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagosActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 153));
        jButton6.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Contratos");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 153));
        jButton7.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Reportes");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jokan5443\\Desktop\\Imagen de WhatsApp 2025-06-28 a las 17.27.41_ae88b174.jpg")); // NOI18N

        javax.swing.GroupLayout PanelGerenteLayout = new javax.swing.GroupLayout(PanelGerente);
        PanelGerente.setLayout(PanelGerenteLayout);
        PanelGerenteLayout.setHorizontalGroup(
            PanelGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGerenteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PanelGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pagos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        PanelGerenteLayout.setVerticalGroup(
            PanelGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGerenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Pagos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel1.add(PanelGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 580));

        ContenidoGerente.setBackground(new java.awt.Color(0, 0, 153));
        ContenidoGerente.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout ContenidoGerenteLayout = new javax.swing.GroupLayout(ContenidoGerente);
        ContenidoGerente.setLayout(ContenidoGerenteLayout);
        ContenidoGerenteLayout.setHorizontalGroup(
            ContenidoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        ContenidoGerenteLayout.setVerticalGroup(
            ContenidoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jPanel1.add(ContenidoGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 1120, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadosActionPerformed
    AdministrarEmpleados AdministrarEmpleados = new AdministrarEmpleados();
        AdministrarEmpleados.setSize(1120,580);
        AdministrarEmpleados.setLocation(0,0);
        
        ContenidoGerente.removeAll();
        ContenidoGerente.add(AdministrarEmpleados,BorderLayout.CENTER);
        ContenidoGerente.revalidate();
        ContenidoGerente.repaint();
    }//GEN-LAST:event_EmpleadosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     Areas Areas = new Areas();
        Areas.setSize(1120,580);
        Areas.setLocation(0,0);
        
        ContenidoGerente.removeAll();
        ContenidoGerente.add(Areas,BorderLayout.CENTER);
        ContenidoGerente.revalidate();
        ContenidoGerente.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void PagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagosActionPerformed
    AdministrarPagos AdministrarPagos = new AdministrarPagos();
        AdministrarPagos.setSize(1120,580);
        AdministrarPagos.setLocation(0,0);
        
        ContenidoGerente.removeAll();
        ContenidoGerente.add(AdministrarPagos,BorderLayout.CENTER);
        ContenidoGerente.revalidate();
        ContenidoGerente.repaint();
    }//GEN-LAST:event_PagosActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     int respuesta = JOptionPane.showConfirmDialog(
         MenuGerente.this, // Referencia al componente la ventana actual 
         "¿Deseas realmente salir?", // Mensaje que se muestra al usuario
         "Confirmación", // Título de la ventana de diálogo
         JOptionPane.YES_NO_OPTION // Tipo de opciones que se presentan al usuario (Sí y No)
        );
        if (respuesta == JOptionPane.YES_OPTION) { // Verifica si el usuario seleccionó "Sí"
            dispose(); // Cierra la ventana y libera los recursos
            VentanaPrincipal vprinc = new VentanaPrincipal();
            vprinc.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    AdministrarContratos AdministrarContratos = new AdministrarContratos();
        AdministrarContratos.setSize(1120,580);
        AdministrarContratos.setLocation(0,0);
        
        ContenidoGerente.removeAll();
        ContenidoGerente.add(AdministrarContratos,BorderLayout.CENTER);
        ContenidoGerente.revalidate();
        ContenidoGerente.repaint();   
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    AdministrarReportes AdministrarReportes = new AdministrarReportes();
        AdministrarReportes.setSize(1120,580);
        AdministrarReportes.setLocation(0,0);
        
        ContenidoGerente.removeAll();
        ContenidoGerente.add(AdministrarReportes,BorderLayout.CENTER);
        ContenidoGerente.revalidate();
        ContenidoGerente.repaint(); 
    }//GEN-LAST:event_jButton7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContenidoGerente;
    private javax.swing.JButton Empleados;
    private javax.swing.JButton Pagos;
    private javax.swing.JPanel PanelGerente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
