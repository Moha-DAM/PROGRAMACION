package UD3_Ejercicios03_02_Funcciones;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static Scanner teclado = new Scanner(System.in); 

	public static void main(String[] args) {

		numParImpar();		
	teclado.close();
	}

	
	public static void numParImpar() {

		int numero ,  i= 0 , numPar=0 , numImpa=0 ;
		System.out.println("cuántos Numeros son pares y cuántos impares" );
		while (i < 10 ) {
			
			numero = (int) (Math.random()*100);
			System.out.println(numero);
			
				if (numero%2 == 0) {
					numPar++ ;	
				}else {
					numImpa++;
				}
			i++;	
		}
		System.out.println("-------------------------------- " );
		System.out.println("El numero de Pares es  : "+numPar );
		System.out.println("El numero de ImPares es  : "+numImpa );
	}
	
	
}
