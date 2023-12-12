package co.edu.uptc.controller;

import co.edu.uptc.model.Album;
import co.edu.uptc.model.Banda;

public class BandaController {
	public static void AgregarArtistas(String name, String genero,String creationDate,String birtDate,String image, String description) {
		Banda nuevabanda = new Banda(name, genero, creationDate,birtDate, image, description);
	Banda.getArrayBanda().add(nuevabanda);
	}
	
	public static void MostarBanda() {
		for (int i =0; i<Banda.getArrayBanda().size();i++ ) {
			System.out.println(Banda.getArrayBanda());
		}
	}

}
