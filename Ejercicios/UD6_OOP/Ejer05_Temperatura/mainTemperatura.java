package UD6_OOP.Ejer05_Temperatura;

import java.util.Scanner;

public class mainTemperatura {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = opcionConversion() ;
		System.out.print("Introducir la Temperatura que desea Convertir : ");
		double temperatura = teclado.nextDouble();
		
		temperaturaConversion(opcion ,temperatura) ;

	}

	public static void temperaturaConversion(int opcion , double temperatura) {
		Temperatura temp = new Temperatura();
		double tempConv = 0 ;
		
		switch(opcion) {
			case 1 : tempConv = temp.celsiusToFahrenheit(temperatura);
				System.out.printf("El grado Celsius : %.2fºC a Fahrenheit es : %.2fºF",temperatura,tempConv);
				break ;
			
			case 2 : tempConv = temp.fahrenheitToCelsius(temperatura);
				System.out.printf("El grado Fahrenheit: %.2fºF a Celsius es: %.2fºC", temperatura, tempConv);
				break ;
		}	
	}
	
	
	
	public static int opcionConversion() {
		System.out.println("\n---Menu Opcion Conversion Temperatura---");
		System.out.println("1. Celsius To Fahrenheit");
		System.out.println("2. Fahrenheit To Celsius");
		
		int opcion = 0;
		
		do {
			try {
				System.out.print("Elegir una Opcion : ");
				opcion = teclado.nextInt();
				teclado.nextLine();	
				
				 if(opcion<1 || opcion >2) {
					 System.out.println("La Opcion debe ser entre rango (1-2).. ");
				 }
			}catch(Exception e) {
				System.out.println("Opcion no Valida, debe ser un numero.. ");
				teclado.nextLine();	
				opcion = -1 ;
			}
		}while(opcion<1 || opcion >2);
		
	return opcion ; 	
	}
	
	
}
