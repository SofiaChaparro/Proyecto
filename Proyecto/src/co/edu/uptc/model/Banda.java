package src.co.edu.uptc.model;

import java.util.Date;

public class Banda extends Performer{
    private Date fechaCreacion;

    public Banda(String name, String image, String description, Date fechaCreacion) {
        super(name, image, description);
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}
