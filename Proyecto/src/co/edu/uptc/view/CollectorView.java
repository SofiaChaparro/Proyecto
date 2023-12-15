package src.co.edu.uptc.view;

import src.co.edu.uptc.controller.CollectorController;
import src.co.edu.uptc.model.Coleccionista;

import java.util.Scanner;

public class CollectorView {
    Scanner sc = new Scanner(System.in);
    CollectorController collectorController = new CollectorController();

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

        Coleccionista coleccionista = new Coleccionista();
        coleccionista.setNombre(nombre);
        coleccionista.setTelefono(telefono);
        coleccionista.setEmail(email);
        coleccionista.setClave(clave);

        boolean isRegistered = collectorController.registrarColeccionista(coleccionista);

        if (isRegistered) {
            System.out.println("El coleccionista es válido y ha sido registrado exitosamente.");
        } else {
            System.out.println("El coleccionista no es válido. Por favor, revise los datos e intente de nuevo.");
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
            System.out.println("Inicio de sesión exitoso.");
            return true;
        } else {
            System.out.println("Email o clave incorrectos. Por favor, intente de nuevo.");
            return false;
        }
    }
}