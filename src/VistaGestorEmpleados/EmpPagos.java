/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VistaGestorEmpleados;

import GestionEmpleados.GestorEmpleados;
import GestionEmpleados.RegistroPago;
import GestionEmpleados.RegistroPago.PagoEstado;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmpPagos extends javax.swing.JPanel {

    public static GestorEmpleados gestor;
    
    public EmpPagos(GestorEmpleados gestor) {
        initComponents();
        this.gestor = gestor;
        String[] columnas = {"ID Pago", "Fecha", "Monto", "Medio", "Estado"};
        tbListaAreas.setModel(new DefaultTableModel(columnas, 0));

        panelBusquedaPago.setSize(828, 114);
        this.setSize(840, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBusqueda = new javax.swing.JPanel();
        tablaPagos = new javax.swing.JScrollPane();
        tbListaAreas = new javax.swing.JTable();
        panelBusquedaPago = new javax.swing.JPanel();
        btnBuscarPago = new javax.swing.JButton();
        lblBuscarOpc1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPagoPorId = new javax.swing.JTextField();
        listaEstadoPagoEmp = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(17, 50, 77));

        panelBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        panelBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder("PanelBusqueda"));

        tablaPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Empleados"));
        tablaPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tbListaAreas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaPagos.setViewportView(tbListaAreas);

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(tablaPagos, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablaPagos, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBusquedaPago.setBackground(new java.awt.Color(17, 50, 77));
        panelBusquedaPago.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PanelBusqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        btnBuscarPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver.png"))); // NOI18N
        btnBuscarPago.setText("Buscar");
        btnBuscarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPagoActionPerformed(evt);
            }
        });

        lblBuscarOpc1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblBuscarOpc1.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscarOpc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscarOpc1.setText("Revise sus Pagos");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estado del Pago:");

        listaEstadoPagoEmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "REALIZADO", "PENDIENTES" }));

        javax.swing.GroupLayout panelBusquedaPagoLayout = new javax.swing.GroupLayout(panelBusquedaPago);
        panelBusquedaPago.setLayout(panelBusquedaPagoLayout);
        panelBusquedaPagoLayout.setHorizontalGroup(
            panelBusquedaPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaPagoLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(panelBusquedaPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBuscarOpc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87)
                .addGroup(panelBusquedaPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panelBusquedaPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listaEstadoPagoEmp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPagoPorId, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        panelBusquedaPagoLayout.setVerticalGroup(
            panelBusquedaPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaPagoLayout.createSequentialGroup()
                .addGroup(panelBusquedaPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarOpc1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lblPagoPorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBusquedaPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(listaEstadoPagoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBusquedaPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBusquedaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPagoActionPerformed
        String idTexto = lblPagoPorId.getText().trim();
        String filtroEstado = (String) listaEstadoPagoEmp.getSelectedItem();

        DefaultTableModel model = (DefaultTableModel) tbListaAreas.getModel();
        model.setRowCount(0); // Limpiar tabla

        if (idTexto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID válido.");
            return;
        }

        try {
            int idEmpleado = Integer.parseInt(idTexto);
            List<RegistroPago> pagos = gestor.getMisRagistro();
            pagos = pagos.stream().filter(p -> p.getIdEmpleado() == idEmpleado).collect(Collectors.toList());
            
            if (pagos == null || pagos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encontraron pagos para el ID ingresado.");
                return;
            }

            for (RegistroPago pago : pagos) {
                boolean mostrar = false;

                switch (filtroEstado) {
                    case "TODOS" -> mostrar = true;
                    case "REALIZADO" -> mostrar = pago.getEstado() == PagoEstado.REALIZADO;
                    case "PENDIENTES" -> mostrar = pago.getEstado() == PagoEstado.PENDIENTE;
                }

                if (mostrar) {
                    model.addRow(new Object[]{
                        pago.getIdPago(),
                        pago.getFechaPago().toString(),
                        pago.getMonto(),
                        pago.getMedioPago().toString(),
                        pago.getEstado().toString()
                    });
                }
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El ID debe ser un número.");
        }
    }//GEN-LAST:event_btnBuscarPagoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBuscarOpc1;
    private javax.swing.JTextField lblPagoPorId;
    private javax.swing.JComboBox<String> listaEstadoPagoEmp;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelBusquedaPago;
    private javax.swing.JScrollPane tablaPagos;
    private javax.swing.JTable tbListaAreas;
    // End of variables declaration//GEN-END:variables
}
