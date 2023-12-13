package co.edu.uptc.model;

public class CollectorAlbum {
    private double precio;
    private String estado;

    public CollectorAlbum(double precio, String estado) {
        this.precio = precio;
        this.estado = estado;
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
