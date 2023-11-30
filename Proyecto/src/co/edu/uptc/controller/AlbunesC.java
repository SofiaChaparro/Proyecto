package co.edu.uptc.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import co.edu.uptc.model.AlbunesM;

public class AlbunesC {
	static ArrayList <Object> albunes = new ArrayList <Object>(5);

public static void CrearAlbum(String name, String cover, String description,LocalDate releaseDate,String genre, String recordLabel ) {
AlbunesM album = new AlbunesM(name,cover,description,releaseDate,genre,recordLabel);
albunes.add(album);
}
public static void BorrarAlbum() {
	
}
public static void enlistarAlbum() {
	
}
public static void editarAlbum() {
	
}
}
