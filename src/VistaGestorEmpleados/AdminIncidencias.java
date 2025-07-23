/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VistaGestorEmpleados;

import GestionEmpleados.Empleado;
import GestionEmpleados.Enum.TipoIncidencia;
import GestionEmpleados.GestorEmpleados;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jokan5443
 */
public class AdminIncidencias extends javax.swing.JPanel {

    /**
     * Creates new form AdministrarNominas
     */
    GestorEmpleados gestor;
    private DefaultTableModel modeloTabla = new DefaultTableModel();;
    
    public AdminIncidencias(GestorEmpleados gestor) {
        initComponents();
        
        this.gestor = gestor;
        
        modeloTabla.setColumnIdentifiers(new String[]
        {"ID Empleado","Nombre","Tipo Incidencia","Fecha", "Descripcion"});
        tbLista.setModel(modeloTabla);
    }
    
    public void limpiarCampos(){
        CboxIndc.setSelectedIndex(0);
        TxtIndDescu.setText("");
        TxtIndObs.setText("");
        fecha.setDate(null);
    }
    
    private int validarID() {
        // 1) Validar que el campo no esté vacío
        String textoId = txtEmpID.getText().trim();
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
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelPagoReg4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CboxIndc = new javax.swing.JComboBox<>();
        TxtIndDesc = new javax.swing.JScrollPane();
        TxtIndDescu = new javax.swing.JTextArea();
        fecha = new com.toedter.calendar.JDateChooser();
        txtobser = new javax.swing.JScrollPane();
        TxtIndObs = new javax.swing.JTextArea();
        buscar = new javax.swing.JButton();
        actua = new javax.swing.JButton();
        panelPagoReg3 = new javax.swing.JPanel();
        lblIdPago3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtEmpID = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtApelli = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        buscadatos = new javax.swing.JButton();
        panelBusqueda = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        tablaLista = new javax.swing.JScrollPane();
        tbLista = new javax.swing.JTable();
        CboxTipoInc = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(17, 50, 77));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPagoReg4.setBackground(new java.awt.Color(0, 0, 0));
        panelPagoReg4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar Indicencias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo Indidencia:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripcion:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Observaciones");

        CboxIndc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "NINGUNA", "LEVE", "MODERADA", "GRAVE" }));
        CboxIndc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboxIndcActionPerformed(evt);
            }
        });

        TxtIndDescu.setColumns(20);
        TxtIndDescu.setLineWrap(true);
        TxtIndDescu.setRows(5);
        TxtIndDescu.setWrapStyleWord(true);
        TxtIndDesc.setViewportView(TxtIndDescu);

        TxtIndObs.setColumns(20);
        TxtIndObs.setRows(5);
        txtobser.setViewportView(TxtIndObs);

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        actua.setText("Actualizar");
        actua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPagoReg4Layout = new javax.swing.GroupLayout(panelPagoReg4);
        panelPagoReg4.setLayout(panelPagoReg4Layout);
        panelPagoReg4Layout.setHorizontalGroup(
            panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagoReg4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPagoReg4Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPagoReg4Layout.createSequentialGroup()
                        .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(actua, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPagoReg4Layout.createSequentialGroup()
                                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3))
                                    .addComponent(buscar))
                                .addGap(18, 18, 18)
                                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtIndDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtobser, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CboxIndc, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 26, Short.MAX_VALUE))))
        );
        panelPagoReg4Layout.setVerticalGroup(
            panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagoReg4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CboxIndc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TxtIndDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtobser, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(19, 19, 19)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar)
                    .addComponent(actua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(81, 81, 81)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelPagoReg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 6, -1, 320));

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

        txtEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpIDActionPerformed(evt);
            }
        });

        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });

        txtApelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });

        buscadatos.setText("Buscar Datos - Empleado");
        buscadatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadatosActionPerformed(evt);
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
                        .addComponent(buscadatos))
                    .addGroup(panelPagoReg3Layout.createSequentialGroup()
                        .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdPago3))
                        .addGap(27, 27, 27)
                        .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(txtEmpID)
                            .addComponent(txtApelli)
                            .addComponent(txtNom)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        panelPagoReg3Layout.setVerticalGroup(
            panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagoReg3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdPago3)
                    .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtApelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagoReg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscadatos)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(panelPagoReg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        panelBusqueda.setBackground(new java.awt.Color(0, 0, 0));
        panelBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PanelBusqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tablaLista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Incidencias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        tablaLista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
        tablaLista.setViewportView(tbLista);

        CboxTipoInc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Ninguna", "Leve", "Moderado", "Grave" }));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo Incidencia:");

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusquedaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(tablaLista, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE))
                    .addGroup(panelBusquedaLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CboxTipoInc, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(CboxTipoInc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablaLista, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(panelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 332, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscadatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadatosActionPerformed
        
        // 1) Validamos el ID
        int id = validarID();
        if(id == -1) return;

        // 2) Buscar empleado y rellenar campos
        Empleado emp = gestor.getEmpleado(id);
        if (emp != null) {
            // No volvemos a setear TxtBusID, mantenemos el mismo valor
            txtNom.setText(emp.getNombre());
            txtApelli.setText(emp.getApellido());
            txtdni.setText(emp.getDni());
            txtcorreo.setText(emp.getEmail());
        } else {
            JOptionPane.showMessageDialog(this, "Error... No existe un empleado con ID " + id + ".");
            txtNom.setText("");
            txtApelli.setText("");
            txtdni.setText("");
            txtcorreo.setText("");
        }    }//GEN-LAST:event_buscadatosActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        // Limpiar la tabla antes de cargar nuevos datos
        modeloTabla.setRowCount(0);

        // Obtener el índice seleccionado del ComboBox de tipo de incidencia
        int index = CboxTipoInc.getSelectedIndex();

        // Declarar la lista que se va a mostrar
        List<Empleado> lista;

        // Filtrar la lista según el tipo de incidencia seleccionado
        switch (index) {
            case 0 -> // Todos los que tengan alguna incidencia (excepto NINGUNA)
                lista = gestor.getMisEmpleados().stream()
                    .filter(p -> !p.getTipoIncidencia().toString().equalsIgnoreCase("NINGUNA"))
                    .collect(Collectors.toList());

            case 1 -> // Solo con incidencia "NINGUNA"
                lista = gestor.getMisEmpleados().stream()
                    .filter(p -> p.getTipoIncidencia().toString().equalsIgnoreCase("NINGUNA"))
                    .collect(Collectors.toList());

            case 2 -> // Solo con incidencia "LEVE"
                lista = gestor.getMisEmpleados().stream()
                    .filter(p -> p.getTipoIncidencia().toString().equalsIgnoreCase("LEVE"))
                    .collect(Collectors.toList());

            case 3 -> // Solo con incidencia "MODERADA"
                lista = gestor.getMisEmpleados().stream()
                    .filter(p -> p.getTipoIncidencia().toString().equalsIgnoreCase("MODERADA"))
                    .collect(Collectors.toList());

            case 4 -> // Solo con incidencia "GRAVE"
                lista = gestor.getMisEmpleados().stream()
                    .filter(p -> p.getTipoIncidencia().toString().equalsIgnoreCase("GRAVE"))
                    .collect(Collectors.toList());

            default -> // Por defecto, mostrar todos
                lista = gestor.getMisEmpleados();
        }

        // Agregar los empleados filtrados a la tabla
        for (Empleado e : lista) {
            modeloTabla.addRow(new Object[]{
                e.getId(),
                e.getNombre(),
                e.getTipoIncidencia().toString(),
                e.getFechaInc(),
                e.getTextIncidencia()
            });
        }

        // Establecer el modelo actualizado en la tabla
        tbLista.setModel(modeloTabla);
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        // 1) Validar el ID ingresado
        int id = validarID();
        if (id == -1) return;

        // 2) Buscar al empleado por su ID
        Empleado emp = gestor.getEmpleado(id);

        if (emp != null) {
            // Nota: No se modifica el campo de búsqueda TxtBusID, se conserva su valor actual

            // 3) Seleccionar el tipo de incidencia en el ComboBox
            String sIndc = emp.getTipoIncidencia().toString();
            boolean encontrado = false;

            for (int i = 0; i < CboxIndc.getItemCount(); i++) {
                if (CboxIndc.getItemAt(i).equals(sIndc)) {
                    CboxIndc.setSelectedIndex(i);
                    encontrado = true;
                    break;
                }
            }

            // Validación por si el tipo de incidencia no está en el ComboBox
            if (!encontrado) {
                JOptionPane.showMessageDialog(
                    this,
                    "Advertencia: el tipo de incidencia '" + sIndc + "' no está disponible en la lista.",
                    "Tipo de incidencia no encontrado",
                    JOptionPane.WARNING_MESSAGE
                );
                CboxIndc.setSelectedIndex(0); // Selecciona opción por defecto
            }

            // 4) Mostrar la descripción de la incidencia
            TxtIndDescu.setText(emp.getTextIncidencia());

            // 5) Mostrar la fecha de la incidencia, si existe
            if (emp.getFechaInc() != null) {
                Date fechaConvertida = Date.from(
                    emp.getFechaInc().atStartOfDay(ZoneId.systemDefault()).toInstant()
                );
                fecha.setDate(fechaConvertida);
            } else {
                fecha.setDate(null); // Si no hay fecha registrada
            }

            // 6) Mostrar la observación registrada
            TxtIndObs.setText(emp.getTextObservacion());

        } else {
            // Mensaje de error si el ID no existe en el sistema
            JOptionPane.showMessageDialog(
                this,
                "No se encontró un empleado con el ID " + id + ".",
                "Empleado no encontrado",
                JOptionPane.ERROR_MESSAGE
            );
            limpiarCampos();
        }
        
    }//GEN-LAST:event_buscarActionPerformed

    private void actuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actuaActionPerformed
        // 1) Validar el ID del empleado
        int id = validarID();
        if (id == -1) return;  // Si el ID no es válido, salir del método

        // 2) Buscar al empleado por ID
        Empleado emp = gestor.getEmpleado(id);

        if (emp != null) {
            // 3) Validar selección del tipo de incidencia
            int tipoSeleccionado = CboxIndc.getSelectedIndex();
            if (tipoSeleccionado == 0) {
                JOptionPane.showMessageDialog(
                    this,
                    "Debe seleccionar un tipo de incidencia antes de continuar.",
                    "Tipo de Incidencia no seleccionado",
                    JOptionPane.WARNING_MESSAGE
                );
                return;
            }

            // 4) Establecer tipo de incidencia
            TipoIncidencia tipoIncidencia = switch (tipoSeleccionado) {
                case 1 -> TipoIncidencia.NINGUNA;
                case 2 -> TipoIncidencia.LEVE;
                case 3 -> TipoIncidencia.MODERADA;
                case 4 -> TipoIncidencia.GRAVE;
                default -> null;
            };

            emp.setTipoIncidencia(tipoIncidencia);

            // 5) Asignar campos según tipo
            if (tipoIncidencia == TipoIncidencia.NINGUNA) {
                // Si no hay incidencia, se asignan nulos
                emp.setTextIncidencia(null);
                emp.setTextObservacion(null);
                emp.setFechaInc(null);
            } else {
                // Para otros tipos, se requiere información adicional

                emp.setTextIncidencia(TxtIndDescu.getText());
                emp.setTextObservacion(TxtIndObs.getText());

                Date fechaSeleccionada = fecha.getDate();
                if (fechaSeleccionada != null) {
                    emp.setFechaInc(fechaSeleccionada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                } else {
                    JOptionPane.showMessageDialog(
                        this,
                        "Debe seleccionar una fecha válida para registrar la incidencia.",
                        "Fecha no válida",
                        JOptionPane.WARNING_MESSAGE
                    );
                    return;
                }
            }

            // 6) Confirmación de éxito
            JOptionPane.showMessageDialog(
                this,
                "Se registró correctamente la incidencia del empleado con ID " + id + ".",
                "Registro exitoso",
                JOptionPane.INFORMATION_MESSAGE
            );
            limpiarCampos();

        } else {
            // Si no se encuentra al empleado
            JOptionPane.showMessageDialog(
                this,
                "No se encontró un empleado con el ID " + id + ". Verifique e intente nuevamente.",
                "Empleado no encontrado",
                JOptionPane.ERROR_MESSAGE
            );
            limpiarCampos();
        }
        
    }//GEN-LAST:event_actuaActionPerformed

    private void txtEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpIDActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void CboxIndcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboxIndcActionPerformed
        
        if(CboxIndc.getSelectedIndex() == 1){
            TxtIndDescu.setEditable(false);
            fecha.setEnabled(false);
            TxtIndObs.setEnabled(false);
        } else {
            TxtIndDescu.setEditable(true);
            fecha.setEnabled(true);
            TxtIndObs.setEnabled(true);
        }
        
    }//GEN-LAST:event_CboxIndcActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxIndc;
    private javax.swing.JComboBox<String> CboxTipoInc;
    private javax.swing.JScrollPane TxtIndDesc;
    private javax.swing.JTextArea TxtIndDescu;
    private javax.swing.JTextArea TxtIndObs;
    private javax.swing.JButton actua;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton buscadatos;
    private javax.swing.JButton buscar;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIdPago3;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelPagoReg3;
    private javax.swing.JPanel panelPagoReg4;
    private javax.swing.JScrollPane tablaLista;
    private javax.swing.JTable tbLista;
    private javax.swing.JTextField txtApelli;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdni;
    private javax.swing.JScrollPane txtobser;
    // End of variables declaration//GEN-END:variables
}
