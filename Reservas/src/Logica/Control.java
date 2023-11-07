package Logica;

import Datos.ControlDatos;
import java.util.Date;

public class Control {
    
    ControlDatos controldatos = new ControlDatos ();

    public void guardar(String nombre, String apellido, String telefono, String catering, String evento, int jornadas, int assis, Date fecha, String hab) {
                Reserva reserva = new Reserva();
                reserva.setNombre(nombre);
                reserva.setApellidos(apellido);
                reserva.setTelefono(telefono);
                reserva.setCatering(catering);
                reserva.setJornadas(jornadas);
                reserva.setAsistentes(assis);
                reserva.setFecha(fecha);
                reserva.setHabs(hab);
                reserva.setEvento(evento);

        controldatos.guardar(reserva);
    } 

}
