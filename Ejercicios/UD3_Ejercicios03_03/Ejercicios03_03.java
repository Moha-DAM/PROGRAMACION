package UD3_Ejercicios03_03;
import java.util.Scanner;

public class Ejercicios03_03 {
	
 public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Método pasar_mayuscula(String)");
			pasar_mayuscula("aouragh" );
		
	}
/**
 * 
 * @param mayuscula
 */
	public static void pasar_mayuscula(String mayuscula ) {	
		System.out.println(mayuscula.toUpperCase());
	}
	
	
}
