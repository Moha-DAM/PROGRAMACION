package UD5_Ejercicios05_02;
import java.util.Arrays;
public class Ejercicio05_03 {

	public static void main(String[] args) {
		
		int [] numeros = cargarTabla(4,1,9);
		mostrarArray(numeros);
		mostrarFrecuencias(numeros);	
	}

/**
 * Devuelve un array segun los parametros
 * @param tamanio
 * @param valorMin
 * @param valorMax
 * @return
 */
	public static int [] cargarTabla(int tamanio, int valorMin, int valorMax) {
		int [] numeros = new int [tamanio];
		int numero = 0 ; //(int)(Math.random() * (max - min + 1)) + min;
		
		for(int i = 0 ; i < tamanio ; i++) {
			numero = (int) (Math.random() * (valorMax-valorMin+1)) + valorMin;	
			numeros[i] = numero;
		}
		
	return numeros;	
	}
/**
 * Muestra la cantidad de cada numero dentro el Array
 * @param numeros
 */
	public static void  mostrarFrecuencias(int [] numeros) {
		
		for(int j = 1 ; j < 10 ; j++) {
			int numVeces = 0 ;
			for(int i = 0 ; i < numeros.length ; i++) {
				if(numeros[i]==j) {
					numVeces++;
				}
			}
		System.out.println("La cantidad del numero "+j+" es : "+numVeces);
		}	
	}
/**
 * 	Muestra el contenido del array
 * @param numeros
 */
	public static void  mostrarArray(int [] numeros) {
		System.out.println("El contenido del array : "+Arrays.toString(numeros));
	}
	
	
}
