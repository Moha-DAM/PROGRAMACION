package UD2_Ejercicios02_05;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner(System.in); 
	int numCuenta , saldoActual , sumaSaldoAcr = 0;
	
	
	do {
		System.out.print("Dame el numero de cuenta  : ");
		numCuenta= teclado.nextInt();
	
		if(numCuenta<0) {
			System.out.println("Saliendo !!! ");
			System.out.println("------------------------------------- ");
		}else {
			System.out.print("Dame el saldo de cuenta  : ");
			saldoActual= teclado.nextInt();
	
			if (saldoActual>0) {
				System.out.println("Estado de cuenta es : Acreedor ");
				sumaSaldoAcr = sumaSaldoAcr + saldoActual ;
				
				}else if(saldoActual<0){
					System.out.println("Estado de cuenta es : Deudor ");
				}else {
					System.out.println("Estado de cuenta es : Nulo ");
				}
			System.out.println("------------------------------------- ");
		}
	}while(numCuenta>0);
	
	System.out.println("La suma total de los saldos acreedores es : "+sumaSaldoAcr);
		
	teclado.close();
	}

}
