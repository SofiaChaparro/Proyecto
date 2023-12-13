package co.edu.uptc.view;

import co.edu.uptc.model.Cancion;

import java.util.Scanner;

public class CancionView {
    Scanner sc = new Scanner(System.in);

    public void agregarCancionAAlbumVista() {
        System.out.println("Ingrese el nombre del álbum:");
        String nombreAlbum = sc.nextLine();
        System.out.println("Ingrese el nombre de la nueva canción:");
        String nombreCancion = sc.nextLine();
        System.out.println("Ingrese la duración de la nueva canción:");
        String duracionCancion = sc.nextLine();

        Cancion nuevaCancion = new Cancion(nombreCancion, duracionCancion);
        boolean resultado = albumController.agregarCancionAAlbum(nombreAlbum, nombreCancion, duracionCancion);
        if (resultado) {
            System.out.println("Canción agregada al álbum exitosamente.");
        } else {
            System.out.println("Álbum no encontrado.");
        }
    }

    public void eliminarCancionDeAlbumVista() {
        System.out.println("Ingrese el nombre del álbum:");
        String nombreAlbum = sc.nextLine();
        System.out.println("Ingrese el nombre de la canción a eliminar:");
        String nombreCancionEliminar = sc.nextLine();

        boolean resultado = albumController.eliminarCancionDeAlbum(nombreAlbum, nombreCancionEliminar);
        if (resultado) {
            System.out.println("Canción eliminada del álbum exitosamente.");
        } else {
            System.out.println("Canción o álbum no encontrado.");
        }
    }

    public void mostrarCancionesDeAlbumVista() {
        System.out.println("Ingrese el nombre del álbum:");
        String nombreAlbum = sc.nextLine();

        Album album = albumController.buscarAlbumPorNombre(nombreAlbum);
        if (album != null) {
            System.out.println("Canciones del álbum '" + nombreAlbum + "':");
            album.mostrarCancionesDelAlbum(); // Este método imprimirá la información de las canciones usando toString()
        } else {
            System.out.println("Álbum no encontrado.");
        }

    }

    public void editarCancionDeAlbumVista() {
        System.out.println("Ingrese el nombre del álbum:");
        String nombreAlbum = sc.nextLine();
        System.out.println("Ingrese el nombre actual de la canción:");
        String nombreActualCancion = sc.nextLine();
        System.out.println("Ingrese el nuevo nombre de la canción:");
        String nuevoNombreCancion = sc.nextLine();
        System.out.println("Ingrese la nueva duración de la canción:");
        String nuevaDuracionCancion = sc.nextLine();

        boolean resultado = albumController.editarCancionDeAlbum(nombreAlbum, nombreActualCancion, nuevoNombreCancion, nuevaDuracionCancion);
        if (resultado) {
            System.out.println("Canción editada en el álbum exitosamente.");
        } else {
            System.out.println("Canción o álbum no encontrado.");
        }
    }




}
