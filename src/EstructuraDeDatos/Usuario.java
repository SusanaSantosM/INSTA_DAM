package EstructuraDeDatos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Usuario {
    private String user;
    private String contrasenia;
    private int seguidores;
    private ArrayList<String> usuarios = new ArrayList<>();
    private List<Publicaciones> misPublicaciones = new ArrayList<>();

    public Usuario(String user, String contrasenia){
        this.user = user;
        this.contrasenia = contrasenia;
        this.seguidores = 0;
    }

    //Getters
    public String getUser() {
        return user;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public ArrayList<String> getUsuarios() {
        return usuarios;
    }

    public List<Publicaciones> getMisPublicaciones() {
        return misPublicaciones;
    }

    //Setters
    public void setUser(String user) {
        this.user = user;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public void setUsuarios(ArrayList<String> usuarios) {
        this.usuarios = usuarios;
    }

    public void setMisPublicaciones(List<Publicaciones> misPublicaciones) {
        this.misPublicaciones = misPublicaciones;
    }

}
