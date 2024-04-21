package EstructuraDeDatos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Publicaciones {
    private ArrayList<Publicacion> publicaciones = new ArrayList<>();

    //Constructores
    public Publicaciones() {
        //Agregamos algunas publicaciones
        Publicacion mensaje1 = new Publicacion("Luisa24","Se acabó!!","No hay mas nutella", Calendar.getInstance().getTime());
        Publicacion mensaje2 = new Publicacion("Marco2", "Ya sé!", "Terrible! ¿Qué haremos sin más nutella?", Calendar.getInstance().getTime());
        Publicacion mensaje3 = new Publicacion("CrisAngel","QEPD Nutella","Es que en Mercadona era el único que vendia Nutella TwT", Calendar.getInstance().getTime());

        publicaciones.add(mensaje1);
        publicaciones.add(mensaje2);
        publicaciones.add(mensaje3);
    }

    public ArrayList<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public void agregarPublicación(Publicacion mensaje){
        publicaciones.add(mensaje);
    }
}
