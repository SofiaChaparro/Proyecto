package co.edu.uptc.view;

import co.edu.uptc.controller.AlbumController;
import java.util.Scanner;


public class AlbumView {
    AlbumController album = new AlbumController();
    static Scanner pat = new Scanner(System.in);

    public void DatosAlbum() {
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
        album.CrearAlbum(name, cover, description, releaseDate, genre, recordLabel);


    }

    public void IndiceAlbum() {
        System.out.println("Ingrese indice");
        album.BorrarAlbum(pat.nextInt());

    }


}
