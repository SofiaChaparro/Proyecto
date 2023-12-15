package src.co.edu.uptc.controller;
import src.co.edu.uptc.model.*;

import java.util.ArrayList;

public class PrizeController {
    private Coleccionista coleccionista;
    private ArrayList<PerformerDetail> listaInterpretes;

    public PrizeController(Coleccionista coleccionista, ArrayList<PerformerDetail> listaInterpretes) {
        this.coleccionista = coleccionista;
        this.listaInterpretes = listaInterpretes;
    }

    // Métodos para manejar premios de álbumes
    public boolean agregarPremioAAlbum(String nombreAlbum, PerformerPrize premio) {
        for (CollectorAlbum collectorAlbum : coleccionista.getAlbumes()) {
            if (collectorAlbum.getAlbum().getName().equalsIgnoreCase(nombreAlbum)) {
                collectorAlbum.getAlbum().agregarPremioAlAlbum(premio);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarPremioDeAlbum(String nombreAlbum, String nombrePremio) {
        for (CollectorAlbum collectorAlbum : coleccionista.getAlbumes()) {
            if (collectorAlbum.getAlbum().getName().equalsIgnoreCase(nombreAlbum)) {
                return collectorAlbum.getAlbum().eliminarPremioDelAlbum(nombrePremio);
            }
        }
        return false;
    }

    public ArrayList<PerformerPrize> obtenerPremiosDeAlbum(String nombreAlbum) {
        for (CollectorAlbum collectorAlbum : coleccionista.getAlbumes()) {
            if (collectorAlbum.getAlbum().getName().equalsIgnoreCase(nombreAlbum)) {
                return collectorAlbum.getAlbum().getPremiosAlbum();
            }
        }
        return null;
    }

    // Métodos para manejar premios de intérpretes
    public boolean agregarPremioAInterprete(String nombreInterprete, PerformerPrize premio) {
        for (PerformerDetail interprete : listaInterpretes) {
            if (interprete.getName().equalsIgnoreCase(nombreInterprete)) {
                interprete.getInterpretePremios().add(premio);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarPremioDeInterprete(String nombreInterprete, String nombrePremio) {
        for (PerformerDetail interprete : listaInterpretes) {
            if (interprete.getName().equalsIgnoreCase(nombreInterprete)) {
                return interprete.eliminarPremio(nombrePremio);
            }
        }
        return false;
    }

    public ArrayList<PerformerPrize> obtenerPremiosDeInterprete(String nombreInterprete) {
        for (PerformerDetail interprete : listaInterpretes) {
            if (interprete.getName().equalsIgnoreCase(nombreInterprete)) {
                return interprete.getInterpretePremios();
            }
        }
        return null;
    }
}
