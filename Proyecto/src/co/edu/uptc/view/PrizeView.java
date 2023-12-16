package src.co.edu.uptc.view;

import src.co.edu.uptc.controller.PrizeController;
import src.co.edu.uptc.model.Coleccionista;
import src.co.edu.uptc.model.PerformerDetail;
import src.co.edu.uptc.model.PerformerPrize;

import java.util.ArrayList;
import java.util.Scanner;

public class PrizeView {
    Scanner sc = new Scanner(System.in);
    PrizeController prizeController;
    Coleccionista coleccionista;
    ArrayList<PerformerDetail> listaInterpretes; // Asegúrate de inicializar esto

    public PrizeView(Coleccionista coleccionista, ArrayList<PerformerDetail> listaInterpretes) {
        this.coleccionista = coleccionista;
        this.listaInterpretes = listaInterpretes;
        this.prizeController = new PrizeController(coleccionista, listaInterpretes);
    }

    public void showMenu() {
        int opcion;
        do {
            System.out.println("1. Agregar premio a álbum");
            System.out.println("2. Eliminar premio de álbum");
            System.out.println("3. Mostrar premios de álbum");
            System.out.println("4. Agregar premio a intérprete");
            System.out.println("5. Eliminar premio de intérprete");
            System.out.println("6. Mostrar premios de intérprete");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    agregarPremioAAlbumVista();
                    break;
                case 2:
                    eliminarPremioDeAlbumVista();
                    break;
                case 3:
                    mostrarPremiosDeAlbumVista();
                    break;
                case 4:
                    agregarPremioAInterpreteVista();
                    break;
                case 5:
                    eliminarPremioDeInterpreteVista();
                    break;
                case 6:
                    mostrarPremiosDeInterpreteVista();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 7);
    }
    // Método para agregar un premio a un álbum
    public void agregarPremioAAlbumVista() {
        System.out.println("Ingrese el nombre del álbum:");
        String nombreAlbum = sc.nextLine();
        System.out.println("Ingrese el nombre del premio:");
        String nombrePremio = sc.nextLine();
        System.out.println("Ingrese la descripción del premio:");
        String descripcionPremio = sc.nextLine();
        System.out.println("Ingrese la organización del premio:");
        String organizacionPremio = sc.nextLine();

        PerformerPrize nuevoPremio = new PerformerPrize(nombrePremio, descripcionPremio, organizacionPremio);
        boolean resultado = prizeController.agregarPremioAAlbum(nombreAlbum, nuevoPremio);

        if (resultado) {
            System.out.println("Premio agregado al álbum exitosamente.");
        } else {
            System.out.println("Álbum no encontrado.");
        }
    }

    // Método para eliminar un premio de un álbum
    public void eliminarPremioDeAlbumVista() {
        System.out.println("Ingrese el nombre del álbum:");
        String nombreAlbum = sc.nextLine();
        System.out.println("Ingrese el nombre del premio a eliminar:");
        String nombrePremioEliminar = sc.nextLine();

        boolean resultado = prizeController.eliminarPremioDeAlbum(nombreAlbum, nombrePremioEliminar);
        if (resultado) {
            System.out.println("Premio eliminado del álbum exitosamente.");
        } else {
            System.out.println("Premio o álbum no encontrado.");
        }
    }

    // Método para mostrar los premios de un álbum
    public void mostrarPremiosDeAlbumVista() {
        System.out.println("Ingrese el nombre del álbum:");
        String nombreAlbum = sc.nextLine();

        var premios = prizeController.obtenerPremiosDeAlbum(nombreAlbum);
        if (premios != null) {
            System.out.println("Premios del álbum '" + nombreAlbum + "':");
            for (PerformerPrize premio : premios) {
                System.out.println(premio.getPrizeDetail().getName());
            }
        } else {
            System.out.println("Álbum no encontrado.");
        }
    }

    // Método para agregar un premio a un intérprete
    public void agregarPremioAInterpreteVista() {
        System.out.println("Ingrese el nombre del intérprete:");
        String nombreInterprete = sc.nextLine();
        System.out.println("Ingrese el nombre del premio:");
        String nombrePremio = sc.nextLine();
        System.out.println("Ingrese la descripción del premio:");
        String descripcionPremio = sc.nextLine();
        System.out.println("Ingrese la organización del premio:");
        String organizacionPremio = sc.nextLine();

        PerformerPrize nuevoPremio = new PerformerPrize(nombrePremio, descripcionPremio, organizacionPremio);
        boolean resultado = prizeController.agregarPremioAInterprete(nombreInterprete, nuevoPremio);
        if (resultado) {
            System.out.println("Premio agregado al intérprete exitosamente.");
        } else {
            System.out.println("Intérprete no encontrado.");
        }
    }

    // Método para eliminar un premio de un intérprete
    public void eliminarPremioDeInterpreteVista() {
        System.out.println("Ingrese el nombre del intérprete:");
        String nombreInterprete = sc.nextLine();
        System.out.println("Ingrese el nombre del premio a eliminar:");
        String nombrePremioEliminar = sc.nextLine();

        boolean resultado = prizeController.eliminarPremioDeInterprete(nombreInterprete, nombrePremioEliminar);
        if (resultado) {
            System.out.println("Premio eliminado del intérprete exitosamente.");
        } else {
            System.out.println("Premio o intérprete no encontrado.");
        }
    }

    // Método para mostrar los premios de un intérprete
    public void mostrarPremiosDeInterpreteVista() {
        System.out.println("Ingrese el nombre del intérprete:");
        String nombreInterprete = sc.nextLine();

        var premios = prizeController.obtenerPremiosDeInterprete(nombreInterprete);
        if (premios != null) {
            System.out.println("Premios del intérprete '" + nombreInterprete + "':");
            for (PerformerPrize premio : premios) {
                System.out.println(premio.getPrizeDetail().getName());
            }
        } else {
            System.out.println("Intérprete no encontrado.");
        }
    }
}
