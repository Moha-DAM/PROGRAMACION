package UD5_Ejercicios05_02;

import java.util.Random;
import java.util.Scanner;
public class Ejercicio05_07 {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
        int[] tabla = cargarTabla(20, 0, 50);

        System.out.println("Situacion inicial:");
        mostrarArray(tabla);

        moverCerosFinal(tabla);

        System.out.println("Situacion final:");
        mostrarArray(tabla);
	}
	
/**
 * 
 * @param n
 * @param valorMin
 * @param valorMax
 * @return
 */
	
	public static int[] cargarTabla(int n, int valorMin, int valorMax) {
        Random rand = new Random();
        int[] tabla = new int[n];
        for (int i = 0; i < n; i++) {
           
            tabla[i] = rand.nextInt(valorMax - valorMin + 1) + valorMin;
        }
        return tabla;
    }
	
/**
 * 
 * @param array
 */
    public static void moverCerosFinal(int[] array) {
        int n = array.length;
        int count = 0;  
       
        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                array[count++] = array[i];
            }
        }

        while (count < n) {
            array[count++] = 0;
        }
    }

 /**
  * 
  * @param array
  */
    public static void mostrarArray(int[] array) {
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }


}
