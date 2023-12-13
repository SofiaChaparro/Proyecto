package co.edu.uptc.model;


import java.util.ArrayList;


public class Album {
	private String name;
	private String cover;
	private String description;
	private String releaseDate;
	private String genre;
	private String recordLabel;
	private ArrayList<PerformerPrize> premiosAlbum;
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
		this.premiosAlbum = new ArrayList<>();
		this.cancionesAlbum = new ArrayList<>();
	}

	public ArrayList<PerformerPrize> getPremiosAlbum() {
		return premiosAlbum;
	}

	public void setPremiosAlbum(ArrayList<PerformerPrize> premiosAlbum) {
		this.premiosAlbum = premiosAlbum;
	}

	public void addPremio(PerformerPrize premio) {
		this.premiosAlbum.add(premio);
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

	public String toString() {
		// Modifica el método toString para incluir los premios del álbum
		String infoAlbum = "Album [name:" + name + ", cover:" + cover + ", description:" + description +
				", releaseDate:" + releaseDate + ", genre:" + genre + ", recordLabel:" + recordLabel + "]";
		String infoPremios = "Premios del álbum: ";
		for (PerformerPrize premio : premiosAlbum) {
			infoPremios += premio.getPrizeDetail().getName() + ", ";
		}
		return infoAlbum + "\n" + infoPremios;
	}

	// Método para agregar una canción al álbum
	public void agregarCancionAlAlbum(Cancion cancion) {
		this.cancionesAlbum.add(cancion);
	}

	// Método para eliminar una canción del álbum
	public boolean eliminarCancionDelAlbum(String nombreCancion) {
		Cancion cancionAEliminar = null;
		for (Cancion cancion : this.cancionesAlbum) {
			if (cancion.getName().equalsIgnoreCase(nombreCancion)) {
				cancionAEliminar = cancion;
				break; // Salimos del ciclo una vez que encontramos la canción
			}
		}
		if (cancionAEliminar != null) {
			this.cancionesAlbum.remove(cancionAEliminar);
			return true;
		}
		return false;
	}

	// Método para mostrar todas las canciones del álbum
	public void mostrarCancionesDelAlbum() {
		if (this.cancionesAlbum.isEmpty()) {
			System.out.println("No hay canciones en este álbum.");
		} else {
			for (Cancion cancion : this.cancionesAlbum) {
				System.out.println(cancion);
			}
		}
	}

	// Método para editar una canción del álbum
	public boolean editarCancionDelAlbum(String nombreActual, String nuevoNombre, String nuevaDuracion) {
		for (Cancion cancion : this.cancionesAlbum) {
			if (cancion.getName().equalsIgnoreCase(nombreActual)) {
				cancion.setName(nuevoNombre);
				cancion.setDuracion(nuevaDuracion);
				return true;
			}
		}
		return false;
	}


	// Método para eliminar un premio del álbum
	public boolean eliminarPremioDelAlbum(String nombrePremio) {
		return premiosAlbum.removeIf(premio -> premio.getPrizeDetail().getName().equalsIgnoreCase(nombrePremio));


	}

	public void agregarPremioAlAlbum(PerformerPrize premio) {
		this.premiosAlbum.add(premio);
	}

}