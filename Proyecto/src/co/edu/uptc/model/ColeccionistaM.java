package co.edu.uptc.model;

import java.util.ArrayList;

public class ColeccionistaM {

    public String nombre;
    public String telefono;
    public String email;
    public String clave;
    public ArrayList<ColeccionistaM> arrayColeccionistas = new ArrayList<ColeccionistaM>();

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

    public ArrayList<ColeccionistaM> getArrayColeccionistas() {
        return arrayColeccionistas;
    }

    public String mtdRegistrarM(ColeccionistaM objC) {
        ColeccionistaM objC1 = new ColeccionistaM();
        objC1.setNombre(objC.getNombre());
        objC1.setTelefono(objC.getTelefono());
        objC1.setClave(objC.getClave());
        objC1.setEmail(objC.getEmail());
        arrayColeccionistas.add(objC1);
        System.out.println(arrayColeccionistas.size());

        for (int i = 0; i < arrayColeccionistas.size(); i++) {
            System.out.println(arrayColeccionistas.get(i).getNombre());
        }
        return "Su registro fue exitoso";
    }

    public String mtdLoginM(String email, String clave) {
        String r = "";
        for (int i = 0; i < arrayColeccionistas.size(); i++) {
            if (arrayColeccionistas.get(i).getEmail().equals(email) && arrayColeccionistas.get(i).getClave().equals(clave)) {
                r = "Bienvenido";
                break;
            } else if (arrayColeccionistas.get(i).getEmail().equals(email) || arrayColeccionistas.get(i).getClave().equals(clave)) {
                if (r == "") {
                    r = "Datos Incorrectos";
                }

            } else {
                if (r == "") {
                    r = "No se encuentra registrado";
                }

            }
        }
        System.out.println(r);

        return r;
    }

}
