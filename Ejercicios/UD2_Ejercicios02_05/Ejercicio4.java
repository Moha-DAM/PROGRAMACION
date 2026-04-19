package UD2_Ejercicios02_05;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in); 
		 int num1 , num2 , num3 ;
			
			System.out.print("dame el numero 1 : ");
			num1= teclado.nextInt();
			
			System.out.print("dame el numero 2 : ");
			num2= teclado.nextInt();
		
			System.out.print("dame el numero 3 : ");
			num3= teclado.nextInt();
		
		if(num1>num2 && num1>num3 ) {
			
			System.out.println("El numero "+ num1 + " es el Mayor ");

		}else if (num2>num1 && num2>num3 ){
			System.out.println("El numero "+ num2 + " es el Mayor ");
			
			}else {
				System.out.println("El numero "+ num3 + " es el Mayor ");
			}
			
		
		teclado.close();	
	}

}
