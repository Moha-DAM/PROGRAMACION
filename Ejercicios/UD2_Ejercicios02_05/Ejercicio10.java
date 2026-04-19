package UD2_Ejercicios02_05;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in); 
		int numero, resultado;
		
		System.out.print("Dame un numero  : ");
		numero= teclado.nextInt();
		
		System.out.println("----------------------------------------");
		System.out.println("Tabla de multiplicar del número :"+numero);
		System.out.println("----------------------------------------");
			
System.out.println("---> Con WHILE  "); 
		int i = 0 ;
		while(i<=10) {
			
			resultado = numero * i ;
			System.out.println(numero+ " * "+i+" = "+ resultado);	
			i++;
		}
		
System.out.println("******************");
System.out.println("---> Con DO WHILE "); 
		int j = 0 ;
		do {
			resultado = numero * j ;
			System.out.println(numero+ " * "+j+" = "+ resultado);	
			j++;
		}while(j<=10);
		
System.out.println("******************");
System.out.println("---> Con FOR ");
		for( int k = 0 ; k<=10 ; k++ ) {
			 
			 resultado = numero * k ;
			System.out.println(numero+ " * "+k+" = "+ resultado);	
		}
		
		
		teclado.close();
	}

}
