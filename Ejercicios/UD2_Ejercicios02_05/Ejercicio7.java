package UD2_Ejercicios02_05;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		int preguntasTotal, preguntasCorrectas ;
		double porcentaje ;
		
		System.out.print("dame las preguntas Total : ");
		preguntasTotal= teclado.nextInt();

		System.out.print("dame las preguntas Correctas : ");
		preguntasCorrectas= teclado.nextInt();

		porcentaje = ((double) preguntasCorrectas/preguntasTotal*100);
				
		System.out.println("el porcentaje de respuestas correctas es : "+porcentaje+" %");
		
			if(porcentaje>=90) {
				System.out.print("Nivel máximo ");
		
			}else if(porcentaje>=75 && porcentaje<90) {
				System.out.print("Nivel medio ");
		
			}else if(porcentaje>=50 && porcentaje<75) {
				System.out.print("Nivel regular ");
		
			}else {
				System.out.print("Fuera de nivel ");
			}
			
		teclado.close();
	}

}
