package co.edu.uptc.controller;


import java.util.ArrayList;


import co.edu.uptc.model.AlbumM;

public class AlbumC {
static ArrayList<Object> albunes = new ArrayList<Object>(5);
	
	
	public static void CrearAlbum(String name, String cover,String description, String releaseDate, String genre,String recordLabel) {
		AlbumM nuevoAlbum = new AlbumM(name, cover, description,releaseDate,genre,recordLabel);
		albunes.add(nuevoAlbum);
	}

	public static void BorrarAlbum() {

	}

	public static void EnlistarAlbum() {

	}

	public static void EditarAlbum() {

	}
	public static void MostarAlbum() {
		for (int i =0; i<albunes.size();i++ ) {
			System.out.println(albunes.get(i));
		}
	}


}


