package src.co.edu.uptc.controller;

import src.co.edu.uptc.model.Album;
import src.co.edu.uptc.model.Cancion;
import src.co.edu.uptc.model.Coleccionista;
import src.co.edu.uptc.model.CollectorAlbum;

import java.util.ArrayList;


public class AlbumController {

    private Coleccionista coleccionista;

    public AlbumController(Coleccionista coleccionista) {
        this.coleccionista = coleccionista;
    }

    // Método para crear y agregar un nuevo álbum
    public void crearAlbum(String name, String cover, String description, String releaseDate, String genre, String recordLabel) {
        Album newAlbum = new Album(name, cover, description, releaseDate, genre, recordLabel);
        CollectorAlbum collectorAlbum = new CollectorAlbum(0, "Nuevo", newAlbum);
        coleccionista.addAlbum(collectorAlbum);
    }

    public boolean eliminarAlbum(String albumNameDelete) {
        CollectorAlbum albumParaEliminar = null;
        for (CollectorAlbum a : coleccionista.getAlbumes()) {
            if (a.getAlbum().getName().equalsIgnoreCase(albumNameDelete)) {
                albumParaEliminar = a;
                break;
            }
        }

        if (albumParaEliminar != null) {
            coleccionista.getAlbumes().remove(albumParaEliminar);
            return true;
        } else {
            return false;
        }
    }

    // Método para buscar un álbum por nombre
    // Método para buscar un álbum por nombre
    public Album buscarAlbumPorNombre(String nombreBusqueda) {
        System.out.println("Número total de álbumes: " + coleccionista.getAlbumes().size()); // Imprime el número total de álbumes
        for (CollectorAlbum collectorAlbum : coleccionista.getAlbumes()) {
            Album album = collectorAlbum.getAlbum();
            System.out.println("Nombre del álbum actual: " + album.getName()); // Imprime el nombre del álbum actual en la iteración
            if (album.getName().equalsIgnoreCase(nombreBusqueda)) {
                System.out.println("¡Álbum encontrado!"); // Imprime un mensaje si se encuentra el álbum
                return album;
            }
        }
        System.out.println("Álbum no encontrado."); // Imprime un mensaje si no se encuentra el álbum
        return null;
    }

    // Método para agregar una canción a un álbum

    public void editarNombreAlbum(String nombreActual, String nuevoNombre) {
        for (CollectorAlbum collectorAlbum : coleccionista.getAlbumes()) {
            if (collectorAlbum.getAlbum().getName().equalsIgnoreCase(nombreActual)) {
                collectorAlbum.getAlbum().setName(nuevoNombre);
            }
        }
    }

    public void editarPortadaAlbum(String nombreAlbum, String nuevaPortada) {
        for (CollectorAlbum collectorAlbum : coleccionista.getAlbumes()) {
            if (collectorAlbum.getAlbum().getName().equalsIgnoreCase(nombreAlbum)) {
                collectorAlbum.getAlbum().setCover(nuevaPortada);
            }
        }
    }

    public void editarDescripcionAlbum(String nombreAlbum, String nuevaDescripcion) {
        for (CollectorAlbum collectorAlbum : coleccionista.getAlbumes()) {
            if (collectorAlbum.getAlbum().getName().equalsIgnoreCase(nombreAlbum)) {
                collectorAlbum.getAlbum().setDescription(nuevaDescripcion);
            }
        }
    }

    public void editarFechaLanzamientoAlbum(String nombreAlbum, String nuevaFechaLanzamiento) {
        for (CollectorAlbum collectorAlbum : coleccionista.getAlbumes()) {
            if (collectorAlbum.getAlbum().getName().equalsIgnoreCase(nombreAlbum)) {
                collectorAlbum.getAlbum().setReleaseDate(nuevaFechaLanzamiento);
            }
        }
    }

    public void editarGeneroAlbum(String nombreAlbum, String nuevoGenero) {
        for (CollectorAlbum collectorAlbum : coleccionista.getAlbumes()) {
            if (collectorAlbum.getAlbum().getName().equalsIgnoreCase(nombreAlbum)) {
                collectorAlbum.getAlbum().setGenre(nuevoGenero);
            }
        }
    }

    public void editarDiscograficaAlbum(String nombreAlbum, String nuevaDiscografica) {
        for (CollectorAlbum collectorAlbum : coleccionista.getAlbumes()) {
            if (collectorAlbum.getAlbum().getName().equalsIgnoreCase(nombreAlbum)) {
                collectorAlbum.getAlbum().setRecordLabel(nuevaDiscografica);
            }
        }
    }


    public void mostrarAlbumes() {
        if (coleccionista.getAlbumes().isEmpty()) {
            System.out.println("No hay álbumes en la colección.");
        } else {
            System.out.println("Lista de álbumes:");
            for (CollectorAlbum collectorAlbum : coleccionista.getAlbumes()) {
                System.out.println(collectorAlbum.getAlbum());
            }
        }
    }

    // Método para agregar una canción a un álbum específico
    public boolean agregarCancionAAlbum(String nombreAlbum, String nombreCancion, String duracionCancion) {
        Album album = buscarAlbumPorNombre(nombreAlbum);
        if (album != null) {
            Cancion nuevaCancion = new Cancion(nombreCancion, duracionCancion);
            album.addCancion(nuevaCancion);
            return true;
        } else {
            return false;
        }
    }

    // Método para eliminar una canción de un álbum específico
    public boolean eliminarCancionDeAlbum(String nombreAlbum, String nombreCancionEliminar) {
        Album album = buscarAlbumPorNombre(nombreAlbum);
        if (album != null) {
            return album.eliminarCancionDelAlbum(nombreCancionEliminar);
        }
        return false;
    }

    // Método para mostrar todas las canciones de un álbum específico
    public void mostrarCancionesDeAlbum(String nombreAlbum) {
        Album album = buscarAlbumPorNombre(nombreAlbum);
        if (album != null) {
            album.mostrarCancionesDelAlbum();
        } else {
            System.out.println("Álbum no encontrado.");
        }
    }

    // Método para editar una canción de un álbum específico
    public boolean editarCancionDeAlbum(String nombreAlbum, String nombreActualCancion, String nuevoNombreCancion, String nuevaDuracionCancion) {
        Album album = buscarAlbumPorNombre(nombreAlbum);
        if (album != null) {
            return album.editarCancionDelAlbum(nombreActualCancion, nuevoNombreCancion, nuevaDuracionCancion);
        }
        return false;
    }

}











