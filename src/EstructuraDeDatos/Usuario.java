package EstructuraDeDatos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Usuario {
    private String user;
    private String contraseña;
    private HashMap<String, String> usuarios = new HashMap<>();
    private List<Publicaciones> misPublicaciones = new ArrayList<>();

    public Usuario(){
        this.user = user;
        this.contraseña = contraseña;
        this.usuarios = new HashMap<>();
        this.misPublicaciones = new ArrayList<>();
    }

    public void agregarUsuario(String user, String contraseña){
        usuarios.put(user, contraseña);
    }

    public boolean verificarCredencial(String user, String contraseña){
        String contraseñaGuardada = usuarios.get(user);
        return contraseñaGuardada != null && contraseñaGuardada.equals(contraseña);
    }
}
