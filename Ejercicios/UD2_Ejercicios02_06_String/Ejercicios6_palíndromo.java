package UD2_Ejercicios02_06_String;

import java.util.Scanner;

public class Ejercicios6_palíndromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in); 
		String cadena ; int diferencia = 0 ;
			
		System.out.print("dame un cadena de caracteres : ");
		cadena = teclado.nextLine().trim() ; 
		 // quitar espacios 
		cadena = cadena.replace(" ", "").toLowerCase();
		
	    	for(int k = 0 ; k<cadena.length(); k++) {
	    		int i = 0 , j = 0 ;
	    		
	    		for( i = cadena.length()-1 ; i>=0 ; i--) {
	    		
	    		    if(cadena.charAt(i) != cadena.charAt(j)) {
	    		    	diferencia++;
	    		    }
	    		    j++;
	    		}
	    	}
	    	
	    	if(diferencia==0) {
	    		System.out.println("la cadena de caracteres es un palíndromo ");
	    	}else {
	    		System.out.println("la cadena de caracteres NO es un palíndromo ");
	    	}
		
		teclado.close();
	}

}

