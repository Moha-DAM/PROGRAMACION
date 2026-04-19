package UD2_Ejercicios02_05;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in); 
		int nota ;
		
		System.out.print("dame una nota : ");
		nota= teclado.nextInt();
		
		if(nota>=1 && nota<=2) {
			System.out.print("Necesita mejorar ");	
		}else if(nota>=3 && nota<=4) {
			System.out.print("Necesita afianzar ");	
		}else if(nota==5) {
			System.out.print("Suficiente ");
		}else if(nota==6) {
			System.out.print("Bien ");	
		}else if(nota>=7 && nota<=8) {
			System.out.print("Muy bien ");
		}else if(nota>=9 && nota<=10) {
			System.out.print("Perfecto ");
		}else {
			System.out.print("Dato incorrecto ");	
		}
			
		teclado.close();
	}

}
