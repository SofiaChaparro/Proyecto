package co.edu.uptc.controller;

import co.edu.uptc.model.ValidarDatosM;

public class ValidarDatosC {

    ValidarDatosM objValidarDatosM = new ValidarDatosM();

    public boolean validarLetrasC(String cadena) {

        return objValidarDatosM.validarLetrasM(cadena);
    }

    public boolean validarNumerosC(String cadena) {
        return objValidarDatosM.validarNumerosM(cadena);
    }
}
