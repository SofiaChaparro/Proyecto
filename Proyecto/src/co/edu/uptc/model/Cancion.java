package src.co.edu.uptc.model;

import java.util.ArrayList;

public class Cancion {

    public static ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public static void setCanciones(ArrayList<Cancion> canciones) {
        Cancion.canciones = canciones;
    }

    private String name;
    private String duracion;

    static ArrayList<Cancion> canciones = new ArrayList<Cancion>();

    public Cancion(String name, String duracion) {
        this.name = name;
        this.duracion = duracion;
    }

    public String getName() {
        return name;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Canción: " + this.getName() + " - Duración: " + this.getDuracion();
    }
}
