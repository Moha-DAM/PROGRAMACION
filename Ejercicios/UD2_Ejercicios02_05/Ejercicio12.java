package UD2_Ejercicios02_05;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner teclado = new Scanner(System.in); 
		int  resultado;	

				for( int i = 0 ; i<=10 ; i++ ) {
					
					for( int j = 1 ; j<=10 ; j++ ) {
					 resultado = j * i ;
					System.out.println(j+ " * "+i+" = "+ resultado);	
					}
					
					System.out.println("-----------------------");
				}
				
				
		teclado.close();
	}

}
