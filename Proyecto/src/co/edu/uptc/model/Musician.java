package co.edu.uptc.model;

import java.util.Date;

public class Musician extends Performer {
    private Date fechaNacimiento;

    public Musician(String name, String image, String description, Date fechaNacimiento) {
        super(name, image, description);
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
