package co.edu.uptc.view;

import co.edu.uptc.model.Cancion;

import java.util.Scanner;

public class CancionView {
    Scanner sc = new Scanner(System.in);

    public void registrarCancion() {
        System.out.println("Ingrese el nombre de la cancion");
        String nombre = sc.next();
        System.out.println("Ingrese la duracion de la cancion");
        String duracion = sc.next();
        Cancion cancion = new Cancion(nombre, duracion);
        canciones.add(cancion);

    }


}
