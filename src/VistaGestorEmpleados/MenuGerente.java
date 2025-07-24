package VistaGestorEmpleados;

import GestionEmpleados.GestorEmpleados;
import VistaHotel.VentanaPrincipal;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;


public class MenuGerente extends javax.swing.JFrame {

    GestorEmpleados gestor;
    
    public MenuGerente(GestorEmpleados gestor) {
        initComponents();
        
        this.gestor = gestor;
        
        Icon miIcono = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/logoHotelOscuro.jpg")).getImage().getScaledInstance(lbImagen.getWidth(), lbImagen.getHeight(), 0));
        lbImagen.setIcon(miIcono);
        lbImagen.setOpaque(true);
        
        panelPrincipal.setSize(600, 1000);
        panelMenu.setSize(160, 600);
        panelContenido.setSize(850, 600);
    }
    public MenuGerente() {
        initComponents();
        
        gestor = new GestorEmpleados();
        
        Icon miIcono = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/logoHotelOscuro.jpg")).getImage().getScaledInstance(lbImagen.getWidth(), lbImagen.getHeight(), 0));
        lbImagen.setIcon(miIcono);
        lbImagen.setOpaque(true);
        
        panelPrincipal.setSize(600, 1000);
        panelMenu.setSize(160, 600);
        panelContenido.setSize(850, 600);
    }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        lbImagen = new javax.swing.JLabel();
        btnPersonal = new javax.swing.JButton();
        btnNominas = new javax.swing.JButton();
        btnContrato = new javax.swing.JButton();
        btnIncidencias = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnJerarquias = new javax.swing.JButton();
        btnAreas = new javax.swing.JButton();
        panelContenido = new javax.swing.JPanel();
        lbImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        btnContrato.setBackground(new java.awt.Color(17, 50, 77));
        btnContrato.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        btnContrato.setForeground(new java.awt.Color(255, 255, 255));
        btnContrato.setText("Contratos");
        btnContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoActionPerformed(evt);
            }
        });

        btnIncidencias.setBackground(new java.awt.Color(17, 50, 77));
        btnIncidencias.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        btnIncidencias.setForeground(new java.awt.Color(255, 255, 255));
        btnIncidencias.setText("Incidencias");
        btnIncidencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncidenciasActionPerformed(evt);
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

        btnJerarquias.setBackground(new java.awt.Color(17, 50, 77));
        btnJerarquias.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        btnJerarquias.setForeground(new java.awt.Color(255, 255, 255));
        btnJerarquias.setText("Jerarquias");
        btnJerarquias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJerarquiasActionPerformed(evt);
            }
        });

        btnAreas.setBackground(new java.awt.Color(17, 50, 77));
        btnAreas.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        btnAreas.setForeground(new java.awt.Color(255, 255, 255));
        btnAreas.setText("Areas");
        btnAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJerarquias, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNominas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnPersonal)
                .addGap(18, 18, 18)
                .addComponent(btnNominas)
                .addGap(18, 18, 18)
                .addComponent(btnContrato)
                .addGap(18, 18, 18)
                .addComponent(btnIncidencias)
                .addGap(18, 18, 18)
                .addComponent(btnJerarquias)
                .addGap(18, 18, 18)
                .addComponent(btnReportes)
                .addGap(18, 18, 18)
                .addComponent(btnAreas)
                .addGap(35, 35, 35)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        panelPrincipal.add(panelMenu);
        panelMenu.setBounds(0, 0, 160, 600);

        panelContenido.setBackground(new java.awt.Color(17, 50, 77));
        panelContenido.setForeground(new java.awt.Color(102, 102, 102));
        panelContenido.setLayout(new java.awt.BorderLayout());

        lbImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
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
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalActionPerformed
        // Crear instancia del nuevo panel
        AdminEmpleados qwew = new AdminEmpleados(gestor);
        qwew.setSize(new Dimension(840, 600));
        
        panelContenido.removeAll();
        panelContenido.add(qwew, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
        
        
        
    }//GEN-LAST:event_btnPersonalActionPerformed

    private void btnNominasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNominasActionPerformed
        // Crear instancia del nuevo panel
        AdminNominas AdministrarNominass = new AdminNominas(gestor);
        AdministrarNominass.setPreferredSize(new Dimension(840, 600));

        // Agregarlo al panel contenedor
        panelContenido.removeAll();
        panelContenido.add(AdministrarNominass, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnNominasActionPerformed

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

    private void btnIncidenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncidenciasActionPerformed
        AdminIncidencias asd = new AdminIncidencias(gestor);
        asd.setPreferredSize(new Dimension(840, 600));
        
        panelContenido.removeAll();
        panelContenido.add(asd,BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();   
    }//GEN-LAST:event_btnIncidenciasActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        AdminReportes reportes1 = new AdminReportes(gestor);
        reportes1.setPreferredSize(new Dimension(840, 600));
        
        panelContenido.removeAll();
        panelContenido.add(reportes1,BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnReportesActionPerformed

    private void lbImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbImagenMouseClicked
        AdminLogo logo = new AdminLogo();
        logo.setPreferredSize(new Dimension(840, 600));
        
        panelContenido.removeAll();
        panelContenido.add(logo,BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_lbImagenMouseClicked

    private void btnContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoActionPerformed
        // Crear instancia del nuevo panel
        AdminContratos AdminContratos = new AdminContratos(gestor);
        AdminContratos.setPreferredSize(new Dimension(840,600));

        panelContenido.removeAll();
        panelContenido.add(AdminContratos,BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnContratoActionPerformed

    private void btnJerarquiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJerarquiasActionPerformed
        // TODO add your handling code here:
        AdminJerarquias AdminJerarquias = new AdminJerarquias(gestor);
        AdminJerarquias.setPreferredSize(new Dimension(830,600));

        panelContenido.removeAll();
        panelContenido.add(AdminJerarquias,BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnJerarquiasActionPerformed

    private void btnAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreasActionPerformed
    AdminAreas AdminAreasdds = new AdminAreas(gestor);
        AdminAreasdds.setPreferredSize(new Dimension(830,600));

        panelContenido.removeAll();
        panelContenido.add(AdminAreasdds,BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnAreasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAreas;
    private javax.swing.JButton btnContrato;
    private javax.swing.JButton btnIncidencias;
    private javax.swing.JButton btnJerarquias;
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
