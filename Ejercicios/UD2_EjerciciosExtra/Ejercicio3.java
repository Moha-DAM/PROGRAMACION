package UD2_EjerciciosExtra;

import java.util.Scanner;

public class Ejercicio3 {
	
//Declaracion Variables
	public static Scanner teclado = new Scanner(System.in);
	public static boolean HayNumPro = false ;
	
// Main ---------------------------------------------------------------------------------------
	public static void main(String[] args) {
		System.out.println(" *** Numeros Perfectos *** ");
		numerosPerfectos();
		
		System.out.println(" ");
		System.out.println(" *** Numeros Amigos *** ");
		numerosAmigos();
		
		teclado.close();
	}

// Metodos ------------------------------------------------------------------------------------
	public static void numerosAmigos() {
		/*Dos números son amigos si la suma de los divisores propios de uno es igual al otro y viceversa
		 * Los divisores de un número son todos los números enteros 
		 * que lo dividen de manera exacta (sin dejar resto)
		 */
         boolean HayNumAmig = false ;
         
		System.out.print(" Dame un numero entero positivo : ");
		int N = teclado.nextInt();
		
		for (int i = 1; i < N; i++) {
	        int suma1 = 0;
	        // Suma de divisores propios de i
	        for (int j = 1; j < i; j++) {
	            if (i % j == 0) {
	                suma1 += j;
	            }
	        }

	        if (suma1 > i && suma1 < N) { // evitar repetir parejas
	            int suma2 = 0;
	            
	            // Suma de divisores propios de suma1
	            for (int j = 1; j < suma1; j++) {
	                if (suma1 % j == 0) {
	                    suma2 += j;
	                }
	            }

	            if (suma2 == i) {
	                System.out.println("Los numeros " + i + " y " + suma1 + " son amigos");
	                HayNumAmig = true;
	            }
	        }
	    }
		
		if(!HayNumAmig) {
			 System.out.println(" NO hay Ningun numero Amigo !!! ");
		}

	}		

	public static void numerosPerfectos() {
		/*Un número perfecto es igual a la suma de sus divisores propios (excluyéndose a sí mismo)
		 * Los divisores de un número son todos los números enteros 
		 * que lo dividen de manera exacta (sin dejar resto)
		 */
		int i = 1 , N;
		System.out.print(" Dame un numero entero positivo : ");
		N = teclado.nextInt();
		while(i<N) {
			int divisorProp = 0 ;
			
			for(int j = 1 ; j<i ; j++) {
				
				if(i%j==0) {
					divisorProp= divisorProp + j ;
				}
			}
			if (i==divisorProp) {
			 System.out.println(" El numero : "+i+ " es un  numero perfecto ");
			 HayNumPro = true;
			}
			
			i++;
		}
		
		if(!HayNumPro) {
			 System.out.println(" NO hay Ningun numero perfecto !!! ");
		}
	}		
		

}
