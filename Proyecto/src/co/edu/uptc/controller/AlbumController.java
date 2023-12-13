package co.edu.uptc.controller;
import co.edu.uptc.model.ColectorAlbum;
import co.edu.uptc.model.Album;

import java.util.ArrayList;



public class AlbumController  {

		private CollectorAlbum collectorAlbum;

		public AlbumController(CollectorAlbum collectorAlbum) {
			this.collectorAlbum = collectorAlbum;
		}

		// Método para crear y agregar un nuevo álbum
		public void crearAlbum(String name, String cover, String description, String releaseDate, String genre, String recordLabel) {
			Album newAlbum = new Album(name, cover, description, releaseDate, genre, recordLabel);
			collectorAlbum.addAlbum(newAlbum);
		}
		public boolean eliminarAlbum(String albumNameDelete) {
			Album albumParaEliminar = null;
			for (Album a : collectorAlbum.getAlbumes()) {
				if (a.getName().equalsIgnoreCase(albumNameDelete)) {
					albumParaEliminar = a;
					break;
				}
			}

			if (albumParaEliminar != null) {
				collectorAlbum.getAlbumes().remove(albumParaEliminar);
				return true;
			} else {
				return false;
			}
		}
		// Método para buscar un álbum por nombre
		public Album buscarAlbumPorNombre(String nombreBusqueda) {
			for (Album album : collectorAlbum.getAlbumes()) {
				if (album.getName().equalsIgnoreCase(nombreBusqueda)) {
					return album;
				}
			}
			return null; // Retorna null si no se encuentra el álbum
		}
		public void editarNombre(Album album, String nuevoNombre) {
			album.setName(nuevoNombre);
		}

		public void editarPortada(Album album, String nuevaPortada) {
			album.setCover(nuevaPortada);
		}

		public void editarDescripcion(Album album, String nuevaDescripcion) {
			album.setDescription(nuevaDescripcion);
		}

		public void editarFechaLanzamiento(Album album, String nuevaFechaLanzamiento) {
			album.setReleaseDate(nuevaFechaLanzamiento);
		}

		public void editarGenero(Album album, String nuevoGenero) {
			album.setGenre(nuevoGenero);
		}

		public void editarDiscografica(Album album, String nuevaDiscografica) {
			album.setRecordLabel(nuevaDiscografica);
		}
		public ArrayList<Album> obtenerAlbumes() {
			return collectorAlbum.getAlbumes();
		}

	}


}








