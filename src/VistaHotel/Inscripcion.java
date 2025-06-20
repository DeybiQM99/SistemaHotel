package VistaHotel;

import GestionReservas.Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JPanel;
import java.sql.Date;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;

public class Inscripcion extends javax.swing.JFrame {

    public Inscripcion() {
        initComponents();
        this.setLocationRelativeTo(null);
        // --------- AQUI: PON LOS LISTENERS DE FECHAS ---------
        jDateChooserEntrada.getDateEditor().addPropertyChangeListener(evt -> {
            if ("date".equals(evt.getPropertyName())) {
                calcularTotalReserva();
            }
        });

        jDateChooserSalida.getDateEditor().addPropertyChangeListener(evt -> {
            if ("date".equals(evt.getPropertyName())) {
                calcularTotalReserva();
            }
        });

    }
    private ReservarHabitacion panelReservarHabitacion;

    // Nuevo constructor que recibe datos
    public Inscripcion(String numero, String tipo, String precio, ReservarHabitacion panel) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.panelReservarHabitacion = panel;
        // Asume que tienes JTextFields con estos nombres en Inscripcion
        TxtNumHabitacion.setText(numero);
        TxtTipoH.setText(tipo);
        TxtPrecioPorNoche.setText(precio);

        // --------- AQUI TAMBIÉN: PON LOS LISTENERS DE FECHAS ---------
        jDateChooserEntrada.getDateEditor().addPropertyChangeListener(evt -> {
            if ("date".equals(evt.getPropertyName())) {
                calcularTotalReserva();
            }
        });

        jDateChooserSalida.getDateEditor().addPropertyChangeListener(evt -> {
            if ("date".equals(evt.getPropertyName())) {
                calcularTotalReserva();
            }
        });

    }

    // --------- AQUI: MÉTODO PARA CALCULAR EL TOTAL ---------
    private void calcularTotalReserva() {
        java.util.Date fechaEntradaUtil = jDateChooserEntrada.getDate();
        java.util.Date fechaSalidaUtil = jDateChooserSalida.getDate();

        if (fechaEntradaUtil != null && fechaSalidaUtil != null) {
            long diferenciaMillis = fechaSalidaUtil.getTime() - fechaEntradaUtil.getTime();
            int nroNoches = (int) (diferenciaMillis / (1000 * 60 * 60 * 24));

            if (nroNoches <= 0) {
                TxtResPrecio.setText("0.00");
                return;
            }

            try {
                double precioPorNoche = Double.parseDouble(TxtPrecioPorNoche.getText());
                double total = nroNoches * precioPorNoche;
                TxtResPrecio.setText(String.format("%.2f", total));
            } catch (NumberFormatException ex) {
                TxtResPrecio.setText("Precio inválido");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnRegistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BtnRegresar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TxtDni = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        TxtApellido = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        TxtNombre = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        TxtTipoH = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        TxtPrecioPorNoche = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        TxtNumHabitacion = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TxtResPrecio = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        TxtDireccion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        TxtCorreo = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        TxtDescripcion = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jDateChooserSalida = new com.toedter.calendar.JDateChooser();
        jDateChooserEntrada = new com.toedter.calendar.JDateChooser();
        TxtObservacion = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        CbEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(750, 440));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 44, 116));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtTelefono.setBackground(new java.awt.Color(33, 44, 116));
        TxtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        TxtTelefono.setBorder(null);
        jPanel1.add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 170, 20));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("APELLIDOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 20));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TELEFONO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 30));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DNI");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, 20));

        BtnRegistrar.setBackground(new java.awt.Color(33, 44, 116));
        BtnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarEV.png"))); // NOI18N
        BtnRegistrar.setText("Registrar");
        BtnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegistrarMouseClicked(evt);
            }
        });
        jPanel1.add(BtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 150, 40));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOMBRE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, 20));

        BtnRegresar1.setBackground(new java.awt.Color(33, 44, 116));
        BtnRegresar1.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RegresarEV.png"))); // NOI18N
        BtnRegresar1.setText("Regresar");
        BtnRegresar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegresar1MouseClicked(evt);
            }
        });
        jPanel1.add(BtnRegresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 150, 40));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DETALLE CLIENTE");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 170, 10));

        TxtDni.setBackground(new java.awt.Color(33, 44, 116));
        TxtDni.setForeground(new java.awt.Color(255, 255, 255));
        TxtDni.setBorder(null);
        jPanel1.add(TxtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 170, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, 10));

        TxtApellido.setBackground(new java.awt.Color(33, 44, 116));
        TxtApellido.setForeground(new java.awt.Color(255, 255, 255));
        TxtApellido.setBorder(null);
        jPanel1.add(TxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 170, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, 10));

        TxtNombre.setBackground(new java.awt.Color(33, 44, 116));
        TxtNombre.setForeground(new java.awt.Color(255, 255, 255));
        TxtNombre.setBorder(null);
        jPanel1.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 170, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 170, 10));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 10, 440));

        TxtTipoH.setBackground(new java.awt.Color(33, 44, 116));
        TxtTipoH.setForeground(new java.awt.Color(255, 255, 255));
        TxtTipoH.setBorder(null);
        jPanel1.add(TxtTipoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 170, 20));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PRECIO NOCHE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 110, 30));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TIPO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 50, 30));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ESTADO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, 30));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("N. HABITACION");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 170, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 170, 10));

        TxtPrecioPorNoche.setBackground(new java.awt.Color(33, 44, 116));
        TxtPrecioPorNoche.setForeground(new java.awt.Color(255, 255, 255));
        TxtPrecioPorNoche.setBorder(null);
        jPanel1.add(TxtPrecioPorNoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 170, 20));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 170, 10));

        TxtNumHabitacion.setBackground(new java.awt.Color(33, 44, 116));
        TxtNumHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        TxtNumHabitacion.setBorder(null);
        jPanel1.add(TxtNumHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 170, 20));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 170, 10));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("DETALLE HABITACION");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 380, -1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("DETALLE RESERVACION");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 390, -1));

        jLabel15.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("F. SALIDA");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, 30));

        jLabel17.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("PRECIO");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, 30));

        jLabel18.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("F. ENTRADA");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, 30));

        TxtResPrecio.setBackground(new java.awt.Color(33, 44, 116));
        TxtResPrecio.setForeground(new java.awt.Color(255, 255, 255));
        TxtResPrecio.setBorder(null);
        jPanel1.add(TxtResPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 170, 20));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 170, 10));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 170, -1));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 170, 0));

        jLabel19.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("OBSERVACION");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 120, 30));

        TxtDireccion.setBackground(new java.awt.Color(33, 44, 116));
        TxtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        TxtDireccion.setBorder(null);
        jPanel1.add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 170, 20));

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DIRECCION");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 80, 30));

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CORREO");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 80, 30));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 170, 10));

        TxtCorreo.setBackground(new java.awt.Color(33, 44, 116));
        TxtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        TxtCorreo.setBorder(null);
        jPanel1.add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 170, 20));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 170, 10));

        TxtDescripcion.setBackground(new java.awt.Color(33, 44, 116));
        TxtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        TxtDescripcion.setBorder(null);
        jPanel1.add(TxtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 170, 20));

        jLabel20.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("DESCRIPCION");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 100, 30));
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 170, 10));
        jPanel1.add(jDateChooserSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 170, -1));
        jPanel1.add(jDateChooserEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 170, -1));

        TxtObservacion.setBackground(new java.awt.Color(33, 44, 116));
        TxtObservacion.setForeground(new java.awt.Color(255, 255, 255));
        TxtObservacion.setBorder(null);
        jPanel1.add(TxtObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 170, 20));
        jPanel1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 170, 10));

        CbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DISPONIBLE", "OCUPADO", "LIMPIEZA" }));
        jPanel1.add(CbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegresar1MouseClicked

        this.dispose(); // finaliza el  jframe pero no cierra el programa por completo
    }//GEN-LAST:event_BtnRegresar1MouseClicked

    private void BtnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistrarMouseClicked

        // Leer datos CLIENTES
        String nombre = TxtNombre.getText();
        String apellido = TxtApellido.getText();
        String dni = TxtDni.getText();
        String telefono = TxtTelefono.getText();
        String correo = TxtCorreo.getText();
        String direccion = TxtDireccion.getText();

        // Leer datos HABITACION
        String numHabitacion = TxtNumHabitacion.getText();
        String precioPorNoche = TxtPrecioPorNoche.getText();
        String estadoSeleccionado = (String) CbEstado.getSelectedItem();
        String tipoHabitacion = TxtTipoH.getText();
        String descripcion = TxtDescripcion.getText();

        // Leer fechas desde JDateChooser
        java.util.Date fechaEntradaUtil = jDateChooserEntrada.getDate();
        java.util.Date fechaSalidaUtil = jDateChooserSalida.getDate();

        String precio = TxtResPrecio.getText();
        String observacion = TxtObservacion.getText();

        if (fechaEntradaUtil == null || fechaSalidaUtil == null) {
            JOptionPane.showMessageDialog(null, "Selecciona ambas fechas de entrada y salida.");
            return;
        }

        java.sql.Date fechaEntrada = new java.sql.Date(fechaEntradaUtil.getTime());
        java.sql.Date fechaSalida = new java.sql.Date(fechaSalidaUtil.getTime());

        // Validar que dni sea número (ajusta si DNI es otro tipo)
        int dniInt;
        try {
            dniInt = Integer.parseInt(dni);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "DNI debe ser un número válido.");
            return;
        }

        // Crear objeto Cliente
        Cliente nuevoCliente = new Cliente(nombre, apellido, telefono, correo, Integer.parseInt(dni), direccion);
        nuevoCliente.setDireccion(direccion); // Asignamos la dirección
        // Conexión y guardado en base de datos
        try (Connection conn = ConexionBaseDeDatos.ConexionBD.conectar()) {
            if (conn != null) {
                // insertar datos en la tabla CLIENTES
                String sql = "INSERT INTO Clientes (nombre, apellido, dni_pasaporte, correo, telefono, direccion) VALUES (?, ?, ?, ?, ?, ?)";
                java.sql.PreparedStatement stmtCliente = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                stmtCliente.setString(1, nuevoCliente.getNombre());
                stmtCliente.setString(2, nuevoCliente.getApellido());
                stmtCliente.setString(3, String.valueOf(nuevoCliente.getDni()));
                stmtCliente.setString(4, nuevoCliente.getCorreo());
                stmtCliente.setString(5, nuevoCliente.getTelefono());
                stmtCliente.setString(6, nuevoCliente.getDireccion());
                int filasCliente = stmtCliente.executeUpdate();
                if (filasCliente == 0) {
                    JOptionPane.showMessageDialog(null, "Error al insertar cliente.");
                    return;
                }

                // Obtener id_cliente generado
                int idCliente = -1;
                try (ResultSet generatedKeys = stmtCliente.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        idCliente = generatedKeys.getInt(1);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo obtener el ID del cliente.");
                        return;
                    }
                }
                // insertar datos en la tabla HABITACIONES
                String sqlHabitacion = "INSERT INTO Habitaciones (numero_habitacion, tipo, descripcion, precio_por_noche, estado) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement stmtHabitacion = conn.prepareStatement(sqlHabitacion);
                stmtHabitacion.setString(1, numHabitacion);                          // Ej: "101"
                stmtHabitacion.setString(2, tipoHabitacion);                         // Ej: "Suite"
                stmtHabitacion.setString(3, descripcion);                            // Ej: "Vista al mar"
                stmtHabitacion.setDouble(4, Double.parseDouble(precioPorNoche));    // Ej: "250.00"
                stmtHabitacion.setString(5, estadoSeleccionado);                    // SELECCION DEL CB DE ESTADO
                stmtHabitacion.executeUpdate();
                // Definir estado reserva (ajusta este id segun tus datos en Estados_Reserva)
                int idEstadoReserva = 1; // por ejemplo: 1 = "Reservado"
                // INSERTAR  TABLA RESERVA
                String sqlReserva = "INSERT INTO Reservas (id_cliente, fecha_entrada, fecha_salida, id_estado) VALUES (?, ?, ?, ?)";
                PreparedStatement stmtReserva = conn.prepareStatement(sqlReserva, Statement.RETURN_GENERATED_KEYS);
                stmtReserva.setInt(1, idCliente);
                stmtReserva.setDate(2, fechaEntrada);
                stmtReserva.setDate(3, fechaSalida);
                stmtReserva.setInt(4, idEstadoReserva);
                stmtReserva.executeUpdate();
                // INSERTAR EN TABLA DETALLE RESERVA

                // Obtener id_reserva generado
                int idReserva = -1;
                try (ResultSet generatedReservaKeys = stmtReserva.getGeneratedKeys()) {
                    if (generatedReservaKeys.next()) {
                        idReserva = generatedReservaKeys.getInt(1);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo obtener el ID de la reserva.");
                        return;
                    }
                }

// Obtener id_habitacion por número de habitación
                int idHabitacion = -1;
                String sqlGetHabitacionId = "SELECT id_habitacion FROM Habitaciones WHERE numero_habitacion = ?";
                try (PreparedStatement stmtGetHabitacion = conn.prepareStatement(sqlGetHabitacionId)) {
                    stmtGetHabitacion.setString(1, numHabitacion);
                    ResultSet rsHabitacion = stmtGetHabitacion.executeQuery();
                    if (rsHabitacion.next()) {
                        idHabitacion = rsHabitacion.getInt("id_habitacion");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró la habitación recién insertada.");
                        return;
                    }
                }

// Calcular número de noches
                long diferenciaMillis = fechaSalida.getTime() - fechaEntrada.getTime();
                int nroNoches = (int) (diferenciaMillis / (1000 * 60 * 60 * 24));

                double precioDouble;
                try {
                    precioDouble = Double.parseDouble(precio);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "El precio ingresado no es válido.");
                    return;
                }

// Insertar en tabla Detalle_Reserva
                String sqlDetalle = "INSERT INTO Detalle_Reserva ( id_reserva, id_habitacion, precio, nro_noches) VALUES (?, ?, ?, ?)";

                PreparedStatement stmtDetalle = conn.prepareStatement(sqlDetalle);

                stmtDetalle.setInt(1, idReserva);
                stmtDetalle.setInt(2, idHabitacion);

                stmtDetalle.setDouble(3, Double.parseDouble(precio));

                stmtDetalle.setInt(4, nroNoches);

                stmtDetalle.executeUpdate();

                // Suponiendo que estás en Inscripcion.java y quieres notificar a ReservarHabitacion:
                if (panelReservarHabitacion != null) {
                    panelReservarHabitacion.actualizarColorPanelPorEstado(numHabitacion, estadoSeleccionado);

                }

                javax.swing.JOptionPane.showMessageDialog(null, "Habitaciones registrado correctamente.");
                this.dispose();
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error al registrar habitacionessss: " + e.getMessage());
        }
    }//GEN-LAST:event_BtnRegistrarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inscripcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JButton BtnRegresar1;
    private javax.swing.JComboBox<String> CbEstado;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtDescripcion;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtDni;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtNumHabitacion;
    private javax.swing.JTextField TxtObservacion;
    private javax.swing.JTextField TxtPrecioPorNoche;
    private javax.swing.JTextField TxtResPrecio;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JTextField TxtTipoH;
    private com.toedter.calendar.JDateChooser jDateChooserEntrada;
    private com.toedter.calendar.JDateChooser jDateChooserSalida;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
