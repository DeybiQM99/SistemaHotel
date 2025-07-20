/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VistaGestorEmpleados;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AdminEmpleados extends javax.swing.JPanel {
    
            
 
 public AdminEmpleados(){   
        initComponents();
        txtNombreDespedir.setEditable(false);
        txtApellidoDespedir.setEditable(false);
        txtTelefonoDespedir.setEditable(false);
        txtDNIDespedir.setEditable(false);
        txtCorreoDespedir.setEditable(false);
        BoxContratoDespedir.setEditable(false);
        BoxCargoDespedir.setEditable(false);
        BoxAreaDespedir.setEditable(false);
    

 
    }      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPagoReg1 = new javax.swing.JPanel();
        lblIdPago1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIDEmpleado = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        btnRegistrarEmpleado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BoxCargo = new javax.swing.JComboBox<>();
        BoxContrato = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        BoxArea = new javax.swing.JComboBox<>();
        panelPagoReg4 = new javax.swing.JPanel();
        lblIdPago4 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtBuscarID2 = new javax.swing.JTextField();
        txtNombreModificar = new javax.swing.JTextField();
        txtTelefonoModificar = new javax.swing.JTextField();
        txtApellidoModificar = new javax.swing.JTextField();
        txtCorreoModificar = new javax.swing.JTextField();
        txtDNIModificar = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        BtnBuscarModificar = new javax.swing.JButton();
        btnModificarEmpleado = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        BoxContratoModificar = new javax.swing.JComboBox<>();
        BoxCargoModificar = new javax.swing.JComboBox<>();
        BoxAreaModificar = new javax.swing.JComboBox<>();
        panelBusqueda = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        jsEmpleados = new javax.swing.JScrollPane();
        tbLista = new javax.swing.JTable();
        lblBuscarOpc = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        panelPagoReg3 = new javax.swing.JPanel();
        lblIdPago3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtIDDespedir = new javax.swing.JTextField();
        txtNombreDespedir = new javax.swing.JTextField();
        txtTelefonoDespedir = new javax.swing.JTextField();
        txtApellidoDespedir = new javax.swing.JTextField();
        txtDNIDespedir = new javax.swing.JTextField();
        BtnDespedirEmpleado = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtCorreoDespedir = new javax.swing.JTextField();
        BtnBuscarDespedir = new javax.swing.JButton();
        BoxContratoDespedir = new javax.swing.JComboBox<>();
        BoxCargoDespedir = new javax.swing.JComboBox<>();
        BoxAreaDespedir = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(17, 50, 77));

        panelPagoReg1.setBackground(new java.awt.Color(0, 0, 0));
        panelPagoReg1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contratar Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblIdPago1.setForeground(new java.awt.Color(255, 255, 255));
        lblIdPago1.setText("Id Empleado:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Apellido:");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Telefono:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DNI:");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Correo:");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tipo Contrato:");

        txtIDEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDEmpleadoActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });

        btnRegistrarEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarEmpleado.setText("Registrar");
        btnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cargo:");

        BoxCargo.setForeground(new java.awt.Color(0, 0, 0));
        BoxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Limpieza", "Tecnico", "Cocinero", "Recepcionista", "Botones" }));
        BoxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxCargoActionPerformed(evt);
            }
        });

        BoxContrato.setForeground(new java.awt.Color(0, 0, 0));
        BoxContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Indefinido", "Renovable", "Temporal", "Discapacidad" }));
        BoxContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxContratoActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Area:");

        BoxArea.setForeground(new java.awt.Color(0, 0, 0));
        BoxArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Limpieza", "Cocina", "Area Tecnica", "Recepcion", "Salon" }));

        javax.swing.GroupLayout panelPagoReg1Layout = new javax.swing.GroupLayout(panelPagoReg1);
        panelPagoReg1.setLayout(panelPagoReg1Layout);
        panelPagoReg1Layout.setHorizontalGroup(
            panelPagoReg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagoReg1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPagoReg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPagoReg1Layout.createSequentialGroup()
                        .addGroup(panelPagoReg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdPago1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(23, 23, 23)
                        .addGroup(panelPagoReg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BoxCargo, 0, 120, Short.MAX_VALUE)
                            .addComponent(txtDNI, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIDEmpleado)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApellido)
                            .addComponent(txtCorreo)
                            .addComponent(txtNombre)
                            .addComponent(BoxContrato, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BoxArea, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPagoReg1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelPagoReg1Layout.setVerticalGroup(
            panelPagoReg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagoReg1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelPagoReg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdPago1)
                    .addComponent(txtIDEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(12, 12, 12)
                .addGroup(panelPagoReg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(12, 12, 12)
                .addGroup(panelPagoReg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(BoxContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarEmpleado)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panelPagoReg4.setBackground(new java.awt.Color(0, 0, 0));
        panelPagoReg4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblIdPago4.setForeground(new java.awt.Color(255, 255, 255));
        lblIdPago4.setText("Id Empleado:");

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Nombre:");

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Apellido:");

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Telefono:");

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("DNI:");

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Correo:");

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Tipo Contrato:");

        txtBuscarID2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarID2ActionPerformed(evt);
            }
        });

        txtNombreModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreModificarActionPerformed(evt);
            }
        });

        txtTelefonoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoModificarActionPerformed(evt);
            }
        });

        txtApellidoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoModificarActionPerformed(evt);
            }
        });

        txtCorreoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoModificarActionPerformed(evt);
            }
        });

        txtDNIModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIModificarActionPerformed(evt);
            }
        });

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Cargo:");

        BtnBuscarModificar.setForeground(new java.awt.Color(0, 0, 0));
        BtnBuscarModificar.setText("Buscar");
        BtnBuscarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarModificarActionPerformed(evt);
            }
        });

        btnModificarEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        btnModificarEmpleado.setText("Modificar");
        btnModificarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEmpleadoActionPerformed(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Area:");

        BoxContratoModificar.setForeground(new java.awt.Color(0, 0, 0));
        BoxContratoModificar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Indefinido", "Renovable", "Temporal", "Discapacidad" }));
        BoxContratoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxContratoModificarActionPerformed(evt);
            }
        });

        BoxCargoModificar.setForeground(new java.awt.Color(0, 0, 0));
        BoxCargoModificar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Limpieza", "Tecnico", "Cocinero", "Recepcionista", "Botones" }));
        BoxCargoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxCargoModificarActionPerformed(evt);
            }
        });

        BoxAreaModificar.setForeground(new java.awt.Color(0, 0, 0));
        BoxAreaModificar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Limpieza", "Cocina", "Area Tecnica", "Recepcion", "Salon" }));

        javax.swing.GroupLayout panelPagoReg4Layout = new javax.swing.GroupLayout(panelPagoReg4);
        panelPagoReg4.setLayout(panelPagoReg4Layout);
        panelPagoReg4Layout.setHorizontalGroup(
            panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagoReg4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPagoReg4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(BtnBuscarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPagoReg4Layout.createSequentialGroup()
                        .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdPago4)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BoxAreaModificar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BoxCargoModificar, 0, 124, Short.MAX_VALUE)
                            .addComponent(BoxContratoModificar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDNIModificar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBuscarID2)
                            .addComponent(txtTelefonoModificar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApellidoModificar)
                            .addComponent(txtCorreoModificar)
                            .addComponent(txtNombreModificar))))
                .addContainerGap())
        );
        panelPagoReg4Layout.setVerticalGroup(
            panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagoReg4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdPago4)
                    .addComponent(txtBuscarID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtNombreModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtApellidoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(12, 12, 12)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNIModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(12, 12, 12)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(BoxContratoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(BoxCargoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(BoxAreaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarEmpleado)
                    .addComponent(BtnBuscarModificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBusqueda.setBackground(new java.awt.Color(0, 0, 0));
        panelBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PanelBusqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver.png"))); // NOI18N
        btnBuscar.setText("Buscar");

        jsEmpleados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jsEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
        jsEmpleados.setViewportView(tbLista);

        lblBuscarOpc.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscarOpc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscarOpc.setText("Buscar por(en blanco para todos):");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingrese ID Empleado:");

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusquedaLayout.createSequentialGroup()
                        .addComponent(jsEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBusquedaLayout.createSequentialGroup()
                        .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBusquedaLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblBuscarOpc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236))))
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblBuscarOpc)
                .addGap(3, 3, 3)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelPagoReg3.setBackground(new java.awt.Color(0, 0, 0));
        panelPagoReg3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Despedir Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblIdPago3.setForeground(new java.awt.Color(255, 255, 255));
        lblIdPago3.setText("Id Empleado:");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Nombre:");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Apellido:");

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Telefono:");

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("DNI:");

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Correo:");

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Tipo Contrato:");

        txtIDDespedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDDespedirActionPerformed(evt);
            }
        });

        txtNombreDespedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDespedirActionPerformed(evt);
            }
        });

        txtTelefonoDespedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoDespedirActionPerformed(evt);
            }
        });

        txtApellidoDespedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoDespedirActionPerformed(evt);
            }
        });

        txtDNIDespedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIDespedirActionPerformed(evt);
            }
        });

        BtnDespedirEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        BtnDespedirEmpleado.setText("Despedir");
        BtnDespedirEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDespedirEmpleadoActionPerformed(evt);
            }
        });

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Cargo:");

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Area:");

        txtCorreoDespedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoDespedirActionPerformed(evt);
            }
        });

        BtnBuscarDespedir.setForeground(new java.awt.Color(0, 0, 0));
        BtnBuscarDespedir.setText("Buscar");
        BtnBuscarDespedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarDespedirActionPerformed(evt);
            }
        });

        BoxContratoDespedir.setForeground(new java.awt.Color(0, 0, 0));
        BoxContratoDespedir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Indefinido", "Renovable", "Temporal", "Discapacidad" }));
        BoxContratoDespedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxContratoDespedirActionPerformed(evt);
            }
        });

        BoxCargoDespedir.setForeground(new java.awt.Color(0, 0, 0));
        BoxCargoDespedir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Limpieza", "Tecnico", "Cocinero", "Recepcionista", "Botones" }));
        BoxCargoDespedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxCargoDespedirActionPerformed(evt);
            }
        });

        BoxAreaDespedir.setForeground(new java.awt.Color(0, 0, 0));
        BoxAreaDespedir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Limpieza", "Cocina", "Area Tecnica", "Recepcion", "Salon" }));

        javax.swing.GroupLayout panelPagoReg3Layout = new javax.swing.GroupLayout(panelPagoReg3);
        panelPagoReg3.setLayout(panelPagoReg3Layout);
        panelPagoReg3Layout.setHorizontalGroup(
            panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagoReg3Layout.createSequentialGroup()
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPagoReg3Layout.createSequentialGroup()
                        .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdPago3)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BoxCargoDespedir, javax.swing.GroupLayout.Alignment.TRAILING, 0, 122, Short.MAX_VALUE)
                            .addComponent(BoxContratoDespedir, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDNIDespedir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIDDespedir)
                            .addComponent(txtTelefonoDespedir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApellidoDespedir)
                            .addComponent(txtNombreDespedir)
                            .addComponent(txtCorreoDespedir, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(panelPagoReg3Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(73, 73, 73)
                        .addComponent(BoxAreaDespedir, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPagoReg3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnBuscarDespedir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnDespedirEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelPagoReg3Layout.setVerticalGroup(
            panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagoReg3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdPago3)
                    .addComponent(txtIDDespedir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtNombreDespedir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtApellidoDespedir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoDespedir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(12, 12, 12)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNIDespedir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(12, 12, 12)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtCorreoDespedir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(BoxContratoDespedir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(BoxCargoDespedir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BoxAreaDespedir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(18, 18, 18)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnDespedirEmpleado)
                    .addComponent(BtnBuscarDespedir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelPagoReg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelPagoReg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelPagoReg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelPagoReg3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPagoReg1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPagoReg4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDEmpleadoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void BoxContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxContratoActionPerformed

    private void txtBuscarID2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarID2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarID2ActionPerformed

    private void txtNombreModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreModificarActionPerformed

    private void txtTelefonoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoModificarActionPerformed

    private void txtApellidoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoModificarActionPerformed

    private void txtCorreoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoModificarActionPerformed

    private void txtDNIModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIModificarActionPerformed

    private void txtIDDespedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDDespedirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDDespedirActionPerformed

    private void txtNombreDespedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDespedirActionPerformed
    
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDespedirActionPerformed

    private void txtTelefonoDespedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoDespedirActionPerformed
        
// TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoDespedirActionPerformed

    private void txtApellidoDespedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoDespedirActionPerformed
      
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoDespedirActionPerformed

    private void txtDNIDespedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIDespedirActionPerformed
     
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIDespedirActionPerformed

    private void txtCorreoDespedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoDespedirActionPerformed
       
// TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoDespedirActionPerformed

    private void BoxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxCargoActionPerformed

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
    String Idtexto =txtIDEmpleado.getText().trim();
    int id = Integer.parseInt(Idtexto.trim());
    String Nombre = txtNombre.getText().trim();
    String Apellido = txtApellido.getText().trim();
    String Telefono = txtTelefono.getText().trim();
    String DNI = txtDNI.getText().trim();
    String Correo = txtCorreo.getText().trim();
    String TipoContrato = BoxContrato.getSelectedItem().toString();
    String Cargo = BoxCargo.getSelectedItem().toString();
    String Area = BoxArea.getSelectedItem().toString();
    
    
    if(Idtexto.isEmpty() || Nombre.isEmpty() || Apellido.isEmpty() || Telefono.isEmpty()
    || DNI.isEmpty() || Correo.isEmpty() || TipoContrato.equals("Seleccionar") || Cargo.equals("Seleccionar") || Area.equals("Seleccionar") ){
        JOptionPane.showMessageDialog(this, "Completa todos los campos porfavor :)");
    return;
    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed
     
    try{
    id = Integer.parseInt(Idtexto);
    } catch(NumberFormatException e){
    JOptionPane.showMessageDialog(this,"El ID debe ser un numero.");
    return;
    }
    
    Empleado nuevoEmpleado = new Empleado(id ,Nombre ,Apellido,Telefono,DNI,Correo,TipoContrato,Cargo,Area);
    DatosCompartidos.listaEmpleados.add(nuevoEmpleado);
    
    System.out.println("total de empleados registrados "+listaEmpleados.size()); 
    JOptionPane.showMessageDialog(null, "Empleado registrado");
    limpiarCampos();
    
    }

    private void btnModificarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEmpleadoActionPerformed
    if(DatosCompartidos.listaEmpleados.isEmpty()){
    JOptionPane.showMessageDialog(this,"No hay empleados registrados.");
    return;
    }
    
    String IdTexto =txtBuscarID2.getText();
    
    if(IdTexto.isEmpty()){
    JOptionPane.showMessageDialog(this, "Ingrese un ID.");
    return;
    }
    
    int idBuscado;
    try{
    idBuscado = Integer.parseInt(IdTexto);
    }//GEN-LAST:event_btnModificarEmpleadoActionPerformed
    catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this,"El ID debe ser un numero.");
    return;
    }
    Empleados encontrado = null;
    for (Empleados emp : DatosCompartidos.listaEmpleados){
    if(emp.getId() == idBuscado){
    encontrado = emp;
    break;
    }  
    }
    if(encontrado!= null){
    txtNombre.setText(encontrado.getNombre());
    txtApellido.setText(encontrado.getApellido());
    txtTelefono.setText(encontrado.getTelefono());
    txtDNI.setText(encontrado.getDNI());
    txtCorreo.setText(encontrado.getCorreo());
    BoxContrato.setSelectedItem(encontrado.getTipoContrato());
    BoxCargo.setSelectedItem(encontrado.getCargo());
    BoxArea.setSelectedItem(encontrado.getArea());
    
    JOptionPane.showMessageDialog(this,"Empleado Modificado correctamente");
    } else {
     JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
    }
    limpiarCampos();
    }

    private void BtnBuscarDespedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarDespedirActionPerformed
    if(DatosCompartidos.listaEmpleados.isEmpty()){
    JOptionPane.showMessageDialog(this,"No hay empleados registrados.");
    return;
    }
    
    String IdTexto =txtBuscarID2.getText();
    
    if(IdTexto.isEmpty()){
    JOptionPane.showMessageDialog(this, "Ingrese un ID valida.");
    return;
    }
    
    int idBuscado;
    
    try{
    idBuscado = Integer.parseInt(IdTexto);
    }                                                    
    catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this,"El ID debe ser un numero.");
    return;
    }
    
    Empleados encontrado = null;
    for (Empleados emp :DatosCompartidos.listaEmpleados){
    if(emp.getId() == idBuscado){
    encontrado = emp;
    break;
    }  
    }
    
    if(encontrado!= null){
    txtNombreDespedir.setText(encontrado.getNombre());
    txtApellidoDespedir.setText(encontrado.getApellido());
    txtTelefonoDespedir.setText(encontrado.getTelefono());
    txtDNIDespedir.setText(encontrado.getDNI());
    txtCorreoDespedir.setText(encontrado.getCorreo());
    BoxContratoDespedir.setSelectedItem(encontrado.getTipoContrato());
    BoxCargoDespedir.setSelectedItem(encontrado.getCargo());
    BoxAreaDespedir.setSelectedItem(encontrado.getArea());
    JOptionPane.showMessageDialog(this,"Datos obtenidos correctamente");
    } 
    
    else{
    JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
    }
    */
    }//GEN-LAST:event_BtnBuscarDespedirActionPerformed
    private void BtnBuscarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarModificarActionPerformed
    if(DatosCompartidos.listaEmpleados.isEmpty()){
    JOptionPane.showMessageDialog(this,"No hay empleados registrados.");
    return;
    }
    
    String IdTexto =txtBuscarID2.getText();
    
    if(IdTexto.isEmpty()){
    JOptionPane.showMessageDialog(this, "Ingrese un ID.");
    return;
    }
    
    int idBuscado;
    
    try{
    idBuscado = Integer.parseInt(IdTexto);
    }                                                    
    catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this,"El ID debe ser un numero.");
    return;
    }
    
    Empleados encontrado = null;
    for (Empleados emp : DatosCompartidos.listaEmpleados){
    if(emp.getId() == idBuscado){
    encontrado = emp;
    break;
    }  
    }
    
    if(encontrado!= null){
    txtNombreModificar.setText(encontrado.getNombre());
    txtApellidoModificar.setText(encontrado.getApellido());
    txtTelefonoModificar.setText(encontrado.getTelefono());
    txtDNIModificar.setText(encontrado.getDNI());
    txtCorreoModificar.setText(encontrado.getCorreo());
    BoxContratoModificar.setSelectedItem(encontrado.getTipoContrato());
    BoxCargoModificar.setSelectedItem(encontrado.getCargo());
    BoxAreaModificar.setSelectedItem(encontrado.getArea());
    JOptionPane.showMessageDialog(this,"Datos obtenidos correctamente");
    }else{
    JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
    }
    
    }//GEN-LAST:event_BtnBuscarModificarActionPerformed

    private void BoxContratoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxContratoModificarActionPerformed
    int Id = Integer.parseInt(txtBuscarID2.getText().trim());
    
    for(Empleados e: DatosCompartidos.listaEmpleados){
    if(e.getId() == Id){
    e.setNombre(txtNombreModificar.getText().trim());
    e.setApellido(txtNombreModificar.getText().trim());
    e.setTelefono(txtNombreModificar.getText().trim());
    e.setDNI(txtNombreModificar.getText().trim());
    e.setCorreo(txtNombreModificar.getText().trim());
    e.setTipoContrato(BoxContratoModificar.getSelectedItem().toString());
    e.setCargo(BoxCargoModificar.getSelectedItem().toString());
    e.setArea(BoxAreaModificar.getSelectedItem().toString());
            
    JOptionPane.showMessageDialog(null,"Empleado modificado correctamente");
    }
    }
    }//GEN-LAST:event_BoxContratoModificarActionPerformed

    private void BoxCargoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxCargoModificarActionPerformed
    
    }//GEN-LAST:event_BoxCargoModificarActionPerformed

    private void BtnDespedirEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDespedirEmpleadoActionPerformed
    
    String IdTexto = txtIDDespedir.getText().trim();
    
    if(IdTexto.isEmpty()){
    JOptionPane.showMessageDialog(this,"Ingrese una ID");
    return;
    }
    int Id;
    try{
    Id = Integer.parseInt(IdTexto);
    }catch(NumberFormatException e){
    JOptionPane.showMessageDialog(this,"El ID debe ser un numero");
    return;
    }
    
    boolean encontrado = false;
    
    for(int i = 0; i < DatosCompartidos.listaEmpleados.size(); i++){
    if(DatosCompartidos.listaEmpleados.get(i).getId() == Id){
    int confirmacion = JOptionPane.showConfirmDialog(null,
    "Estas seguro de despedir al empleado con ID"+ Id + "?",
    "Confirmar despido",
    JOptionPane.YES_NO_OPTION);
    
    if(confirmacion == JOptionPane.YES_OPTION){
    DatosCompartidos.listaEmpleados.remove(i);
    encontrado = true;
    JOptionPane.showMessageDialog(null,"Empleado despedido correctamente");
    limpiarCampos();
    }else{
    JOptionPane.showMessageDialog(null,"Operacion cancelada");
    }
    
    return;
    }
    }
    if(!encontrado){
    JOptionPane.showMessageDialog(null,"Empleado no encontrado.");
    }
    
    limpiarCampos();
    }//GEN-LAST:event_BtnDespedirEmpleadoActionPerformed

    private void BoxContratoDespedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxContratoDespedirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxContratoDespedirActionPerformed

    private void BoxCargoDespedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxCargoDespedirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxCargoDespedirActionPerformed
    
    private void limpiarCampos(){
    txtIDEmpleado.setText("");
    txtNombre.setText("");
    txtApellido.setText("");
    txtTelefono.setText("");
    txtDNI.setText("");
    txtCorreo.setText("");
    BoxContrato.setSelectedIndex(0);
    BoxCargo.setSelectedIndex(0);
    BoxArea.setSelectedIndex(0);    
    }  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxArea;
    private javax.swing.JComboBox<String> BoxAreaDespedir;
    private javax.swing.JComboBox<String> BoxAreaModificar;
    private javax.swing.JComboBox<String> BoxCargo;
    private javax.swing.JComboBox<String> BoxCargoDespedir;
    private javax.swing.JComboBox<String> BoxCargoModificar;
    private javax.swing.JComboBox<String> BoxContrato;
    private javax.swing.JComboBox<String> BoxContratoDespedir;
    private javax.swing.JComboBox<String> BoxContratoModificar;
    private javax.swing.JButton BtnBuscarDespedir;
    private javax.swing.JButton BtnBuscarModificar;
    private javax.swing.JButton BtnDespedirEmpleado;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificarEmpleado;
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JScrollPane jsEmpleados;
    private javax.swing.JLabel lblBuscarOpc;
    private javax.swing.JLabel lblIdPago1;
    private javax.swing.JLabel lblIdPago3;
    private javax.swing.JLabel lblIdPago4;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelPagoReg1;
    private javax.swing.JPanel panelPagoReg3;
    private javax.swing.JPanel panelPagoReg4;
    private javax.swing.JTable tbLista;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoDespedir;
    private javax.swing.JTextField txtApellidoModificar;
    private javax.swing.JTextField txtBuscarID2;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreoDespedir;
    private javax.swing.JTextField txtCorreoModificar;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDNIDespedir;
    private javax.swing.JTextField txtDNIModificar;
    private javax.swing.JTextField txtIDDespedir;
    private javax.swing.JTextField txtIDEmpleado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreDespedir;
    private javax.swing.JTextField txtNombreModificar;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoDespedir;
    private javax.swing.JTextField txtTelefonoModificar;
    // End of variables declaration//GEN-END:variables
}
