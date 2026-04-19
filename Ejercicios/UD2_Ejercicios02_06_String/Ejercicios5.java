package UD2_Ejercicios02_06_String;

import java.util.Scanner;

public class Ejercicios5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in); 
		String cadena1 , cadena2  ;
		
		
		System.out.print("dame la primera cadena : ");
		cadena1 = teclado.nextLine() ; 
		
		System.out.print("dame la segunda cadena : ");
		cadena2 = teclado.nextLine() ; 
		
      if (cadena1.equalsIgnoreCase(cadena2)) {
    	  System.out.println("las cadenas son iguales ");  
      }else {
    	  System.out.println("las cadenas NO son iguales ");  
      }

			
		teclado.close();
	}

}
