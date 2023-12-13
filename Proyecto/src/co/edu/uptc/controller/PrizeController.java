package co.edu.uptc.controller;
import co.edu.uptc.model.Album;
import co.edu.uptc.model.CollectorAlbum;
import co.edu.uptc.model.PerformerDetail;
import co.edu.uptc.model.PerformerPrize;
import java.util.ArrayList;

public class PrizeController {
    private CollectorAlbum collectorAlbum;
    private ArrayList<PerformerDetail> listaInterpretes;

    public PrizeController(CollectorAlbum collectorAlbum, ArrayList<PerformerDetail> listaInterpretes) {
        this.collectorAlbum = collectorAlbum;
        this.listaInterpretes = listaInterpretes;
    }

    // Métodos para manejar premios de álbumes
    public boolean agregarPremioAAlbum(String nombreAlbum, PerformerPrize premio) {
        for (Album album : collectorAlbum.getAlbumes()) {
            if (album.getName().equalsIgnoreCase(nombreAlbum)) {
                album.agregarPremioAlAlbum(premio);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarPremioDeAlbum(String nombreAlbum, String nombrePremio) {
        for (Album album : collectorAlbum.getAlbumes()) {
            if (album.getName().equalsIgnoreCase(nombreAlbum)) {
                return album.eliminarPremioDelAlbum(nombrePremio);
            }
        }
        return false;
    }

    public ArrayList<PerformerPrize> obtenerPremiosDeAlbum(String nombreAlbum) {
        for (Album album : collectorAlbum.getAlbumes()) {
            if (album.getName().equalsIgnoreCase(nombreAlbum)) {
                return album.getPremiosAlbum();
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
