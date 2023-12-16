package src.co.edu.uptc.view;

import src.co.edu.uptc.controller.AlbumController;
import src.co.edu.uptc.model.Album;
import src.co.edu.uptc.model.Coleccionista;
import src.co.edu.uptc.model.CollectorAlbum;

import java.util.Scanner;

public class AlbumView {
    Scanner sc = new Scanner(System.in);

    Coleccionista coleccionista = new Coleccionista("nombre", "telefono", "email", "clave");
    AlbumController albumController = new AlbumController(coleccionista);


    public void DatosAlbum() {


        System.out.println("Digite nombre:");
        String name = sc.nextLine();

        System.out.println("Digite la portada:");
        String cover = sc.nextLine();

        System.out.println("Digite descripcion:");
        String description = sc.nextLine();

        System.out.println("Digite fecha de lanzamiento:");
        String releaseDate = sc.nextLine();

        System.out.println("Digite genero:");
        String genre = sc.nextLine();

        System.out.println("Digite la etiqueta de registro:");
        String recordLabel = sc.nextLine();

        // Invoca el método correcto con los datos recopilados
        albumController.crearAlbum(name, cover, description, releaseDate, genre, recordLabel);


    }

    public void eliminarAlbum() {

        System.out.println("Ingrese el nombre del álbum a eliminar:");
        String albumNameDelete = sc.nextLine();
        boolean resultado = albumController.eliminarAlbum(albumNameDelete);
        if (resultado) {
            System.out.println("Álbum eliminado exitosamente.");
        } else {
            System.out.println("Álbum no encontrado.");
        }

    }

    public void editarAlbumVista() {
        System.out.println("Ingrese el nombre del álbum que desea editar:");
        String albumNameEdit = sc.nextLine();
        Album albumParaEditar = albumController.buscarAlbumPorNombre(albumNameEdit);

        if (albumParaEditar != null) {
            System.out.println("¿Qué atributo desea editar?");
            System.out.println("1. Nombre del álbum");
            System.out.println("2. Portada del álbum");
            System.out.println("3. Descripción del álbum");
            System.out.println("4. Fecha de lanzamiento");
            System.out.println("5. Género del álbum");
            System.out.println("6. Discográfica");
            int editOption = sc.nextInt();
            sc.nextLine();

            switch (editOption) {
                case 1:
                    System.out.println("Ingrese el nuevo nombre del álbum:");
                    String newName = sc.nextLine();
                    albumController.editarNombreAlbum(albumParaEditar.getName(), newName);
                    System.out.println("Nombre del álbum actualizado exitosamente.");
                    break;
                case 2:
                    System.out.println("Ingrese la nueva portada del álbum:");
                    String newCover = sc.nextLine();
                    albumController.editarPortadaAlbum(albumParaEditar.getName(), newCover);
                    System.out.println("Portada del álbum actualizada exitosamente.");
                    break;
                case 3:
                    System.out.println("Ingrese la nueva descripción del álbum:");
                    String newDescription = sc.nextLine();
                    albumController.editarDescripcionAlbum(albumParaEditar.getName(), newDescription);
                    System.out.println("Descripción del álbum actualizada exitosamente.");
                    break;
                case 4:
                    System.out.println("Ingrese la nueva fecha de lanzamiento:");
                    String newReleaseDate = sc.nextLine();
                    albumController.editarFechaLanzamientoAlbum(albumParaEditar.getName(), newReleaseDate);
                    System.out.println("Fecha de lanzamiento actualizada exitosamente.");
                    break;
                case 5:
                    System.out.println("Ingrese el nuevo género del álbum:");
                    String newGenre = sc.nextLine();
                    albumController.editarGeneroAlbum(albumParaEditar.getName(), newGenre);
                    System.out.println("Género del álbum actualizado exitosamente.");
                    break;
                case 6:
                    System.out.println("Ingrese la nueva discográfica:");
                    String newRecordLabel = sc.nextLine();
                    albumController.editarDiscograficaAlbum(albumParaEditar.getName(), newRecordLabel);
                    System.out.println("Discográfica actualizada exitosamente.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } else {
            System.out.println("Álbum no encontrado.");
        }
    }
    public void mostrarAlbumes(Coleccionista coleccionista) {
        if (coleccionista.getAlbumes().isEmpty()) {
            System.out.println("No hay álbumes en la colección.");
        } else {
            System.out.println("Lista de álbumes:");
            for (CollectorAlbum collectorAlbum : coleccionista.getAlbumes()) {
                System.out.println(collectorAlbum.getAlbum().getName());
            }
        }
    }
}
//	public static void main(String[] args) {
//
//		Main albumView = new Main();
//		System.out.println("Bienvenido a la aplicación de álbumes.");
//		System.out.println("¿Qué desea hacer?");
//		int opcion = 0;
//		do {
//			System.out.println("1. Crear álbum");
//			System.out.println("2. Eliminar álbum");
//			System.out.println("3. Editar álbum");
//			System.out.println("4. Mostrar álbumes");
//			opcion = albumView.sc.nextInt();
//			albumView.sc.nextLine();
//
//			switch (opcion) {
//				case 1:
//					albumView.DatosAlbum();
//					break;
//				case 2:
//					albumView.eliminarAlbum();
//					break;
//				case 3:
//					albumView.editarAlbumVista();
//					break;
//				case 4:
//					albumView.mostrarAlbumesVista();
//					break;
//				case 5:
//					System.out.println("Gracias por usar la aplicación.");
//					break;
//				default:
//					System.out.println("Opción inválida.");
//					break;
//			}
//		}while (opcion != 5);
//
//
//
//
//	}
