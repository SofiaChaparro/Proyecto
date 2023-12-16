package src.co.edu.uptc.controller;

import src.co.edu.uptc.model.BandDetail;
import src.co.edu.uptc.model.Banda;
import src.co.edu.uptc.model.Musician;

import java.util.ArrayList;
import java.util.Date;

public class BandaController {
    private ArrayList<Banda> bandas;
    private ArrayList<Musician> musicians;

    public BandaController() {
        this.bandas = new ArrayList<>();
        this.musicians = new ArrayList<>();
    }

    public void addBand(Banda banda) {
        this.bandas.add(banda);
    }

    public void removeBand(String name) {
        this.bandas.removeIf(banda -> banda.getName().equals(name));
    }

    public void addMusician(Musician musician) {
        this.musicians.add(musician);
    }

    public void removeMusician(String name) {
        this.musicians.removeIf(musician -> musician.getName().equals(name));
    }
    public Musician getMusician(String name) {
        for (Musician musician : this.musicians) {
            if (musician.getName().equals(name)) {
                return musician;
            }
        }
        return null; // devuelve null si no se encuentra el músico
    }

    // Método para editar una banda
    public void editarBandaName(String oldName, String newName) {
        for (Banda banda : this.bandas) {
            if (banda.getName().equals(oldName)) {
                banda.setName(newName);
                break;
            }
        }
    }

    // Método para editar la imagen de una banda
    public void editarBandaImage(String name, String newImage) {
        for (Banda banda : this.bandas) {
            if (banda.getName().equals(name)) {
                banda.setImage(newImage);
                break;
            }
        }
    }

    // Método para editar la descripción de una banda
    public void editarBandaDescription(String name, String newDescription) {
        for (Banda banda : this.bandas) {
            if (banda.getName().equals(name)) {
                banda.setDescription(newDescription);
                break;
            }
        }
    }

    // Método para editar la fecha de creación de una banda
    public void editarBandaFechaCreacion(String name, Date newFechaCreacion) {
        for (Banda banda : this.bandas) {
            if (banda.getName().equals(name)) {
                banda.setFechaCreacion(newFechaCreacion);
                break;
            }
        }
    }

    // Método para editar un músico
    public void editarMusician(String oldName, String newName, String newImage, String newDescription, Date newFechaNacimiento) {
        for (Musician musician : this.musicians) {
            if (musician.getName().equals(oldName)) {
                musician.setName(newName);
                musician.setImage(newImage);
                musician.setDescription(newDescription);
                musician.setFechaNacimiento(newFechaNacimiento);
                break;
            }
        }
    }

    // Método para mostrar las bandas
    public void mostrarBandas() {
        if (this.bandas.isEmpty()) {
            System.out.println("No hay bandas en la colección.");
        } else {
            System.out.println("Lista de bandas:");
            for (Banda banda : this.bandas) {
                System.out.println(banda);
            }
        }
    }

    // Método para mostrar los músicos
    public void mostrarMusicos() {
        if (this.musicians.isEmpty()) {
            System.out.println("No hay músicos en la colección.");
        } else {
            System.out.println("Lista de músicos:");
            for (Musician musician : this.musicians) {
                System.out.println(musician);
            }
        }
    }



    // Método para editar el nombre de un músico
    public void editarMusicianName(String oldName, String newName) {
        for (Musician musician : this.musicians) {
            if (musician.getName().equals(oldName)) {
                musician.setName(newName);
                break;
            }
        }
    }

    // Método para editar la imagen de un músico
    public void editarMusicianImage(String name, String newImage) {
        for (Musician musician : this.musicians) {
            if (musician.getName().equals(name)) {
                musician.setImage(newImage);
                break;
            }
        }
    }

    // Método para editar la descripción de un músico
    public void editarMusicianDescription(String name, String newDescription) {
        for (Musician musician : this.musicians) {
            if (musician.getName().equals(name)) {
                musician.setDescription(newDescription);
                break;
            }
        }
    }

    // Método para editar la fecha de nacimiento de un músico
    public void editarMusicianFechaNacimiento(String name, Date newFechaNacimiento) {
        for (Musician musician : this.musicians) {
            if (musician.getName().equals(name)) {
                musician.setFechaNacimiento(newFechaNacimiento);
                break;
            }
        }
    }  // Método para agregar un músico a una banda
    public void agregarMusicoBanda(String bandName, Musician musician) {
        for (Banda banda : this.bandas) {
            if (banda.getName().equals(bandName) && banda instanceof BandDetail) {
                ((BandDetail) banda).getMusicians().add(musician);
                break;
            }
        }
    }

    // Método para eliminar un músico de una banda
    public void eliminarMusicoBanda(String bandName, String musicianName) {
        for (Banda banda : this.bandas) {
            if (banda.getName().equals(bandName) && banda instanceof BandDetail) {
                ((BandDetail) banda).getMusicians().removeIf(musician -> musician.getName().equals(musicianName));
                break;
            }
        }
    }

    // Método para mostrar los músicos de una banda
    public ArrayList<Musician> obtenerMusicosBanda(String bandName) {
        for (Banda banda : this.bandas) {
            if (banda.getName().equals(bandName) && banda instanceof BandDetail) {
                return ((BandDetail) banda).getMusicians();
            }
        }
        return null; // devuelve null si no se encuentra la banda
    }

}
