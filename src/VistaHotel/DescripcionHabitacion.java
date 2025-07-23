package VistaHotel;



public class DescripcionHabitacion extends javax.swing.JPanel {

   

    public DescripcionHabitacion() {
        initComponents();
       
        

    }

    public DescripcionHabitacion(String numero, String tipo, String precio) {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        img16 = new javax.swing.JLabel();
        lblPrecio15 = new javax.swing.JLabel();
        LblNumero18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        LblNumero19 = new javax.swing.JLabel();
        LblTipo17 = new javax.swing.JLabel();
        Panel13 = new javax.swing.JPanel();
        img13 = new javax.swing.JLabel();
        lblPrecio13 = new javax.swing.JLabel();
        LblNumero14 = new javax.swing.JLabel();
        LblTipo13 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        LblNumero15 = new javax.swing.JLabel();
        Panel14 = new javax.swing.JPanel();
        lblPrecio14 = new javax.swing.JLabel();
        LblNumero16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        LblNumero17 = new javax.swing.JLabel();
        img15 = new javax.swing.JLabel();
        LblTipo16 = new javax.swing.JLabel();
        LTitulo = new javax.swing.JLabel();

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

        setBackground(new java.awt.Color(17, 50, 77));
        setMinimumSize(new java.awt.Dimension(720, 440));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FAMILIAR.jpg"))); // NOI18N
        Panel1.add(img16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 180));

        lblPrecio15.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblPrecio15.setText("CAMAS: 1 MATRIMONIAL Y 2 INDIVIDUALES");
        Panel1.add(lblPrecio15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 250, 30));

        LblNumero18.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LblNumero18.setText("VISTAS: JARDIN O AREA DE JUEGOS");
        Panel1.add(LblNumero18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 200, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel15.setText("OCUPACION: 4 PERSONAS");
        Panel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 20));

        LblNumero19.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LblNumero19.setText("SUPERFICIE: 35 m²  ");
        Panel1.add(LblNumero19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 200, 20));

        LblTipo17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblTipo17.setText("HABITACION FAMILIAR");
        Panel1.add(LblTipo17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 210, 20));

        add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 220, 340));

        Panel13.setBackground(new java.awt.Color(255, 255, 255));
        Panel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SUIT.jpg"))); // NOI18N
        Panel13.add(img13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 180));

        lblPrecio13.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblPrecio13.setText("CAMAS: MEDIDA KING, QUEEN O DOBLE");
        Panel13.add(lblPrecio13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 210, 30));

        LblNumero14.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LblNumero14.setText("VISTAS: PATIO");
        Panel13.add(LblNumero14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 200, 30));

        LblTipo13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblTipo13.setText("HABITACION SUIT");
        Panel13.add(LblTipo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 160, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel13.setText("OCUPACION: 2 PERSONAS");
        Panel13.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 30));

        LblNumero15.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LblNumero15.setText("SUPERFICIE: 25 m²");
        Panel13.add(LblNumero15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 200, 30));

        add(Panel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 220, 340));

        Panel14.setBackground(new java.awt.Color(255, 255, 255));
        Panel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPrecio14.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblPrecio14.setText("CAMAS: 1 MATRIMONIAL Y 2 INDIVIDUALES");
        Panel14.add(lblPrecio14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 210, 30));

        LblNumero16.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LblNumero16.setText("VISTAS: EXTERIOR O CALLE");
        Panel14.add(LblNumero16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 200, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel14.setText("OCUPACION: 2 PERSONAS");
        Panel14.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 20));

        LblNumero17.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LblNumero17.setText("SUPERFICIE: 20 m²  ");
        Panel14.add(LblNumero17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 200, 20));

        img15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DOBLE.jpg"))); // NOI18N
        Panel14.add(img15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 180));

        LblTipo16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblTipo16.setText("HABITACION DOBLE");
        Panel14.add(LblTipo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 180, 20));

        add(Panel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 220, 340));

        LTitulo.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        LTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LTitulo.setText("DESCRIPCION HABITACIONES");
        add(LTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 440, 50));
    }// </editor-fold>//GEN-END:initComponents

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LTitulo;
    private javax.swing.JLabel LblNumero14;
    private javax.swing.JLabel LblNumero15;
    private javax.swing.JLabel LblNumero16;
    private javax.swing.JLabel LblNumero17;
    private javax.swing.JLabel LblNumero18;
    private javax.swing.JLabel LblNumero19;
    private javax.swing.JLabel LblTipo13;
    private javax.swing.JLabel LblTipo16;
    private javax.swing.JLabel LblTipo17;
    public javax.swing.JPanel Panel1;
    public javax.swing.JPanel Panel13;
    public javax.swing.JPanel Panel14;
    private javax.swing.JLabel img13;
    private javax.swing.JLabel img15;
    private javax.swing.JLabel img16;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPrecio13;
    private javax.swing.JLabel lblPrecio14;
    private javax.swing.JLabel lblPrecio15;
    // End of variables declaration//GEN-END:variables
}
