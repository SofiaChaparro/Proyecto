package src.co.edu.uptc.model;

import java.util.ArrayList;

public class CollectorDetail {
    private ArrayList<Coleccionista> coleccionistas;

    public CollectorDetail() {
        coleccionistas = new ArrayList<>();
    }

    public ArrayList<Coleccionista> getColeccionistas() {
        return coleccionistas;
    }

    public void setColeccionistas(ArrayList<Coleccionista> coleccionistas) {
        this.coleccionistas = coleccionistas;
    }

    public void addColeccionista(Coleccionista coleccionista) {
        coleccionistas.add(coleccionista);
    }

    public void mostrarTodosLosAlbumes() {
        if (coleccionistas.isEmpty()) {
            System.out.println("No hay coleccionistas.");
        } else {
            for (Coleccionista coleccionista : coleccionistas) {
                System.out.println("Álbumes de " + coleccionista.getNombre() + ":");
                if (coleccionista.getAlbumes().isEmpty()) {
                    System.out.println("No hay álbumes en la colección de " + coleccionista.getNombre() + ".");
                } else {
                    for (CollectorAlbum album : coleccionista.getAlbumes()) {
                        System.out.println(album);
                    }
                }
            }
        }
    }
}
