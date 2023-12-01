package co.edu.uptc.view;

import java.util.Scanner;

import co.edu.uptc.controller.ComentarioC;
import co.edu.uptc.model.ComentarioM;

public class ComentarioV {
	
	public static ComentarioC objComC=new ComentarioC();
	public static ComentarioM objComM=new ComentarioM();
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		mtdReg();
	//	mtdReg();
	//	mtdEliminar();
		mtdEliminar();

	}
	
	public static void mtdReg() {
		String des;
		int cla;
		System.out.println("Comentario");
		System.out.println("Digite la descripcion");
		des=sc.next();
		objComM.setDescripcion(des);
		System.out.println("Digite la clasificacion");
		cla=sc.nextInt();
		objComM.setClasificacion(cla);
		System.out.println(objComC.mtdRegistrarC(objComM));
	}
	
	public static void mtdEliminar() {
		int cla;
		System.out.println("Eliminar");

		System.out.println("Digite la clasificacion");
		cla=sc.nextInt();
		System.out.println(objComC.mtdEliminarC(cla));
	}

}
