package UD3_Ejercicios03_03;
import java.util.Scanner;

public class Ejercicios03_02 {
	
 public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Método pasar_minuscula(String)");
			pasar_minuscula("MOHAMMED" );

	}
/**
 * 
 * @param minusculas
 */
	public static void pasar_minuscula(String minusculas ) {	
		System.out.println(minusculas.toLowerCase());
	}
	
	
}
