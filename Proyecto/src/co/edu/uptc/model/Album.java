package co.edu.uptc.model;


import java.util.ArrayList;


public class Album {
	private String name;
	private String cover;
	private String description;
	private String releaseDate;
	private String genre;
	private String recordLabel;

	private ArrayList<Cancion> cancionesAlbum;

	public String getName() {
		return name;
	}

	public Album(String name, String cover, String description, String releaseDate, String genre,
				 String recordLabel) {

		this.name = name;
		this.cover = cover;
		this.description = description;
		this.releaseDate = releaseDate;
		this.genre = genre;
		this.recordLabel = recordLabel;
		this.cancionesAlbum = new ArrayList<>();
	}


	public ArrayList<Cancion> getCancionesAlbum() {
		return cancionesAlbum;
	}

	public void setCancionesAlbum(ArrayList<Cancion> cancionesAlbum) {
		this.cancionesAlbum = cancionesAlbum;
	}

	public void addCancion(Cancion cancion) {
		this.cancionesAlbum.add(cancion);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getRecordLabel() {
		return recordLabel;
	}

	public void setRecordLabel(String recordLabel) {
		this.recordLabel = recordLabel;
	}

	@Override
	public String toString() {
		return "AlbunesM [name:" + name + ", cover:" + cover + ", description:" + description + ", releaseDate:"
				+ releaseDate + ", genre:" + genre + ", recordLabel:" + recordLabel + "]";
	}

}