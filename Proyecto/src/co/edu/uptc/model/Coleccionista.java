package src.co.edu.uptc.model;

import java.util.ArrayList;

public class Coleccionista {

    private String nombre;
    private String telefono;
    private String email;
    private String clave;
    private ArrayList<CollectorAlbum> albumes;

    public Coleccionista(String nombre, String telefono, String email, String clave) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.clave = clave;
        this.albumes = albumes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getClave() {
        return clave;
    }


    public ArrayList<CollectorAlbum> getAlbumes() {
        return albumes;
    }
    public void addAlbum(CollectorAlbum album){
        this.albumes.add(album);
    }


//    public String mtdRegistrarM(Coleccionista objC) {
//        Coleccionista objC1 = new Coleccionista();
//        objC1.setNombre(objC.getNombre());
//        objC1.setTelefono(objC.getTelefono());
//        objC1.setClave(objC.getClave());
//        objC1.setEmail(objC.getEmail());
//        arrayColeccionistas.add(objC1);
//       // System.out.println(arrayColeccionistas.size());
//
//       /* for (int i = 0; i < arrayColeccionistas.size(); i++) {
//            System.out.println(arrayColeccionistas.get(i).getNombre());
//        }*/
//        return "Su registro fue exitoso";
//    }
//
//    public String mtdLoginM(String email, String clave) {
//        String r = "";
//        for (int i = 0; i < arrayColeccionistas.size(); i++) {
//            if (arrayColeccionistas.get(i).getEmail().equals(email) && arrayColeccionistas.get(i).getClave().equals(clave)) {
//                r = arrayColeccionistas.get(i).getNombre()+","+i;
//                break;
//            }
//         }
//
//       // System.out.println(r);
//
//        return r;
//    }

}
