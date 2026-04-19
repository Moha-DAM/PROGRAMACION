package UD3_Ejercicios03_02_Funcciones;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static Scanner teclado = new Scanner(System.in); 

	public static void main(String[] args) {
		int num ;
		boolean esPrimo = false ; 
		
		System.out.print("dame un numero entero : ");
		num= teclado.nextInt();
		esPrimo = esPrimo(num);
		
		if (!esPrimo) {
			System.out.println("El numero "+num+" es Primo ");
		}else {
			System.out.println("El numero "+num+" No es Primo ");
		}
		
	//-------------------------------------------------	
		numerosPrimos();
		
	teclado.close();
	}

	/**
	 * devuelva si ese número es primo o no
	 * @param num
	 * @return
	 */
	public static boolean  esPrimo(int num ) {
		boolean esPrimo = false ; 
		
		if(num==1){
			esPrimo = true ;
		}
		for(int i=2 ; i<num ; i++) {
			
			if(num%i==0) {
				esPrimo = true ;
			}
		}
		
	 return esPrimo ;
	}
	
	/**
	 * genere los N primeros números primos
	 */
	public static void numerosPrimos() {
		 boolean esPrimo = false ; 
		 int contador = 0 ;
		 
		 System.out.println("-----**Los primeros números primos**----- ");
		 System.out.print("dame un numero entero : ");
		 int numPrimos= teclado.nextInt();
		 
		
		for(int i= 1 ; contador<numPrimos ; i++ ) {
		
			esPrimo = esPrimo(i);
			
			if (!esPrimo) {
				System.out.println("El numero "+i+" es Primo ");
				contador++;
			}
		}
		
	}

	
}
