package VistaHotel;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import ConexionBaseDeDatos.ConexionBD;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import GestionReservas.Productos;

public class Producto extends javax.swing.JPanel {

    public Producto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtCategoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtPrecio = new javax.swing.JTextField();
        TxtCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtMostrar = new javax.swing.JTable();
        BtnNuevo = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        TxtBuscar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

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

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMBRE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 60, 20));
        add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 140, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CATEGORIA");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 70, 20));
        add(TxtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 140, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRECIO");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 50, 20));
        add(TxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 150, -1));
        add(TxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 140, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CANTIDAD");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 70, 20));

        JtMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Categoria", "Cantidad", "Precio"
            }
        ));
        JtMostrar.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(JtMostrar);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 730, 200));

        BtnNuevo.setBackground(new java.awt.Color(33, 44, 116));
        BtnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        BtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        BtnNuevo.setText("NUEVO");
        BtnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnNuevoMouseClicked(evt);
            }
        });
        add(BtnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 120, 30));

        BtnCancelar.setBackground(new java.awt.Color(33, 44, 116));
        BtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        BtnCancelar.setText("CANCELAR");
        BtnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCancelarMouseClicked(evt);
            }
        });
        add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 120, 30));

        BtnGuardar.setBackground(new java.awt.Color(33, 44, 116));
        BtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        BtnGuardar.setText("GUARDAR");
        BtnGuardar.setMaximumSize(null);
        BtnGuardar.setMinimumSize(null);
        BtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGuardarMouseClicked(evt);
            }
        });
        add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 120, 30));
        add(TxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 230, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 750, 20));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("BUSCAR");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 70, 20));

        BtnBuscar.setBackground(new java.awt.Color(33, 44, 116));
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BuscarTalentoEV.png"))); // NOI18N
        BtnBuscar.setText("BUSCAR");
        BtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnBuscarMouseClicked(evt);
            }
        });
        add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 120, -1));

        BtnEliminar.setBackground(new java.awt.Color(33, 44, 116));
        BtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarEV.png"))); // NOI18N
        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.setMaximumSize(new java.awt.Dimension(108, 37));
        BtnEliminar.setMinimumSize(new java.awt.Dimension(108, 37));
        BtnEliminar.setPreferredSize(new java.awt.Dimension(108, 37));
        BtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseClicked(evt);
            }
        });
        add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 120, -1));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PRODUCTO");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseClicked

        int filaSeleccionada = JtMostrar.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona un producto de la tabla para eliminar.");
            return;
        }

        String nombreProducto = JtMostrar.getValueAt(filaSeleccionada, 0).toString();

        int confirmacion = JOptionPane.showConfirmDialog(null,
         "¿Estás seguro de eliminar el producto: " + nombreProducto + "?", "Confirmar eliminación",
         JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM Productos WHERE nombre = ?";
            try (Connection conn = ConexionBD.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, nombreProducto);
                int filasEliminadas = ps.executeUpdate();
                if (filasEliminadas > 0) {
                    JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
                    mostrarProductos(); // recarga la tabla
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el producto en la base de datos.");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al eliminar producto: " + e.getMessage());
            }
        }

    }//GEN-LAST:event_BtnEliminarMouseClicked

    private void BtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseClicked

        String nombre = TxtNombre.getText();
        String categoria = TxtCategoria.getText();
        String cantidadStr = TxtCantidad.getText();
        String precioStr = TxtPrecio.getText();
        int cantidad;
        double precio;
        try {
            cantidad = Integer.parseInt(cantidadStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Cantidad inválida. Debe ser un número entero.");
            return;
        }
        try {
            precio = Double.parseDouble(precioStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Precio inválido. Debe ser un número decimal.");
            return;
        }
        if (nombre.isEmpty() || categoria.isEmpty() || cantidadStr.isEmpty() || precioStr.isEmpty()) {
            TxtNombre.requestFocus();
            JOptionPane.showMessageDialog(null, "Completa todos los campos obligatorios.");
            return;
        }
        //  Crear objeto Productos
        Productos producto = new Productos(nombre, categoria, cantidad, precio);

        // Insertar en la base de datos
        try (Connection conn = ConexionBD.conectar()) {
            if (conn != null) {
                String sql = "INSERT INTO Productos (nombre, categoria, cantidad, precio) VALUES (?, ?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, producto.getNombre());
                ps.setString(2, producto.getCategoria());
                ps.setInt(3, producto.getCantidad());
                ps.setDouble(4, producto.getPrecio());

                int filasInsertadas = ps.executeUpdate();

                if (filasInsertadas > 0) {
                    JOptionPane.showMessageDialog(null, "Producto registrado correctamente.");
                    limpiarCampos(); // opcional
                    mostrarProductos(); // recargar tabla
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo registrar el producto.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error de conexión con la base de datos.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar producto: " + e.getMessage());
        }
    }//GEN-LAST:event_BtnGuardarMouseClicked

    private void BtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMouseClicked

        String textoBuscar = TxtBuscar.getText();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre", "Categoria", "Cantidad", "Precio"});
        String sql = "SELECT nombre, categoria, cantidad, precio FROM Productos WHERE nombre LIKE ?";
        try (Connection conn = ConexionBD.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "%" + textoBuscar + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString("nombre"),
                    rs.getString("categoria"),
                    rs.getInt("cantidad"),
                    rs.getDouble("precio"),});
            }
            JtMostrar.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar producto: " + e.getMessage());
        }
    }//GEN-LAST:event_BtnBuscarMouseClicked

    private void BtnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNuevoMouseClicked
        limpiarCampos();
    }//GEN-LAST:event_BtnNuevoMouseClicked

    private void BtnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCancelarMouseClicked


    }//GEN-LAST:event_BtnCancelarMouseClicked

    private void limpiarCampos() {
        TxtNombre.setText("");
        TxtCategoria.setText("");
        TxtCantidad.setText("");
        TxtPrecio.setText("");
    }

    private void mostrarProductos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre", "Categoria", "Cantidad", "Precio"});
        String sql = "SELECT nombre, categoria, cantidad, precio FROM Productos";
        try (Connection conn = ConexionBD.conectar(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString("nombre"),
                    rs.getString("categoria"),
                    rs.getInt("cantidad"),
                    rs.getDouble("precio"),});
            }
            JtMostrar.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar productos: " + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JTable JtMostrar;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtCantidad;
    private javax.swing.JTextField TxtCategoria;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
