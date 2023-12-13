package src.co.edu.uptc.model;

import java.util.ArrayList;

public class PerformerDetail extends Performer {
    private ArrayList<PerformerPrize> premiosInterpretes; // Cambiado a lista de PerformerPrize

    public PerformerDetail(String name, String image, String description) {
        super(name, image, description);
        this.premiosInterpretes = new ArrayList<>();
    }



    public void agregarPremioAInterprete(PerformerPrize premio) {
        this.premiosInterpretes.add(premio);
    }

    public boolean eliminarPremioDeInterprete(String nombrePremio) {
        return premiosInterpretes.removeIf(premio -> premio.getPrizeDetail().getName().equalsIgnoreCase(nombrePremio));
    }

    public ArrayList<PerformerPrize> getPremiosInterpretes() {
        return premiosInterpretes;
    }

    public void setPremiosInterpretes(ArrayList<PerformerPrize> premiosInterpretes) {
        this.premiosInterpretes = premiosInterpretes;
    }



    public ArrayList<PerformerPrize> getInterpretePremios() {
        return premiosInterpretes;
    }

    // Método para eliminar un premio por nombre
    public boolean eliminarPremio(String nombrePremio) {
        return premiosInterpretes.removeIf(premio -> premio.getPrizeDetail().getName().equalsIgnoreCase(nombrePremio));
    }
}
