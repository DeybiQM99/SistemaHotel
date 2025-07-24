
package VistaGestorEmpleados;
import GestionEmpleados.Area;
import GestionEmpleados.Empleado;
import GestionEmpleados.GestorEmpleados;
import GestionEmpleados.Jefe;
import GestionEmpleados.Operario;
import GestionEmpleados.RegistroPago;
import GestionEmpleados.Supervisor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jokan5443
 */
public class AdminReportes extends javax.swing.JPanel {
    GestorEmpleados gestor; 
    private DefaultTableModel modeloTabla;
    public AdminReportes(GestorEmpleados gestor) {
        initComponents();
        
        modeloTabla = new DefaultTableModel();
        modeloTabla.setColumnIdentifiers(new Object[]{
        "Vacio"
        });
        TablaReportes.setModel(modeloTabla);
        
        this.gestor = gestor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBusquedaContrato = new javax.swing.JPanel();
        btnBuscarInformacion = new javax.swing.JButton();
        lblBuscarOpc2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BoxSeleccion = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaReportes = new javax.swing.JTable();

        setBackground(new java.awt.Color(17, 50, 77));

        panelBusquedaContrato.setBackground(new java.awt.Color(0, 0, 0));
        panelBusquedaContrato.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese los datos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        btnBuscarInformacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver.png"))); // NOI18N
        btnBuscarInformacion.setText("Buscar Información");
        btnBuscarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarInformacionActionPerformed(evt);
            }
        });

        lblBuscarOpc2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblBuscarOpc2.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscarOpc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscarOpc2.setText("Revisar Reportes");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Seleccione :");

        BoxSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Empleados", "Áreas", "Contratos", "Nominas", "Incidencias", "Jerarquia" }));

        javax.swing.GroupLayout panelBusquedaContratoLayout = new javax.swing.GroupLayout(panelBusquedaContrato);
        panelBusquedaContrato.setLayout(panelBusquedaContratoLayout);
        panelBusquedaContratoLayout.setHorizontalGroup(
            panelBusquedaContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaContratoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panelBusquedaContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBuscarOpc2))
                .addGap(42, 42, 42)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
        );
        panelBusquedaContratoLayout.setVerticalGroup(
            panelBusquedaContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaContratoLayout.createSequentialGroup()
                .addComponent(lblBuscarOpc2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBusquedaContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Información:"));

        TablaReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane2.setViewportView(TablaReportes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBusquedaContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelBusquedaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
       
    private String buscarNombreAreaDeEmpleado(Empleado emp){
    for(Area area : gestor.getMisAreas()){
     if(area.getListaEmpleadoIds().contains(emp.getId())){
     return area.getNombre();
    }
    }    
    return "No asignado";
    }
    
    private void mostrarEmpleadosEnTabla(){
        modeloTabla = new DefaultTableModel();
        modeloTabla.setColumnIdentifiers(new Object[]{
        "ID", "Nombre", "Apelllido", "Tipo Contrato", "Cargo", "Area"
        });
     
       for(Empleado emp : gestor.getMisEmpleados()){ 
          String cargo;
          if(emp instanceof Operario) cargo = "Operario";
          else if (emp instanceof Supervisor) cargo = "Supervisor";
          else if (emp instanceof Jefe) cargo = "Jefe";
          else cargo = "Otro";
          
          String area = buscarNombreAreaDeEmpleado(emp);
          
          modeloTabla.addRow(new Object[] {
          emp.getId(),
          emp.getNombre(),
          emp.getApellido(),
          emp.getTipoContrato(),
          cargo,
          area
          });
    }
       
    TablaReportes.setModel(modeloTabla);
       
    }
    
private void mostrarAreasEnTabla() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Área");
    modelo.addColumn("Nombre Área");

    for (Area area : gestor.getMisAreas()) {
        modelo.addRow(new Object[]{
            area.getIdArea(),
            area.getNombre()
        });
    }

    TablaReportes.setModel(modelo);
}


private void mostrarPagosEnTabla() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Empleado");
    modelo.addColumn("Total Pagado");
    modelo.addColumn("Fecha Pago");
    modelo.addColumn("Pendiente");

    for (RegistroPago pago : gestor.getMisRagistro()) {
        modelo.addRow(new Object[]{
            pago.getIdEmpleado(),
            pago.getMontoTotal(),
            pago.getFechaPago(),
            pago.isPendiente() ? "Sí" : "No"
        });
    }

    TablaReportes.setModel(modelo);
}


private void mostrarContratosEnTabla() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Empleado");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido");
    modelo.addColumn("Tipo Contrato");
    modelo.addColumn("Fecha Ingreso");
    modelo.addColumn("Fecha Término");
    modelo.addColumn("Fecha Renovación");

    for (Empleado e : gestor.getMisEmpleados()) {
        modelo.addRow(new Object[]{
            e.getId(),
            e.getNombre(),
            e.getApellido(),
            e.getTipoContrato(),
            e.getFechaIngreso(),
            e.getFechaTermino(),
            e.getFechaRenovacion()
        });
    }

    TablaReportes.setModel(modelo);
}


private void mostrarNominasEnTabla() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Empleado");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido");
    modelo.addColumn("Tarifa por Hora");
    modelo.addColumn("Salario Estimado Semanal");

    for (Empleado e : gestor.getMisEmpleados()) {
        double salarioEstimado = e.getTarifaPorHora() * 40; 
        modelo.addRow(new Object[]{
            e.getId(),
            e.getNombre(),
            e.getApellido(),
            e.getTarifaPorHora(),
            salarioEstimado
        });
    }

    TablaReportes.setModel(modelo);
}


private void mostrarIncidenciasEnTabla() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Empleado");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido");
    modelo.addColumn("Tipo Incidencia");

    for (Empleado e : gestor.getMisEmpleados()) {
        modelo.addRow(new Object[]{
            e.getId(),
            e.getNombre(),
            e.getApellido(),
            e.getTipoIncidencia()
        });
    }

    TablaReportes.setModel(modelo);
}


private void mostrarJerarquiaEnTabla() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Supervisor/Gerente");
    modelo.addColumn("Empleado a Cargo - ID");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido");
    modelo.addColumn("Cargo");
    modelo.addColumn("Área");

    for (Empleado jefe : gestor.getMisEmpleados()) {
        if (jefe instanceof Supervisor || jefe instanceof Jefe) {
            int idJefe = jefe.getId();
            String areaJefe = buscarNombreAreaDeEmpleado(jefe);

           for(Empleado sub : gestor.getMisEmpleados()){
           String areaSub = buscarNombreAreaDeEmpleado(sub);
             
                if(jefe instanceof Supervisor && sub instanceof Operario 
                 && areaJefe.equals(areaSub)){              
                    modelo.addRow(new Object[]{
                        idJefe,
                        sub.getId(),
                        sub.getNombre(),
                        sub.getApellido(),
                        "Operario",
                        areaSub
                    });
                }
               
                if(jefe instanceof Jefe && sub instanceof Supervisor 
                 && areaJefe.equals(areaSub)){       
                    modelo.addRow(new Object[]{
                        idJefe,
                        sub.getId(),
                        sub.getNombre(),
                        sub.getApellido(),
                        "Operario",
                        areaSub 
                    });
                }
            }
        }
    }
           TablaReportes.setModel(modelo);
}
  
    
   
    private void btnBuscarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarInformacionActionPerformed
    String seleccion = BoxSeleccion.getSelectedItem().toString();
    
    switch (seleccion){
        case "Empleados":
        mostrarEmpleadosEnTabla();
        break;
        case "Áreas":
        mostrarAreasEnTabla();
        break;
        case "Contratos":
        mostrarContratosEnTabla();
        break;
        case "Nominas":
        mostrarNominasEnTabla();
        break;
        case "Incidencias":
        mostrarIncidenciasEnTabla();
        break;
        case "Jerarquia":
        mostrarJerarquiaEnTabla();
        break;
        default:
      JOptionPane.showMessageDialog(this ,"Seleccione una opcion valida.");      
    }   
    }//GEN-LAST:event_btnBuscarInformacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxSeleccion;
    private javax.swing.JTable TablaReportes;
    private javax.swing.JButton btnBuscarInformacion;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBuscarOpc2;
    private javax.swing.JPanel panelBusquedaContrato;
    // End of variables declaration//GEN-END:variables
}
