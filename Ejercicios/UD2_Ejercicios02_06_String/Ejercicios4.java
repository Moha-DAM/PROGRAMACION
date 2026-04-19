package UD2_Ejercicios02_06_String;

import java.util.Scanner;

public class Ejercicios4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in); 
		String cadena1 , cadena2 , texto = null , espacio =" " ;
		
		
		System.out.print("dame la primera cadena : ");
		cadena1 = teclado.nextLine() ; 
		
		System.out.print("dame la segunda cadena : ");
		cadena2 = teclado.nextLine() ; 
		
		texto = cadena1.concat(espacio).concat(cadena2) ;
		System.out.print(texto);
		
			
		teclado.close();
	}

}
