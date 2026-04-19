package Ejercicio02_03;

import java.io.*;

public class Ejercicio03 {

    public static void main(String[] args) {

    	File fichero = new File("infoRecurso.txt");

    	if(!fichero.exists()){

    	 System.out.println("El fichero no existe!! ");

    	}else{
    	    try{
    	        FileReader fr = new FileReader("infoRecurso.txt");
    	        BufferedReader br= new BufferedReader(fr) ;

    	         String linea ;
    	        
    	        while((linea = br.readLine()) != null){
    	            System.out.println(linea) ;
    	            
    	        }

    	         br.close() ;

    	    }catch (IOException e){
    	        System.out.println("Error al leer el fichero!! ");
    	    }
    	}

    }
 }

