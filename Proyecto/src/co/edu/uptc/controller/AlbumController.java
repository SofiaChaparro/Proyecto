package co.edu.uptc.controller;


import co.edu.uptc.model.Album;

import java.util.ArrayList;

public class AlbumController {
    static ArrayList<Object> albunes = new ArrayList<Object>(5);


    public static void CrearAlbum(String name, String cover, String description, String releaseDate, String genre, String recordLabel) {
        Album nuevoAlbum = new Album(name, cover, description, releaseDate, genre, recordLabel);
        albunes.add(nuevoAlbum);
    }

    public static void BorrarAlbum(int indice) {
        for (indice = 0; indice < albunes.size(); indice++) {
            albunes.remove(indice);
        }
    }

    public static void EnlistarAlbum() {

    }

    public static void EditarAlbum() {

    }

    public static void MostarAlbum() {
        for (int i = 0; i < albunes.size(); i++) {
            System.out.println(albunes.get(i));
        }
    }


}


