package GestionReservas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReservaDAO {
     private final Connection conn;

    public ReservaDAO(Connection conn) {
        this.conn = conn;
    }

    public boolean liberarHabitacion(int idReserva) {
        String sqlObtener = "SELECT id_habitacion FROM Detalle_Reserva WHERE id_reserva = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sqlObtener)) {
            stmt.setInt(1, idReserva);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int idHabitacion = rs.getInt("id_habitacion");

                String sqlLiberar = "UPDATE Habitaciones SET estado = 'Disponible' WHERE id_habitacion = ?";
                try (PreparedStatement stmtUpdate = conn.prepareStatement(sqlLiberar)) {
                    stmtUpdate.setInt(1, idHabitacion);
                    stmtUpdate.executeUpdate(); // no necesitas return dentro de loop
                }
            }
            return true; // si todo sale bien
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}