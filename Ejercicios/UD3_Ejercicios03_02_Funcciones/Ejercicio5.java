package UD3_Ejercicios03_02_Funcciones;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static Scanner teclado = new Scanner(System.in); 
	
	
//MAIN--------------------------------------------------------------------------
	public static void main(String[] args) {
		
		int opcion;
		double num1=0 , num2=0  ;
		
		do {
			pintarMenu();
			opcion = menuOpcion() ;
			
			if (opcion!=5) {
				num1 = pedirNumero();
				num2 = pedirNumero();
			}
			
			switch (opcion) {
			
			case 1: 	suma(num1,num2) ;
				break;
			case 2: 	resta(num1,num2) ;
				break;
			case 3: 	multiplicación(num1,num2) ;
				break;
			case 4: 	división(num1,num2) ;
				break;
			case 5: System.out.println("Adios! ");
			}
			
		}while(opcion!=5);
		
		
	teclado.close();
	}

//METODOS :----------------------------------------------------------------
/**
 * 
 */
	public static void pintarMenu() {

		System.out.println("------------------ ");
		System.out.println("Calculadora");
		System.out.println("------------------ ");
		System.out.println("1. Suma ");
		System.out.println("2. Resta ");
		System.out.println("3. Producto ");
		System.out.println("4. División ");
		System.out.println("5. Salir ");
		System.out.println(" ");
	}
/**
 * 	
 * @return
 */
	public static int menuOpcion() {	
		int opcion=0;
		do {
			try {
				System.out.print("Introduce la opción deseada de 1 a 5 : ");
				opcion= teclado.nextInt();
				teclado.nextLine();
				
				if((opcion<1) ||( opcion>5)) {
					System.out.println("Opcion fuera del rango 1-5 !!!! ");
				}
			
			}catch (Exception e) {
				System.out.println("ERROR!! Opcion NO valida!! ");
				teclado.nextLine();
				opcion = -1 ;		
			}
		}while((opcion<1) ||( opcion>5));
	
	return opcion;
	}
	/**
	 * 
	 * @return
	 */
	public static int pedirNumero() {
		int numero=0;
		do {
			try {
				System.out.print("Dame un numero  : ");
				numero= teclado.nextInt();
				teclado.nextLine();
				
				if(numero<0) {
					System.out.println("El Numero es Negativo !!!! ");
				}
			}catch(Exception e) {
				System.out.println("Numero NO valido!! ");
				teclado.nextLine();
				numero = -1 ;
			}
			
		}while(numero<0);
			
		return numero ;
	}
/**
 * 
 * @param num1
 * @param num2
 * @return
 */
	public static double suma(double num1 , double num2) {
		double resultado = 0 ;
		resultado = num1 + num2;
		System.out.println("La suma "+num1+" + "+num2+" = "+resultado);
		return resultado ;
	}
/**
 * 
 * @param num1
 * @param num2
 * @return
 */
	public static double resta(double num1 , double num2) {
		double resultado = 0 ;
		resultado = num1 - num2;
		System.out.println("La Resta "+num1+" - "+num2+" = "+resultado);
		return resultado ;
	}
/**
 * 	
 * @param num1
 * @param num2
 * @return
 */
	public static double multiplicación(double num1 , double num2) {
		double resultado = 0 ;
		resultado = num1 * num2;
		System.out.println("La Producto "+num1+" * "+num2+" = "+resultado);
		return resultado ;
	}
/**
 * 
 * @param num1
 * @param num2
 * @return
 */
	public static double división(double num1 , double num2) {
		double resultado = 0 ;
		if (num2!=0) {
			resultado = num1 / num2;
			System.out.println("La División "+num1+" / "+num2+" = "+resultado);

			}else {
				System.out.println("ERROR!!! no se puede dividir entre 0");
			}
		return resultado ;
	}
	
}
