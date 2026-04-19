package UD2_Ejercicios02_05;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		int num ;
		
		System.out.print("dame un numero : ");
		num= teclado.nextInt();
		
		switch(num) {
		
		case 1 : System.out.print("Hoy es Lunes ");
			break;
		case 2 : System.out.print("Hoy es Martes ");
			break;
		case 3 : System.out.print("Hoy es Miercoles ");
			break;
		case 4 : System.out.print("Hoy es Jueves ");
			break;
		case 5 : System.out.print("Hoy es Viernes ");
			break;
		case 6 : System.out.print("Hoy es Sabado ");
			break;
		case 7 : System.out.print("Hoy es Domingo ");
			break;
		}
		
	teclado.close();	
	}

}
