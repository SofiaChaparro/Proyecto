package src.co.edu.uptc.model;

import java.util.ArrayList;

public class CollectorAlbum {
    private double precio;
    private String estado;
    private Album album;


    public CollectorAlbum(double precio, String estado, Album album) {
        this.precio = precio;
        this.estado = estado;
        this.album = album;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
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
