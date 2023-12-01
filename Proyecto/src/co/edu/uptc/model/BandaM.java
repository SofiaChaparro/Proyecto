package co.edu.uptc.model;

public class BandaM {
<<<<<<< HEAD
	
	public int performer;
=======
    private String name;
    private String genero;
    private String creationDate;
    private String birthDate;
    private String image;
    private String description;
    ArrayList<Banda> arrayBanda = new ArrayList<Banda>();
    public BandaV(String name, String genero, String creationDate, String birthDate, String image, String description) {
        this.name = name;
        this.genero = genero;
        this.creationDate = creationDate;
        this.birthDate = birthDate;
        this.image = image;
        this.description = description;
    }
    public String getName() {
        return name;
    }
>>>>>>> branch 'develop' of https://github.com/SofiaChaparro/Proyecto.git

    public void setName(String name) {
        this.name = name;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public toString(){
        return "Nombre: "+name+" Genero: "+genero+" Fecha de creacion: "+creationDate+" Fecha de nacimiento: "+birthDate+" Imagen: "+image+" Descripcion: "+description;
    }
}
