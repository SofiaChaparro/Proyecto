package src.co.edu.uptc.model;

import java.util.ArrayList;
import java.util.Date;

public class BandDetail extends Banda {
    private ArrayList<Musician> musicians;

    public BandDetail(String name, String image, String description, Date fechaCreacion, ArrayList<Musician> musicians) {
        super(name, image, description, fechaCreacion);
        this.musicians = musicians;
    }

    public ArrayList<Musician> getMusicians() {
        return musicians;
    }

    public void setMusicians(ArrayList<Musician> musicians) {
        this.musicians = musicians;
    }
}
