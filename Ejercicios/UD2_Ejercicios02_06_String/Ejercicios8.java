package UD2_Ejercicios02_06_String;

import java.util.Scanner;

public class Ejercicios8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in); 
		String texto ;  char espacio = ' ';
			
		System.out.print("dame el texto  : ");
		texto = teclado.nextLine().trim() ; 
		
		System.out.print(texto.charAt(0));
		for(int i = 0 ; i<texto.length() ; i++) {
			
			if(texto.charAt(i)== espacio) {
				System.out.print(texto.charAt(i+1));		
			}
		}

		
		teclado.close();
	}
}

