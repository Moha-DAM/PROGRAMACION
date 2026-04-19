package UD2_Ejercicios02_05;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		double sueldo ;
		
		System.out.print("dame un sueldo : ");
		sueldo= teclado.nextDouble();
		
		if (sueldo>3000) {
			System.out.print("debe abonar impuestos ");	
		}
	
		teclado.close();
	}

}
