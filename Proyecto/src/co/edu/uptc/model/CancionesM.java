package co.edu.uptc.model;

public class CancionesM {

    private String name;
    private String description;
    private String duration;

    ArrayList<Canciones> arrayCanciones = new ArrayList<Canciones>();


    public CancionesM(String name, String description, String duration) {
        this.name = name;
        this.description = description;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public toString(){
        return "Nombre: "+name+" Descripcion: "+description+" Duracion: "+duration;
    }
}
