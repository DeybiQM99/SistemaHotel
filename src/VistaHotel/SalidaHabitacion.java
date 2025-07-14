package VistaHotel;


public class SalidaHabitacion extends javax.swing.JPanel {

    ReservarHabitacion panelReservas;

    public SalidaHabitacion() {
        initComponents();
        panelReservas = new ReservarHabitacion(); // Creamos una instancia para acceder a los paneles ya diseñados
       
    }

  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CLIENTE = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        CLIENTE1 = new javax.swing.JLabel();
        CLIENTE2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        CLIENTE3 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        CLIENTE4 = new javax.swing.JLabel();
        CLIENTE5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(33, 44, 116));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CLIENTE.setForeground(new java.awt.Color(255, 255, 255));
        CLIENTE.setText("FECHA SALIDA");
        add(CLIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 120, 30));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DIN");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 50, 30));

        jButton1.setBackground(new java.awt.Color(33, 44, 116));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BuscarTalentoEV.png"))); // NOI18N
        jButton1.setText("BUSCAR");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 150, 40));

        jTextField1.setBackground(new java.awt.Color(33, 44, 116));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.setPreferredSize(new java.awt.Dimension(64, 64));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 170, 20));

        jTextField2.setBackground(new java.awt.Color(33, 44, 116));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 170, 20));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ESTADO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 70, -1));

        jTextField3.setBackground(new java.awt.Color(33, 44, 116));
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(null);
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 170, 20));

        CLIENTE1.setForeground(new java.awt.Color(255, 255, 255));
        CLIENTE1.setText("CLIENTE");
        add(CLIENTE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 60, 30));

        CLIENTE2.setForeground(new java.awt.Color(255, 255, 255));
        CLIENTE2.setText("METODO DE PAGO");
        add(CLIENTE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 120, 30));

        jTextField4.setBackground(new java.awt.Color(33, 44, 116));
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(null);
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 170, 20));

        jTextField5.setBackground(new java.awt.Color(33, 44, 116));
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(null);
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 170, 20));

        CLIENTE3.setForeground(new java.awt.Color(255, 255, 255));
        CLIENTE3.setText("FECHA ENTRADA");
        add(CLIENTE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 110, 30));

        jTextField6.setBackground(new java.awt.Color(33, 44, 116));
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setBorder(null);
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, 20));

        CLIENTE4.setForeground(new java.awt.Color(255, 255, 255));
        CLIENTE4.setText("ESTADO DE PAGO");
        add(CLIENTE4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 120, 30));

        CLIENTE5.setForeground(new java.awt.Color(255, 255, 255));
        CLIENTE5.setText("TOTAL A PAGAR");
        add(CLIENTE5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 100, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EFECTIVO", "TARJETA" }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 170, 30));

        jTextField7.setBackground(new java.awt.Color(33, 44, 116));
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setBorder(null);
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 170, 20));

        jButton2.setBackground(new java.awt.Color(33, 44, 116));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reserva.png"))); // NOI18N
        jButton2.setText("ALARGAR FECHA");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 150, 40));

        jButton3.setBackground(new java.awt.Color(33, 44, 116));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarEV.png"))); // NOI18N
        jButton3.setText("CONFIRMAR SALIDA");
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 180, 40));

        jButton4.setBackground(new java.awt.Color(33, 44, 116));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        jButton4.setText("CANCELAR RESERVA");
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 170, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 170, 20));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 170, 20));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 170, 20));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 170, 20));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 170, 20));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 170, 20));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, 20));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 170, 20));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 170, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
      
        EditarReserva editRes = new EditarReserva();
        editRes.setVisible(true);
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CLIENTE;
    private javax.swing.JLabel CLIENTE1;
    private javax.swing.JLabel CLIENTE2;
    private javax.swing.JLabel CLIENTE3;
    private javax.swing.JLabel CLIENTE4;
    private javax.swing.JLabel CLIENTE5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
