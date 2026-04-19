package UD06_Calculadora_POO.menu;

import java.util.Scanner;

import UD06_Calculadora_POO.operaciones.Operaciones;

public class Menu {

	private static final int MAX_OPCIONES  = 7 ;
	private Scanner teclado = null;
	
	public Menu() {
		teclado = new Scanner(System.in);
	}
	
	public void pintarMenu() {
		
		System.out.println(" ");
		System.out.println("--< calculadora >--");
		System.out.println("0- Salir");
		System.out.println("1- Sumar");
		System.out.println("2- Restar");
		System.out.println("3- Multiplicar");
		System.out.println("4- Dividir");
		System.out.println("5- Raíz Cuadrada");
		System.out.println("6- Factorial");
		System.out.println("7- Sumatorio");
		System.out.println(" ");	
	}
	
	public int PedirOpcion () {
		int ret = 0 ;
		do {
			try {
				System.out.print("-->Dame una Opcion : ");
				ret = teclado.nextInt();
				teclado.nextLine();
					if(ret<0 || ret >MAX_OPCIONES) {
						System.out.println("Opcion fuera del rango permitido (0-7), Inténtalo de nuevo. ");
					}
			}catch(Exception e) {
				System.out.println("ERROR! Opcion No valida ");
				teclado.nextLine();
				ret = -1 ;
			}
		}while(ret<0 || ret >MAX_OPCIONES);
		
	return ret;	
	}
	
	public int PedirNumero () {
		int ret = 0 ;
		do {
			try {
				System.out.print("-->Introducir un Numero positivo: ");
				ret = teclado.nextInt();
				teclado.nextLine();
					if(ret<0) {
						System.out.println("Numero Negativo!! , Inténtalo de nuevo. ");
					}
			}catch(Exception e) {
				System.out.println("ERROR! No es un numero ");
				teclado.nextLine();
				ret = -1 ;
			}
		}while(ret<0 );
		
	return ret;	
	}
	
	
	public void EjecutarMenu() {
		Operaciones operaciones = new Operaciones();
		int opcion =0 ;
		double num1 = 0 , num2 = 0 , resultado = 0;
		do {
				pintarMenu();
				opcion = PedirOpcion ();
			switch (opcion) {
				case 0 : System.out.println("Adios ! ");
					break;
				case 1 : num1 = PedirNumero (); num2 = PedirNumero ();
						 resultado = operaciones.suma(num1, num2);
					break;
				case 2 : num1 = PedirNumero ();  num2 = PedirNumero ();
						 resultado = operaciones.resta(num1, num2);
					break;
				case 3 : num1 = PedirNumero ();  num2 = PedirNumero ();
						 resultado = operaciones.multiplicar(num1, num2);
					break;
				case 4 : num1 = PedirNumero ();  num2 = PedirNumero ();
						if (num2!=0) {
							resultado =operaciones.dividir(num1, num2);
						}else {
							System.out.println("No se puede dividir entre 0 !! ");
							resultado = 0 ;
						}
					break;
				case 5 : num1 = PedirNumero ();  
				 		 resultado = operaciones.raizCuadrada(num1);
					break;
				case 6 : num1 = PedirNumero ();  
		 		 		 resultado = operaciones.factorial(num1);
					break;
				case 7 : num1 = PedirNumero ();  
						 resultado = operaciones.sumatorio(num1);
					break;
				
			}
			System.out.println("El resultado es : "+resultado);
		}while(opcion!=0);
	}
	
	
	
}
