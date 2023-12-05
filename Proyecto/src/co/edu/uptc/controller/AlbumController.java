package co.edu.uptc.controller;


import co.edu.uptc.model.Album;

import java.util.ArrayList;



public class AlbumController  {
	
	
	public static void CrearAlbum(String name, String cover,String description, String releaseDate, String genre,String recordLabel) {
		Album nuevoAlbum = new Album(name,cover, description,releaseDate,genre,recordLabel);
		Album.getAlbunes().add(nuevoAlbum);
	}

	public static void BorrarAlbum(int indice) {
		for ( indice=0;indice <Album.getAlbunes().size();indice++) {
			
	}
		Album.getAlbunes().remove(indice);
	}

	public static void EnlistarAlbum() {

	}

	public static void EditarAlbum() {

	}
	public static void MostarAlbum() {
		for (int i =0; i<Album.getAlbunes().size();i++ ) {
			System.out.println(Album.getAlbunes());
		}
	}


}








