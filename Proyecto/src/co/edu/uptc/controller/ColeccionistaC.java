package co.edu.uptc.controller;

import co.edu.uptc.model.ColeccionistaM;

public class ColeccionistaC {

	ColeccionistaM objColeccionistaM=new ColeccionistaM();
	
	public String mtdRegistrarC(ColeccionistaM objCol) {
		return objColeccionistaM.mtdRegistrarM(objCol);
	}
	public String mtdLoginC(String e, String c) {
		return objColeccionistaM.mtdLoginM(e, c);
	}
}
