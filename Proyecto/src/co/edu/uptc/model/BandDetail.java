package src.co.edu.uptc.model;

import java.util.ArrayList;

public class BandDetail extends Banda {
    private ArrayList<Musician> musicians;

    public BandDetail(String name, String description, String organization) {
        super(name, description, organization);
        this.musicians = new ArrayList<>();
    }

    public ArrayList<Musician> getMusicians() {
        return musicians;
    }

    public void setMusicians(ArrayList<Musician> musicians) {
        this.musicians = musicians;
    }
}
