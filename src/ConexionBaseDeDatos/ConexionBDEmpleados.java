package ConexionBaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBDEmpleados {
    public static void main(String[] args) {
        Connection conexion = null;

        try {
            // Cargar el driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // URL de conexión a Azure SQL
            String url = "jdbc:sqlserver://empleadosutp.database.windows.net:1433;"
                       + "database=empleadosutpBD;"
                       + "user=nallelyadmin@empleadosutp;"
                       + "password=Nallely2025!;"
                       + "encrypt=true;"
                       + "trustServerCertificate=false;"
                       + "loginTimeout=30;";

            // Intentar conectar
            conexion = DriverManager.getConnection(url);
            System.out.println("Conexión exitosa a Azure SQL");

        } catch (ClassNotFoundException e) {
            System.out.println("No se encontró el driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        } finally {
            try {
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}