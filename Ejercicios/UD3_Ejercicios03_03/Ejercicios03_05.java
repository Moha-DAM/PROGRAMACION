package UD3_Ejercicios03_03;
import java.util.Scanner;

public class Ejercicios03_05 {
	
 public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcion=0;
	do {
		opcion = opcionMenu() ;
		switch(opcion) {
			case 1 -> pintar_linea(pedirChar(),pedirNumero());
			case 2 -> charMinuscula(pedirChar());
			case 3 -> charMayuscula(pedirChar());
			case 4 -> pasar_minuscula(pedirString());
			case 5 -> pasar_mayuscula(pedirString());
			case 6 -> System.out.println("ADIOS!");
		}
		
	}while(opcion!=6);
		
		
	teclado.close();	
	}
/**
 * 
 */
	public static void Pintarmenu() {
		System.out.println(" ");
		System.out.println("***Menu***");
		System.out.println("1. Pintar una línea");
		System.out.println("2. Convertir letra a minúscula");
		System.out.println("3. Convertir letra a mayúscula");
		System.out.println("4. Convertir frase a minúscula");
		System.out.println("5. Convertir frase a mayúscula");
		System.out.println("6. Salir");
		System.out.println(" ");
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
/**
 * 	
 * @return
 */
	public static char pedirChar() {
		System.out.print("Dame un caracter : ");
		char caracter = teclado.next().charAt(0);
		
	return caracter ;
	}
/**
 * 
 * @return
 */
	public static String pedirString() {
		System.out.print("Dame una cadena/frase : ");
		String ret = teclado.nextLine().trim();
		
	return ret ;
	}
/**
 * 
 * @return
 */
	public static int pedirNumero() {
		  int numero = 0;
	        do {
	            try {
	                System.out.print("Dame un numero: ");
	                numero = teclado.nextInt();
	                teclado.nextLine();
	                if (numero < 0) {
	                    System.out.println("El numero debe ser positivo");
	                }
	            } catch (Exception e) {
	                System.out.println("ERROR!! numero no valido");
	                teclado.nextLine();
	                numero = -1;
	            }
	        } while (numero < 0);
	        
	   return numero;
	}
	/**
	 * 
	 * @param caracter
	 * @param numero
	 */
	public static void pintar_linea(char caracter, int numero){	
		for(int i=1 ; i<=numero ; i++) {
			System.out.print(caracter);	
		}	
	}
	/**
	 * 
	 * @param minusculas
	 */
	public static void charMinuscula(char minuscula ) {	
		System.out.println(Character.toLowerCase(minuscula) );
	}
	
	/**
	 * 
	 * @param mayuscula
	 */
	public static void charMayuscula(char mayuscula ) {	
		System.out.println(Character.toUpperCase(mayuscula));
	}
		
	public static void pasar_minuscula(String minusculas ) {	
		System.out.println(minusculas.toLowerCase());
	}
	
	/**
	 * 
	 * @param mayuscula
	 */
	public static void pasar_mayuscula(String mayuscula ) {	
		System.out.println(mayuscula.toUpperCase());
	}
}
