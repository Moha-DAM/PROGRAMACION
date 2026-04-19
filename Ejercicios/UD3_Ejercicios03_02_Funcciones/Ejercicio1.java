package UD3_Ejercicios03_02_Funcciones;

import java.util.Scanner;

public class Ejercicio1 {
	
	
	public static Scanner teclado = new Scanner(System.in); 

	public static void main(String[] args) {
		int numero ;
		
		System.out.print("Dame numero Entero  : ");
		numero= teclado.nextInt();
		
		esPar(numero);
		
	teclado.close();
	}

	
	public static int esPar(int numero) {

			if (numero%2 == 0) {
				System.out.print("El numero "+numero+" es Par ");	
			}else {
				System.out.print("El numero "+numero+" es ImPar ");
			}
	return numero;
	}
	
	
}
