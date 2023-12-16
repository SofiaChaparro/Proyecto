package src.co.edu.uptc.view;

import src.co.edu.uptc.controller.AlbumController;
import src.co.edu.uptc.model.Album;
import src.co.edu.uptc.model.Coleccionista;

import java.util.Scanner;

public class CancionView {
    Scanner sc = new Scanner(System.in);
    Coleccionista coleccionista;
    AlbumController albumController;

    public CancionView(Coleccionista coleccionista) {
        this.coleccionista = coleccionista;
        this.albumController = new AlbumController(coleccionista);
    }

    public void showMenu() {
        int opcionCancion;
        do {
            System.out.println("Gestión de canciones");
            System.out.println("----------------------------------");
            System.out.println("1. Agregar canción");
            System.out.println("2. Eliminar canción");
            System.out.println("3. Editar canción");
            System.out.println("4. Mostrar canciones");
            System.out.println("5. Volver al menú anterior");
            System.out.println("----------------------------------");
            System.out.println("Elige una opción: ");
            System.out.println("----------------------------------");
            opcionCancion = sc.nextInt();
            sc.nextLine();

            switch (opcionCancion) {
                case 1:
                    agregarCancionAAlbumVista();
                    break;
                case 2:
                    eliminarCancionDeAlbumVista();
                    break;
                case 3:
                    editarCancionDeAlbumVista();
                    break;
                case 4:
                    mostrarCancionesDeAlbumVista();
                    break;
                case 5:
                    System.out.println("Volviendo al menú anterior...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
        } while (opcionCancion != 5);
    }

    public void agregarCancionAAlbumVista() {
        System.out.println("Ingrese el nombre del álbum:");
        String nombreAlbum = sc.nextLine();
        System.out.println("Ingrese el nombre de la nueva canción:");
        String nombreCancion = sc.nextLine();
        System.out.println("Ingrese la duración de la nueva canción:");
        String duracionCancion = sc.nextLine();

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
