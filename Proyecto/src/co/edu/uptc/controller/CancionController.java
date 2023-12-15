package src.co.edu.uptc.controller;

import src.co.edu.uptc.model.Cancion;

public class CancionController {

    public static void AgregarCancion(String name, String duracion) {
    	
    		Cancion nuevacancion = new Cancion(name,duracion);
    	    Cancion.getCanciones().add(nuevacancion);

    }

    public static void BorrarCancion() {

    }

    public static void enlistarCancion() {

    }

    public static void editarCancion() {

    }

}
