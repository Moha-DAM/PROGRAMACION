package UD3_Ejercicios03_03;
import java.util.Scanner;

public class Ejercicios03_01 {
	
 public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Método pintar_linea(carácter, numero)");
			pintar_linea('A',3);	
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
	
}