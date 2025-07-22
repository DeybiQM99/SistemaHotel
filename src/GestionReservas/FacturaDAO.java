package GestionReservas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.math.BigDecimal;
import java.time.LocalDate;

public class FacturaDAO {

    private Connection conn;

    // Constructor que recibe la conexión
    public FacturaDAO(Connection conn) {
        this.conn = conn;
    }

    // Registrar una nueva factura
    public boolean registrarFactura(Factura factura) {
        String sql = "INSERT INTO Facturas (id_reserva, subtotal, igv, fecha_emision) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, factura.getIdReserva());
            ps.setBigDecimal(2, factura.getSubtotal());
            ps.setBigDecimal(3, factura.getIgv());
            ps.setDate(4, Date.valueOf(factura.getFechaEmision())); // LocalDate -> java.sql.Date
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("Error al registrar la factura:");
            ex.printStackTrace();
            return false;
        }
    }

    // Obtener la última factura registrada
    public Factura obtenerUltimaFactura() {
        String sql = "SELECT TOP 1 * FROM Facturas ORDER BY id_factura DESC";
        try (PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                int idFactura = rs.getInt("id_factura");
                int idReserva = rs.getInt("id_reserva");
                BigDecimal subtotal = rs.getBigDecimal("subtotal");
                BigDecimal igv = rs.getBigDecimal("igv");
                BigDecimal total = rs.getBigDecimal("monto_total");
                LocalDate fecha = rs.getDate("fecha_emision").toLocalDate();

                Factura factura = new Factura(idReserva, subtotal, igv, total);
                factura.setIdFactura(idFactura);
                factura.setFechaEmision(fecha);
                return factura;
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener la última factura:");
            ex.printStackTrace();
        }
        return null;
    }

    // Obtener una factura por ID de reserva
    public Factura obtenerFacturaPorReserva(int idReserva) {
        String sql = "SELECT * FROM Facturas WHERE id_reserva = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idReserva);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int idFactura = rs.getInt("id_factura");
                    BigDecimal subtotal = rs.getBigDecimal("subtotal");
                    BigDecimal igv = rs.getBigDecimal("igv");
                    BigDecimal total = rs.getBigDecimal("monto_total");
                    LocalDate fecha = rs.getDate("fecha_emision").toLocalDate();

                    Factura factura = new Factura(idReserva, subtotal, igv, total);
                    factura.setIdFactura(idFactura);
                    factura.setFechaEmision(fecha);
                    return factura;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener factura por ID de reserva:");
            ex.printStackTrace();
        }
        return null;
    }
    //////////////////////////////////////////
    public void actualizarTotalesFactura(int idFactura) {
    String sql = """
        UPDATE Facturas
        SET subtotal = (
            SELECT 
                ISNULL(SUM(dr.precio * dr.nro_noches), 0) +
                ISNULL(SUM(dfs.cantidad * dfs.precio_unitario), 0) +
                ISNULL(SUM(dfp.subtotal), 0)
            FROM Reservas r
            INNER JOIN Facturas f ON r.id_reserva = f.id_reserva
            LEFT JOIN Detalle_Reserva dr ON dr.id_reserva = r.id_reserva
            LEFT JOIN Detalle_Factura_Servicio dfs ON dfs.id_factura = f.id_factura
            LEFT JOIN Detalle_Factura_Producto dfp ON dfp.id_factura = f.id_factura
            WHERE f.id_factura = ?
        ),
        igv = (
            SELECT ROUND(0.18 * (
                ISNULL(SUM(dr.precio * dr.nro_noches), 0) +
                ISNULL(SUM(dfs.cantidad * dfs.precio_unitario), 0) +
                ISNULL(SUM(dfp.subtotal), 0)
            ), 2)
            FROM Reservas r
            INNER JOIN Facturas f ON r.id_reserva = f.id_reserva
            LEFT JOIN Detalle_Reserva dr ON dr.id_reserva = r.id_reserva
            LEFT JOIN Detalle_Factura_Servicio dfs ON dfs.id_factura = f.id_factura
            LEFT JOIN Detalle_Factura_Producto dfp ON dfp.id_factura = f.id_factura
            WHERE f.id_factura = ?
        )
        WHERE id_factura = ?;
        """;

    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, idFactura);
        ps.setInt(2, idFactura);
        ps.setInt(3, idFactura);
        int filas = ps.executeUpdate();
        if (filas > 0) {
            System.out.println("Subtotal e IGV actualizados para la factura ID " + idFactura);
        } else {
            System.out.println(" No se encontró factura con ID " + idFactura);
        }
    } catch (SQLException e) {
        System.out.println(" Error al actualizar la factura:");
        e.printStackTrace();
    }
}
}
