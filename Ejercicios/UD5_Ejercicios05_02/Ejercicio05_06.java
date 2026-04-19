package UD5_Ejercicios05_02;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio05_06 {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		   int[] datos = cargarTabla(20, 1, 100);

	        System.out.println("Array original:");
	        mostrarArray(datos);

	        invertirArray(datos);

	        System.out.println("\nArray invertido:");
	        mostrarArray(datos);
	}

/**
 * 
 * @param n
 * @param valorMin
 * @param valorMax
 * @return
 */
	    public static int[] cargarTabla(int n, int valorMin, int valorMax) {
	        int[] tabla = new int[n];
	        Random rnd = new Random();
	        int rango = valorMax - valorMin + 1;

	        for (int i = 0; i < n; i++) {
	            tabla[i] = valorMin + rnd.nextInt(rango);
	        }
	        return tabla;
	    }

/**
 *  
 * @param array
 */
	    public static void invertirArray(int[] array) {
	        int inicio = 0;
	        int fin = array.length - 1;

	        while (inicio < fin) {
	          
	            int temp = array[inicio];
	            array[inicio] = array[fin];
	            array[fin] = temp;

	            inicio++;
	            fin--;
	        }
	    }

/**
 *   
 * @param array
 */
	    public static void mostrarArray(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }


}
