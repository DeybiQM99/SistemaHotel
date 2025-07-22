package GestionReservas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.math.BigDecimal;
import java.time.LocalDate;

public class PagoDAO {

    private Connection conn;

    public PagoDAO(Connection conn) {
        this.conn = conn;
    }

    // Método principal que registra el pago
    public boolean registrarPago(Pago pago) {
        String sql = "INSERT INTO Pagos (id_reserva, fecha_pago, monto, id_metodo, id_estado_pago) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            int idMetodo = obtenerIdMetodoPago(pago.getMetodoPago());
            if (idMetodo == -1) {
                System.out.println("Método de pago no válido: " + pago.getMetodoPago());
                return false;
            }

            ps.setInt(1, pago.getIdReserva());
            ps.setDate(2, java.sql.Date.valueOf(pago.getFechaPago()));
            ps.setBigDecimal(3, pago.getMonto());
            ps.setInt(4, idMetodo);
            ps.setInt(5, 1); // Ejemplo: 1 = "Pagado", cambia según tu lógica

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("Error al registrar el pago:");
            ex.printStackTrace();
            return false;
        }
    }

    // Obtener el último pago registrado
    public Pago obtenerUltimoPago() {
        String sql = "SELECT TOP 1 * FROM Pagos ORDER BY id_pago DESC";
        try (PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                int idPago = rs.getInt("id_pago");
                int idReserva = rs.getInt("id_reserva");
                BigDecimal monto = rs.getBigDecimal("monto");
                String metodo = rs.getString("metodo_pago");
                LocalDate fecha = rs.getDate("fecha_pago").toLocalDate();

                Pago pago = new Pago(idReserva, monto, metodo);
                pago.setIdPago(idPago);
                pago.setFechaPago(fecha);
                return pago;
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener el último pago:");
            ex.printStackTrace();
        }
        return null;
    }

    // Obtener todos los pagos asociados a una reserva
    public Pago obtenerPagoPorReserva(int idReserva) {
        String sql = "SELECT p.id_pago, p.monto, p.fecha_pago, m.descripcion AS metodo_pago "
                + "FROM Pagos p "
                + "JOIN Metodos_Pago m ON p.id_metodo = m.id_metodo "
                + "WHERE p.id_reserva = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idReserva);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int idPago = rs.getInt("id_pago");
                    BigDecimal monto = rs.getBigDecimal("monto");
                    String metodo = rs.getString("metodo_pago");
                    LocalDate fecha = rs.getDate("fecha_pago").toLocalDate();

                    Pago pago = new Pago(idReserva, monto, metodo);
                    pago.setIdPago(idPago);
                    pago.setFechaPago(fecha);

                    return pago;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener el pago por reserva:");
            ex.printStackTrace();
        }
        return null;
    }

    public int obtenerIdMetodoPago(String metodoPago) {
        String sql = "SELECT id_metodo FROM Metodos_Pago WHERE descripcion = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, metodoPago);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("id_metodo");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener id del método de pago:");
            ex.printStackTrace();
        }
        return -1; // Devuelve -1 si no se encuentra
    }
}
