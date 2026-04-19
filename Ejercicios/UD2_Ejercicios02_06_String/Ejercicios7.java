package UD2_Ejercicios02_06_String;

import java.util.Scanner;

public class Ejercicios7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in); 
		String oracion ;  char espacio = ' ';
		int numEspacio = 0 , numPalabra = 0 ;
			
		System.out.print("dame la oracion  : ");
		oracion = teclado.nextLine().trim() ; 
	
		for(int i = 0 ; i<oracion.length() ; i++) {
			if(oracion.charAt(i)== espacio) {
				numEspacio++;	
			}
		}
		numPalabra = numEspacio + 1;

		System.out.print("La oracion tiene "+numPalabra+" palabras ");
		
		teclado.close();
	}

}

