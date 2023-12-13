package src.co.edu.uptc.view;

public class PrizeView {
    private PrizeController prizeController;
    private Scanner sc;

    public PrizeView(PrizeController prizeController) {
        this.prizeController = prizeController;
        this.sc = new Scanner(System.in);
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
