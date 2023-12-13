package src.co.edu.uptc.model;

import java.util.ArrayList;

public class PerformerDetail extends Performer{
    private ArrayList<PerformerPrize> prizes; // Cambiado a lista de PerformerPrize

    public PerformerDetail(String name, String image, String description) {
        super(name, image, description);
        this.prizes = new ArrayList<>();
    }



    public void addPrize(PerformerPrize prize){ // Cambiado a aceptar PerformerPrize
        prizes.add(prize);
    }
    public boolean removePrize(String prizeName) {
        for (PerformerPrize prize : prizes) {
            if (prize.getPrizeDetail().getName().equalsIgnoreCase(prizeName)) {
                prizes.remove(prize);
                return true;
            }
        }
        return false;
    }

    public ArrayList<PerformerPrize> getPrizes() { // Cambiado a devolver lista de PerformerPrize
        return prizes;
    }

    public void setPrizes(ArrayList<PerformerPrize> prizes){ // Cambiado a aceptar lista de PerformerPrize
        this.prizes = prizes;
    }

}
