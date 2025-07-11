package ConexionBaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBDEmpleados {
    private static final String URL = "jdbc:mysql://localhost:3306/bd_empleados";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "";

    public static Connection conectar() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("Conexion exitosa.");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conexion;
    }

    // Pueba para comprobar la coneccion
     public static void main(String[] args) {
        Connection con = conectar(); // Llama al método para conectar
        if (con != null) {
            // Si la conexión no es nula, imprime éxito
            System.out.println("Conexion exitosa");
        } else {
            // Si hay fallos
            System.out.println("Fallo la conexión.");
        }
    }
}
