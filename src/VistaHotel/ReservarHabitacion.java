package VistaHotel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import ConexionBaseDeDatos.ConexionBD;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;

public class ReservarHabitacion extends javax.swing.JPanel {

    // Mapa para asociar número de habitación con su panel
    private Map<String, JPanel> mapaPaneles = new HashMap<>();
    private Map<String, JButton> mapaBotones = new HashMap<>();
    private Map<String, JLabel> mapaLblNumero = new HashMap<>();
    private Map<String, JLabel> mapaLblTipo = new HashMap<>();
    private Map<String, JLabel> mapaLblPrecio = new HashMap<>();

    public ReservarHabitacion() {
        initComponents();
        inicializarMapaPaneles(); // Asociar las habitaciones con sus paneles respectivos
        inicializarMapaBotones(); // <<--- AGREGA ESTO
        inicializarColoresPorDefecto();
        cargarEstadosDesdeBD();

        inicializarMapaLabels();    // NUEVO
        asignarEventosBotones();    // NUEVO 
    }

    public ReservarHabitacion(String numero, String tipo, String precio) {
        initComponents();
    }

    // Asociar número de habitación con su MAPA panel visual CON MAPS
    private void inicializarMapaPaneles() {
        mapaPaneles.put("1", Panel1);
        mapaPaneles.put("2", Panel2);
        mapaPaneles.put("3", Panel3);
        mapaPaneles.put("4", Panel4);
        mapaPaneles.put("5", Panel5);
        mapaPaneles.put("6", Panel6);
        mapaPaneles.put("7", Panel7);
        mapaPaneles.put("8", Panel8);
        mapaPaneles.put("9", Panel9);
        mapaPaneles.put("10", Panel10);
        mapaPaneles.put("11", Panel11);
        mapaPaneles.put("12", Panel12);
    }

    // Colección de tipo Map que asocia el número de habitación con su botón correspondiente
    private void inicializarMapaBotones() {
        mapaBotones.put("1", BtnReservar1);
        mapaBotones.put("2", BtnReservar2);
        mapaBotones.put("3", BtnReservar3);
        mapaBotones.put("4", BtnReservar4);
        mapaBotones.put("5", BtnReservar5);
        mapaBotones.put("6", BtnReservar6);
        mapaBotones.put("7", BtnReservar7);
        mapaBotones.put("8", BtnReservar8);
        mapaBotones.put("9", BtnReservar9);
        mapaBotones.put("10", BtnReservar10);
        mapaBotones.put("11", BtnReservar11);
        mapaBotones.put("12", BtnReservar12);
    }

    private void inicializarMapaLabels() {
        mapaLblNumero.put("1", LblNumero1);
        mapaLblTipo.put("1", LblTipo1);
        mapaLblPrecio.put("1", lblPrecio1);

        mapaLblNumero.put("2", LblNumero2);
        mapaLblTipo.put("2", LblTipo2);
        mapaLblPrecio.put("2", lblPrecio2);

        mapaLblNumero.put("3", LblNumero3);
        mapaLblTipo.put("3", LblTipo3);
        mapaLblPrecio.put("3", lblPrecio3);

        mapaLblNumero.put("4", LblNumero4);
        mapaLblTipo.put("4", LblTipo4);
        mapaLblPrecio.put("4", lblPrecio4);

        mapaLblNumero.put("5", LblNumero5);
        mapaLblTipo.put("5", LblTipo5);
        mapaLblPrecio.put("5", lblPrecio5);

        mapaLblNumero.put("6", LblNumero6);
        mapaLblTipo.put("6", LblTipo6);
        mapaLblPrecio.put("6", lblPrecio6);

        mapaLblNumero.put("7", LblNumero7);
        mapaLblTipo.put("7", LblTipo7);
        mapaLblPrecio.put("7", lblPrecio7);

        mapaLblNumero.put("8", LblNumero8);
        mapaLblTipo.put("8", LblTipo8);
        mapaLblPrecio.put("8", lblPrecio8);

        mapaLblNumero.put("9", LblNumero9);
        mapaLblTipo.put("9", LblTipo9);
        mapaLblPrecio.put("9", lblPrecio9);

        mapaLblNumero.put("10", LblNumero10);
        mapaLblTipo.put("10", LblTipo10);
        mapaLblPrecio.put("10", lblPrecio10);

        mapaLblNumero.put("11", LblNumero11);
        mapaLblTipo.put("11", LblTipo11);
        mapaLblPrecio.put("11", lblPrecio11);

        mapaLblNumero.put("12", LblNumero12);
        mapaLblTipo.put("12", LblTipo12);
        mapaLblPrecio.put("12", lblPrecio12);
    }

    private void asignarEventosBotones() {
        for (int i = 1; i <= 12; i++) {
            String num = String.valueOf(i);
            JButton boton = mapaBotones.get(num);

            boton.addActionListener(evt -> {
                if (!boton.isEnabled()) {
                    return;
                }
                JLabel lblNum = mapaLblNumero.get(num);
                JLabel lblTipo = mapaLblTipo.get(num);
                JLabel lblPrecio = mapaLblPrecio.get(num);
                abrirInscripcion(lblNum, lblTipo, lblPrecio);
            });
        }
    }

    // Pintar todos los paneles en verde por defecto (disponible)
    private void inicializarColoresPorDefecto() {
        for (JPanel panel : mapaPaneles.values()) {
            panel.setBackground(Color.GREEN);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel9 = new javax.swing.JPanel();
        BtnReservar9 = new javax.swing.JButton();
        img9 = new javax.swing.JLabel();
        lblPrecio9 = new javax.swing.JLabel();
        LblNumero9 = new javax.swing.JLabel();
        LblTipo9 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Panel1 = new javax.swing.JPanel();
        BtnReservar1 = new javax.swing.JButton();
        img1 = new javax.swing.JLabel();
        lblPrecio1 = new javax.swing.JLabel();
        LblNumero1 = new javax.swing.JLabel();
        LblTipo1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Panel5 = new javax.swing.JPanel();
        BtnReservar5 = new javax.swing.JButton();
        img5 = new javax.swing.JLabel();
        lblPrecio5 = new javax.swing.JLabel();
        LblNumero5 = new javax.swing.JLabel();
        LblTipo5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Panel10 = new javax.swing.JPanel();
        BtnReservar10 = new javax.swing.JButton();
        img10 = new javax.swing.JLabel();
        lblPrecio10 = new javax.swing.JLabel();
        LblNumero10 = new javax.swing.JLabel();
        LblTipo10 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Panel6 = new javax.swing.JPanel();
        BtnReservar6 = new javax.swing.JButton();
        img6 = new javax.swing.JLabel();
        lblPrecio6 = new javax.swing.JLabel();
        LblNumero6 = new javax.swing.JLabel();
        LblTipo6 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Panel11 = new javax.swing.JPanel();
        BtnReservar11 = new javax.swing.JButton();
        img11 = new javax.swing.JLabel();
        lblPrecio11 = new javax.swing.JLabel();
        LblNumero11 = new javax.swing.JLabel();
        LblTipo11 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Panel7 = new javax.swing.JPanel();
        BtnReservar7 = new javax.swing.JButton();
        img7 = new javax.swing.JLabel();
        lblPrecio7 = new javax.swing.JLabel();
        LblNumero7 = new javax.swing.JLabel();
        LblTipo7 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Panel12 = new javax.swing.JPanel();
        BtnReservar12 = new javax.swing.JButton();
        img12 = new javax.swing.JLabel();
        lblPrecio12 = new javax.swing.JLabel();
        LblNumero12 = new javax.swing.JLabel();
        LblTipo12 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Panel8 = new javax.swing.JPanel();
        BtnReservar8 = new javax.swing.JButton();
        img8 = new javax.swing.JLabel();
        lblPrecio8 = new javax.swing.JLabel();
        LblNumero8 = new javax.swing.JLabel();
        LblTipo8 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        BtnReservar2 = new javax.swing.JButton();
        img2 = new javax.swing.JLabel();
        lblPrecio2 = new javax.swing.JLabel();
        LblNumero2 = new javax.swing.JLabel();
        LblTipo2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        BtnReservar3 = new javax.swing.JButton();
        img3 = new javax.swing.JLabel();
        lblPrecio3 = new javax.swing.JLabel();
        LblNumero3 = new javax.swing.JLabel();
        LblTipo3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Panel4 = new javax.swing.JPanel();
        BtnReservar4 = new javax.swing.JButton();
        img4 = new javax.swing.JLabel();
        lblPrecio4 = new javax.swing.JLabel();
        LblNumero4 = new javax.swing.JLabel();
        LblTipo4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel9.setBackground(new java.awt.Color(255, 255, 255));
        Panel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar9.setBackground(new java.awt.Color(17, 50, 77));
        BtnReservar9.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar9.setText("Reservar");
        Panel9.add(BtnReservar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel9.add(img9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio9.setText("350");
        Panel9.add(lblPrecio9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 30, 20));

        LblNumero9.setText("9");
        Panel9.add(LblNumero9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 20, 20));

        LblTipo9.setText("FAMILIAR");
        Panel9.add(LblTipo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 20));

        jLabel9.setText("NUM");
        Panel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 20));

        add(Panel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 150, 130));

        Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar1.setBackground(new java.awt.Color(17, 50, 77));
        BtnReservar1.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar1.setText("Reservar");
        Panel1.add(BtnReservar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel1.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio1.setText("500");
        Panel1.add(lblPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 30, 20));

        LblNumero1.setText("1");
        Panel1.add(LblNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 10, 20));

        LblTipo1.setText("SUIT");
        Panel1.add(LblTipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 40, 20));

        jLabel2.setText("NUM");
        Panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 20));

        add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, 130));

        Panel5.setBackground(new java.awt.Color(255, 255, 255));
        Panel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar5.setBackground(new java.awt.Color(17, 50, 77));
        BtnReservar5.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar5.setText("Reservar");
        Panel5.add(BtnReservar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel5.add(img5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio5.setText("250");
        Panel5.add(lblPrecio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 30, 20));

        LblNumero5.setText("5");
        Panel5.add(LblNumero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 20, 20));

        LblTipo5.setText("DOUBLE");
        Panel5.add(LblTipo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 20));

        jLabel5.setText("NUM");
        Panel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 20));

        add(Panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 150, 130));

        Panel10.setBackground(new java.awt.Color(255, 255, 255));
        Panel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar10.setBackground(new java.awt.Color(17, 50, 77));
        BtnReservar10.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar10.setText("Reservar");
        Panel10.add(BtnReservar10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel10.add(img10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio10.setText("350");
        Panel10.add(lblPrecio10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 30, 20));

        LblNumero10.setText("10");
        Panel10.add(LblNumero10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 30, 20));

        LblTipo10.setText("FAMILIAR");
        Panel10.add(LblTipo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 20));

        jLabel10.setText("NUM");
        Panel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 20));

        add(Panel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 150, 130));

        Panel6.setBackground(new java.awt.Color(255, 255, 255));
        Panel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar6.setBackground(new java.awt.Color(17, 50, 77));
        BtnReservar6.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar6.setText("Reservar");
        Panel6.add(BtnReservar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel6.add(img6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio6.setText("250");
        Panel6.add(lblPrecio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 30, 20));

        LblNumero6.setText("6");
        Panel6.add(LblNumero6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 20, 20));

        LblTipo6.setText("DOUBLE");
        Panel6.add(LblTipo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 20));

        jLabel6.setText("NUM");
        Panel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 20));

        add(Panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 150, 130));

        Panel11.setBackground(new java.awt.Color(255, 255, 255));
        Panel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar11.setBackground(new java.awt.Color(17, 50, 77));
        BtnReservar11.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar11.setText("Reservar");
        Panel11.add(BtnReservar11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel11.add(img11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio11.setText("350");
        Panel11.add(lblPrecio11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 30, 20));

        LblNumero11.setText("11");
        Panel11.add(LblNumero11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 20, 20));

        LblTipo11.setText("FAMILIAR");
        Panel11.add(LblTipo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 20));

        jLabel11.setText("NUM");
        Panel11.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 20));

        add(Panel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 150, 130));

        Panel7.setBackground(new java.awt.Color(255, 255, 255));
        Panel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar7.setBackground(new java.awt.Color(17, 50, 77));
        BtnReservar7.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar7.setText("Reservar");
        Panel7.add(BtnReservar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel7.add(img7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio7.setText("250");
        Panel7.add(lblPrecio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 30, 20));

        LblNumero7.setText("7");
        Panel7.add(LblNumero7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 20, 20));

        LblTipo7.setText("DOUBLE");
        Panel7.add(LblTipo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 20));

        jLabel7.setText("NUM");
        Panel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 20));

        add(Panel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 150, 130));

        Panel12.setBackground(new java.awt.Color(255, 255, 255));
        Panel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar12.setBackground(new java.awt.Color(17, 50, 77));
        BtnReservar12.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar12.setText("Reservar");
        Panel12.add(BtnReservar12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel12.add(img12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio12.setText("350");
        Panel12.add(lblPrecio12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 30, 20));

        LblNumero12.setText("12");
        Panel12.add(LblNumero12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 20, 20));

        LblTipo12.setText("FAMILIAR");
        Panel12.add(LblTipo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 20));

        jLabel12.setText("NUM");
        Panel12.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 20));

        add(Panel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 150, 130));

        Panel8.setBackground(new java.awt.Color(255, 255, 255));
        Panel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar8.setBackground(new java.awt.Color(17, 50, 77));
        BtnReservar8.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar8.setText("Reservar");
        Panel8.add(BtnReservar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel8.add(img8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio8.setText("250");
        Panel8.add(lblPrecio8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 30, 20));

        LblNumero8.setText("8");
        Panel8.add(LblNumero8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 20, 20));

        LblTipo8.setText("DOUBLE");
        Panel8.add(LblTipo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 20));

        jLabel8.setText("NUM");
        Panel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 20));

        add(Panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 150, 130));

        Panel2.setBackground(new java.awt.Color(255, 255, 255));
        Panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar2.setBackground(new java.awt.Color(17, 50, 77));
        BtnReservar2.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar2.setText("Reservar");
        Panel2.add(BtnReservar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel2.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio2.setText("500");
        Panel2.add(lblPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 30, 20));

        LblNumero2.setText("2");
        Panel2.add(LblNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 10, 20));

        LblTipo2.setText("SUIT");
        Panel2.add(LblTipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 40, 20));

        jLabel3.setText("NUM");
        Panel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 20));

        add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 150, 130));

        Panel3.setBackground(new java.awt.Color(255, 255, 255));
        Panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar3.setBackground(new java.awt.Color(17, 50, 77));
        BtnReservar3.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar3.setText("Reservar");
        Panel3.add(BtnReservar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel3.add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio3.setText("500");
        Panel3.add(lblPrecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 30, 20));

        LblNumero3.setText("3");
        Panel3.add(LblNumero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 20, 20));

        LblTipo3.setText("SUIT");
        Panel3.add(LblTipo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 40, 20));

        jLabel4.setText("NUM");
        Panel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 20));

        add(Panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 150, 130));

        Panel4.setBackground(new java.awt.Color(255, 255, 255));
        Panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar4.setBackground(new java.awt.Color(17, 50, 77));
        BtnReservar4.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar4.setText("Reservar");
        Panel4.add(BtnReservar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel4.add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio4.setText("500");
        Panel4.add(lblPrecio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 30, 20));

        LblNumero4.setText("4");
        Panel4.add(LblNumero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 20, 20));

        LblTipo4.setText("SUIT");
        Panel4.add(LblTipo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 40, 20));

        jLabel1.setText("NUM");
        Panel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 20));

        add(Panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 150, 130));
    }// </editor-fold>//GEN-END:initComponents

    // METODO PARA QUE SE MUESTRE LOS ESTADOS ACTUALES DE LAS HABITACIONES 
    private void cargarEstadosDesdeBD() {
        try (Connection conn = ConexionBaseDeDatos.ConexionBD.conectar()) {
            String sql = "SELECT numero_habitacion, estado FROM Habitaciones";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String numero = rs.getString("numero_habitacion");
                String estado = rs.getString("estado");
                actualizarColorPanelPorEstado(numero, estado);
            }
        } catch (Exception e) {
            System.out.println("Error al cargar estados: " + e.getMessage());
        }
    }

    // Cambiar el color del panel según el estado de la habitación
    public void actualizarColorPanelPorEstado(String numeroHabitacion, String estado) {
        JPanel panel = mapaPaneles.get(numeroHabitacion);
        JButton boton = mapaBotones.get(numeroHabitacion);
        if (panel != null) {
            switch (estado.toLowerCase()) {
                case "ocupado":
                case "ocupada":  // <-- AÑADE ESTE CASE
                    panel.setBackground(Color.RED);
                    if (boton != null) {
                        boton.setEnabled(false);
                        boton.setForeground(Color.BLACK);
                    }
                    break;
                case "limpieza":
                    panel.setBackground(new Color(173, 216, 230)); // CELESTE
                    if (boton != null) {
                        boton.setEnabled(true);
                    }
                    break;
                default:
                    panel.setBackground(Color.GREEN);
                    if (boton != null) {
                        boton.setEnabled(true);
                    }
                    break;
            }
            panel.setOpaque(true);
            panel.repaint();
        }
    }

    // CREAMOS UN METODO PARA REUTILIZAR CODDIGO EN TODOS LOS PANELES / HABITACIONES QUE SELECCIONEMOS
    private void abrirInscripcion(JLabel lblNum, JLabel lblTipo, JLabel lblPrecio) {
        String numero = lblNum.getText();
        String tipo = lblTipo.getText();
        String precio = lblPrecio.getText();
        Inscripcion ins = new Inscripcion(numero, tipo, precio, this); // <-- Aquí agregas 'this'
        ins.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReservar1;
    private javax.swing.JButton BtnReservar10;
    private javax.swing.JButton BtnReservar11;
    private javax.swing.JButton BtnReservar12;
    private javax.swing.JButton BtnReservar2;
    private javax.swing.JButton BtnReservar3;
    private javax.swing.JButton BtnReservar4;
    private javax.swing.JButton BtnReservar5;
    private javax.swing.JButton BtnReservar6;
    private javax.swing.JButton BtnReservar7;
    private javax.swing.JButton BtnReservar8;
    private javax.swing.JButton BtnReservar9;
    private javax.swing.JLabel LblNumero1;
    private javax.swing.JLabel LblNumero10;
    private javax.swing.JLabel LblNumero11;
    private javax.swing.JLabel LblNumero12;
    private javax.swing.JLabel LblNumero2;
    private javax.swing.JLabel LblNumero3;
    private javax.swing.JLabel LblNumero4;
    private javax.swing.JLabel LblNumero5;
    private javax.swing.JLabel LblNumero6;
    private javax.swing.JLabel LblNumero7;
    private javax.swing.JLabel LblNumero8;
    private javax.swing.JLabel LblNumero9;
    private javax.swing.JLabel LblTipo1;
    private javax.swing.JLabel LblTipo10;
    private javax.swing.JLabel LblTipo11;
    private javax.swing.JLabel LblTipo12;
    private javax.swing.JLabel LblTipo2;
    private javax.swing.JLabel LblTipo3;
    private javax.swing.JLabel LblTipo4;
    private javax.swing.JLabel LblTipo5;
    private javax.swing.JLabel LblTipo6;
    private javax.swing.JLabel LblTipo7;
    private javax.swing.JLabel LblTipo8;
    private javax.swing.JLabel LblTipo9;
    public javax.swing.JPanel Panel1;
    public javax.swing.JPanel Panel10;
    public javax.swing.JPanel Panel11;
    public javax.swing.JPanel Panel12;
    public javax.swing.JPanel Panel2;
    public javax.swing.JPanel Panel3;
    public javax.swing.JPanel Panel4;
    public javax.swing.JPanel Panel5;
    public javax.swing.JPanel Panel6;
    public javax.swing.JPanel Panel7;
    public javax.swing.JPanel Panel8;
    public javax.swing.JPanel Panel9;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img10;
    private javax.swing.JLabel img11;
    private javax.swing.JLabel img12;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
    private javax.swing.JLabel img6;
    private javax.swing.JLabel img7;
    private javax.swing.JLabel img8;
    private javax.swing.JLabel img9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPrecio1;
    private javax.swing.JLabel lblPrecio10;
    private javax.swing.JLabel lblPrecio11;
    private javax.swing.JLabel lblPrecio12;
    private javax.swing.JLabel lblPrecio2;
    private javax.swing.JLabel lblPrecio3;
    private javax.swing.JLabel lblPrecio4;
    private javax.swing.JLabel lblPrecio5;
    private javax.swing.JLabel lblPrecio6;
    private javax.swing.JLabel lblPrecio7;
    private javax.swing.JLabel lblPrecio8;
    private javax.swing.JLabel lblPrecio9;
    // End of variables declaration//GEN-END:variables
}
