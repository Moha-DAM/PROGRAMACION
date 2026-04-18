package Reto1_G4;

import java.util.Scanner;

public class Administrador {

    static Scanner teclado = new Scanner(System.in);
    static String usuarioCorrecto = "admin";
    static int passwordCorrecto = 123;

    static String[] tipos = new String[50];
    static String[] nombres = new String[50];
    static double[] precios = new double[50];
    static int[] codigos = new int[50];
    static int codigo = 0 ;
    static int cantidad = 0  ;
/**
 * Metodo principal. Controla el flujo general del programa.
 * Se encarga del inicio de sesion y del acceso al menu principal.
 * 
 * @param args Argumentos de linea de comandos (no utilizados).
 */
    public static void main(String[] args) {
    	boolean valido = false;
    	

        while (valido == false) {
            bienvenida();
            valido = login() ;
            
            if (valido == true) {        
                	menuPrincipal();
                	bienvenida();
            }else {
                System.out.println("Volviendo al INICIO...\n");
            }
        }

    }
/**
 * Muestra un mensaje de bienvenida al usuario.
 */
    public static void bienvenida() {
        System.out.println("\n*******************************");
        System.out.println(" Bienvenida a Elorrieta Vending ");
        System.out.println("*******************************");
    }

/**
 * Realiza el proceso de inicio de sesion del administrador.
 * 
 * @return true si las credenciales son correctas, false en caso contrario.
 */
    public static boolean login() {
        boolean correcto = false;
        int password=0;
        String usuario;
            System.out.println("\n--- INICIO DE SESION ADMINISTRADOR ---");

            System.out.print("Usuario: ");
            usuario = teclado.nextLine().trim();
            
            do {
	            try {
		            System.out.print("Contrasena: ");
		            password = teclado.nextInt();  
		            teclado.nextLine();
		            
	            }catch(Exception e) {
	            	System.out.println("\nError!! contraseña incorrecta, hay que introducir numeros enteros");
	            	teclado.nextLine();
	            	password=-1;
	            }
            }while(password<0);
            
	            if (usuario.equals(usuarioCorrecto) && password == passwordCorrecto) {
	                System.out.println("Acceso correcto");
	                correcto = true; 
	            } else {
                System.out.println("\nUsuario O Contraseña incorrectos !!");
            }
            
        return correcto;
    }
/**
 * Muestra el menu principal del administrador.
 */
   public static void pintarMenuPrincipal() {
	   System.out.println(" ");
       System.out.println("*** MENU ADMINISTRADOR ***");
       System.out.println("1. Nuevo producto");
       System.out.println("2. Modificar producto");
       System.out.println("3. Eliminar producto");
       System.out.println("4. Salir");
   	   System.out.println(" ");
   }
/**
* Permite al usuario elegir una opcion del menu principal.
* 
* @return la opcion seleccionada (entre 1 y 4).
*/
   
   public static int opcionMenuPrincipal() {
	   int opcion = 0 ;
	   do {
		   try {
			   System.out.print("Elige una opcion : ");
		       opcion = teclado.nextInt();
		       teclado.nextLine();
			       if(opcion<1 || opcion>4) {
			    	   System.out.println("\nOpcion NO valida !! ");
			       }
		   }catch(Exception e) {
			   System.out.println("\nERROR !! debe Introducir un Numero Entero... ");
			   teclado.nextLine();
			   opcion = 0 ;
		   }
	   }while(opcion<1 || opcion>4);
	   
	return opcion;   
   }
/**
* Controla el flujo del menu principal del programa.
*/  
    public static void menuPrincipal() {
    	int opcion = 0 ;

        do {
        	pintarMenuPrincipal();
        	opcion = opcionMenuPrincipal();

            switch (opcion) {
                case 1: nuevoProducto();
                    break;
                case 2: modificarProducto();
                    break;
                case 3: eliminarProducto();
                    break;
                case 4: System.out.println("--> Saliendo del Menu Administrador...");
                    break;
            }
            
        }while (opcion!=4);
    }


  //-----------------------NUEVO PRODUCTO-----------------------------------------------------------------------------------------
    /**
     * Genera un nuevo codigo unico para un producto.
     * 
     * @return el nuevo codigo generado.
     */
    public static int nuevoCodigo() {
          codigo++ ;
        
      return codigo ;
    }
/**
 * Permite registrar un nuevo producto solicitando sus datos al usuario.
 */   
    public static void nuevoProducto() {
        System.out.println("\n--- NUEVO PRODUCTO ---");

        String tipo = pedirTipo();
        String nombre = pedirNombre();
        double precio = pedirPrecio();
        int codigo = nuevoCodigo();

        tipos[cantidad] = tipo;
        nombres[cantidad] = nombre;
        precios[cantidad] = precio;
        codigos[cantidad] = codigo;
        cantidad++;
        System.out.println("\n El Producto ha Anadido con Exito");
        mostrarProductos();
        
        System.out.println("--> Volviendo al Menu Administrador...");
    }

 //-----------------------MOSTRAR PRODUCTO-----------------------------------------------------------------------------------------  
    /**
     * Muestra todos los productos actualmente registrados.
     */
    public static void mostrarProductos() {
    	System.out.println(" ");
	    System.out.println("-------------> Los Productos Disponible <------------- ");
        for (int i = 0; i < cantidad; i++) {
        	 System.out.println("Codigo : "+codigos[i] + " | Tipo : " + tipos[i] + " | Nombre : " + nombres[i] + " | Precio : " + precios[i] + " €");
        }
    	System.out.println("------------------------------------------------------");
    }
    
 //-----------------------MODIFICAR PRODUCTO-----------------------------------------------------------------------------------------
/**
 * Muestra el menu de opciones para modificar un producto.
 */   
    public static void pintarMenuModificarProd() {
	    System.out.println(" ");
	    System.out.println("--- MODIFICAR PRODUCTO ---");
	    System.out.println("1. Modificar Nombre");
	    System.out.println("2. Modificar Precio");
	    System.out.println("3. Modificar Tipo");
	    System.out.println(" ");
    }
/**
 * Permite elegir una opcion del menu de modificacion.
 * 
 * @return la opcion seleccionada (1-3).
 */   
    public static int opcionMenuModificarProd() {
 	   int opcion = 0 ;
 	   do {
 		   try {
 			   System.out.print("Elige una opcion : ");
 		       opcion = teclado.nextInt();
 		       teclado.nextLine();
 			       if(opcion<1 || opcion>3) {
 			    	   System.out.println("\nOpcion NO valida !! ");
 			       }
 		   }catch(Exception e) {
 			   System.out.println("\nERROR !! debe Introducir un Numero Entero... ");
 			   teclado.nextLine();
 			   opcion = 0 ;
 		   }
 	   }while(opcion<1 || opcion>3);
 	   
 	return opcion;   
    }
/**
 * Muestra el menu para seleccionar un producto a modificar.
 */    
    public static void pentarMenuSeleccionarProd() {
    	mostrarProductos();
    	System.out.println(" ");
    	System.out.println("1. Seleccionar uno de los productos");
    	System.out.println("0. Volver al Menu Principal");
    	System.out.println(" ");
    }
/**
 * Permite seleccionar si se modificara un producto o se volvera al menu.
 * 
 * @return la opcion seleccionada (0 o 1).
 */  
    public static int opcionSeleccionarProd() {
  	   int opcion = 0 ;
  	   do {
  		   try {
  			   System.out.print("Elige una opcion : ");
  		       opcion = teclado.nextInt();
  		       teclado.nextLine();
  			       if(opcion<0 || opcion>1) {
  			    	   System.out.println("\nOpcion NO valida !! ");
  			       }
  		   }catch(Exception e) {
  			   System.out.println("\nERROR !! debe Introducir un Numero Entero... ");
  			   teclado.nextLine();
  			   opcion = -1 ;
  		   }
  	   }while(opcion<0 || opcion>1);
  	   
      return opcion;   
     }
/**
 * Solicita al usuario el codigo de un producto.
 * 
 * @return el codigo introducido.
 */    
    public static int pedirCodigo() {
   	   int codigo = 1 ;
   	   do {
   		   try {
	   			System.out.print("--> Dame el Codigo del producto : ");
	            codigo = teclado.nextInt();   
   		        teclado.nextLine();
   		        	if(codigo < 1) {
   		        		System.out.println("\nEl Codigo debe ser mayor que 0");
   		        	}
   		   }catch(Exception e) {
   			   System.out.println("\nERROR !! debe Introducir un Numero Entero... ");
   			   teclado.nextLine();
   			   codigo = 0 ;
   		   }
   	   }while(codigo < 1);
   	   
       return codigo;   
      } 
/**
 * Busca la posicion de un producto en los arrays segun su codigo.
 * 
 * @return la posicion del producto en los arrays.
 */   
    public static int posicionProducto() {
    	boolean  encontrado = false ;
        int pos = -1 ;
	        
        do {
            int codigo = pedirCodigo();
	        for (int i = 0; i < cantidad; i++) {
	            if (codigos[i] == codigo) {
	                pos = i;
	                encontrado = true ;
	                break;
	            }
	        }
	        if(encontrado==false) {
	        	System.out.println("\nERROR!! El Producto NO Encontrado !! ");
           }
	        
        }while(encontrado==false);
    	
    
     return pos ;
    }
/**
 * Comprueba si una cadena solo contiene letras.
 * 
 * @param NombreTipo la cadena a comprobar.
 * @return true si es valida, false si contiene numeros o esta vacia.
 */    
    public static boolean comprobarString(String NombreTipo ) {
    	boolean valido = false ;
    	for (int i = 0 ; i<NombreTipo.length() ; i++) {
	    	valido = true ;
	    		if(Character.isDigit(NombreTipo.charAt(i))) {
	    			valido = false ;
	    			break;
    		}	
    	}
    	
    	if( (valido == false) || (NombreTipo.isEmpty()) ) {
    		 System.out.println("\nERROR!! Solo las letras son Validas");
    	}
    
     return valido ;
    }
/**
 * Solicita el nombre del producto.
 * 
 * @return el nombre introducido.
 */  
    public static String pedirNombre() {
      String nombre = null; 
      boolean valido = false ;
	    do {
	   	 System.out.print("--> Dame el Nombre : ");
	        nombre = teclado.nextLine();
	        valido = comprobarString(nombre);
	 
	    }while( (valido == false) || (nombre.isEmpty()) );
    
    return nombre ;
    }
/**
 * Solicita el tipo del producto.
 * 
 * @return el tipo introducido.
 */    
    public static String pedirTipo() {
        String tipo = null; 
        boolean valido = false ;
  	    do {
  	   	 System.out.print("--> Dame el Tipo : ");
  	   	 	tipo = teclado.nextLine();
  	        valido = comprobarString(tipo);
  	 
  	    }while( (valido == false) || (tipo.isEmpty()) );
      
      return tipo ;
      }
/**
 * Solicita el precio del producto.
 * 
 * @return el precio introducido.
 */ 
    public static double pedirPrecio() {
    	 double precio = 0 ;
    	 do {
        	 try {
                 System.out.print("--> Dame el Precio : ");
                 String precioString = teclado.nextLine();
                 precio = Double.parseDouble(precioString);
                
                   if(precio<=0) {
                	   System.out.println("\nEl Precio debe ser mayor que 0");
                   }
             }catch(Exception e) {
            	 System.out.println("\nERROR! Debe Introducir un Numero ");
            	 precio = -1 ;
             }
    	 }while(precio<=0);

     return precio ;
    }
/**
 * Permite modificar los datos de un producto existente.
 */  
    public static void modificarProducto() {
    	 int  pos = 0 , opcionSel = 0;
    	 
         if (cantidad == 0) {
       	  System.out.println("\n--> No hay Productos Disponibles para Modificar !!");
         }else {
   				pentarMenuSeleccionarProd();
   		        opcionSel = opcionSeleccionarProd();
   			       
   		    	switch(opcionSel) {
   			    	case 1 : 
   			    			 pos = posicionProducto();
   			    			 pintarMenuModificarProd();
   					         int opcionMod = opcionMenuModificarProd();
   			
   						         switch (opcionMod) {
   						             case 1:
   							                 String nombre = pedirNombre() ;
   							                 nombres[pos] = nombre;  							      
   							               break;
   						             case 2:
   						            	 	 double precio = pedirPrecio() ;
   						            	 	 precios[pos] = precio;
   							               break;
   						             case 3:
   							            	 String tipo = pedirTipo() ;
   							                 tipos[pos] = tipo;							                
   							               break;               
   						         }
   						     System.out.println("\n El Producto ha Modificado con Exito");	
   						     System.out.println("\n--> Lista de Productos Actualizada :");	
   						     mostrarProductos() ; 
   							 System.out.println("\n--> Volviendo al Menu Administrador...");
   							
   					    break ;
   			    	case 0 : System.out.println("--> Saliendo del Menu Modificar Producto...");
   			    		break;
   		    	}
         }
    } 	

//-----------------------ELIMINAR PRODUCTO-----------------------------------------------------------------------------------------
/**
 * Permite eliminar un producto existente.
 */   

    public static void eliminarProducto() {
    	int  pos = 0 , opcionSel = 0;
    	
    	 if (cantidad == 0) {
     		  System.out.println("\n--> No hay Productos Disponibles para Eliminar !!");
	      }else {
	    	    pentarMenuSeleccionarProd();
 		        opcionSel = opcionSeleccionarProd();
 		       switch(opcionSel) {
			    	case 1 :  
			    			pos = posicionProducto();
			    			System.out.println("\n El Producto ha Eliminado con Exito");	

				    	  	 for (int i = pos; i < cantidad - 1; i++) {
			    	            nombres[i] = nombres[i + 1];
			    	            tipos[i] = tipos[i + 1];
			    	            precios[i] = precios[i + 1];
			    	            codigos[i] = codigos[i + 1];
				    	        }
				    	  	 
				    	  	 cantidad--;
			
						     System.out.println("\n--> Lista de Productos Actualizada :");	
						     mostrarProductos() ; 
							 System.out.println("\n--> Volviendo al Menu Administrador...");
						break ;
						
   			    	case 0 : System.out.println("--> Saliendo del Menu Eliminar Producto...");
   			    		break;
   		    	}
	      }
     }
    
}
