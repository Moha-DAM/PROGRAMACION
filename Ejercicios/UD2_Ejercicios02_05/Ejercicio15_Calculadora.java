package UD2_Ejercicios02_05;

import java.util.Scanner;

public class Ejercicio15_Calculadora {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in); 
		int opcion;
		double num1 , num2 ,resultado = 0  ;
		
		do {
			System.out.println("------------------ ");
			System.out.println("Calculadora");
			System.out.println("------------------ ");
			System.out.println("1. Suma ");
			System.out.println("2. Resta ");
			System.out.println("3. Producto ");
			System.out.println("4. División ");
			System.out.println("5. Salir ");
			System.out.println(" ");
			
			System.out.print("Introduce la opción deseada : ");
			opcion= teclado.nextInt();
			
			if(opcion==5){
				System.out.println("Adios! ");
				}else if((opcion>0) && (opcion<5)) {
						
				System.out.print("Dame el numero 1 : ");
				num1= teclado.nextInt();
		
				System.out.print("Dame el numero 2 : ");
				num2= teclado.nextInt();
				
					switch (opcion) {
					
					case 1: resultado = num1 + num2;
						System.out.println("--> Operación seleccionada: Suma ");
						System.out.println(num1+" + "+num2+" = "+resultado);
						break;
					case 2: resultado = num1 - num2;
						System.out.println("--> Operación seleccionada: Resta ");
						System.out.println(num1+" - "+num2+" = "+resultado);
						break;
					case 3: resultado = num1 * num2;
						System.out.println("--> Operación seleccionada: Producto ");
						System.out.println(num1+" * "+num2+" = "+resultado);
						break;
					case 4: 
						if (num2!=0) {
						resultado = num1 / num2;
						System.out.println("--> Operación seleccionada: División ");
						System.out.println(num1+" / "+num2+" = "+resultado);
	
						}else {
							System.out.println("ERROR!!!");
						}
					}
					
				}else {
					System.out.println("Opción "+opcion + " no disponible, vuelva a intentarlo. ");
		}
			
		}while(opcion!=5);
		
	teclado.close();	
	}

}
