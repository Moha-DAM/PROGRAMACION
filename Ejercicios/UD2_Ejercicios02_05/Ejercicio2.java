package UD2_Ejercicios02_05;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		int edad ;
		
		System.out.print("dame un edad : ");
		edad= teclado.nextInt();

		if(edad>=18) {
			System.out.print("es mayor de edad . ");
		}else {
			System.out.print("es menor de edad . ");
		}
		
		teclado.close();
	}

}
