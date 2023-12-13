package co.edu.uptc.runner;

import java.util.Scanner;

import co.edu.uptc.view.ColeccionistaV;

public class run {
    public static void main(String[] args) {
    	int opcion,opcion2;
    	Scanner datos = new Scanner(System.in);
       ColeccionistaV login= new ColeccionistaV();
       
       System.out.println("BIENVENIDO");
       do {
    	   System.out.println("1. desea registarse");
           System.out.println("2. desea iniciar sesion");
         opcion= datos.nextInt();
          switch(opcion) {
          case 1:
        	  login.mtdRegistrarCo();
        	  break;
          case 2:
        	  login.mtdRegistrarCo();
              System.out.println("1. desea crear album");
              System.out.println("2. desea ver albunes");
              System.out.println("3. Salir");
              opcion2=datos.nextInt();
          
        	  switch (opcion2) {
        	  case 1:
            	  break;
        	  case 2:
        		  break;
        	  case 3:
        		  break;
        
        	
            	
        	  }
        
        	  break;
          case 3:
        	  break;
        	  
          }
       }while(opcion<3);
      
    }

}
