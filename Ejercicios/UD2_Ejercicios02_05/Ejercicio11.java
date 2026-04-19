package UD2_Ejercicios02_05;


import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); 
		int numero , n, i= 0 , numPar=0 , numImpa=0 ;
		
		System.out.print("Dame n numeros Enteros  : ");
		n= teclado.nextInt();
		
		while (i < n ) {
			
			numero = (int) (Math.random()*100);
			System.out.println(numero);
			
				if (numero%2 == 0) {
					numPar++ ;	
				}else {
					numImpa++;
				}
			i++;	
		}
		System.out.println("-------------------------------- " );
		System.out.println("El numero de Pares es  : "+numPar );
		System.out.println("El numero de ImPares es  : "+numImpa );
		
		teclado.close();
	}

}
