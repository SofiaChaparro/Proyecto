package co.edu.uptc.view;

import java.util.Scanner;

import co.edu.uptc.controller.AlbumC;



public class AlbumV {
	AlbumC album = new AlbumC();
	static Scanner pat = new Scanner(System.in);

	public  void DatosAlbum() {
		System.out.println("digite nombre");
		String name = pat.next();
		System.out.println("digite la portada");
		String cover = pat.next();
		System.out.println("digite descripcion");
		String description = pat.next();
		System.out.println("digite nombre");
		String releaseDate = pat.next();
		System.out.println("digite genero");
		String genre = pat.next();
		System.out.println("digite la etiqueta de registro");
		String recordLabel = pat.next();
		album.CrearAlbum(name,cover,description,releaseDate,genre,recordLabel);


	}




	}
