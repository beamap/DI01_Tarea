package Datos;

import Logica.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class ControlDatos {

    public void guardar(Reserva reserva) {
        Connection conexion = ConexionBaseDeDatos.obtenerConexion();
        String sql = "INSERT INTO reservas (nombre, apellidos, telefono, fecha, asistentes, catering, evento, jornadas, habitaciones) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, reserva.getNombre());
            ps.setString(2, reserva.getApellidos());
            ps.setString(3, reserva.getTelefono());
            ps.setString(4, new SimpleDateFormat("yyyy-MM-dd").format(reserva.getFecha()));
            ps.setInt(5, reserva.getAsistentes());
            ps.setString(6, reserva.getCatering());
            ps.setString(7, reserva.getEvento());
            ps.setInt(8, reserva.getJornadas());
            ps.setString(9, reserva.getHabs());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConexionBaseDeDatos.cerrarConexion();
        }
    }
    
}