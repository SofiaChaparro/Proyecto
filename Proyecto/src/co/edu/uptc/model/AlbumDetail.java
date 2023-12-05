package co.edu.uptc.model;

import java.util.List;

public class AlbumDetail {
    private ArrayList<Album> albums;
    private List<Cancion> canciones;
    public AlbumDetail(){
        this.albums = new ArrayList<Album>();

    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }
}
