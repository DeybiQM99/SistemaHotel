
package VistaGestorEmpleados;

import GestionEmpleados.Area;
import GestionEmpleados.Empleado;
import GestionEmpleados.GestorEmpleados;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AdminAreas extends javax.swing.JPanel {
GestorEmpleados gestor; 

    public AdminAreas(GestorEmpleados gestor) {
        
        initComponents();
        this.gestor = gestor;
        
        configurarTabla();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelPagoReg4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIDArea = new javax.swing.JTextField();
        txtNombreArea = new javax.swing.JTextField();
        BtnRegistrarAreas = new javax.swing.JButton();
        BtnBuscarYModificarAreas = new javax.swing.JButton();
        panelBusqueda = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        tablaListaArea = new javax.swing.JScrollPane();
        TablaListaAreas = new javax.swing.JTable();
        lblBuscarOpc = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdAreaBusqueda = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(17, 50, 77));

        panelPagoReg4.setBackground(new java.awt.Color(0, 0, 0));
        panelPagoReg4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar Areas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID Area:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre:");

        BtnRegistrarAreas.setText("Registrar");
        BtnRegistrarAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarAreasActionPerformed(evt);
            }
        });

        BtnBuscarYModificarAreas.setText("Buscar");
        BtnBuscarYModificarAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarYModificarAreasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPagoReg4Layout = new javax.swing.GroupLayout(panelPagoReg4);
        panelPagoReg4.setLayout(panelPagoReg4Layout);
        panelPagoReg4Layout.setHorizontalGroup(
            panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagoReg4Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPagoReg4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPagoReg4Layout.createSequentialGroup()
                        .addComponent(BtnRegistrarAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(BtnBuscarYModificarAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(panelPagoReg4Layout.createSequentialGroup()
                        .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIDArea, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(txtNombreArea))))
                .addGap(30, 30, 30))
        );
        panelPagoReg4Layout.setVerticalGroup(
            panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagoReg4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIDArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombreArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelPagoReg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegistrarAreas)
                    .addComponent(BtnBuscarYModificarAreas))
                .addGap(166, 166, 166)
                .addComponent(jLabel8))
        );

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

        tablaListaArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Area", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        tablaListaArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TablaListaAreas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tablaListaArea.setViewportView(TablaListaAreas);

        lblBuscarOpc.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscarOpc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscarOpc.setText("Buscar por(en blanco para todos):");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingrese ID Area:");

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusquedaLayout.createSequentialGroup()
                        .addComponent(tablaListaArea)
                        .addContainerGap())
                    .addGroup(panelBusquedaLayout.createSequentialGroup()
                        .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBusquedaLayout.createSequentialGroup()
                                .addComponent(lblBuscarOpc, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                .addGap(134, 134, 134))
                            .addGroup(panelBusquedaLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel6)
                        .addGap(28, 28, 28)
                        .addComponent(txtIdAreaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))))
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
                        .addComponent(jLabel6)
                        .addComponent(txtIdAreaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablaListaArea, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(panelPagoReg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPagoReg4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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
    private void limpiarcampos(){
        txtIDArea.setText("");
        txtNombreArea.setText("");
    }
    
    private DefaultTableModel configurarTabla() {
        DefaultTableModel m = new DefaultTableModel();
        m.setColumnIdentifiers(new String[]{"ID", "Nombre", "Apellido", "Contrato", "Id Area"});
        TablaListaAreas.setModel(m);
        return m;
    }
        
    private void mostrarEmpleadosEnTabla(List<Empleado> empleados){
        DefaultTableModel modelo = (DefaultTableModel) TablaListaAreas.getModel();   
        modelo.setRowCount(0);

        for(Empleado emp : empleados){
           modelo.addRow(new Object[]{
                emp.getId(),
                emp.getNombre(),
                emp.getApellido(),
                emp.getTipoContrato().toString(),
                emp.getAreaLabor()
           });              
        }
    }
    
    private void buscarEmpleadosPorArea(){
        String texto = txtIdAreaBusqueda.getText().trim();
        List<Empleado> empleados = gestor.getMisEmpleados();
        List<Empleado> empleadosFiltrados = new ArrayList<>();

        if(!texto.isEmpty()){
            try{
            int idArea = Integer.parseInt(texto);

            for(Empleado emp: empleados){
                if(emp.getAreaLabor() == idArea)
                    empleadosFiltrados.add(emp);
            }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this,"Ingrese una ID de área valida.");
                return;
            }    
        }else
            empleadosFiltrados.addAll(empleados);
        
        mostrarEmpleadosEnTabla(empleadosFiltrados);
    }   
            
    private void BtnRegistrarAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarAreasActionPerformed
        try{
            int idArea = Integer.parseInt(txtIDArea.getText().trim());
            String NombreArea =txtNombreArea.getText().trim();

            if(NombreArea.isEmpty()){
             JOptionPane.showMessageDialog(this,"Ingrese un nombre al area.");
             return;
            }

            if(gestor.getArea(idArea)!= null){
             JOptionPane.showMessageDialog(this,"Ya existe un area con esa ID.");
            return;
            }

            Area nuevaArea = new Area(idArea, NombreArea);
            gestor.addArea(nuevaArea);
            JOptionPane.showMessageDialog(this,"Area correctamente registrada.");
            limpiarcampos();
        
            gestor.guardarDatos();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"El ID del area debe ser un numero.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error al registrar el área: ");
        }
    }//GEN-LAST:event_BtnRegistrarAreasActionPerformed

    private void BtnBuscarYModificarAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarYModificarAreasActionPerformed
    String textoBoton = BtnBuscarYModificarAreas.getText();
    
    try{
        int idArea = Integer.parseInt(txtIDArea.getText().trim());

        if(textoBoton.equals("Buscar")){
           Area areaEncontrada = gestor.getArea(idArea);

            if(areaEncontrada !=null){
            txtNombreArea.setText(areaEncontrada.getNombre());    

            BtnBuscarYModificarAreas.setText("Modificar");
            } else {
                JOptionPane.showMessageDialog(this,"Area no encontrada-");
            }
        } else if(textoBoton.equals("Modificar")){
            String nuevoNombre = txtNombreArea.getText().trim();
            
            if(nuevoNombre.isEmpty()){
                JOptionPane.showMessageDialog(this,"Llenar el nombre de Area");
                return;
                }

            Area areaModificar = gestor.getArea(idArea);
                if(areaModificar != null){
                    areaModificar.setNombre(nuevoNombre);
                    JOptionPane.showMessageDialog(this,"Area Modificada Correctamente");
                    BtnBuscarYModificarAreas.setText("Buscar");
                    limpiarcampos();
                }else{
                    JOptionPane.showMessageDialog(this,"Error: Esta Area ya no existe");       
                }
            }
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(this,"El ID del area debe ser un numero.");
    }catch(Exception e){
        JOptionPane.showMessageDialog(this, "Error: "+e.getMessage());
    }
    
    }//GEN-LAST:event_BtnBuscarYModificarAreasActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarEmpleadosPorArea(); 
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarYModificarAreas;
    private javax.swing.JButton BtnRegistrarAreas;
    private javax.swing.JTable TablaListaAreas;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBuscarOpc;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelPagoReg4;
    private javax.swing.JScrollPane tablaListaArea;
    private javax.swing.JTextField txtIDArea;
    private javax.swing.JTextField txtIdAreaBusqueda;
    private javax.swing.JTextField txtNombreArea;
    // End of variables declaration//GEN-END:variables
}
