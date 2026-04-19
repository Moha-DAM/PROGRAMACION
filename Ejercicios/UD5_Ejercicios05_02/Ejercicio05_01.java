package UD5_Ejercicios05_02;

import java.util.Scanner;

public class Ejercicio05_01 {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		imprimirEdad(leerEdad());
		
		teclado.close();
	}
	
	/**
	 * una metodo solicita una edad por teclado entre 18 y 35 y lo devuelve.
	 * @return
	 */
	public static int[] leerEdad() {
        int[] edades = new int[20];
        
        for(int i = 0 ; i < edades.length ; i++) {
        	//(int)(Math.random() * (max - min + 1)) + min;
	        int edad = (int)(Math.random() * (35 - 18 + 1)) + 18;
	        edades[i] = edad ;   
        }
        
     return edades;    
    }
/**
 * Calcula la edad media de los 20 alumnos y lo devuelve
 * @param edades
 * @return
 */
	public static double  calcularMedia(int [] edades) {
		double mediaEdad = 0 , suma = 0 , edad = 0;
		
		 for(int i = 0 ; i < edades.length ; i++) {
			edad =  edades[i] ; 
			 suma = suma + edad ;
		 }
		 mediaEdad = suma/edades.length ;
			 
	return mediaEdad ;
	}
/**	
 * Imprime la edad de cada alumno y al final, la media de todos ellos
 * @param edades
 */
	public static void imprimirEdad(int [] edades) {
		double mediaEdad=  calcularMedia(edades);

		 for(int i = 0 ; i < edades.length ; i++) {
			 System.out.println("la edad del alumno Nº "+(i+1)+" es : "+edades[i]);
		 }
		System.out.println("....................................................");
		System.out.printf(" la edad media de tous los Alumnos es : %.2f años%n ", mediaEdad);
	}
	
}
