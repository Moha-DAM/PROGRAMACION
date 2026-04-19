package UD2_Ejercicios02_06_String;

import java.util.Scanner;

public class Ejercicios2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in); 
		String texto ; int numVeces = 0 ;
		
		System.out.print("dame un texto : ");
		texto = teclado.nextLine() ; 
		
		for(int i = 0 ; i<texto.length(); i++ ) {
			
			if (texto.charAt(i) == 'a' ) {
				numVeces++ ;
			}
		}
		
		System.out.println(" Nº veces aparece la letra 'a' : "+numVeces);
			
		teclado.close();
	}

}
