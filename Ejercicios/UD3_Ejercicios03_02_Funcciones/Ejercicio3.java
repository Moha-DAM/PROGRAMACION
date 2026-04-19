package UD3_Ejercicios03_02_Funcciones;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static Scanner teclado = new Scanner(System.in); 

	public static void main(String[] args) {
		int num1, num2 ;
		
		System.out.print("dame el numero 1 : ");
		num1= teclado.nextInt();
		
		System.out.print("dame el numero 2 : ");
		num2= teclado.nextInt();
		
		esMayor(num1 , num2);
		
	teclado.close();
	}

	
	public static int  esMayor(int num1 , int num2) {
		int numMayor=0 ;
			
			if (num1>num2) {
				System.out.println("El numero "+ num1 + " es el mayor ");
				numMayor = num1 ;
			}else if (num2>num1) {
				System.out.println("El numero "+ num2 + " es el mayor ");
				numMayor = num2;
				}else {
					System.out.println("Los dos numeros "+ num1 + " y "+num2+" son eguales ");
				}
	 return numMayor ;
	}
	
	
}
