/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VistaGestorEmpleados;

import GestionEmpleados.*;
import GestionEmpleados.Supervisor;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class EmpReportes1 extends javax.swing.JPanel {

    private static GestorEmpleados gestor;
    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");        
    
    public EmpReportes1(GestorEmpleados gest) {
        initComponents();
        
        gestor = gest;
        
        txtReporteID.setText("""
                            INFORMACIÓN DEL EMPLEADO
                            
                            Nombre completo: Juan Pérez García  
                            DNI: 12345678  
                            Edad: 29 años  
                            Género: Masculino  
                            Estado civil: Soltero  
                            Nacionalidad: Peruana  
                            
                            Cargo: Asistente Administrativo  
                            Área: Recursos Humanos  
                            Fecha de ingreso: 15/03/2022  
                            Tipo de contrato: Indeterminado  
                            Condición laboral: Tiempo completo  
                            
                            Remuneración mensual: S/ 2,500.00  
                            Horario de trabajo: Lunes a Viernes, de 8:00 a.m. a 5:00 p.m.  
                            
                            Dirección: Av. Los Próceres 456, Lima  
                            Teléfono: 987654321  
                            Correo electrónico: juan.perez@email.com  
                            
                            Número de cuenta bancaria: 0021-0123-4567-8901 (Banco BCP)  
                            Afiliación a salud: EsSalud  
                            AFP: Integra  
                            """
        
        );
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReporteID = new javax.swing.JTextArea();
        panelBusquedaContrato = new javax.swing.JPanel();
        btnBuscarPago1 = new javax.swing.JButton();
        lblBuscarOpc2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdCampo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(17, 50, 77));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Información:"));

        txtReporteID.setColumns(20);
        txtReporteID.setRows(5);
        jScrollPane1.setViewportView(txtReporteID);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBusquedaContrato.setBackground(new java.awt.Color(17, 50, 77));
        panelBusquedaContrato.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese sus datos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        btnBuscarPago1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarPago1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver.png"))); // NOI18N
        btnBuscarPago1.setText("Buscar Información");
        btnBuscarPago1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPago1ActionPerformed(evt);
            }
        });

        lblBuscarOpc2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblBuscarOpc2.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscarOpc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscarOpc2.setText("Revise su Información");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("ID:  ");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escritura.png"))); // NOI18N
        jButton1.setText("Generar PDF");

        javax.swing.GroupLayout panelBusquedaContratoLayout = new javax.swing.GroupLayout(panelBusquedaContrato);
        panelBusquedaContrato.setLayout(panelBusquedaContratoLayout);
        panelBusquedaContratoLayout.setHorizontalGroup(
            panelBusquedaContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaContratoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panelBusquedaContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarPago1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBuscarOpc2))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtIdCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        panelBusquedaContratoLayout.setVerticalGroup(
            panelBusquedaContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaContratoLayout.createSequentialGroup()
                .addGroup(panelBusquedaContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBusquedaContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addGroup(panelBusquedaContratoLayout.createSequentialGroup()
                        .addComponent(lblBuscarOpc2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarPago1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBusquedaContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBusquedaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPago1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPago1ActionPerformed
        try {
            int id = Integer.parseInt(txtIdCampo.getText());
            Empleado emp = gestor.getEmpleado(id);
            if (emp == null) {
                JOptionPane.showMessageDialog(this, "Error... No existe el empleado.");
                return;
            }
            StringBuilder info = new StringBuilder();
            info.append("INFORMACIÓN DEL EMPLEADO\n");
            info.append("ID: ").append(emp.getId()).append("\n");
            info.append("Nombre: ").append(emp.getNombre()).append(" ").append(emp.getApellido()).append("\n");
            info.append("DNI: ").append(emp.getDni()).append("\n");
            info.append("Cargo: ").append(emp.getClass().getSimpleName()).append("\n");
            info.append("Tarifa: S/ ").append(emp.getTarifaPorHora()).append(" por hora.\n");
            // Contratos
            info.append("Tipo Contrato: ").append(emp.getTipoContrato()).append("\n");

            if (emp.getFechaIngreso() != null) {
                info.append("Fecha Ingreso: ").append(emp.getFechaIngreso().format(fmt)).append("\n");
            } else {
                info.append("Fecha Ingreso: No registrada\n");
            }

            if (emp.getFechaTermino() != null) {
                info.append("Fecha Término: ").append(emp.getFechaTermino().format(fmt)).append("\n");
            }

            if (emp.getFechaRenovacion() != null) {
                info.append("Fecha Renovación: ").append(emp.getFechaRenovacion().format(fmt)).append("\n");
            }

            txtReporteID.setText(info.toString());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error... Número inválido.");
        }
    }//GEN-LAST:event_btnBuscarPago1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPago1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscarOpc2;
    private javax.swing.JPanel panelBusquedaContrato;
    private javax.swing.JTextField txtIdCampo;
    private javax.swing.JTextArea txtReporteID;
    // End of variables declaration//GEN-END:variables
}
