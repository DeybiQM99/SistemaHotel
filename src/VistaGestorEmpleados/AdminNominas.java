package VistaGestorEmpleados;
import GestionEmpleados.Empleado;
import GestionEmpleados.GestorEmpleados;
import GestionEmpleados.Jefe;
import GestionEmpleados.Operario;
import GestionEmpleados.RegistroPago;
import GestionEmpleados.RegistroPago.MedioPago;
import GestionEmpleados.Supervisor;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jokan5443
 */
public class AdminNominas extends javax.swing.JPanel {
    
    GestorEmpleados gestor;
    DefaultTableModel modelo = new DefaultTableModel();
    
    public AdminNominas(GestorEmpleados gestor) {
        initComponents();
        
        this.gestor = gestor;
        
        TxtMosEmpID.setEditable(false);
        TxtMosTar.setEditable(false);
        TxtMosBono.setEditable(false);
        TxtMosDesc.setEditable(false);
        TxtMosMed.setEditable(false);
        TxtMosTotal.setEditable(false);
        
        modelo = configurarTabla();
        refrescarTabla();
        limpiarCampos();
    }
    
    private void limpiarCampos(){
        TxtNomEmpID.setText("");
        TxtNomBon.setText("");
        TxtNomDesc.setText("");
        CboxMedioPago.setSelectedIndex(0);
        CboxNdias.setSelectedIndex(0);
    }
    
    private DefaultTableModel configurarTabla() {
        DefaultTableModel m = new DefaultTableModel();
        m.setColumnIdentifiers(new String[]{"ID Emp", "ID pago", "Estado", "Monto Total"});
        tbLista.setModel(m);
        return m;
    }
    
    // Método opcional para recargar la JTable de empleados
    private void refrescarTabla() {
        DefaultTableModel model = (DefaultTableModel) tbLista.getModel();
        model.setRowCount(0);
        
        for (RegistroPago pago : gestor.getMisRagistro()) {
            model.addRow(new Object[]{
                            pago.getIdEmpleado(),
                            pago.getIdPago(),
                            pago.getEstado().toString(),
                            pago.getMontoTotal()
                        }); 

            // Asignar el modelo a la tabla:
            tbLista.setModel(modelo);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelBusquedaPago = new javax.swing.JPanel();
        btnBuscarPago = new javax.swing.JButton();
        jsPagos = new javax.swing.JScrollPane();
        tbLista = new javax.swing.JTable();
        jtBuscar = new javax.swing.JTabbedPane();
        panelIdBuscarArea = new javax.swing.JPanel();
        lblIDBuscar1 = new javax.swing.JLabel();
        txtIdBuscarPago = new javax.swing.JTextField();
        panelEstado = new javax.swing.JPanel();
        lblEstadoPago = new javax.swing.JLabel();
        CboxEstado = new javax.swing.JComboBox<>();
        lblBuscarOpc1 = new javax.swing.JLabel();
        panelPagosEmp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtNomEmpID = new javax.swing.JTextField();
        TxtNomBon = new javax.swing.JTextField();
        TxtNomDesc = new javax.swing.JTextField();
        BtnRegistar = new javax.swing.JButton();
        CboxNdias = new javax.swing.JComboBox<>();
        CboxMedioPago = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        panelPagosEmp1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TxtMosEmpID = new javax.swing.JTextField();
        TxtMosTar = new javax.swing.JTextField();
        TxtMosBono = new javax.swing.JTextField();
        TxtMosDesc = new javax.swing.JTextField();
        TxtMosTotal = new javax.swing.JTextField();
        BtnBuscarNomina = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TxtMosID = new javax.swing.JTextField();
        TxtMosMed = new javax.swing.JTextField();
        btnAprobar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(17, 50, 77));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBusquedaPago.setBackground(new java.awt.Color(0, 0, 0));
        panelBusquedaPago.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PanelBusqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        btnBuscarPago.setBackground(new java.awt.Color(17, 50, 77));
        btnBuscarPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarPago.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver.png"))); // NOI18N
        btnBuscarPago.setText("Buscar");
        btnBuscarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPagoActionPerformed(evt);
            }
        });

        jsPagos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Nominas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jsPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tbLista.setModel(new javax.swing.table.DefaultTableModel(
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
        jsPagos.setViewportView(tbLista);

        jtBuscar.setToolTipText("");

        lblIDBuscar1.setText("ID empleado:");

        javax.swing.GroupLayout panelIdBuscarAreaLayout = new javax.swing.GroupLayout(panelIdBuscarArea);
        panelIdBuscarArea.setLayout(panelIdBuscarAreaLayout);
        panelIdBuscarAreaLayout.setHorizontalGroup(
            panelIdBuscarAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdBuscarAreaLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lblIDBuscar1)
                .addGap(18, 18, 18)
                .addComponent(txtIdBuscarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        panelIdBuscarAreaLayout.setVerticalGroup(
            panelIdBuscarAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdBuscarAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtIdBuscarPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblIDBuscar1))
        );

        jtBuscar.addTab("ID", panelIdBuscarArea);

        lblEstadoPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstadoPago.setText("Estado:");

        CboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "REALIZADO", "PENDIENTE" }));

        javax.swing.GroupLayout panelEstadoLayout = new javax.swing.GroupLayout(panelEstado);
        panelEstado.setLayout(panelEstadoLayout);
        panelEstadoLayout.setHorizontalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadoLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(lblEstadoPago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        panelEstadoLayout.setVerticalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadoLayout.createSequentialGroup()
                .addGroup(panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstadoPago))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jtBuscar.addTab("Estado", panelEstado);

        lblBuscarOpc1.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscarOpc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscarOpc1.setText("Buscar por(en blanco para todos):");

        javax.swing.GroupLayout panelBusquedaPagoLayout = new javax.swing.GroupLayout(panelBusquedaPago);
        panelBusquedaPago.setLayout(panelBusquedaPagoLayout);
        panelBusquedaPagoLayout.setHorizontalGroup(
            panelBusquedaPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaPagoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelBusquedaPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsPagos)
                    .addGroup(panelBusquedaPagoLayout.createSequentialGroup()
                        .addGroup(panelBusquedaPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBusquedaPagoLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(lblBuscarOpc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBusquedaPagoLayout.createSequentialGroup()
                                .addGap(0, 163, Short.MAX_VALUE)
                                .addComponent(btnBuscarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)))
                        .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelBusquedaPagoLayout.setVerticalGroup(
            panelBusquedaPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaPagoLayout.createSequentialGroup()
                .addGroup(panelBusquedaPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusquedaPagoLayout.createSequentialGroup()
                        .addComponent(lblBuscarOpc1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsPagos, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(panelBusquedaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 820, 290));

        panelPagosEmp.setBackground(new java.awt.Color(0, 0, 0));
        panelPagosEmp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actualizar Nomina", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Empleado:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de Pago:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bonificacion:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descuentos:");

        BtnRegistar.setText("Registrar");
        BtnRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistarActionPerformed(evt);
            }
        });

        CboxNdias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Semanal", "Quincenal", "Mensual" }));

        CboxMedioPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Efectivo", "Transferencia" }));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Medio Pago:");

        javax.swing.GroupLayout panelPagosEmpLayout = new javax.swing.GroupLayout(panelPagosEmp);
        panelPagosEmp.setLayout(panelPagosEmpLayout);
        panelPagosEmpLayout.setHorizontalGroup(
            panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagosEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPagosEmpLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnRegistar))
                    .addGroup(panelPagosEmpLayout.createSequentialGroup()
                        .addGroup(panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(43, 43, 43)
                        .addGroup(panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNomDesc)
                            .addComponent(CboxNdias, 0, 182, Short.MAX_VALUE)
                            .addComponent(TxtNomEmpID)
                            .addComponent(TxtNomBon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CboxMedioPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelPagosEmpLayout.setVerticalGroup(
            panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagosEmpLayout.createSequentialGroup()
                .addGroup(panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CboxNdias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CboxMedioPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNomEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNomBon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(TxtNomDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnRegistar)
                .addGap(87, 87, 87))
        );

        jPanel1.add(panelPagosEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, 193));

        panelPagosEmp1.setBackground(new java.awt.Color(0, 0, 0));
        panelPagosEmp1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mostrar Nomina", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID Empleado:");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pago Por Hora:");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Bonificacion:");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Descuentos:");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Total A Pagar:");

        BtnBuscarNomina.setText("Buscar Pago");
        BtnBuscarNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarNominaActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Medio Pago:");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ID Nomina:");

        btnAprobar.setText("Aprobar");
        btnAprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprobarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPagosEmp1Layout = new javax.swing.GroupLayout(panelPagosEmp1);
        panelPagosEmp1.setLayout(panelPagosEmp1Layout);
        panelPagosEmp1Layout.setHorizontalGroup(
            panelPagosEmp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagosEmp1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPagosEmp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPagosEmp1Layout.createSequentialGroup()
                        .addGroup(panelPagosEmp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel9)
                            .addComponent(jLabel15))
                        .addGap(37, 37, 37)
                        .addGroup(panelPagosEmp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtMosEmpID, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(TxtMosBono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtMosTotal)
                            .addComponent(TxtMosDesc)
                            .addComponent(TxtMosTar)
                            .addComponent(TxtMosMed)))
                    .addGroup(panelPagosEmp1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(57, 57, 57)
                        .addComponent(TxtMosID))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPagosEmp1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelPagosEmp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnBuscarNomina, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAprobar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        panelPagosEmp1Layout.setVerticalGroup(
            panelPagosEmp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagosEmp1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPagosEmp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(TxtMosID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBuscarNomina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(panelPagosEmp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMosEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagosEmp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMosTar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagosEmp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMosBono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagosEmp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMosDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagosEmp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(TxtMosMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagosEmp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMosTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(12, 12, 12)
                .addComponent(btnAprobar)
                .addContainerGap())
        );

        jPanel1.add(panelPagosEmp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistarActionPerformed
        // --- 1) Validar y parsear ID de empleado ---
        String txtId = TxtNomEmpID.getText().trim();
        if (txtId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingresa una ID.");
            return;
        }

        int id;
        try {
            id = Integer.parseInt(txtId);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.");
            return;
        }

        Empleado emp = gestor.getEmpleado(id);
        if (emp == null) {
            JOptionPane.showMessageDialog(this, "No existe un empleado con ID " + id + ".");
            return;
        }

        // --- 2) Determinar periodo en días según el combo ---
        int ultimosNdias;
        switch (CboxNdias.getSelectedIndex()) {
            case 1: ultimosNdias = 7;  break;
            case 2: ultimosNdias = 15; break;
            case 3: ultimosNdias = 31; break;
            default:
                JOptionPane.showMessageDialog(this, "Seleccione un período válido.");
                return;
        }

        // --- 3) Calcular salario base ---
        double sueldoBase = emp.calcularSalario(ultimosNdias);
        
        // --- 4) Validar bono y descuento ---
        String sBono = TxtNomBon.getText().trim();
        String sDesc = TxtNomDesc.getText().trim();
        
        if (sBono.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un bono.");
            return;
        }
        if (sDesc.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un descuento.");
            return;
        }

        double bono, descuento;
        try {
            bono      = Double.parseDouble(sBono);
            descuento = Double.parseDouble(sDesc);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Bono y descuento deben ser números válidos.");
            return;
        }

        // --- 5) Validar medio de pago ---
        MedioPago medioPago;
        switch (CboxMedioPago.getSelectedIndex()) {
            case 1: medioPago = MedioPago.EFECTIVO;     break;
            case 2: medioPago = MedioPago.TRANSFERENCIA; break;
            default:
                JOptionPane.showMessageDialog(this, "Seleccione un medio de pago.");
                return;
        }

        // --- 6) Crear y registrar el pago ---
        int idPago = gestor.getMisRagistro().size() + 1;    // por ejemplo, si quieres 1‑based
        LocalDate fecha = LocalDate.now();

        RegistroPago nuevoPago = new RegistroPago(
            idPago,
            id,
            fecha,
            sueldoBase,
            bono,
            descuento,
            medioPago
        );

        // --- 7) Comprobamos un pago negativo ---
        if(nuevoPago.getMontoTotal() <= 0){
            JOptionPane.showMessageDialog(this, "El empleado no trabajo lo suficiente.");
            limpiarCampos();
            return;
        }
        
        gestor.addRegistroPago(nuevoPago);
        JOptionPane.showMessageDialog(this, "Pago registrado con éxito. ID Pago: " + idPago);
        refrescarTabla();
        limpiarCampos();
        
        gestor.guardarDatos();
    }//GEN-LAST:event_BtnRegistarActionPerformed

    private void btnBuscarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPagoActionPerformed
        // 1) Limpiar todas las filas de la tabla
        DefaultTableModel model = (DefaultTableModel) tbLista.getModel();
        model.setRowCount(0);
        
        // 2) Detectar la pestaña activa
        int indexSelc = jtBuscar.getSelectedIndex();
        switch (indexSelc){
            case 0: 
                String txtId = txtIdBuscarPago.getText().trim();
                // Si no hay texto, restaurar tabla completa
                if (txtId.isEmpty()) {
                    refrescarTabla();
                    return;
                }
                
                // Intentar convertir a entero
                int id;
                try {
                    id = Integer.parseInt(txtId);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.");
                    return;
                }

                // Verificar existencia de empleado
                Empleado emp = gestor.getEmpleado(id);
                if (emp == null) {
                    JOptionPane.showMessageDialog(this, "No existe un empleado con ID " + id + ".");
                    return;
                }
                
                // Recorrer todos los registros y añadir los que coincidan
                for(RegistroPago pago: gestor.getMisRagistro()){
                    if(pago.getIdEmpleado() == id) {
                        model.addRow(new Object[]{
                                    pago.getIdEmpleado(),
                                    pago.getIdPago(),
                                    pago.getEstado().toString(),
                                    pago.getMontoTotal()
                                });
                    
                    }
                }
                
                break;
            case 1: 
                
                for(RegistroPago pago: gestor.getMisRagistro()){
                    String EstadoPago = CboxEstado.getSelectedItem().toString();
                    
                    // Si el usuario no seleccionó un estado válido, restaurar tabla
                    if (EstadoPago.equals("Seleccionar")){
                        refrescarTabla();
                        return;
                    }
                    
                    // Recorrer registros y añadir los que coincidan con el estado
                    if(pago.getEstado().toString().equals(EstadoPago)){
                        model.addRow(new Object[]{
                                    pago.getIdEmpleado(),
                                    pago.getIdPago(),
                                    pago.getEstado().toString(),
                                    pago.getMontoTotal()
                                }); 
                    }
                }
                
                break;
            default:
                break;
        }
        
        
        // 3) Asignar el modelo (con las filas ya añadidas) al JTable
        tbLista.setModel(model);
    }//GEN-LAST:event_btnBuscarPagoActionPerformed

    private void BtnBuscarNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarNominaActionPerformed
        // 1) Parsear y validar ID del pago
        String sIdPago = TxtMosID.getText().trim();
        if (sIdPago.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingresa el ID del pago.");
            return;
        }

        int idPago;
        try {
            idPago = Integer.parseInt(sIdPago);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID de pago debe ser un número válido.");
            return;
        }

        // 2) Obtener el registro de pago
        RegistroPago pago = gestor.getRegistroPago(idPago);
        if (pago == null) {
            JOptionPane.showMessageDialog(this, "No existe un pago con ID " + idPago + ".");
            return;
        }

        // 3) Mostrar ID de empleado
        int idEmpleado = pago.getIdEmpleado();
        TxtMosEmpID.setText(String.valueOf(idEmpleado));

        // 4) Obtener y validar empleado
        Empleado emp = gestor.getEmpleado(idEmpleado);
        if (emp == null) {
            JOptionPane.showMessageDialog(this, "No existe un empleado con ID " + idEmpleado + ".");
            return;
        }

        // 5) Rellenar los campos restantes
        TxtMosTar.setText(String.valueOf(emp.getTarifaPorHora()));
        TxtMosBono.setText(String.valueOf(pago.getBono()));
        TxtMosDesc.setText(String.valueOf(pago.getDescuento()));
        TxtMosMed.setText(pago.getMedioPago().toString());
        TxtMosTotal.setText(String.valueOf(pago.getMontoTotal()));
    }//GEN-LAST:event_BtnBuscarNominaActionPerformed

    private void btnAprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprobarActionPerformed
        // 1) Validar entrada
        String sIdPago = TxtMosID.getText().trim();
        if (sIdPago.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingresa el ID del pago.");
            return;
        }

        // 2) Parsear ID Pago
        int idPago;
        try {
            idPago = Integer.parseInt(sIdPago);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID de pago debe ser un número válido.");
            return;
        }

        // 3) Obtener registro
        RegistroPago pago = gestor.getRegistroPago(idPago);
        if (pago == null) {
            JOptionPane.showMessageDialog(this, "No existe un pago con ID " + idPago + ".");
            return;
        }

        // 4) Validar que no esté ya realizado
        if (pago.getEstado().toString().equalsIgnoreCase("REALIZADO")) {
            JOptionPane.showMessageDialog(this, 
                "El pago con ID " + idPago + " ya está marcado como realizado.");
            return;
        }

        // 5) Marcar como realizado y refrescar vista
        pago.marcarComoRealizado();
        JOptionPane.showMessageDialog(this, 
            "Se realizó correctamente el pago (" + idPago + ").");
        refrescarTabla();
        
        gestor.guardarDatos();
    }//GEN-LAST:event_btnAprobarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarNomina;
    private javax.swing.JButton BtnRegistar;
    private javax.swing.JComboBox<String> CboxEstado;
    private javax.swing.JComboBox<String> CboxMedioPago;
    private javax.swing.JComboBox<String> CboxNdias;
    private javax.swing.JTextField TxtMosBono;
    private javax.swing.JTextField TxtMosDesc;
    private javax.swing.JTextField TxtMosEmpID;
    private javax.swing.JTextField TxtMosID;
    private javax.swing.JTextField TxtMosMed;
    private javax.swing.JTextField TxtMosTar;
    private javax.swing.JTextField TxtMosTotal;
    private javax.swing.JTextField TxtNomBon;
    private javax.swing.JTextField TxtNomDesc;
    private javax.swing.JTextField TxtNomEmpID;
    private javax.swing.JButton btnAprobar;
    private javax.swing.JButton btnBuscarPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jsPagos;
    private javax.swing.JTabbedPane jtBuscar;
    private javax.swing.JLabel lblBuscarOpc1;
    private javax.swing.JLabel lblEstadoPago;
    private javax.swing.JLabel lblIDBuscar1;
    private javax.swing.JPanel panelBusquedaPago;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JPanel panelIdBuscarArea;
    private javax.swing.JPanel panelPagosEmp;
    private javax.swing.JPanel panelPagosEmp1;
    private javax.swing.JTable tbLista;
    private javax.swing.JTextField txtIdBuscarPago;
    // End of variables declaration//GEN-END:variables
}
