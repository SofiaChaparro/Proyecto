package co.edu.uptc.model;

public class Cancion {
    private String name;
    private String duration;

    public Cancion(String name, String duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

   public String toString() {
        return "Cancion{" + "name=" + name + ", duration=" + duration + '}';
    }


}
