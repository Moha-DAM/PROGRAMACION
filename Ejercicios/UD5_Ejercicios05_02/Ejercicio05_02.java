package UD5_Ejercicios05_02;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio05_02 {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int [] numeros = cargarTabla();
		int suma =sumaPares(numeros);
		long producto =prodImpares(numeros);
		
		imprimirDatos(numeros,suma,producto);
	
	}
/**
 * devuelve un numero entre 1 y 100 
 * @return
 */
	public static int generarNumero() {
		int numero = 0 ;
		//(int)(Math.random() * (max - min + 1)) + min;
		numero = (int) (Math.random() * (100-1+1)) + 1;
		
	return numero ;	
	}
/**
 * carga el array de los 20 numeros 
 * @return
 */
	public static int [] cargarTabla() {
		int [] numeros = new int [20];
		for(int i = 0 ; i < numeros.length ; i++) {
			numeros[i]= generarNumero();	
		}
		
	return numeros;	
	}
/**
 * Calcula la suma de los numeros de la posicion par y lo devuelve	
 * @param numeros
 * @return
 */
	public static int sumaPares(int [] numeros) {
		int suma = 0 ;
		for(int i = 0 ; i < numeros.length ; i+=2) {
			suma = suma + numeros[i];
		}
		
	return suma ;	
	}
/**
 * Calcula el producto de los números de la posición impar y lo devuelve
 * @param numeros
 * @return
 */
	public static long prodImpares(int [] numeros) {
		long producto = 1 ;
		for(int i = 1 ; i < numeros.length ; i+=2) {
			producto = producto * numeros[i];
		}
		
	return producto ;	
	}
/**
 * Muestra el contenido del array y despues la suma y el producto
 * @param numeros
 * @param suma
 * @param producto
 */
	public static void imprimirDatos(int [] numeros, int suma , long producto) {	
		System.out.println("El contenido del array : "+Arrays.toString(numeros));
		System.out.println("la suma de los numeros de la posicion Par es :"+suma);
		System.out.println("El producto de los numeros de la posicion Impar es :"+producto);
	}
	
}
