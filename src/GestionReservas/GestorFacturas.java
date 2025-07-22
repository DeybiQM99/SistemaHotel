
package GestionReservas;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestorFacturas {
    private Connection conn;

    public GestorFacturas(Connection conn) {
        this.conn = conn;
    }

    public double calcularSubtotal(int idReserva) throws SQLException {
        double subtotal = 0;

        // 1. Total habitaciones
        String sql1 = "SELECT SUM(precio * nro_noches) FROM Detalle_Reserva WHERE id_reserva = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql1)) {
            ps.setInt(1, idReserva);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) subtotal += rs.getDouble(1);
        }

        // 2. Total servicios adicionales
        String sql2 = """
            SELECT SUM(s.precio * rs.cantidad)
            FROM Reserva_Servicios rs
            JOIN Servicios_Adicionales s ON rs.id_servicio = s.id_servicio
            WHERE rs.id_reserva = ?
            """;
        try (PreparedStatement ps = conn.prepareStatement(sql2)) {
            ps.setInt(1, idReserva);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) subtotal += rs.getDouble(1);
        }

        // 3. Total productos
        String sql3 = """
            SELECT SUM(p.precio * rp.cantidad)
            FROM Reserva_Productos rp
            JOIN Productos p ON rp.id_producto = p.id_producto
            WHERE rp.id_reserva = ?
            """;
        try (PreparedStatement ps = conn.prepareStatement(sql3)) {
            ps.setInt(1, idReserva);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) subtotal += rs.getDouble(1);
        }

        return subtotal;
    }

    public double calcularIGV(double subtotal) {
        return subtotal * 0.18;
    }

    public double calcularTotal(double subtotal, double igv) {
        return subtotal + igv;
    }
}

