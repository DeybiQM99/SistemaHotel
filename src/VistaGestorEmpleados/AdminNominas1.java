package VistaGestorEmpleados;
import GestionEmpleados.Empleado;
import GestionEmpleados.GestorEmpleados;
import javax.swing.JOptionPane;

/**
 *
 * @author Jokan5443
 */
public class AdminNominas1 extends javax.swing.JPanel {
    GestorEmpleados gestor;
    
    public AdminNominas1(GestorEmpleados gestor) {
        initComponents();
        
        this.gestor = gestor;
        
        TxtEmpNom.setEditable(false);
        TxtEmpApp.setEditable(false);
        TxtEmpDNI.setEditable(false);
        TxtEmpCorreo.setEditable(false);
        TxtEmpCont.setEditable(false);
        TxtNomID.setEditable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelBusquedaPago = new javax.swing.JPanel();
        btnBuscarPago = new javax.swing.JButton();
        jsPagos = new javax.swing.JScrollPane();
        tbListaPagos = new javax.swing.JTable();
        jtBuscarPago = new javax.swing.JTabbedPane();
        panelIdBuscarArea = new javax.swing.JPanel();
        lblIDBuscar1 = new javax.swing.JLabel();
        txtIdBuscarPago = new javax.swing.JTextField();
        panelEstado = new javax.swing.JPanel();
        lblEstadoPago = new javax.swing.JLabel();
        listaEstadoBuscarPago = new javax.swing.JComboBox<>();
        lblBuscarOpc1 = new javax.swing.JLabel();
        panelPagoReg3 = new javax.swing.JPanel();
        lblIdPago3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        TxtEmpID = new javax.swing.JTextField();
        TxtEmpNom = new javax.swing.JTextField();
        TxtEmpApp = new javax.swing.JTextField();
        TxtEmpCorreo = new javax.swing.JTextField();
        TxtEmpDNI = new javax.swing.JTextField();
        TxtEmpCont = new javax.swing.JTextField();
        BtnBuscarDatos = new javax.swing.JButton();
        panelPagosEmp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtNomID = new javax.swing.JTextField();
        TxtNomHoras = new javax.swing.JTextField();
        TxtNomTar = new javax.swing.JTextField();
        TxtNomBon = new javax.swing.JTextField();
        TxtNomDesc = new javax.swing.JTextField();
        TxtNomTotal = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        BtnAcciones = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(17, 50, 77));

        panelBusquedaPago.setBackground(new java.awt.Color(0, 0, 0));
        panelBusquedaPago.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PanelBusqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        btnBuscarPago.setBackground(new java.awt.Color(17, 50, 77));
        btnBuscarPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarPago.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver.png"))); // NOI18N
        btnBuscarPago.setText("Buscar");

        jsPagos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Nominas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jsPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tbListaPagos.setModel(new javax.swing.table.DefaultTableModel(
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
        jsPagos.setViewportView(tbListaPagos);

        jtBuscarPago.setToolTipText("");

        lblIDBuscar1.setText("Id Pago:");

        javax.swing.GroupLayout panelIdBuscarAreaLayout = new javax.swing.GroupLayout(panelIdBuscarArea);
        panelIdBuscarArea.setLayout(panelIdBuscarAreaLayout);
        panelIdBuscarAreaLayout.setHorizontalGroup(
            panelIdBuscarAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdBuscarAreaLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(lblIDBuscar1)
                .addGap(18, 18, 18)
                .addComponent(txtIdBuscarPago)
                .addGap(171, 171, 171))
        );
        panelIdBuscarAreaLayout.setVerticalGroup(
            panelIdBuscarAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdBuscarAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtIdBuscarPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblIDBuscar1))
        );

        jtBuscarPago.addTab("ID", panelIdBuscarArea);

        lblEstadoPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstadoPago.setText("Estado laboral:");

        listaEstadoBuscarPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "REALIZADO", "PENDIENTE" }));

        javax.swing.GroupLayout panelEstadoLayout = new javax.swing.GroupLayout(panelEstado);
        panelEstado.setLayout(panelEstadoLayout);
        panelEstadoLayout.setHorizontalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadoLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(lblEstadoPago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listaEstadoBuscarPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        panelEstadoLayout.setVerticalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadoLayout.createSequentialGroup()
                .addGroup(panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaEstadoBuscarPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstadoPago))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jtBuscarPago.addTab("Estado", panelEstado);

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
                                .addGap(2, 2, 2)
                                .addComponent(btnBuscarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblBuscarOpc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtBuscarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)))
                .addContainerGap())
        );
        panelBusquedaPagoLayout.setVerticalGroup(
            panelBusquedaPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaPagoLayout.createSequentialGroup()
                .addGroup(panelBusquedaPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusquedaPagoLayout.createSequentialGroup()
                        .addComponent(lblBuscarOpc1)
                        .addGap(10, 10, 10)
                        .addComponent(btnBuscarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtBuscarPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsPagos, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelPagoReg3.setBackground(new java.awt.Color(0, 0, 0));
        panelPagoReg3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblIdPago3.setForeground(new java.awt.Color(255, 255, 255));
        lblIdPago3.setText("Id Empleado:");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Nombre:");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Apellido:");

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("DNI:");

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Correo:");

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Tipo Contrato:");

        BtnBuscarDatos.setText("Buscar datos - empleado");
        BtnBuscarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPagoReg3Layout = new javax.swing.GroupLayout(panelPagoReg3);
        panelPagoReg3.setLayout(panelPagoReg3Layout);
        panelPagoReg3Layout.setHorizontalGroup(
            panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPagoReg3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPagoReg3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnBuscarDatos))
                    .addGroup(panelPagoReg3Layout.createSequentialGroup()
                        .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdPago3))
                        .addGap(23, 23, 23)
                        .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtEmpDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(TxtEmpID)
                            .addComponent(TxtEmpApp)
                            .addComponent(TxtEmpCorreo)
                            .addComponent(TxtEmpNom)
                            .addComponent(TxtEmpCont, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        panelPagoReg3Layout.setVerticalGroup(
            panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagoReg3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdPago3)
                    .addComponent(TxtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(TxtEmpNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(TxtEmpApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEmpDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(12, 12, 12)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEmpCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(12, 12, 12)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEmpCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnBuscarDatos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPagosEmp.setBackground(new java.awt.Color(0, 0, 0));
        panelPagosEmp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Nomina", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Nomina:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Horas Trabajadas:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pago Por Hora:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bonificacion:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descuentos:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total A Pagar:");

        BtnBuscar.setText("Buscar Pago");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnAcciones.setText("Acciones");

        jButton1.setText("Registrar");

        javax.swing.GroupLayout panelPagosEmpLayout = new javax.swing.GroupLayout(panelPagosEmp);
        panelPagosEmp.setLayout(panelPagosEmpLayout);
        panelPagosEmpLayout.setHorizontalGroup(
            panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagosEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPagosEmpLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtNomID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPagosEmpLayout.createSequentialGroup()
                        .addGroup(panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(37, 37, 37)
                        .addGroup(panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNomBon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtNomTotal)
                            .addComponent(TxtNomDesc)
                            .addComponent(TxtNomTar)))
                    .addGroup(panelPagosEmpLayout.createSequentialGroup()
                        .addComponent(BtnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAcciones))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPagosEmpLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(TxtNomHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelPagosEmpLayout.setVerticalGroup(
            panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagosEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtNomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNomHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNomTar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNomBon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNomDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNomTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(panelPagosEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAcciones)
                    .addComponent(BtnBuscar)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBusquedaPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelPagoReg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(panelPagosEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPagoReg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPagosEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelBusquedaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarDatosActionPerformed
        
        int id;
        
        
        // 1) Parseamos y comprobamos el valor ID
        
        try{
            if (TxtEmpID.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Por favor ingresa una ID.");
                return;
            }
            
            id = Integer.parseInt(TxtEmpID.getText());
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error... El ID debe ser un número válido.");
            return;
        }
        
        // 2) Buscar empleado y rellenar campos
        
        Empleado emp = gestor.getEmpleado(id);
        if (emp != null) {
            TxtEmpNom.setText(emp.getNombre());
            TxtEmpApp.setText(emp.getApellido());
            TxtEmpDNI.setText(emp.getDni());
            TxtEmpCorreo.setText(emp.getEmail());
            TxtEmpCont.setText(emp.getTipoContrato().toString());
        } else {
            JOptionPane.showMessageDialog(this, "Error... No existe un empleado con ID " + id + ".");
            TxtEmpNom.setText("");
            TxtEmpApp.setText("");
            TxtEmpDNI.setText("");
            TxtEmpCorreo.setText("");
            TxtEmpCont.setText("");
        }
        
    }//GEN-LAST:event_BtnBuscarDatosActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed

        
        
    }//GEN-LAST:event_BtnBuscarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAcciones;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnBuscarDatos;
    private javax.swing.JTextField TxtEmpApp;
    private javax.swing.JTextField TxtEmpCont;
    private javax.swing.JTextField TxtEmpCorreo;
    private javax.swing.JTextField TxtEmpDNI;
    private javax.swing.JTextField TxtEmpID;
    private javax.swing.JTextField TxtEmpNom;
    private javax.swing.JTextField TxtNomBon;
    private javax.swing.JTextField TxtNomDesc;
    private javax.swing.JTextField TxtNomHoras;
    private javax.swing.JTextField TxtNomID;
    private javax.swing.JTextField TxtNomTar;
    private javax.swing.JTextField TxtNomTotal;
    private javax.swing.JButton btnBuscarPago;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jsPagos;
    private javax.swing.JTabbedPane jtBuscarPago;
    private javax.swing.JLabel lblBuscarOpc1;
    private javax.swing.JLabel lblEstadoPago;
    private javax.swing.JLabel lblIDBuscar1;
    private javax.swing.JLabel lblIdPago3;
    private javax.swing.JComboBox<String> listaEstadoBuscarPago;
    private javax.swing.JPanel panelBusquedaPago;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JPanel panelIdBuscarArea;
    private javax.swing.JPanel panelPagoReg3;
    private javax.swing.JPanel panelPagosEmp;
    private javax.swing.JTable tbListaPagos;
    private javax.swing.JTextField txtIdBuscarPago;
    // End of variables declaration//GEN-END:variables
}
