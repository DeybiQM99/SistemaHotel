/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VistaGestorEmpleados;

import GestionEmpleados.Empleado;
import GestionEmpleados.Enum.TipoContrato;
import GestionEmpleados.Enum.TipoIncidencia;
import GestionEmpleados.GestorEmpleados;
import GestionEmpleados.Jefe;
import GestionEmpleados.Operario;
import GestionEmpleados.Supervisor;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jokan5443
 */
public class AdminContratos extends javax.swing.JPanel {

    GestorEmpleados gestor;
    DefaultTableModel modelo = new DefaultTableModel();
    
    public AdminContratos(GestorEmpleados gestor) {
        initComponents();
        this.gestor = gestor;
        
        TxtEmpNom.setEditable(false);
        TxtEmpApp.setEditable(false);
        TxtEmpDNI.setEditable(false);
        TxtEmpEmail.setEditable(false);
        TxtEmpCont.setEditable(false);
        
        modelo = configurarTabla();
    }
    
    private DefaultTableModel configurarTabla() {
        DefaultTableModel m = new DefaultTableModel();
        m.setColumnIdentifiers(new String[]{"ID", "Nombre", "Cargo", "Contrato", "Fecha Ingreso", "Fecha Termino", "Fecha Renovacion" });
        tbLista.setModel(m);
        return m;
    }
    
    private TipoContrato getTipoContrato(String combo){
        switch (combo) {
            case "DISCAPACIDAD": return TipoContrato.DISCAPACIDAD;
            case "TEMPORAL":     return TipoContrato.TEMPORAL;
            case "RENOVABLE":    return TipoContrato.RENOVABLE;
            case "INDEFINIDO":   return TipoContrato.INDEFINIDO;
            case "DESPEDIDO":    return TipoContrato.DESPEDIDO;
            default:
                JOptionPane.showMessageDialog(this, "Tipo de contrato no válido.");
                return null;
        }
    }
    
    private void limpiarDatos(){
        TxtEmpNom.setText("");
        TxtEmpApp.setText("");
        TxtEmpDNI.setText("");
        TxtEmpEmail.setText("");
        TxtEmpCont.setText("");
    }
    
    private void limpiarFechas(){
        fechaInicio.setEnabled(true);
        fechaInicio.setDate(null);
        fechaTermino.setEnabled(true);
        fechaTermino.setDate(null);
        fechaRenovacion.setEnabled(true);
        fechaRenovacion.setDate(null);
    }

    private int validarID() {
        // 1) Validar que el campo no esté vacío
        String textoId = TxtEmpID.getText().trim();
        if (textoId.isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "Por favor, ingresa un ID de empleado.",
                "Campo vacío",
                JOptionPane.WARNING_MESSAGE
            );
            return -1;
        }

        // 2) Validar que haya empleados registrados
        if (gestor.getMisEmpleados().isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "No hay empleados registrados en el sistema.",
                "Lista vacía",
                JOptionPane.WARNING_MESSAGE
            );
            return -1;
        }

        // 3) Parsear el ID de forma segura
        int id;
        try {
            id = Integer.parseInt(textoId);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                this,
                "El ID ingresado no es un número válido.",
                "Formato incorrecto",
                JOptionPane.ERROR_MESSAGE
            );
            return -1;
        }

        return id;
    }
    
    // Convierte LocalDate a Date (puede usarse para setDate en JCalendar)
    private Date convertirFecha(LocalDate localDate) {
        if (localDate == null) return null;
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    // Convierte Date a LocalDate (para guardar en entidad)
    private LocalDate convertirALocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    // Muestra un error reutilizable
    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(
            this,
            mensaje,
            "Fecha no válida",
            JOptionPane.WARNING_MESSAGE
        );
    }
    
    public void actualizarFechas(){
        switch(CboxTipoCont.getSelectedItem().toString()){
                case "DISCAPACIDAD":
                        fechaInicio.setEnabled(true);
                        fechaTermino.setEnabled(true);
                        fechaRenovacion.setEnabled(true);
                        break;
                case "TEMPORAL":
                        fechaInicio.setEnabled(true);
                        fechaTermino.setEnabled(true);
                        fechaRenovacion.setEnabled(false);
                        break;
                case "RENOVABLE":
                        fechaInicio.setEnabled(true);
                        fechaTermino.setEnabled(true);
                        fechaRenovacion.setEnabled(true);
                        break;
                case "INDEFINIDO":
                        fechaInicio.setEnabled(true);
                        fechaTermino.setEnabled(false);
                        fechaRenovacion.setEnabled(false);
                        break;
                case "DESPEDIDO":
                        fechaInicio.setEnabled(false);
                        fechaTermino.setEnabled(false);
                        fechaRenovacion.setEnabled(false);
                        break;
                default:
                        fechaInicio.setEnabled(true);
                        fechaTermino.setEnabled(true);
                        fechaRenovacion.setEnabled(true);
                        break;   
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        TxtEmpDNI = new javax.swing.JTextField();
        TxtEmpEmail = new javax.swing.JTextField();
        TxtEmpCont = new javax.swing.JTextField();
        btnBuscarEmp = new javax.swing.JButton();
        panelBusqueda = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        jsEmpleados = new javax.swing.JScrollPane();
        tbLista = new javax.swing.JTable();
        lblBuscarOpc = new javax.swing.JLabel();
        lblEstadoBuscar1 = new javax.swing.JLabel();
        CboxBusContr = new javax.swing.JComboBox<>();
        panelPagoReg4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        CboxTipoCont = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        fechaInicio = new com.toedter.calendar.JDateChooser();
        fechaTermino = new com.toedter.calendar.JDateChooser();
        fechaRenovacion = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(17, 50, 77));
        setPreferredSize(new java.awt.Dimension(840, 600));

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

        btnBuscarEmp.setText("Buscar");
        btnBuscarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmpActionPerformed(evt);
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
                        .addComponent(btnBuscarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(TxtEmpDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(TxtEmpID)
                            .addComponent(TxtEmpApp)
                            .addComponent(TxtEmpCont)
                            .addComponent(TxtEmpNom)
                            .addComponent(TxtEmpEmail, javax.swing.GroupLayout.Alignment.TRAILING))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEmpCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBusqueda.setBackground(new java.awt.Color(0, 0, 0));
        panelBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PanelBusqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        panelBusqueda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panelBusqueda.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 41, 124, 31));

        jsEmpleados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Contratos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
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

        panelBusqueda.add(jsEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 703, 180));

        lblBuscarOpc.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscarOpc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscarOpc.setText("Buscar por(en blanco para todos):");
        panelBusqueda.add(lblBuscarOpc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblEstadoBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        lblEstadoBuscar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstadoBuscar1.setText("Tipo:");
        panelBusqueda.add(lblEstadoBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 85, -1));

        CboxBusContr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "DISCAPACIDAD", "TEMPORAL", "RENOVABLE", "INDEFINIDO", "DESPEDIDO" }));
        panelBusqueda.add(CboxBusContr, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        panelPagoReg4.setBackground(new java.awt.Color(0, 0, 0));
        panelPagoReg4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar Contratos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo Contrato");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha Termino:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha Renovacion:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CboxTipoCont.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "DISCAPACIDAD", "TEMPORAL", "RENOVABLE", "INDEFINIDO", "DESPEDIDO" }));
        CboxTipoCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboxTipoContActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Fecha Inicio:");

        javax.swing.GroupLayout panelPagoReg4Layout = new javax.swing.GroupLayout(panelPagoReg4);
        panelPagoReg4.setLayout(panelPagoReg4Layout);
        panelPagoReg4Layout.setHorizontalGroup(
            panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagoReg4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPagoReg4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CboxTipoCont, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPagoReg4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPagoReg4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fechaTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPagoReg4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPagoReg4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(fechaRenovacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelPagoReg4Layout.setVerticalGroup(
            panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagoReg4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CboxTipoCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaRenovacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(45, 45, 45)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelPagoReg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(panelPagoReg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPagoReg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPagoReg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(panelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CboxTipoContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboxTipoContActionPerformed
        actualizarFechas();
    }//GEN-LAST:event_CboxTipoContActionPerformed

    private void btnBuscarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpActionPerformed
        // 1) Validamos el ID
        int id = validarID();
        if (id == -1) return;

        // 2) Buscar empleado
        Empleado emp = gestor.getEmpleado(id);
        if (emp == null) {
            JOptionPane.showMessageDialog(
                this,
                "No existe un empleado con ID " + id + ".",
                "Empleado no encontrado",
                JOptionPane.ERROR_MESSAGE
            );
            limpiarDatos();
            return;
        }

        // 3) Mostrar los datos del empleado
        TxtEmpNom.setText(emp.getNombre());
        TxtEmpApp.setText(emp.getApellido());
        TxtEmpDNI.setText(emp.getDni());
        TxtEmpEmail.setText(emp.getEmail());
        TxtEmpCont.setText(emp.getTipoContrato() != null ? emp.getTipoContrato().toString() : "SIN CONTRATO");
    }//GEN-LAST:event_btnBuscarEmpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // 1) Validamos el ID
        int id = validarID();
        if (id == -1) return;

        // 2) Buscar empleado
        Empleado emp = gestor.getEmpleado(id);

        if (emp != null) {
            // Modo: BUSCAR
            if (jButton1.getText().equals("Buscar")) {

                // --- Fechas ---
                fechaInicio.setDate(convertirFecha(emp.getFechaIngreso()));
                fechaTermino.setDate(convertirFecha(emp.getFechaTermino()));
                fechaRenovacion.setDate(convertirFecha(emp.getFechaRenovacion()));

                // --- ComboBox: tipo de contrato ---
                String contratoNombre = emp.getTipoContrato().toString();
                for (int i = 0; i < CboxTipoCont.getItemCount(); i++) {
                    if (contratoNombre.equalsIgnoreCase(CboxTipoCont.getItemAt(i))) {
                        CboxTipoCont.setSelectedIndex(i);
                        break;
                    }
                }

                // --- Habilitar campos según tipo de contrato ---
                switch (emp.getTipoContrato()) {
                    case DISCAPACIDAD, RENOVABLE -> {
                        fechaInicio.setEnabled(true);
                        fechaTermino.setEnabled(true);
                        fechaRenovacion.setEnabled(true);
                    }
                    case TEMPORAL -> {
                        fechaInicio.setEnabled(true);
                        fechaTermino.setEnabled(true);
                        fechaRenovacion.setEnabled(false);
                        fechaRenovacion.setDate(null);
                    }
                    case INDEFINIDO -> {
                        fechaInicio.setEnabled(true);
                        fechaTermino.setEnabled(false);
                        fechaTermino.setDate(null);
                        fechaRenovacion.setEnabled(false);
                        fechaRenovacion.setDate(null);
                    }
                    case DESPEDIDO -> {
                        fechaInicio.setEnabled(false);
                        fechaInicio.setDate(null);
                        fechaTermino.setEnabled(false);
                        fechaTermino.setDate(null);
                        fechaRenovacion.setEnabled(false);
                        fechaRenovacion.setDate(null);
                    }
                    default -> {
                        fechaInicio.setEnabled(true);
                        fechaTermino.setEnabled(true);
                        fechaRenovacion.setEnabled(true);
                    }
                }

                TxtEmpID.setEditable(false);
                jButton1.setText("Modificar");

            } else { // Modo: MODIFICAR

                int tipoSeleccionado = CboxTipoCont.getSelectedIndex();
                if (tipoSeleccionado == 0) {
                    JOptionPane.showMessageDialog(
                        this,
                        "Debe seleccionar un tipo de contrato antes de continuar.",
                        "Tipo de Contrato no seleccionado",
                        JOptionPane.WARNING_MESSAGE
                    );
                    return;
                }

                // Establecer tipo de contrato
                emp.setTipoContrato(switch (tipoSeleccionado) {
                    case 1 -> TipoContrato.DISCAPACIDAD;
                    case 2 -> TipoContrato.TEMPORAL;
                    case 3 -> TipoContrato.RENOVABLE;
                    case 4 -> TipoContrato.INDEFINIDO;
                    case 5 -> TipoContrato.DESPEDIDO;
                    default -> null;
                });

                String contratoActual = CboxTipoCont.getSelectedItem().toString();
                Date fechaSeleccionada;

                // --- Fecha de Ingreso ---
                if (!contratoActual.equals("DESPEDIDO")) {
                    fechaSeleccionada = fechaInicio.getDate();
                    if (fechaSeleccionada != null) {
                        emp.setFechaIngreso(convertirALocalDate(fechaSeleccionada));
                    } else {
                        mostrarError("Debe seleccionar una fecha de Ingreso válida.");
                        return;
                    }
                } else {
                    emp.setFechaIngreso(null);
                }

                // --- Fecha de Término ---
                if (contratoActual.equals("DISCAPACIDAD") || contratoActual.equals("TEMPORAL") || contratoActual.equals("RENOVABLE")) {
                    fechaSeleccionada = fechaTermino.getDate();
                    if (fechaSeleccionada != null) {
                        emp.setFechaTermino(convertirALocalDate(fechaSeleccionada));
                    } else {
                        mostrarError("Debe seleccionar una fecha de Término válida.");
                        return;
                    }
                } else {
                    emp.setFechaTermino(null);
                }

                // --- Fecha de Renovación ---
                if (contratoActual.equals("DISCAPACIDAD") || contratoActual.equals("RENOVABLE")) {
                    fechaSeleccionada = fechaRenovacion.getDate();
                    if (fechaSeleccionada != null) {
                        emp.setFechaRenovacion(convertirALocalDate(fechaSeleccionada));
                    } else {
                        mostrarError("Debe seleccionar una fecha de Renovación válida.");
                        return;
                    }
                } else {
                    emp.setFechaRenovacion(null);
                }

                // Restaurar controles
                TxtEmpID.setEditable(true);
                jButton1.setText("Buscar");
                limpiarFechas();
            }

        } else {
            JOptionPane.showMessageDialog(
                this,
                "No se encontró un empleado con el ID " + id + ".",
                "Empleado no encontrado",
                JOptionPane.ERROR_MESSAGE
            );
            TxtEmpID.setEditable(true);
            jButton1.setText("Buscar");
            limpiarFechas();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // Limpiar la tabla
        DefaultTableModel model = (DefaultTableModel) tbLista.getModel();
        model.setRowCount(0);

        // Validar si hay una selección específica de contrato
        if (!CboxBusContr.getSelectedItem().toString().equals("Seleccionar")) {
            String TipoContratoEmp = CboxBusContr.getSelectedItem().toString();
            TipoContrato tipoContr = getTipoContrato(TipoContratoEmp);

            for (Empleado emp : gestor.getMisEmpleados()) {
                if (emp.getTipoContrato() == tipoContr) {
                    String cargo = emp instanceof Operario ? "OPERARIO" :
                                   emp instanceof Supervisor ? "SUPERVISOR" :
                                   emp instanceof Jefe ? "JEFE" : "DESCONOCIDO";

                    model.addRow(new Object[]{
                        emp.getId(),
                        emp.getNombre() + " " + emp.getApellido(),
                        cargo,
                        emp.getTipoContrato(),
                        emp.getFechaIngreso(),
                        emp.getFechaTermino(),
                        emp.getFechaRenovacion()
                    });
                }
            }
        } else {
            // Mostrar todos los empleados si no se filtra por contrato
            for (Empleado emp : gestor.getMisEmpleados()) {
                String cargo = emp instanceof Operario ? "OPERARIO" :
                               emp instanceof Supervisor ? "SUPERVISOR" :
                               emp instanceof Jefe ? "JEFE" : "DESCONOCIDO";

                model.addRow(new Object[]{
                    emp.getId(),
                    emp.getNombre() + " " + emp.getApellido(),
                    cargo,
                    emp.getTipoContrato(),
                    emp.getFechaIngreso(),
                    emp.getFechaTermino(),
                    emp.getFechaRenovacion()
                });
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxBusContr;
    private javax.swing.JComboBox<String> CboxTipoCont;
    private javax.swing.JTextField TxtEmpApp;
    private javax.swing.JTextField TxtEmpCont;
    private javax.swing.JTextField TxtEmpDNI;
    private javax.swing.JTextField TxtEmpEmail;
    private javax.swing.JTextField TxtEmpID;
    private javax.swing.JTextField TxtEmpNom;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarEmp;
    private com.toedter.calendar.JDateChooser fechaInicio;
    private com.toedter.calendar.JDateChooser fechaRenovacion;
    private com.toedter.calendar.JDateChooser fechaTermino;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jsEmpleados;
    private javax.swing.JLabel lblBuscarOpc;
    private javax.swing.JLabel lblEstadoBuscar1;
    private javax.swing.JLabel lblIdPago3;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelPagoReg3;
    private javax.swing.JPanel panelPagoReg4;
    private javax.swing.JTable tbLista;
    // End of variables declaration//GEN-END:variables
}
