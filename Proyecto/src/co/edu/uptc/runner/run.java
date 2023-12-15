package src.co.edu.uptc.runner;

import src.co.edu.uptc.view.CollectorView;

import java.util.Scanner;


public class run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CollectorView collectorView = new CollectorView();
        int opcion;
        do {
            System.out.println("1. Registrar coleccionistas");
            System.out.println("2. Log in");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    collectorView.registrarColeccionista();
                    break;
                case 2:
                    if (collectorView.iniciarSesion()) {
                        int opcionLogin;
                        do {
                            System.out.println("1. Gestión de álbumes");
                            System.out.println("2. Gestión de canciones");
                            System.out.println("3. Gestión de artistas");
                            System.out.println("4. Gestión de bandas");
                            System.out.println("5. Gestión de premios");
                            System.out.println("6. Gestión de coleccionistas");
                            System.out.println("7. Salir");
                            System.out.print("Elige una opción: ");
                            opcionLogin = sc.nextInt();

                            switch (opcionLogin) {
                                case 1:
                                    System.out.println("Gestión de álbumes");
                                    System.out.println("1. Agregar álbum");
                                    System.out.println("2. Eliminar álbum");
                                    System.out.println("3. Buscar álbum");
                                    System.out.println("4. Mostrar álbumes");
                                    break;
                                // Agrega los demás casos aquí
                                case 7:
                                    System.out.println("Saliendo del menú de login...");
                                    break;
                                default:
                                    System.out.println("Opción inválida. Por favor, intenta de nuevo.");
                            }
                        } while (opcionLogin != 7);
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intenta de nuevo.");
            }
        } while (opcion != 3);


    }
}
