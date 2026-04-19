package UD2_Ejercicios02_05;

import java.util.Scanner;

public class Ejercicio8_calculadora {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		int opcion;
		double num1 , num2 ,resultado = 0  ;
		
		do {
			System.out.println("------------------ ");
			System.out.println("Calculadora");
			System.out.println("------------------ ");
			System.out.println("1. Suma ");
			System.out.println("2. Resta ");
			System.out.println("3. Producto ");
			System.out.println("4. División ");
			System.out.println("5. Salir ");
			System.out.println(" ");
			
			System.out.print("Introduce la opción deseada : ");
			opcion= teclado.nextInt();
			
			System.out.print("Dame el numero 1 : ");
			num1= teclado.nextInt();
	
			System.out.print("Dame el numero 2 : ");
			num2= teclado.nextInt();
			
				switch (opcion) {
				
				case 1: resultado = num1 + num2;
					System.out.println("La suma "+num1+" + "+num2+" = "+resultado);
					break;
				case 2: resultado = num1 - num2;
					System.out.println("La Resta "+num1+" - "+num2+" = "+resultado);
					break;
				case 3: resultado = num1 * num2;
					System.out.println("La Producto "+num1+" * "+num2+" = "+resultado);
					break;
				case 4: 
					if (num2!=0) {
					resultado = num1 / num2;
					System.out.println("La División "+num1+" / "+num2+" = "+resultado);

					}else {
						System.out.println("ERROR!!!");
					}
					break;
				case 5: System.out.println("Adios! ");
				}
			
		}while(opcion!=5);
		
	teclado.close();
	}
	
}
