package UD5_Ejercicios05_02;
import java.util.Scanner;
public class Ejercicio05_05 {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numTiradas = 100;
        char letraMin = 'a';
        char letraMax = 'z';
		
		char[] sorteos = generarSorteo(numTiradas, letraMin , letraMax);
		System.out.println("\nMostrar Letras :");
		mostrarSorteo(sorteos);
		
		System.out.println("\nFrecuencias de cada Letra :");
		int[] frecuencias = contarFrec(sorteos, letraMin, letraMax);
		mostrarFrecuencias(frecuencias, letraMin, letraMax);
		
	}

/**
 * 
 * @param numTiradas
 * @param valorMin
 * @param valorMax
 * @return
 */
	public static char[] generarSorteo(int numTiradas, char valorMin, char valorMax) {
	    char[] sorteo = new char[numTiradas];

	    for (int i = 0; i < numTiradas; i++) {
	        int aleatorio = (int)(Math.random() * (valorMax - valorMin + 1));  
	        sorteo[i] = (char)(valorMin + aleatorio);
	    }

	    return sorteo;
	}

/**
 * 
 * @param arraySorteo
 */
	public static void mostrarSorteo(char[] arraySorteo) {
        for (int i = 0; i < arraySorteo.length; i++) {
            System.out.print(arraySorteo[i] + "  ");

            if ((i + 1) % 15 == 0) { 
                System.out.println();
            }
        }
        System.out.println(); 
    }
	
/**
 * 
 * @param arraySorteo
 * @param valorMin
 * @param valorMax
 * @return
 */
    public static int[] contarFrec(char[] arraySorteo, char valorMin, char valorMax) {

    	int rango = valorMax - valorMin + 1;
        int[] frecuencias = new int[rango];

        for (int i = 0; i < arraySorteo.length; i++) {
            char letra = arraySorteo[i];      
            int indice = letra - valorMin;    
            frecuencias[indice]++;           
        }

        return frecuencias;
    }

/**
 * 
 * @param arrayFrecuencias
 * @param valorMin
 * @param valorMax
 */
    public static void mostrarFrecuencias(int[] arrayFrecuencias, char valorMin, char valorMax) {
        for (int i = 0; i < arrayFrecuencias.length; i++) {
            char letra = (char)(valorMin + i);
            System.out.println(letra + ": " + arrayFrecuencias[i]);
        }
    }
	
}
