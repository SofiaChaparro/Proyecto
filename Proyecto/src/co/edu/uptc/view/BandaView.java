package src.co.edu.uptc.view;

import src.co.edu.uptc.controller.BandaController;
import src.co.edu.uptc.model.Banda;
import src.co.edu.uptc.model.Coleccionista;
import src.co.edu.uptc.model.Musician;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BandaView {
    Scanner scanner = new Scanner(System.in);

    private Coleccionista coleccionista;
    private BandaController bandaController;

    public BandaView(Coleccionista coleccionista) {
        this.coleccionista = coleccionista;
        this.bandaController = new BandaController(coleccionista);
    }


    public void showMenuBand(){
        int opcion;
        do {
            System.out.println("Gestión de bandas");
            System.out.println("----------------------------------");
            System.out.println("1. Crear una nueva banda");
            System.out.println("2. Eliminar una banda existente");
            System.out.println("3. Editar una banda existente");
            System.out.println("4. Agregar un músico a una banda");
            System.out.println("5. Eliminar un músico de una banda");
            System.out.println("6. Mostrar los músicos de una banda");
            System.out.println("7. Salir");
            System.out.println("----------------------------------");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    createBand();
                    break;
                case 2:
                    deleteBand();
                    break;
                case 3:
                    editBand();
                    break;
                case 4:
                    addMusicianToBand();
                    break;
                case 5:
                    removeMusicianFromBand();
                    break;
                case 6:
                    showMusiciansFromBand();
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
    public void showMenuMusician(){
        int opcion;
        do {
            System.out.println("Gestión de músicos");
            System.out.println("----------------------------------");
            System.out.println("1. Crear un nuevo músico");
            System.out.println("2. Eliminar un músico existente");
            System.out.println("3. Editar un músico existente");
            System.out.println("4. Salir");
            System.out.println("----------------------------------");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    createMusician();
                    break;
                case 2:
                    deleteMusician();
                    break;
                case 3:
                    editMusician();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 4);
    }
    // Método para crear un nuevo músico
    public void createMusician() {
        System.out.println("Introduce el nombre del músico:");
        String name = scanner.nextLine();
        System.out.println("Introduce la imagen del músico:");
        String image = scanner.nextLine();
        System.out.println("Introduce la descripción del músico:");
        String description = scanner.nextLine();
        System.out.println("Introduce la fecha de nacimiento del músico (en formato dd/MM/yyyy):");
        String fechaComoTexto = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fechaNacimiento = sdf.parse(fechaComoTexto);
            Musician musician = new Musician(name, image, description, fechaNacimiento);
            bandaController.addMusician(musician);
        } catch (ParseException e) {
            System.out.println("La fecha introducida no está en el formato correcto. Por favor, introduce la fecha en el formato dd/MM/yyyy.");
        }
    }


    // Método para eliminar un músico existente
    public void deleteMusician() {
        System.out.println("Introduce el nombre del músico que quieres eliminar:");
        String name = scanner.nextLine();
        bandaController.removeMusician(name);
    }

    // Método para editar un músico existente
    public void editMusician() {
        System.out.println("Introduce el nombre del músico que quieres editar:");
        String name = scanner.nextLine();
        System.out.println("¿Qué atributo te gustaría editar?");
        System.out.println("1. Nombre");
        System.out.println("2. Imagen");
        System.out.println("3. Descripción");
        System.out.println("4. Fecha de nacimiento");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        switch (choice) {
            case 1:
                System.out.println("Introduce el nuevo nombre del músico:");
                String newName = scanner.nextLine();
                bandaController.editarMusicianName(name, newName);
                break;
            case 2:
                System.out.println("Introduce la nueva imagen del músico:");
                String newImage = scanner.nextLine();
                bandaController.editarMusicianImage(name, newImage);
                break;
            case 3:
                System.out.println("Introduce la nueva descripción del músico:");
                String newDescription = scanner.nextLine();
                bandaController.editarMusicianDescription(name, newDescription);
                break;
            case 4:
                System.out.println("Introduce la nueva fecha de nacimiento del músico (en formato dd/MM/yyyy):");
                String fechaComoTexto = scanner.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    Date newFechaNacimiento = sdf.parse(fechaComoTexto);
                    bandaController.editarMusicianFechaNacimiento(name, newFechaNacimiento);
                } catch (ParseException e) {
                    System.out.println("La fecha introducida no está en el formato correcto. Por favor, introduce la fecha en el formato dd/MM/yyyy.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    // Método para crear una nueva banda
    public void createBand() {
        System.out.println("Introduce el nombre de la banda:");
        String name = scanner.nextLine();
        System.out.println("Introduce la imagen de la banda:");
        String image = scanner.nextLine();
        System.out.println("Introduce la descripción de la banda:");
        String description = scanner.nextLine();
        System.out.println("Introduce la fecha de creación de la banda (en formato dd/MM/yyyy):");
        String fechaComoTexto = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fechaCreacion = sdf.parse(fechaComoTexto);
            Banda banda = new Banda(name, image, description, fechaCreacion);
            bandaController.addBand(banda);
        } catch (ParseException e) {
            System.out.println("La fecha introducida no está en el formato correcto. Por favor, introduce la fecha en el formato dd/MM/yyyy.");
        }

    }

    // Método para eliminar una banda existente
    public void deleteBand() {
        System.out.println("Introduce el nombre de la banda que quieres eliminar:");
        String name = scanner.nextLine();
        bandaController.removeBand(name);
    }

    // Método para editar una banda existente
    public void editBand() {
        System.out.println("Introduce el nombre de la banda que quieres editar:");
        String name = scanner.nextLine();
        System.out.println("¿Qué atributo te gustaría editar?");
        System.out.println("1. Nombre");
        System.out.println("2. Imagen");
        System.out.println("3. Descripción");
        System.out.println("4. Fecha de creación");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        switch (choice) {
            case 1:
                System.out.println("Introduce el nuevo nombre de la banda:");
                String newName = scanner.nextLine();
                bandaController.editarBandaName(name, newName);
                break;
            case 2:
                System.out.println("Introduce la nueva imagen de la banda:");
                String newImage = scanner.nextLine();
                bandaController.editarBandaImage(name, newImage);
                break;
            case 3:
                System.out.println("Introduce la nueva descripción de la banda:");
                String newDescription = scanner.nextLine();
                bandaController.editarBandaDescription(name, newDescription);
                break;
            case 4:
                System.out.println("Introduce la nueva fecha de creación de la banda (en formato dd/MM/yyyy):");
                String fechaComoTexto = scanner.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    Date newFechaCreacion = sdf.parse(fechaComoTexto);
                    bandaController.editarBandaFechaCreacion(name, newFechaCreacion);
                } catch (ParseException e) {
                    System.out.println("La fecha introducida no está en el formato correcto. Por favor, introduce la fecha en el formato dd/MM/yyyy.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    // Método para agregar un músico a una banda
    public void addMusicianToBand() {
        System.out.println("Introduce el nombre de la banda a la que quieres agregar un músico:");
        String bandName = scanner.nextLine();
        System.out.println("Introduce el nombre del músico que quieres agregar:");
        String musicianName = scanner.nextLine();
        Musician musician = bandaController.getMusician(musicianName);
        if (musician != null) {
            bandaController.agregarMusicoBanda(bandName, musician);
            System.out.println("Músico agregado a la banda exitosamente.");
        } else {
            System.out.println("No se encontró el músico con el nombre proporcionado.");
        }
    }

    // Método para eliminar un músico de una banda
    public void removeMusicianFromBand() {
        System.out.println("Introduce el nombre de la banda de la que quieres eliminar un músico:");
        String bandName = scanner.nextLine();
        System.out.println("Introduce el nombre del músico que quieres eliminar:");
        String musicianName = scanner.nextLine();
        bandaController.eliminarMusicoBanda(bandName, musicianName);
        System.out.println("Músico eliminado de la banda exitosamente.");
    }

    // Método para mostrar los músicos de una banda
    public void showMusiciansFromBand() {
        System.out.println("Introduce el nombre de la banda de la que quieres ver los músicos:");
        String bandName = scanner.nextLine();
        ArrayList<Musician> musicians = bandaController.obtenerMusicosBanda(bandName);
        if (musicians != null) {
            System.out.println("Músicos de la banda " + bandName + ":");
            for (Musician musician : musicians) {
                System.out.println(musician.getName());
            }
        } else {
            System.out.println("No se encontró la banda con el nombre proporcionado.");
        }
    }

}

