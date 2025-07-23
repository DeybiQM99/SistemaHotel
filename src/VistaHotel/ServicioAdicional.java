package VistaHotel;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import ConexionBaseDeDatos.ConexionBD;
import Interfaz.Bloqueable;
import java.beans.Statement;
import java.sql.ResultSet;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

import Interfaz.Limpiable;
import Interfaz.Bloqueable;

public class ServicioAdicional extends javax.swing.JPanel implements Limpiable, Bloqueable {

    public ServicioAdicional() {
        initComponents();
        bloquearCampos();   //INICIALIZAMOS EL METODO BLOQUEAR CAMPOS
        cargarProductos(); // INICIALIZAR EL METODO DE PARA EL CBRESPRODUCTOS
        configurarTabla();        //  CREA MODELO PARA PODER EDITAR LAS COLIMNAS
        agregarListenerTabla();   //  ACTUALIZAR EL SUBTOTAL

    }

    //SOBREESCRITURA PARA LIMPIAR DATOS
    @Override
    public void limpiarDatos() {
        TxtResNHabitacion.setText("");
        TxtResCliente.setText("");
        TxtResCategoria.setText("");
        TxtResDni.setText("");
        TxtResTelefono.setText("");
    }
    //SOBREESCRITURA PARA BLOQUEAR CAMPOS DE NUESTRO JPANEL

    @Override
    public void bloquearCampos() {
        TxtResCliente.setEditable(false);
        TxtResCategoria.setEditable(false);
        TxtResTelefono.setEditable(false);
        TxtResNHabitacion.setEditable(false);
        TxtResTotalPago.setEditable(false);
        TxtResPrecio.setEditable(false);
    }

    //METODO PARA CONECTAR LA BD DE LOS PRODUCTOS EN EL CBRESPRODUCTOS
    private void cargarProductos() {

        try (Connection conn = ConexionBaseDeDatos.ConexionBD.conectar()) {
            String sql = "SELECT nombre FROM Productos";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            JcResProducto.removeAllItems();
            while (rs.next()) {
                JcResProducto.addItem(rs.getString("nombre"));
            }
            // 2. Forzar que quede seleccionada la opción vacía
            JcResProducto.setSelectedIndex(0);
        } catch (Exception e) {
            System.out.println("Error al cargar estados: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtResDni = new javax.swing.JTextField();
        TxtResCategoria = new javax.swing.JTextField();
        TxtResNHabitacion = new javax.swing.JTextField();
        BtnFinalizarVenta = new javax.swing.JButton();
        JcResProducto = new javax.swing.JComboBox<>();
        TxtResTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtResMostrar = new javax.swing.JTable();
        TxtResPrecio = new javax.swing.JTextField();
        BtnResAgregar = new javax.swing.JButton();
        TxtResCantidad = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtResTotalPago = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        BtnResBuscar = new javax.swing.JButton();
        TxtResCliente = new javax.swing.JTextField();
        TxtResEliminar = new javax.swing.JButton();
        JcResEstadoVenta = new javax.swing.JComboBox<>();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();

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

        TxtResDni.setBackground(new java.awt.Color(17, 50, 77));
        TxtResDni.setForeground(new java.awt.Color(255, 255, 255));
        TxtResDni.setBorder(null);
        add(TxtResDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, 20));

        TxtResCategoria.setBackground(new java.awt.Color(17, 50, 77));
        TxtResCategoria.setForeground(new java.awt.Color(255, 255, 255));
        TxtResCategoria.setBorder(null);
        add(TxtResCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 170, 20));

        TxtResNHabitacion.setBackground(new java.awt.Color(17, 50, 77));
        TxtResNHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        TxtResNHabitacion.setBorder(null);
        add(TxtResNHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 170, 20));

        BtnFinalizarVenta.setBackground(new java.awt.Color(17, 50, 77));
        BtnFinalizarVenta.setForeground(new java.awt.Color(255, 255, 255));
        BtnFinalizarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FinPago.png"))); // NOI18N
        BtnFinalizarVenta.setText("FINALIZAR VENTA");
        BtnFinalizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFinalizarVentaActionPerformed(evt);
            }
        });
        add(BtnFinalizarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 170, 30));

        JcResProducto.setBackground(new java.awt.Color(17, 50, 77));
        JcResProducto.setEditable(true);
        JcResProducto.setForeground(new java.awt.Color(255, 255, 255));
        JcResProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", " " }));
        JcResProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcResProductoActionPerformed(evt);
            }
        });
        add(JcResProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 170, 20));

        TxtResTelefono.setBackground(new java.awt.Color(17, 50, 77));
        TxtResTelefono.setForeground(new java.awt.Color(255, 255, 255));
        TxtResTelefono.setBorder(null);
        add(TxtResTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, 20));

        jScrollPane1.setMaximumSize(null);
        jScrollPane1.setMinimumSize(null);

        JtResMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PRODUCTO", "CANTIDAD", "PRECIO UNITARIO", "SUB. TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JtResMostrar);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 710, 90));

        TxtResPrecio.setBackground(new java.awt.Color(17, 50, 77));
        TxtResPrecio.setForeground(new java.awt.Color(255, 255, 255));
        TxtResPrecio.setBorder(null);
        add(TxtResPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 170, 20));

        BtnResAgregar.setBackground(new java.awt.Color(17, 50, 77));
        BtnResAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BtnResAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        BtnResAgregar.setText("AGREGAR");
        BtnResAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResAgregarActionPerformed(evt);
            }
        });
        add(BtnResAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 150, 30));

        TxtResCantidad.setBackground(new java.awt.Color(17, 50, 77));
        TxtResCantidad.setForeground(new java.awt.Color(255, 255, 255));
        TxtResCantidad.setBorder(null);
        add(TxtResCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 170, 20));

        jLabel17.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("PRODUCTO");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 30));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CLIENTE");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, 30));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DNI");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, 30));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CATEGORIA");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, 30));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DETALLE VENTA");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, 30));

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("N. HABITACION");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, 30));

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TELEFONO");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, 30));

        TxtResTotalPago.setBackground(new java.awt.Color(17, 50, 77));
        TxtResTotalPago.setForeground(new java.awt.Color(255, 255, 255));
        TxtResTotalPago.setBorder(null);
        add(TxtResTotalPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 170, 20));
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 170, 10));
        add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 170, 10));
        add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 140, 10));
        add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 170, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 170, 10));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 170, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 170, 10));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 170, 10));

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("RESUMEN DE LA HABITACION");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 30));

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("CANTIDAD");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, 30));

        jLabel16.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("PRECIO");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, 30));

        jLabel15.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ESTADO");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 90, 20));

        BtnResBuscar.setBackground(new java.awt.Color(17, 50, 77));
        BtnResBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnResBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BuscarTalentoEV.png"))); // NOI18N
        BtnResBuscar.setText("BUSCAR");
        BtnResBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResBuscarActionPerformed(evt);
            }
        });
        add(BtnResBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 140, 30));

        TxtResCliente.setBackground(new java.awt.Color(17, 50, 77));
        TxtResCliente.setForeground(new java.awt.Color(255, 255, 255));
        TxtResCliente.setBorder(null);
        add(TxtResCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, 20));

        TxtResEliminar.setBackground(new java.awt.Color(17, 50, 77));
        TxtResEliminar.setForeground(new java.awt.Color(255, 255, 255));
        TxtResEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarEV.png"))); // NOI18N
        TxtResEliminar.setText("ELIMINAR");
        TxtResEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtResEliminarActionPerformed(evt);
            }
        });
        add(TxtResEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 150, 30));

        JcResEstadoVenta.setBackground(new java.awt.Color(17, 50, 77));
        JcResEstadoVenta.setEditable(true);
        JcResEstadoVenta.setForeground(new java.awt.Color(255, 255, 255));
        JcResEstadoVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente ", "Cancelado" }));
        add(JcResEstadoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 140, 20));
        add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 170, 10));

        jLabel18.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("TOTAL A PAGAR");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 380, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void JcResProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcResProductoActionPerformed
        // SE MORSTRARA LOS DATOS EN EL COMBO 

        String producto = (String) JcResProducto.getSelectedItem();

        // Consultar el precio del producto desde la BD
        try (Connection con = ConexionBD.conectar()) {
            String sql = "SELECT precio FROM Productos WHERE nombre = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, producto);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                TxtResPrecio.setText(String.valueOf(rs.getDouble("precio")));
            }
        } catch (Exception e) {
            System.out.println("Error al obtener precio: " + e.getMessage());
        }

    }//GEN-LAST:event_JcResProductoActionPerformed

    private void BtnResAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResAgregarActionPerformed

        try {
            String producto = (String) JcResProducto.getSelectedItem();
            String cantidadTexto = TxtResCantidad.getText().trim();
            String precioTexto = TxtResPrecio.getText().trim();
            // Validaciones de campos vacios a la hora de agregar los productos a la tabla
            if (producto == null || producto.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Selecciona un producto.");
                return;
            }
            if (cantidadTexto.isEmpty() || precioTexto.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Completa todos los campos.");
                return;
            }
            int cantidad = Integer.parseInt(cantidadTexto);
            double precio = Double.parseDouble(precioTexto);
            double subtotal = cantidad * precio;
            // Agregar a la tabla
            DefaultTableModel modelo = (DefaultTableModel) JtResMostrar.getModel();
            modelo.addRow(new Object[]{producto, cantidad, precio, subtotal});
            calcularTotal(); // Suma los subtotales y muestra en TxtResTotalPago
            // Limpiar cantidad después de agregar
            TxtResCantidad.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Cantidad o precio inválido.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar producto: " + e.getMessage());
        }
    }//GEN-LAST:event_BtnResAgregarActionPerformed

    private void BtnResBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResBuscarActionPerformed
        String dniCliente = TxtResDni.getText().trim();
        if (!dniCliente.isEmpty()) {
            cargarDatosPorDni(dniCliente); // usamos el nuevo método
        } else {
            JOptionPane.showMessageDialog(null, "Escribe el DNI del cliente.");
        }
    }//GEN-LAST:event_BtnResBuscarActionPerformed

    private void TxtResEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtResEliminarActionPerformed

        int filaSeleccionada = JtResMostrar.getSelectedRow();
        if (filaSeleccionada != -1) {
            int confirmacion = JOptionPane.showConfirmDialog(
             null,
             "¿Estás seguro de que deseas eliminar este producto?",
             "Confirmar eliminación",
             JOptionPane.YES_NO_OPTION
            );

            if (confirmacion == JOptionPane.YES_OPTION) {
                DefaultTableModel modelo = (DefaultTableModel) JtResMostrar.getModel();
                modelo.removeRow(filaSeleccionada);
                calcularTotal(); // recalcular total tras eliminar
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar.");
        }

    }//GEN-LAST:event_TxtResEliminarActionPerformed

    private void BtnFinalizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFinalizarVentaActionPerformed
        String dniCliente = TxtResDni.getText().trim();
        String totalStr = TxtResTotalPago.getText().trim();
        String estadoVenta = (String) JcResEstadoVenta.getSelectedItem();

        if (dniCliente.isEmpty() || totalStr.isEmpty() || JtResMostrar.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos y agregar al menos un producto.");
            return;
        }

        int idReserva = obtenerIdReservaPorDni(dniCliente); // usamos el metodo para obtener dato por dni
        if (idReserva == -1) {
            JOptionPane.showMessageDialog(null, "No se encontró una reserva activa para este cliente.");
            return;
        }

        try (Connection con = ConexionBD.conectar()) {
            con.setAutoCommit(false);

            String insertVenta = "INSERT INTO Ventas (id_reserva, estado, total) VALUES (?, ?, ?)";
            PreparedStatement ventaStmt = con.prepareStatement(insertVenta, new String[]{"id_venta"});

            ventaStmt.setInt(1, idReserva);
            ventaStmt.setString(2, estadoVenta);
            ventaStmt.setDouble(3, Double.parseDouble(totalStr));
            ventaStmt.executeUpdate();

            ResultSet rsVenta = ventaStmt.getGeneratedKeys();
            int idVenta = -1;
            if (rsVenta.next()) {
                idVenta = rsVenta.getInt(1);
            } else {
                throw new SQLException("No se pudo obtener el ID de la venta generada.");
            }

            String insertDetalle = "INSERT INTO Detalle_Venta (id_venta, id_producto, cantidad, precio_unitario) VALUES (?, ?, ?, ?)";
            PreparedStatement detalleStmt = con.prepareStatement(insertDetalle);

            for (int i = 0; i < JtResMostrar.getRowCount(); i++) {
                String nombreProducto = JtResMostrar.getValueAt(i, 0).toString();
                int cantidad = Integer.parseInt(JtResMostrar.getValueAt(i, 1).toString());
                double precioUnitario = Double.parseDouble(JtResMostrar.getValueAt(i, 2).toString());

                int idProducto = obtenerIdProductoPorNombre(nombreProducto);
                if (idProducto != -1) {
                    detalleStmt.setInt(1, idVenta);
                    detalleStmt.setInt(2, idProducto);
                    detalleStmt.setInt(3, cantidad);
                    detalleStmt.setDouble(4, precioUnitario);
                    detalleStmt.addBatch();
                }
            }

            detalleStmt.executeBatch();
            con.commit();
            JOptionPane.showMessageDialog(null, "Venta registrada correctamente.");

            limpiarDatos();
            ((DefaultTableModel) JtResMostrar.getModel()).setRowCount(0);
            TxtResTotalPago.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la venta: " + e.getMessage());
            e.printStackTrace();
        
    }

    }//GEN-LAST:event_BtnFinalizarVentaActionPerformed

    private int obtenerIdReservaPorDni(String dniCliente) {
        int idReserva = -1;
        String sql = "SELECT TOP 1 r.id_reserva FROM Reservas r "
         + "JOIN Clientes c ON r.id_cliente = c.id_cliente "
         + "WHERE c.dni_pasaporte = ? "
         + "ORDER BY r.id_reserva DESC";

        try (Connection con = ConexionBD.conectar(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, dniCliente);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                idReserva = rs.getInt("id_reserva");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener ID de reserva por DNI: " + e.getMessage());
        }
        return idReserva;
    }

    private int obtenerIdProductoPorNombre(String nombreProducto) {
        int idProducto = -1;
        String sql = "SELECT id_producto FROM Productos WHERE nombre = ?";
        try (Connection con = ConexionBD.conectar(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, nombreProducto);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                idProducto = rs.getInt("id_producto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener ID del producto: " + e.getMessage());
        }
        return idProducto;
    }

    /*METODO PARA CARGAR DATOS POR EL DNI */
    private void cargarDatosPorDni(String dniCliente) {
        try (Connection con = ConexionBaseDeDatos.ConexionBD.conectar()) {
            String sql = """
            SELECT TOP 1 c.nombre, c.telefono, c.dni_pasaporte, h.tipo, h.numero_habitacion
            FROM Reservas r
            JOIN Clientes c ON r.id_cliente = c.id_cliente
            JOIN Detalle_Reserva dr ON dr.id_reserva = r.id_reserva
            JOIN Habitaciones h ON dr.id_habitacion = h.id_habitacion
            WHERE c.dni_pasaporte = ?
            ORDER BY r.id_reserva DESC
        """;

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, dniCliente);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                TxtResCliente.setText(rs.getString("nombre"));
                TxtResTelefono.setText(rs.getString("telefono"));
                TxtResDni.setText(rs.getString("dni_pasaporte"));
                TxtResCategoria.setText(rs.getString("tipo"));
                TxtResNHabitacion.setText(rs.getString("numero_habitacion"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró información para ese DNI.");
                limpiarDatos();
                ((DefaultTableModel) JtResMostrar.getModel()).setRowCount(0);
                TxtResTotalPago.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar por DNI: " + e.getMessage());
        }
    }

    private void calcularTotal() {
        double total = 0.0;
        DefaultTableModel modelo = (DefaultTableModel) JtResMostrar.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {
            Object valor = modelo.getValueAt(i, 3); // columna subtotal
            if (valor != null) {
                try {
                    total += Double.parseDouble(valor.toString());
                } catch (NumberFormatException ex) {
                    // Ignora errores si hay un valor extraño
                }
            }
        }

        TxtResTotalPago.setText(String.valueOf(total));
    }

    // SE PROCEDE A PODER EDITAR LA TABLA 
    private void configurarTabla() {
        DefaultTableModel modelo = new DefaultTableModel(
         new Object[]{"Producto", "Cantidad", "Precio", "Subtotal"}, 0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 1 || column == 2;
            }
        };
        JtResMostrar.setModel(modelo);
    }

    // Cada vez que se edite una celda de "Cantidad" o "Precio", se recalcula automáticamente el subtotal (cantidad * precio) 
    // y se actualiza el total general en TxtResTotalPago.
    private void agregarListenerTabla() {
        JtResMostrar.getModel().addTableModelListener(e -> {
            if (e.getType() == TableModelEvent.UPDATE) {
                int row = e.getFirstRow();
                DefaultTableModel model = (DefaultTableModel) JtResMostrar.getModel();

                try {
                    int cantidad = Integer.parseInt(model.getValueAt(row, 1).toString());
                    double precio = Double.parseDouble(model.getValueAt(row, 2).toString());
                    double subtotal = cantidad * precio;
                    model.setValueAt(subtotal, row, 3);

                    calcularTotal(); // actualiza el total
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al actualizar subtotal: " + ex.getMessage());
                }
            }
        });
    }

    /*---------------------colocar en otro lado------------------------------------*/
    private void mostrarMensajeExito() {
        JOptionPane.showMessageDialog(null, "La venta fue registrada con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnFinalizarVenta;
    private javax.swing.JButton BtnResAgregar;
    private javax.swing.JButton BtnResBuscar;
    private javax.swing.JComboBox<String> JcResEstadoVenta;
    private javax.swing.JComboBox<String> JcResProducto;
    private javax.swing.JTable JtResMostrar;
    private javax.swing.JTextField TxtResCantidad;
    private javax.swing.JTextField TxtResCategoria;
    private javax.swing.JTextField TxtResCliente;
    private javax.swing.JTextField TxtResDni;
    private javax.swing.JButton TxtResEliminar;
    private javax.swing.JTextField TxtResNHabitacion;
    private javax.swing.JTextField TxtResPrecio;
    private javax.swing.JTextField TxtResTelefono;
    private javax.swing.JTextField TxtResTotalPago;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
