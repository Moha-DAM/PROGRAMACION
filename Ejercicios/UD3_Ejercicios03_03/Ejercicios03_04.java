package UD3_Ejercicios03_03;
import java.util.Scanner;

public class Ejercicios03_04 {
	
 public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcion=0;
	do {
		opcion = opcionMenu() ;
		switch(opcion) {
			
			case 1: 
				System.out.println("Pide una letra y número y muestra esa letra el número de veces indicada");
				break ;
			case 2: 
				System.out.println("Pide una letra y la muestra en minúscula");
				break ;
			case 3: 
				System.out.println("Pide una letra y la muestra en mayúscula");
				break ;
			case 4: 
				System.out.println("Pide una frase y la muestra en minúscula");
				break ;
			case 5: 
				System.out.println("Pide una frase y la muestra en mayúscula");
				break ;
			case 6: 
				System.out.println("ADIOS!");
				break ;
		
		}
		
	}while(opcion!=6);
		
		
	teclado.close();	
	}
/**
 * 
 */
	public static void Pintarmenu() {
		System.out.println("1. Pintar una línea");
		System.out.println("2. Convertir letra a minúscula");
		System.out.println("3. Convertir letra a mayúscula");
		System.out.println("4. Convertir frase a minúscula");
		System.out.println("5. Convertir frase a mayúscula");
		System.out.println("6. Salir");
	}
/**
 * 
 * @return
 */
	public static int opcionMenu() {	
		int opcion=0;
		do { 
			Pintarmenu();
			try {
				System.out.print("Introduce la opcion deseada de 1 a 6 : ");
				opcion= teclado.nextInt();
				teclado.nextLine();
				
				if((opcion<1) ||( opcion>6)) {
					System.out.println("Opcion fuera del rango 1-6 !!!! ");
				}
			
			}catch (Exception e) {
				System.out.println("ERROR!! Opcion NO valida!! ");
				teclado.nextLine();
				opcion = -1 ;		
			}
		}while((opcion<1) ||( opcion>6));
	
	return opcion;
	}
	
	
	
}
