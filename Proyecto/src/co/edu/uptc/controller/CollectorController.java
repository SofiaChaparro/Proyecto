package src.co.edu.uptc.controller;

import src.co.edu.uptc.model.Coleccionista;
import src.co.edu.uptc.model.CollectorDetail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CollectorController {
    private Coleccionista coleccionista;
    private CollectorDetail collectorDetail;

    public CollectorController(Coleccionista coleccionista, CollectorDetail collectorDetail) {
        this.coleccionista = coleccionista;
        this.collectorDetail = collectorDetail;
    }

    public boolean registrarColeccionista(Coleccionista coleccionista) {
        if (validarColeccionista(coleccionista)) {
            collectorDetail.addColeccionista(coleccionista);
            return true;
        } else {
            return false;
        }
    }

    public void editarNombre(String nuevoNombre) {
        coleccionista.setNombre(nuevoNombre);
    }

    public void editarTelefono(String nuevoTelefono) {
        coleccionista.setTelefono(nuevoTelefono);
    }

    public void editarEmail(String nuevoEmail) {
        coleccionista.setEmail(nuevoEmail);
    }

    public void editarClave(String nuevaClave) {
        coleccionista.setClave(nuevaClave);
    }



    public boolean validarColeccionista(Coleccionista coleccionista) {// metodo para validar el coleccionista
        String password = coleccionista.getClave();
        String currentYear = "2023";
        String specialCharacters = "*@";

        boolean isValid = true;

        // Verificar que la contraseña no contenga el año actual seguido
        if (password.contains(currentYear)) {
            isValid = false;
        }

        // Verificar que la contraseña tenga al menos 8 caracteres
        if (password.length() < 8) {
            isValid = false;
        }

        // Verificar que la contraseña contenga al menos una letra mayúscula
        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
            isValid = false;
        }

        // Verificar que la contraseña contenga letras minúsculas
        if (!Pattern.compile("[a-z]").matcher(password).find()) {
            isValid = false;
        }

        // Verificar que la contraseña contenga al menos 4 números no consecutivos
        Matcher digitMatcher = Pattern.compile("(?!(\\d)\\1{3})[0-9]").matcher(password);
        int digitCount = 0;
        while (digitMatcher.find()) {
            digitCount++;
        }
        if (digitCount < 4) {
            isValid = false;
        }

        // Verificar que la contraseña contenga al menos un carácter especial (*,@)
        if (!Pattern.compile("[" + Pattern.quote(specialCharacters) + "]").matcher(password).find()) {
            isValid = false;
        }

        return isValid;
    }

    public boolean validarInicioSesion(String email, String clave) {
        for (Coleccionista coleccionista : collectorDetail.getColeccionistas()) {
            if (coleccionista.getEmail().equals(email) && coleccionista.getClave().equals(clave)) {
                return true;
            }
        }
        return false;
    }

}
