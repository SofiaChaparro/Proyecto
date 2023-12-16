package src.co.edu.uptc.view;
import src.co.edu.uptc.model.CollectorDetail;
import src.co.edu.uptc.controller.CollectorController;
import src.co.edu.uptc.model.Coleccionista;
import src.co.edu.uptc.model.CollectorAlbum;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectorView {
    Scanner sc = new Scanner(System.in);
    private Coleccionista coleccionista;
    private CollectorController collectorController;
    private CollectorDetail collectorDetail; // Asegúrate de inicializar esto

    public CollectorView(Coleccionista coleccionista, CollectorDetail collectorDetail) {
        this.coleccionista = coleccionista;
        this.collectorDetail = collectorDetail;
        this.collectorController = new CollectorController(coleccionista, collectorDetail);
    }

    public void registrarColeccionista() {

        System.out.println("Ingrese los datos del coleccionista:");

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Clave: ");
        String clave = sc.nextLine();

        // Crear un nuevo Coleccionista con los datos ingresados
        Coleccionista coleccionista = new Coleccionista(nombre, telefono, email, clave);

        boolean isRegistered = collectorController.registrarColeccionista(coleccionista);

        if (isRegistered) {

            System.out.println("\n El coleccionista es válido y ha sido registrado exitosamente.");
        } else {
            System.out.println("\n El coleccionista no es válido. Por favor, revise los datos e intente de nuevo.");
        }
    }

    public boolean iniciarSesion() {
        System.out.println("Ingrese los datos para iniciar sesión:");

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Clave: ");
        String clave = sc.nextLine();

        boolean inicioSesionExitoso = collectorController.validarInicioSesion(email, clave);

        if (inicioSesionExitoso) {
            System.out.println("----------------------------------");;
            System.out.println("Inicio de sesión exitoso.");
            System.out.println("Bienvenido, " + coleccionista.getNombre() + "!");
            System.out.println("----------------------------------");
            return true;
        } else {
            System.out.println("----------------------------------");
            System.out.println("Email o clave incorrectos. Por favor, intente de nuevo.");
            System.out.println("----------------------------------");
            return false;
        }
    }
    public void mostrarAlbumes() {
        ArrayList<CollectorAlbum> albumes = coleccionista.getAlbumes();
        if (albumes.isEmpty()) {
            System.out.println("El coleccionista no tiene álbumes.");
        } else {
            System.out.println("Álbumes del coleccionista " + coleccionista.getNombre() + ":");
            for (CollectorAlbum album : albumes) {
                System.out.println(album);
            }
        }
    }

}