package co.edu.uptc.controller;

import co.edu.uptc.model.ComentarioM;

public class ComentarioC {

    ComentarioM objCome = new ComentarioM();

    public String mtdRegistrarC(ComentarioM objCom) {
        return objCome.mtdRegM(objCom);
    }

    public String mtdEliminarC(int clas) {
        return objCome.mtdEliminarM(clas);
    }

}
