package UD2_EjerciciosExtra;

import java.util.Scanner;

public class Ejercicio1 {

		//Simulador de Cajero Automático
		// declaracion variables
		public static Scanner teclado = new Scanner(System.in);
		public static double saldo = 1000  ; 
		
		//metodos :
	public static void mostrarMenu() {
		System.out.println("--------------------------");
		System.out.println("--< Cajero Automático >--");
		System.out.println("1- Consultar saldo");
		System.out.println("2- Ingresar");
		System.out.println("3- Retirar");
		System.out.println("0- Salir");
		System.out.println("--------------------------");
	}
		public static void main(String[] args) {
			int opcion = 0 ;
			
			do {
				mostrarMenu();
				System.out.print(" Dame una Opcion : ");
				opcion = teclado.nextInt();
			
				  switch(opcion) {
				  case 0 : System.out.println("saliendo!!!");
					  break ;
				  case 1 :
				          System.out.println(" El Saldo Actual es : "+saldo);
					  break ;
				  case 2 : 
				          System.out.print(" Dame el importe a Ingresar :  ");
				          double ingresar = teclado.nextDouble();
				          saldo = saldo + ingresar ;
				          System.out.println(" El importe  Ingresada con Exito!! ");
					  break ;
				  case 3 :
						  System.out.print(" Dame el importe a Retirar :  ");
				          double retirar = teclado.nextDouble();
				          saldo = saldo-retirar ;
				          System.out.println(" El importe  Retirada con Exito!! ");
						  break ;
				  
				  default : System.out.println(" La Opcion no correcta !! ");
					  break ;
				  }
			}while(opcion!=0) ;
				
			teclado.close();
	}
}
