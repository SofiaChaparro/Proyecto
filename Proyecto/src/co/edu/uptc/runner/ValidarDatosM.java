package co.edu.uptc.runner;

public class ValidarDatosM {

    public boolean validarLetrasM(String cadena) {
        return cadena.matches("[a-zA-Z]*");
    }

    public boolean validarNumerosM(String cadena) {
        return cadena.matches("[0-9]*");
    }
}
