package UD2_Ejercicios02_08;

import java.util.Scanner;

public class Ejercicio02_08 {

//Declaracion variables : --------------------------------------------------------------------
	public static Scanner teclado = new Scanner(System.in); 
	public static double saldo = 0 , precio = 0 , cambio = 0;
	public static int bebida = 0 ;
	public static int moneda2E = 0 , moneda1E = 0 , moneda50C = 0 , moneda20C = 0 ,
		moneda10C = 0 ,moneda5C = 0 ,moneda2C = 0 ,moneda1C = 0 ;
	
//Main : -------------------------------------------------------------------------------------
	public static void main(String[] args) {
	
		mostrarMenu();
		pedirSaldo(); 
	
		System.out.print("Elige su Bebida : ");
		bebida = teclado.nextInt();
		
		if(bebida>=1 && bebida<=3) {
			switch(bebida) {
			case 1 : precio = 0.43 ;
				break;
			case 2 : precio = 1.11 ;
				break;
			case 3 : precio = 0.36 ;
				break;
			}
			numerosMonedas(saldo);	
		}else {
			System.out.println("Opción incorrecta !!");
			System.out.printf("Su Saldo : "+saldo);
		}	
	}
	
//Metodos ----------------------------------------------------------------------
	public static void  mostrarMenu() {
		System.out.println("*** Máquina expendedora ***");
		System.out.println("------------------------------ ");
		System.out.println("1. Café (0,43 €) ");
		System.out.println("2. Refrescos (1,11 €), ");
		System.out.println("3. Agua (0,36 €) ");
		System.out.println("------------------------------- ");	
	}
	
	public static void  pedirSaldo(){
		System.out.print("Inserta un Saldo : ");
		saldo = teclado.nextDouble(); 		
	}

	public static void  mostrarNumerosMonedas() {
		System.out.println("-------------------------------- ");
		System.out.printf("Su Cambio: %.2f%n", cambio);
		System.out.println("Numero de monedas 2€    :"+moneda2E);
		System.out.println("Numero de monedas 1€    :"+moneda1E);
		System.out.println("Numero de monedas 50cts :"+moneda50C);
		System.out.println("Numero de monedas 20cts :"+moneda20C);
		System.out.println("Numero de monedas 10cts :"+moneda10C);
		System.out.println("Numero de monedas 5cts  :"+moneda5C);
		System.out.println("Numero de monedas 2cts  :"+moneda2C);
		System.out.println("Numero de monedas 1cts  :"+moneda1C);
	}
	
	public static void numerosMonedas(double saldo) {
		if(saldo >=precio) {
			System.out.println("Su producto. Gracias");
			cambio = saldo-precio ;	
		
			int centimos = (int) (cambio*100) ;
			
				moneda2E = centimos/200 ;
				
				centimos = centimos - moneda2E*200 ;
				moneda1E = centimos/100 ;
				
				centimos = centimos - moneda1E*100 ;
				moneda50C = centimos/50 ;
				
				centimos = centimos - moneda50C*50 ;
				moneda20C = centimos/20 ;
				
				centimos = centimos - moneda20C*20 ;
				moneda10C = centimos/10 ;
				
				centimos = centimos - moneda10C*10 ;
				moneda5C = centimos/5 ;
				
				centimos = centimos - moneda5C*5 ;
				moneda2C = centimos/2 ;
				
				centimos = centimos - moneda2C*2 ;
				moneda1C = centimos ;
				
				mostrarNumerosMonedas() ;
		}else {
			System.out.println("Saldo insuficiente");
			System.out.printf("Su Saldo : "+saldo);
		}		
	}

	
}
