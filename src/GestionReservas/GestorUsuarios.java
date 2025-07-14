package GestionReservas;

import ConexionBaseDeDatos.ConexionBD;
import java.sql.*;

public class GestorUsuarios {
// Método para validar si el usuario existe y su contraseña es correcta

    public boolean validarUsuario(String usuario, String contrasena) {
        // Obtiene la conexión usando el método conectar() de tu clase ConexionBD
        try (Connection connection = ConexionBD.conectar()) {
            String query = "SELECT * FROM usuarios WHERE NombreUsuario = ? AND contrasena = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, usuario);
            stmt.setString(2, contrasena);

            ResultSet rs = stmt.executeQuery();
            boolean existe = rs.next();

            rs.close();
            stmt.close();

            return existe;
        } catch (SQLException e) {
            System.out.println("Error al validar usuario: " + e.getMessage());
            return false;
        }
    }

    // Método para actualizar la contraseña del usuario
    public boolean actualizarContraseña(String usuario, String actual, String nueva) {
        try (Connection connection = ConexionBD.conectar()) {
            String query = "UPDATE usuarios SET contrasena = ? WHERE NombreUsuario = ? AND contrasena = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, nueva);
            stmt.setString(2, usuario);
            stmt.setString(3, actual);

            int filas = stmt.executeUpdate();

            stmt.close();
            return filas > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar contraseña: " + e.getMessage());
            return false;
        }
    }

}
