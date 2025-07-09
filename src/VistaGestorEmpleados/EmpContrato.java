/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VistaGestorEmpleados;

import GestionEmpleados.Empleado;
import GestionEmpleados.Enum.TipoContrato;
import GestionEmpleados.GestorEmpleados;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class EmpContrato extends javax.swing.JPanel {

    public static GestorEmpleados gestor = new GestorEmpleados();
    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    
    public EmpContrato(GestorEmpleados gestor) {
        initComponents();
        this.gestor = gestor;
        
        
        txtContrato.setText("""
                            CONTRATO DE TRABAJO
                            Conste por el presente documento el Contrato de Trabajo que celebran de una parte [NOMBRE DEL EMPLEADOR], con RUC/DNI N.º [], con domicilio en [Dirección completa], a quien en adelante se denominará EL EMPLEADOR; y de la otra parte, [NOMBRE DEL TRABAJADOR], con DNI N.º [], domiciliado en [Dirección del trabajador], a quien en adelante se denominará EL TRABAJADOR, en los términos siguientes:
                            
                            PRIMERA: OBJETO DEL CONTRATO
                            Por el presente contrato, EL EMPLEADOR contrata los servicios personales de EL TRABAJADOR, quien se obliga a prestar sus servicios bajo subordinación, realizando las funciones que le sean encomendadas relacionadas al cargo de [Puesto o actividad genérica].
                            
                            SEGUNDA: LUGAR DE TRABAJO
                            EL TRABAJADOR prestará sus servicios en el domicilio de EL EMPLEADOR o en el lugar que este designe dentro del ámbito de la empresa o entidad.
                            
                            TERCERA: JORNADA LABORAL
                            La jornada de trabajo será de [número] horas diarias, [número] días a la semana, con descanso semanal conforme a ley. El horario exacto será fijado por EL EMPLEADOR.
                            
                            CUARTA: REMUNERACIÓN
                            EL TRABAJADOR recibirá una remuneración mensual ascendente a la suma de S/ [monto] ([monto en letras] soles), que le será abonada de forma mensual. Esta remuneración incluye todos los conceptos legales aplicables.
                            
                            QUINTA: DURACIÓN DEL CONTRATO
                            Este contrato tiene una duración [determinada / indeterminada], comenzando el día [fecha de inicio], y en caso de ser a plazo fijo, terminará el [fecha de término], pudiendo renovarse previo acuerdo entre ambas partes.
                            
                            SEXTA: OBLIGACIONES DEL TRABAJADOR
                            EL TRABAJADOR se compromete a:
                            
                            Cumplir las órdenes y directivas de EL EMPLEADOR.
                            
                            Desempeñar sus funciones con diligencia, puntualidad y responsabilidad.
                            
                            Respetar las normas internas y de seguridad del lugar de trabajo.
                            
                            SÉPTIMA: BENEFICIOS
                            EL TRABAJADOR gozará de los beneficios laborales establecidos en la legislación vigente: gratificaciones, CTS, vacaciones, seguro de salud, y demás que correspondan conforme a ley.
                            
                            OCTAVA: TERMINACIÓN
                            El presente contrato podrá resolverse por mutuo acuerdo, renuncia voluntaria, despido justificado, o por las demás causales establecidas en la legislación laboral vigente.
                            
                            NOVENA: LEY APLICABLE
                            Este contrato se regula por las disposiciones del Código del Trabajo (o Ley de Productividad y Competitividad Laboral, según el país), así como por otras normas complementarias.
                            
                            En fe de lo cual, ambas partes firman por duplicado el presente contrato, en señal de conformidad.
                            
                            Lugar y fecha: [Ciudad], [día] de [mes] del [año]
                            
                            _________________________
                            EL EMPLEADOR
                            [Nombres y Apellidos]
                            Cargo: [____]
                            
                            _________________________
                            EL TRABAJADOR
                            [Nombres y Apellidos]
                            """
        
        );
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtContrato = new javax.swing.JTextArea();
        panelBusquedaContrato = new javax.swing.JPanel();
        btnBuscarPago1 = new javax.swing.JButton();
        lblBuscarOpc2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtReporteID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(17, 50, 77));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Información:"));

        txtContrato.setColumns(20);
        txtContrato.setRows(5);
        jScrollPane1.setViewportView(txtContrato);

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
        btnBuscarPago1.setText("Buscar Contrato");
        btnBuscarPago1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPago1ActionPerformed(evt);
            }
        });

        lblBuscarOpc2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblBuscarOpc2.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscarOpc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscarOpc2.setText("Revise su Contrato");

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
                .addGap(85, 85, 85)
                .addGroup(panelBusquedaContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarPago1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBuscarOpc2))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtReporteID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        panelBusquedaContratoLayout.setVerticalGroup(
            panelBusquedaContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaContratoLayout.createSequentialGroup()
                .addGroup(panelBusquedaContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBusquedaContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtReporteID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if (txtReporteID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el ID de empleado.");
            return;
        }
        try {
            int id = Integer.parseInt(txtReporteID.getText());
            Empleado emp = gestor.getEmpleado(id);
            if (emp != null) {
                StringBuilder c = new StringBuilder();
                c.append("CONTRATO DE TRABAJO\n");
                c.append("Trabajador: ").append(emp.getNombre()).append(", DNI ")
                 .append(emp.getDni()).append("\n");
                c.append("Cargo: ").append(emp.getClass().getSimpleName()).append("\n");
                c.append("Tarifa: S/ ").append(emp.getTarifaPorHora()).append(" por hora.\n");
                c.append("Fecha Ingreso: ").append(emp.getFechaIngreso().format(fmt)).append("\n");
                switch (emp.getTipoContrato()) {
                    case DISCAPACIDAD:
                        c.append("Fecha Término: ").append(emp.getFechaTermino().format(fmt)).append("\n");
                        c.append("Fecha Renovación: ").append(emp.getFechaRenovacion().format(fmt)).append("\n");
                        c.append("Modalidad: Indefinida con ajustes razonables para discapacidad.\n");
                        c.append("No podrá prestar servicios hasta el término del contrato.\n");
                        break;
                    case INDEFINIDO:
                        c.append("Modalidad: Contrato indefinido sin fecha de término ni renovación.\n");
                        break;
                    case RENOVABLE:
                        c.append("Fecha Término: ").append(emp.getFechaTermino().format(fmt)).append("\n");
                        c.append("Fecha Renovación: ").append(emp.getFechaRenovacion().format(fmt)).append("\n");
                        c.append("Modalidad: Contrato a plazo renovable automáticamente.\n");
                        break;
                    case TEMPORAL:
                        c.append("Fecha Término: ").append(emp.getFechaTermino().format(fmt)).append("\n");
                        c.append("Modalidad: Contrato a plazo fijo sin opción de renovación.\n");
                        break;
                    default:
                        c.append("ERROR: Tipo de contrato no válido.\n");
                        break;
                }
                txtContrato.setText(c.toString());
            } else {
                JOptionPane.showMessageDialog(this, "Error... No existe el empleado.");
            }
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
    private javax.swing.JTextArea txtContrato;
    private javax.swing.JTextField txtReporteID;
    // End of variables declaration//GEN-END:variables
}
