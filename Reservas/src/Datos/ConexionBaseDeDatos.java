package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDeDatos {
    private static final String URL = "jdbc:mysql://localhost:3306/bdreservas";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static Connection conexion = null;
    
    // Este método intenta obtener la conexión si ya está abierta o crear una nueva.
    public static Connection obtenerConexion() {
        if (conexion == null) {
            try {
                conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace(); 
            }
        }
        return conexion;
    }
    //Metodo para cerrar la conexión si está abierta
    public static void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    // Método para probar si la conexión la conexión funciona.
    public static boolean probarConexion() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            return conn != null;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

