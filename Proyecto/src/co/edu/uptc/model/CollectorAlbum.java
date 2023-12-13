package co.edu.uptc.model;

import java.util.ArrayList;

public class CollectorAlbum {
    private double precio;
    private String estado;
    private ArrayList<Album> albumes;

    public CollectorAlbum(double precio, String estado) {
        this.precio = precio;
        this.estado = estado;
        this.albumes = new ArrayList<>();
    }



    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }
    public void addAlbum(Album album){
        this.albumes.add(album);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
