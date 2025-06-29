package VistaGestorEmpleados;

import VistaHotel.VentanaPrincipal;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;


public class MenuGerente extends javax.swing.JFrame {

    public MenuGerente() {
        initComponents();
        
        Icon miIcono = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/logoHotelOscuro.jpg")).getImage().getScaledInstance(lbImagen.getWidth(), lbImagen.getHeight(), 0));
        lbImagen.setIcon(miIcono);
        lbImagen.setOpaque(true);
        
        panelPrincipal.setSize(600, 1000);
        panelMenu.setSize(160, 600);
        panelContenido.setSize(840, 600);
    }
    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        lbImagen = new javax.swing.JLabel();
        btnPersonal = new javax.swing.JButton();
        btnNominas = new javax.swing.JButton();
        btnAscensos = new javax.swing.JButton();
        btnJerarquia = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        panelContenido = new javax.swing.JPanel();
        lbImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelPrincipal.setLayout(null);

        panelMenu.setBackground(new java.awt.Color(0, 0, 0));

        lbImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbImagenMouseClicked(evt);
            }
        });

        btnPersonal.setBackground(new java.awt.Color(17, 50, 77));
        btnPersonal.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        btnPersonal.setForeground(new java.awt.Color(255, 255, 255));
        btnPersonal.setText("Personal");
        btnPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalActionPerformed(evt);
            }
        });

        btnNominas.setBackground(new java.awt.Color(17, 50, 77));
        btnNominas.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        btnNominas.setForeground(new java.awt.Color(255, 255, 255));
        btnNominas.setText("Nominas");
        btnNominas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNominasActionPerformed(evt);
            }
        });

        btnAscensos.setBackground(new java.awt.Color(17, 50, 77));
        btnAscensos.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        btnAscensos.setForeground(new java.awt.Color(255, 255, 255));
        btnAscensos.setText("Ascensos");
        btnAscensos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAscensosActionPerformed(evt);
            }
        });

        btnJerarquia.setBackground(new java.awt.Color(17, 50, 77));
        btnJerarquia.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        btnJerarquia.setForeground(new java.awt.Color(255, 255, 255));
        btnJerarquia.setText("Jerarquia");
        btnJerarquia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJerarquiaActionPerformed(evt);
            }
        });

        btnReportes.setBackground(new java.awt.Color(17, 50, 77));
        btnReportes.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setText("Reportes");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(17, 50, 77));
        btnVolver.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnJerarquia, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNominas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAscensos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnNominas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnAscensos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnJerarquia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        panelPrincipal.add(panelMenu);
        panelMenu.setBounds(0, 0, 160, 600);

        panelContenido.setBackground(new java.awt.Color(17, 50, 77));
        panelContenido.setForeground(new java.awt.Color(102, 102, 102));
        panelContenido.setLayout(new java.awt.BorderLayout());

        lbImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoAdmin.jpg"))); // NOI18N
        panelContenido.add(lbImagenFondo, java.awt.BorderLayout.CENTER);

        panelPrincipal.add(panelContenido);
        panelContenido.setBounds(160, 0, 840, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalActionPerformed
        // Crear instancia del nuevo panel
        GerentePersonal personal = new GerentePersonal();
        personal.setPreferredSize(new Dimension(840, 600));
        
        panelContenido.removeAll();
        panelContenido.add(personal, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnPersonalActionPerformed

    private void btnNominasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNominasActionPerformed
        // Crear instancia del nuevo panel
        GerenteNominas nominas = new GerenteNominas();
        nominas.setPreferredSize(new Dimension(840, 600));

        // Agregarlo al panel contenedor
        panelContenido.removeAll();
        panelContenido.add(nominas, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnNominasActionPerformed

    private void btnAscensosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAscensosActionPerformed
        // Crear instancia del nuevo panel
        GerenteAscensos ascensos = new GerenteAscensos();
        ascensos.setPreferredSize(new Dimension(840, 600));
        
        panelContenido.removeAll();
        panelContenido.add(ascensos,BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnAscensosActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
     int respuesta = JOptionPane.showConfirmDialog(MenuGerente.this, // Referencia al componente la ventana actual 
         "¿Deseas realmente salir?", // Mensaje que se muestra al usuario
         "Confirmación", // Título de la ventana de diálogo
         JOptionPane.YES_NO_OPTION // Tipo de opciones que se presentan al usuario (Sí y No)
        );
        if (respuesta == JOptionPane.YES_OPTION) { // Verifica si el usuario seleccionó "Sí"
            dispose(); // Cierra la ventana y libera los recursos
            VentanaPrincipal vprinc = new VentanaPrincipal();
            vprinc.setVisible(true);
        }
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnJerarquiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJerarquiaActionPerformed
        GerenteJerarquia jerarquia = new GerenteJerarquia();
        jerarquia.setPreferredSize(new Dimension(840, 600));
        
        panelContenido.removeAll();
        panelContenido.add(jerarquia,BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();   
    }//GEN-LAST:event_btnJerarquiaActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        GerenteReportes reportes = new GerenteReportes();
        reportes.setPreferredSize(new Dimension(840, 600));
        
        panelContenido.removeAll();
        panelContenido.add(reportes,BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnReportesActionPerformed

    private void lbImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbImagenMouseClicked
        GerenteLogo logo = new GerenteLogo();
        logo.setPreferredSize(new Dimension(840, 600));
        
        panelContenido.removeAll();
        panelContenido.add(logo,BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_lbImagenMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAscensos;
    private javax.swing.JButton btnJerarquia;
    private javax.swing.JButton btnNominas;
    private javax.swing.JButton btnPersonal;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JLabel lbImagenFondo;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
