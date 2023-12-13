package co.edu.uptc.runner;

import java.util.Scanner;

import co.edu.uptc.view.ColeccionistaV;

public class run {
    public static void main(String[] args) {
    	
    	ColeccionistaV objColecV=new ColeccionistaV();
    	Scanner sc=new Scanner(System.in);
		int op, opA,opRegA,opLisA,opGesA,opGesCan,opGesPremio,opGesCom,idCole;
		String[] datosC=new String[2];
		String res;

    	
    	do {
    		System.out.println("Menu\n1.Registrar Coleccionista \n2.Login\n12.Salir ");
    		op=sc.nextInt();
    		switch(op) {
    		case 1:
				System.out.println("----------------------");

    			objColecV.mtdRegistrarCo();
    			break;
    		case 2:
				System.out.println("----------------------");

    			res=objColecV.mtdLogin();
    			if(res!="") {
    				datosC=res.split(",");
    				idCole=Integer.parseInt(datosC[1]);
    				
    				do {
    					System.out.println(" BIENVENIDO "+datosC[0]+"--"+idCole);
        				System.out.println("Menu\n1.Registrar Album \n2.Listar Album \n3.Eliminar Album\n12.Salir");
        				opA=sc.nextInt();
        				
        				switch(opA) {
        				case 1: 

        					System.out.println("Registrar Album");
        					
        					
                				do {
                					System.out.println("\n1.Registrar Canciones Al Album \n2.Registrar Premios\n12.Salir");
                    				opRegA=sc.nextInt();
                					switch(opRegA) {
                    				case 1:
                    						
                    						System.out.println("Registrar Cancion");
                    					
                    					break;
                    				case 2:
                                          
                    						
                    						System.out.println("Registrar Premio");
                            				
                    					
                    					break;
                    				
                    				}
                				}while(opRegA!=12);
                			
                				
        					
            				


        				     break;
        				case 2:
        					System.out.println("Listar Album ");
        					
        					System.out.println("\n1.Seleccionar album\n12.Salir ");
        					opLisA=sc.nextInt();
        					while(opLisA==1) {
        						//Datos Album
        						do {
        							
        							System.out.println("\n1.Gestion Canciones\n2.Gestion Premios\n3.Gestion Comentarios\n12.Salir");
                					opGesA=sc.nextInt();
                					switch(opGesA) {
                					case 1:
                						do {
                							//Listar Canciones;
                    						System.out.println("Gestion Canciones\n1.Registrar Canciones\n2.Editar Canciones\n3.Eliminar canciones\n12.Salir");
                						    opGesCan=sc.nextInt();
                						    switch(opGesCan) {
                						    case 1:
                						    	System.out.println("Registrar Canciones");
                						    	break;
                						    case 2:
                						    	System.out.println("Editar Canciones");

                						    	break;
                						    case 3:
                						    	System.out.println("Eliminar Canciones");

                						    	break;
                						    }
                						}while(opGesCan!=12);
                						
                						break;
                					case 2:
                						do {
                							System.out.println("Gestion Premio\n1.Registrar Premio\n2.Editar Premio\n3.Eliminar Premio\n12.Salir");
                						    opGesPremio=sc.nextInt();
                						    //Listar Premio
                						    switch(opGesPremio) {
                						    case 1:
                						    	System.out.println("Registrar Premio");
                						    	break;
                						    case 2:
                						    	System.out.println("Editar Premio");

                						    	break;
                						    case 3:
                						    	System.out.println("Eliminar Premio");

                						    	break;
                						    }
                						    
                						}while(opGesPremio!=12);
                						break;
                					case 3:
                						do {
                							System.out.println("Gestion Comentario\n1.Registrar Comentario\n2.Eliminar Comentario\n12.Salir");
                						    opGesCom=sc.nextInt();
                						    //Listar Comentario
                						    switch(opGesCom) {
                						    case 1:
                						    	System.out.println("Registrar Comentario");
                						    	break;
                						    case 2:
                						    	System.out.println("Eliminar Comentario");
                						    	break;
                						 
                						    
                						    }
                							
                						}while(opGesCom!=12);
                						
                						break;
                					}
        							
        						}while(opGesA!=12);
        						
            					
            					
            					System.out.println("\n1.Seleccionar album\n12.Salir ");
            					opLisA=sc.nextInt();
        					}
        					
        					break;
        					
        				case 3:
        					System.out.println("Eliminar Album");
        					
        					
        					break;
        				     
        				   
        				
        				
        				}
        				        				
        				///Coleccionista
    					
    				}while(opA!=12);
    				
    			
 
    			}
    			break;
    		}
    	
    		
    		
    		
    		
    	}while(op!=12);
    	
    	
    	
    }

}
