package src.co.edu.uptc.runner;

import src.co.edu.uptc.view.*;
import src.co.edu.uptc.model.*;
import src.co.edu.uptc.controller.*;

import java.util.ArrayList;
import java.util.Scanner;



public class run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Coleccionista coleccionista = new Coleccionista("nombre", "telefono", "email", "clave");
        CollectorDetail collectorDetail = new CollectorDetail();
        CollectorView collectorView = new CollectorView(coleccionista, collectorDetail);
        AlbumView albumView = new AlbumView(coleccionista);
        BandaView bandaView = new BandaView(coleccionista);
        CancionView cancionView = new CancionView(coleccionista);
        ArrayList<PerformerDetail> listaInterpretes = new ArrayList<>();
        PrizeView prizeView = new PrizeView(coleccionista, listaInterpretes);

        int opcion;
        do {
            System.out.println("Bienvenido al sistema de gestión de vinilos");
            System.out.println("--------------------------------------------");
            System.out.println("1. Registrar coleccionistas");
            System.out.println("2. Log in");
            System.out.println("3. Salir");
            System.out.println("--------------------------------------------");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

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
                            System.out.println("6. Salir");
                            System.out.print("Elige una opción: ");
                            opcionLogin = sc.nextInt();
                            sc.nextLine();

                            switch (opcionLogin) {
                                case 1:
                                    albumView.showMenu();
                                    break;
                                case 2:
                                    cancionView.showMenu();
                                    break;
                                case 3:
                                    bandaView.showMenuMusician();
                                    break;
                                case 4:
                                    bandaView.showMenuBand();
                                    break;
                                case 5:
                                    prizeView.showMenu();
                                    break;
                                case 6:
                                    System.out.println("Saliendo del menú de login...");
                                    break;
                                default:
                                    System.out.println("Opción inválida. Por favor, intenta de nuevo.");
                            }
                        } while (opcionLogin != 6);
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
