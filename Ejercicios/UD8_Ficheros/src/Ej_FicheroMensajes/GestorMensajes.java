package Ej_FicheroMensajes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorMensajes {
	
	public static Scanner teclado = new Scanner(System.in);
	private static final String NombreFichero = "FicheroMensajes.txt";
	private static final String RutaFichero = "FicherosTxt/";
	private static ArrayList <Mensaje> mensajes = new ArrayList<> ();
	
	public static void main(String[] args) {

		mostrarMenu() ;	
	}
	
	
//Metodos-------------------------------------------------------------
/**
 * 
 */
	public static void mostrarMenu() {
		int opcionMenu = 0;
	
		do {
			opcionMenu = escribirMenu();
	
			switch (opcionMenu) {
			
			case 1: cargarMensajes() ;			                            
				break;
			case 2: guardarMensajes();			                                ;
				break;
			case 3: anadirMensaje() ;                               ;
				break;
			case 4: imprimirMensajes() ;
	            break;
			case 5: System.out.println("Adios !!!");
				break;
			default:
				System.out.println("Esta opcion no deberia salir");
			}
	
		} while (opcionMenu != 5);
		
		teclado.close();
	}
/**
 * 
 */
	public static void cargarMensajes() {
	     mensajes.clear(); 

	    try{
	    	File file=new File(RutaFichero + NombreFichero) ;
		    FileReader fileReader = new FileReader(file);;
	        BufferedReader br = new BufferedReader(fileReader);

	         String fecha ;

	        while((fecha = br.readLine()) != null){

		            String hora = br.readLine()  ;
		            String de = br.readLine() ;
		            String para = br.readLine();
		            String asunto = br.readLine() ;
		            String contenido = br.readLine()  ;
		            br.readLine() ; // linea separadora ---

	           Mensaje mensaje= new Mensaje(fecha, hora, de, para, asunto, contenido);
	           mensajes.add(mensaje);
	       }

	        System.out.println("Se han cargado "+ mensajes.size()+" mensajes" );

	     } catch ( FileNotFoundException e) {
	        System.out.println("El fichero " +NombreFichero+" no existe") ;
	    } catch ( IOException e) {
	        System.out.println("Error al leer el fichero " + NombreFichero) ;
	    }
	}

/**
 * 
 */
	public static void guardarMensajes() {
	     PrintWriter pw = null;

	     try {
	        pw = new PrintWriter (RutaFichero + NombreFichero) ;
	        
	        for (Mensaje m : mensajes){
		            pw.println(m.getFecha());
		            pw.println(m.getHora());
		            pw.println(m.getDe());
		            pw.println(m.getPara());
		            pw.println(m.getAsunto());
		            pw.println(m.getContenido());
		            pw.println("---"); // separador entre mensajes ---
	        }
	         System.out.println("Los mensajes en memoria han sido guardados en el fichero FicheroMensajes.txt");

	    } catch (Exception e) {
	        System.out.println("Error al guardar los mensajes");
	    } finally {
	        
	        if (pw != null) {
	            pw.close();
	        }
	    }
	}

/**
 * 
 */
 public static void anadirMensaje() {
	    
	    System.out.print ("Fecha: ") ;
	    String fecha = teclado.nextLine();
	    
	    System.out.print("Hora: ") ;
	    String hora =teclado.nextLine();
	    
	    System.out.print("De:  " ) ;
	    String de  = teclado.nextLine() ;
	    
	    System.out.print("Para: ");
	    String para= teclado.nextLine() ;
	    
	    System.out.print("Asunto: ") ;
	    String asunto =teclado.nextLine();
	    
	    System.out.print("Contenido:  ");
	    String contenido = teclado.nextLine();
	    
	    System.out.print("Desea anadir este mensaje ? (S/N) : " ) ;
	    String confirmar= teclado.nextLine() ;
	    
	    if (confirmar.equalsIgnoreCase("S") )  {
	        
	        Mensaje nuevo = new Mensaje(fecha, hora, de, para, asunto, contenido);
	        mensajes.add(nuevo);
	        System.out.println("Mensaje anadido correctamente ");
	    } else {
	         System.out.println("Anadir mensaje cancelado ");
	    }
	 }

/**
 * 
 */
  public static void imprimirMensajes(){

	    if(mensajes.isEmpty()){
	        System.out.println("No hay mensajes que mostrar ") ;
	    }

	    System.out.printf("%-10s %-10s %-12s %-8s %-15s %-20s%n",
	                      "De", "Para", "Fecha", "Hora", "Asunto",
	                      "Contenido");

	    System.out.println("-----------------------------------------------------------------------------------");

	    for (Mensaje ms : mensajes) {
	        System.out.printf("%-10s %-10s %-12s %-8s %-15s %-20s%n",
              ms.getDe(),
              ms.getPara(),
              ms.getFecha(),
              ms.getHora(),
              ms.getAsunto(),
              ms.getContenido());
	    }
	}

/**
 * 
 * @return
 */
	public static int escribirMenu() {
		int opcion = 0;
		do {
			try {
				pintarMenu();
				System.out.print("Escoge una opcion: ");
				opcion = teclado.nextInt();
				teclado.nextLine();
			} catch (Exception e) {
				System.out.println("Error!!! Opcion incorrecta");
				teclado.nextLine();
				opcion = -1;
			}
		} while ((opcion < 1) || (opcion > 5));
		return opcion;
	}
	
/**
 * 
 */
	public static void pintarMenu() {
		System.out.println(" ");
		System.out.println("- Menu Inicial Mensages -");
		System.out.println("----------------");
		System.out.println("1. Cargar mensajes");
		System.out.println("2. Guardar mensajes");
		System.out.println("3. Añadir mensaje");
		System.out.println("4. Imprimir mensajes");
		System.out.println("5. Salir");
		System.out.println(" ");
	}
	
	

}
