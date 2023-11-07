package Logica;

import java.util.Date;

public class Reserva {
    private int id_reserva;
    private String nombre;
    private String apellidos;
    private String telefono;
    private Date fecha;
    private int asistentes;
    private String catering;
    private String evento;
    private int jornadas;
    private String habs;
    public Reserva() {
    }
    public Reserva(int idReserva, String nombre, String apellidos, String telefono, Date fecha, int asistentes, String catering, String evento, int jornadas, String habitaciones) {
        this.id_reserva = idReserva;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.fecha = fecha;
        this.asistentes = asistentes;
        this.catering = catering;
        this.evento = evento;
        this.jornadas = jornadas;
        this.habs = habitaciones;
    }
//metodos
    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }

    public String getCatering() {
        return catering;
    }

    public void setCatering(String catering) {
        this.catering = catering;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public int getJornadas() {
        return jornadas;
    }

    public void setJornadas(int jornadas) {
        this.jornadas = jornadas;
    }

    public String getHabs() {
        return habs;
    }

    public void setHabs(String habs) {
        this.habs = habs;
    }
   
    
}
