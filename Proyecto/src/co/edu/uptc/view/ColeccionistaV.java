package src.co.edu.uptc.view;

import src.co.edu.uptc.controller.ColeccionistaC;
import co.edu.uptc.controller.ValidarDatosC;
import co.edu.uptc.model.ColeccionistaM;

import java.util.Scanner;

public class ColeccionistaV {

    public static Scanner sc = new Scanner(System.in);

    public static ValidarDatosC objValidacion = new ValidarDatosC();
    public static ColeccionistaM objColecc = new ColeccionistaM();
    public static ColeccionistaC objColeccC = new ColeccionistaC();

    public static void main(String args[]) {
        mtdRegistrarCo();
        mtdLogin();

    }

    public static void mtdRegistrarCo() {


        String nombre, telefono, email, clave;
        int con;
        boolean validarL = false, validarN = false, validarClave = false, validarMa = false, validarMinu = false, validarE = false, validarNum = false;

        System.out.println("Digite su nombre");
        nombre = sc.next();
        validarL = objValidacion.validarLetrasC(nombre);

        System.out.println("Digite su telefono");
        telefono = sc.next();
        validarN = objValidacion.validarNumerosC(telefono);

        System.out.println("Digite su email");
        email = sc.next();

        System.out.println("Digite una clave de 8 caracteres");
        clave = sc.next();


        do {

            System.out.println("------------------------------------------");

            if (validarL == false) {
                System.out.println("No se permiten numeros en el nombre");
                System.out.println("Digite su nombre");
                nombre = sc.next();
                validarL = objValidacion.validarLetrasC(nombre);
            }
            if (validarN == false) {
                System.out.println("No se permiten letras en el telefono");
                System.out.println("Digite su telefono");
                telefono = sc.next();
                validarN = objValidacion.validarNumerosC(telefono);

            }
            if (clave.length() == 8) {
                for (int i = 0; i < clave.length(); i++) {
                    if (clave.charAt(i) >= 'a' && clave.charAt(i) <= 'z') {
                        validarMinu = true;
                    }

                    if (clave.charAt(i) >= 'A' && clave.charAt(i) <= 'Z') {
                        validarMa = true;
                    }

                    if (clave.charAt(i) == '!' || clave.charAt(i) == '@') {
                        validarE = true;

                    }
                    if (clave.charAt(i) >= '0' && clave.charAt(i) <= '9') {
                        validarNum = true;

                    }

                }
                if (validarMinu == true && validarMa == true && validarE == true && validarNum == true) {
                    validarClave = true;
                }
            } else {
                validarClave = false;
            }
            if (validarClave == false) {
                System.out.println("Clave debe tener 8 caracteres, minimo un numero, una letra mayuscula y minuscula y un caracter especial ! o @");
                System.out.println("Digite una clave de 8 caracteres");
                clave = sc.next();
            }

        } while (validarL == false || validarN == false || validarClave == false);

        objColecc.setNombre(nombre);
        objColecc.setTelefono(telefono);
        objColecc.setEmail(email);
        objColecc.setClave(clave);

        System.out.println(objColeccC.mtdRegistrarC(objColecc));


    }

    public static void mtdLogin() {
        String email, clave;
        System.out.println("Digite su email");
        email = sc.next();

        System.out.println("Digite su clave");
        clave = sc.next();
        System.out.println(objColeccC.mtdLoginC(email, clave));
    }

}