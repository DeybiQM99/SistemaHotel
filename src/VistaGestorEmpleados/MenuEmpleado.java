package VistaGestorEmpleados;

import VistaHotel.VentanaPrincipal;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;


public class MenuEmpleado extends javax.swing.JFrame {

    public MenuEmpleado() {
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
        btnEmpleados = new javax.swing.JButton();
        btnAreas = new javax.swing.JButton();
        btnPagos = new javax.swing.JButton();
        btnAsistencia = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        panelContenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelPrincipal.setLayout(null);

        panelMenu.setBackground(new java.awt.Color(0, 0, 0));

        lbImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbImagenMouseClicked(evt);
            }
        });

        btnEmpleados.setBackground(new java.awt.Color(17, 50, 77));
        btnEmpleados.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setText("Empleados");
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
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

        btnPagos.setBackground(new java.awt.Color(17, 50, 77));
        btnPagos.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        btnPagos.setForeground(new java.awt.Color(255, 255, 255));
        btnPagos.setText("Nomina");
        btnPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagosActionPerformed(evt);
            }
        });

        btnAsistencia.setBackground(new java.awt.Color(17, 50, 77));
        btnAsistencia.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        btnAsistencia.setForeground(new java.awt.Color(255, 255, 255));
        btnAsistencia.setText("Asistencias");
        btnAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistenciaActionPerformed(evt);
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
                    .addComponent(btnAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        panelContenido.add(jLabel1, java.awt.BorderLayout.CENTER);

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

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        // Crear instancia del nuevo panel
        GestionEmpleados empleados = new GestionEmpleados();
    empleados.setPreferredSize(new Dimension(840, 600));
        
        panelContenido.removeAll();
        panelContenido.add(empleados, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreasActionPerformed
        // Crear instancia del nuevo panel
        GestionAreas areas1 = new GestionAreas();
        areas1.setPreferredSize(new Dimension(840, 600));

        // Agregarlo al panel contenedor
        panelContenido.removeAll();
        panelContenido.add(areas1, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnAreasActionPerformed

    private void btnPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagosActionPerformed
        // Crear instancia del nuevo panel
        GestionNominas pagos = new GestionNominas();
        pagos.setPreferredSize(new Dimension(840, 600));
        
        panelContenido.removeAll();
        panelContenido.add(pagos,BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnPagosActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
     int respuesta = JOptionPane.showConfirmDialog(MenuEmpleado.this, // Referencia al componente la ventana actual 
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

    private void btnAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsistenciaActionPerformed
        GestionAsistencias asistencias = new GestionAsistencias();
        asistencias.setPreferredSize(new Dimension(840, 600));
        
        panelContenido.removeAll();
        panelContenido.add(asistencias,BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();   
    }//GEN-LAST:event_btnAsistenciaActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        GestionReportes reportes = new GestionReportes();
        reportes.setPreferredSize(new Dimension(840, 600));
        
        panelContenido.removeAll();
        panelContenido.add(reportes,BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnReportesActionPerformed

    private void lbImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbImagenMouseClicked
        GestionLogo logo = new GestionLogo();
        logo.setPreferredSize(new Dimension(840, 600));
        
        panelContenido.removeAll();
        panelContenido.add(logo,BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_lbImagenMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAreas;
    private javax.swing.JButton btnAsistencia;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnPagos;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
