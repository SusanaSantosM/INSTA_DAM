package EstructuraDeDatos;

import java.util.Date;

public class Publicacion {
    private String user;
    private String titulo;
    private String descripcion;
    private Date fechaPublicacion;

    //Constructores

    public Publicacion(String user, String titulo, String descripcion, Date fechaPublicacion) {
        this.user = user;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaPublicacion = fechaPublicacion;
    }
    //Getters
    public String getUser() {
        return user;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    //Setter
    public void setUser(String user) {
        this.user = user;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return "Publicacion" +
                "usuario '" + user + '\'' +
                ", titulo '" + titulo + '\'' +
                ", descripcion '" + descripcion + '\'' +
                ", fechaPublicacion " + fechaPublicacion;
    }
}
