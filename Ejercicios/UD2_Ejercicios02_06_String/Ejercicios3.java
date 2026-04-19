package UD2_Ejercicios02_06_String;

import java.util.Scanner;

public class Ejercicios3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in); 
		String texto ;  ;
		
		System.out.print("dame un texto : ");
		texto = teclado.nextLine() ; 
		
		for(int i = texto.length()-1 ; i>=0 ; i-- ) {
			System.out.print(texto.charAt(i));
		}
			
		teclado.close();
	}

}
