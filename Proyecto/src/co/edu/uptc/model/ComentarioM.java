package co.edu.uptc.model;

import java.util.ArrayList;

public class ComentarioM {
	
	public String descripcion;
	public int clasificacion;
	public ArrayList<ComentarioM> lista= new ArrayList<ComentarioM>();
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(int clasificacion) {
		this.clasificacion = clasificacion;
	}
	
	public void mtdEditar() {
		ComentarioM objComentario= new ComentarioM();
		objComentario.setDescripcion("Descripcion");
		
		//System.out.println(lista.size());
		lista.get(1).setDescripcion("descripcion");
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i).getDescripcion());
			System.out.println(lista.get(i).getClasificacion());
		}
	}
	public String mtdRegM(ComentarioM objCom) {
		
		ComentarioM objComentario= new ComentarioM();
		objComentario.setDescripcion(objCom.getDescripcion());
		objComentario.setClasificacion(objCom.getClasificacion());
		lista.add(objCom);
		/*for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i).getDescripcion());
		}*/
		return "Registro exitoso";
	}
	 public String mtdEliminarM(int clasificacion) {
		 String r="El comentario no se encuentra registrado, verifique el numero de clasificacion ";
		 for(int i=0; i<lista.size(); i++) {
			 if(lista.get(i).getClasificacion()==clasificacion) {
				 lista.remove(i);
				 r="El comentario fue eliminado";
			 }
		 }
		/* for(int i=0; i<lista.size(); i++) {
				System.out.println(lista.get(i).getDescripcion());
			}*/
		 
		 return r;
	 }

}
