package UD2_EjerciciosExtra;

import java.util.Scanner;
public class Ejercicio2 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0 , num ,suma=0 , numPares = 0, numImpares = 0, numPrimos = 0;
		double  promedio = 0;
			int numMin = Integer.MAX_VALUE ; int numMax = Integer.MIN_VALUE ;
			
		while(i<10){
			i++;
			System.out.print(" Dame el numero Nº"+i+" : ");
			num = teclado.nextInt();
			
			// Mayor , Menor :
			if (num>numMax) {
				numMax = num;
			}else {
				numMin= num ;
			}
			
			// Pares , Impares :
				if(num%2==0) {
					numPares++ ;
				}else {
					numImpares++ ;
				}
				
			// Primos
				int par = 0;
				for (int j = 2; j<num ; j++ ) {
					
					if (num%j==0 ) {
						par++;
					}
				}
				
			if (par==0 && num!=1)	{
				numPrimos++;
			}
			
			//suma
	        suma = suma + num ;   
		} 
			promedio = (double) suma/i ;
		System.out.println(" La suma de todos los números es : "+suma);
		System.out.println(" El promedio de los números es : "+promedio);
		System.out.println(" El número Mayor es "+ numMax+ " , y el Menor es :"+numMin);	
		System.out.println(" El número de Pares es "+ numPares+ " , y des Impares es :"+numImpares);
		System.out.println(" El número de Primos es : "+numPrimos++);
			
		teclado.close();
	}
}
