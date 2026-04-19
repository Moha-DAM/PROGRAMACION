package UD2_Ejercicios02_05;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in); 
		int nota ;
		
		System.out.print("dame una nota : ");
		nota= teclado.nextInt();
		
		switch(nota) {
		
			case 1,2 : 
				System.out.print("Necesita mejorar ");
			break;
			
			case 3,4 : 
				System.out.print("Necesita afianzar ");
			break;
			
			case 5 : 
				System.out.print("Suficiente ");
			break;
			
			case 6 : 
				System.out.print("Bien ");
			break;
			
			case 7,8 : 
				System.out.print("Muy bien ");
			break;
			
			case 9,10 : 
				System.out.print("Perfecto ");
			break;
			
			default : 
				System.out.print("Dato incorrecto ");
				break;
		}
		
		
		teclado.close();
	}
		
}
