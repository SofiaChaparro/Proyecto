package co.edu.uptc.controller;
import co.edu.uptc.model.Album;
import co.edu.uptc.model.CollectorAlbum;

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
	public void mostrarAlbumes() {
		if (collectorAlbum.getAlbumes().isEmpty()) {
			System.out.println("No hay álbumes en la colección.");
		} else {
			System.out.println("Lista de álbumes:");
			for (Album album : collectorAlbum.getAlbumes()) {
				System.out.println(album);
			}
		}
	}

	// Método para agregar una canción a un álbum específico
	public boolean agregarCancionAAlbum(String nombreAlbum, String nombreCancion, String duracionCancion) {
		Album album = buscarAlbumPorNombre(nombreAlbum);
		if (album != null) {
			Cancion nuevaCancion = new Cancion(nombreCancion, duracionCancion);
			album.agregarCancionAlAlbum(nuevaCancion);
			return true;
		}
		return false;
	}

	// Método para eliminar una canción de un álbum específico
	public boolean eliminarCancionDeAlbum(String nombreAlbum, String nombreCancionEliminar) {
		Album album = buscarAlbumPorNombre(nombreAlbum);
		if (album != null) {
			return album.eliminarCancionDelAlbum(nombreCancionEliminar);
		}
		return false;
	}

	// Método para mostrar todas las canciones de un álbum específico
	public void mostrarCancionesDeAlbum(String nombreAlbum) {
		Album album = buscarAlbumPorNombre(nombreAlbum);
		if (album != null) {
			album.mostrarCancionesDelAlbum();
		} else {
			System.out.println("Álbum no encontrado.");
		}
	}

	// Método para editar una canción de un álbum específico
	public boolean editarCancionDeAlbum(String nombreAlbum, String nombreActualCancion, String nuevoNombreCancion, String nuevaDuracionCancion) {
		Album album = buscarAlbumPorNombre(nombreAlbum);
		if (album != null) {
			return album.editarCancionDelAlbum(nombreActualCancion, nuevoNombreCancion, nuevaDuracionCancion);
		}
		return false;
	}

}











