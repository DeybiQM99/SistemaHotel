package ConexionBaseDeDatos;

import java.sql.Connection;  // Importa la clase Connection para manejar la conexión a la BD
import java.sql.DriverManager;  // Importa DriverManager para obtener conexiones a la BD
import java.sql.SQLException;// Importa SQLException para manejar errores SQL


public class ConexionBD {

    // Nuevos datos para Azure SQL Server, pero respetando las variables anteriores
    private static final String URL = "jdbc:sqlserver://bdpa.database.windows.net:1433;"
                                    + "database=bd_hotel;"
                                    + "encrypt=true;"
                                    + "trustServerCertificate=false;"
                                    + "loginTimeout=30;";
    private static final String USER = "sqladmin";
    private static final String PASSWORD = "admin12@";

    // Método estático para establecer y retornar una conexión a la base de datos
    public static Connection conectar() {
        Connection con = null;
        try {
            // Registrar el driver de SQL Server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Establecer la conexión
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("¡Conexión exitosa a Azure SQL Server!");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el driver de SQL Server.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error en la conexión.");
            e.printStackTrace();
        }
        return con;
    }

    // Método principal para probar la conexión
    public static void main(String[] args) {
        Connection con = conectar();
        if (con != null) {
            System.out.println("¡Conexión a la base de datos exitosa!");
        } else {
            System.out.println("Falló la conexión.");
        }
    }
}


/*

public class ConexionBD {

    public static void main(String[] args) {
        String url = "jdbc:sqlserver://bdpa.database.windows.net;"
         + "database=bd_hotel;"
         + "user=sqladmin;"
         + "password=admin12@;"
         + "encrypt=true;"
         + "trustServerCertificate=false;"
         + "loginTimeout=30;";

        try (Connection conn = DriverManager.getConnection(url)) {
            System.out.println("Conexión exitosa a Azure SQL Server.");
        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
      

        }}}*/