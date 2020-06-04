package subsistema_juego;

import java.util.Date;

public class Juego {
    private String nombre;
    private String descripcion;
    private Date fechaAgregado;

    public Juego(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaAgregado = new Date();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFechaAgregado() {
        return fechaAgregado;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaAgregado=" + fechaAgregado +
                '}';
    }
}
