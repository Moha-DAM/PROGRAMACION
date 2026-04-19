package UD1_Ejercicios01_03;

import java.util.Scanner;

public class Ejercicios01_03 {
	
	/** Main
	 * 	@param args
	 */
	public static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		
	//hago la llamada a los 10 ejercicios:
		
		ejer01();
		ejer02();
		ejer03();
		ejer04();
		ejer05();
		ejer06();
		ejer07();
		ejer08();
		ejer09();
		ejer10();
		
		
	}

	
	private static void ejer01() {
	System.out.println("--> Ejercicio01 : ");
		
		int n1=50;

		int n2=30, suma=0, n3 = 2 ;

		suma=n1+n2;

		System.out.println("LA SUMA ES: "+suma);	
		
		suma=suma+n3;
		System.out.println(suma);
		
System.out.println("--------------------------");
	}
		
	private static void ejer02() {
	System.out.println("--> Ejercicio02 : ");
		
		int n1=50, n2=30;

		int suma=0;

		suma=n1+n2;

		System.out.println ("LA SUMA ES: "+suma );	
		
System.out.println("--------------------------");
	}
		
	private static void ejer03 () {
	System.out.println("--> Ejercicio03 : ");
		
		int numero=2,
		cuad=numero*numero;

		System.out.println("EL CUADRADO DE "+numero+" ES: "+cuad);
		
System.out.println("--------------------------");
	}
	
	private static void ejer04 () {
	System.out.println("--> Ejercicio04 : ");
		
		//mostrar el numero almacenado en la variable num
		int num=5;

		num += num -1 *4 +1;
		System.out.println (num);

		num=4;
		System.out.println (num);
		
System.out.println("--------------------------");
	}
	
	private static void ejer05 () {
	System.out.println("--> Ejercicio05 : calcule la longitud de una circunferencia");
	
	// L = 2πr
	double longitud , radio= 3 ; 
	longitud = 2 * Math.PI * radio;
	System.out.println("la longitud es :  "+longitud);
	
System.out.println("--------------------------");
	}
	
	private static void ejer06 () {
	System.out.println("--> Ejercicio06 : área de una circunferencia");
	
	//A = πr²
	double area , radio=5.2 ;
	area = Math.PI * radio * radio ;
	System.out.println("la área de una circunferencia  :  "+area);
	
System.out.println("--------------------------");
	}
	
	private static void ejer07 () {
	System.out.println("--> Ejercicio07 : intercambie Los valores de a y b");
	// Realiza un programa en Java que dada dos variables a y b, intercambie Los valores de a y b.
	
	// creamos un variable intermediario t 
	 int a = 3 , b= 10 , t;
	 System.out.println("a :" + a + " b : "+b);
	 
	 t = a ;
	 a = b ;
	 b = t ;
	 System.out.println("a :" + a + " b : "+b);

System.out.println("--------------------------");
	}
	
	private static void ejer08 () {
	System.out.println("--> Ejercicio08 : ");
	//Hacer un programa para sumar dos números leídos por teclado y escribir el resultado.
	
	int num1 , num2 , suma;
	
	System.out.print("dame el numero 1 : ");
	num1= teclado.nextInt();
	
	System.out.print("dame el numero 2 : ");
	num2= teclado.nextInt();
	
	suma = num1 + num2 ;
	System.out.println("la suma de "+num1+" y "+num2+" es : "+ suma);
	
System.out.println("--------------------------");			
	}
		
	private static void ejer09 () {
	System.out.println("--> Ejercicio09 : ");
	//Hacer programa que permita leer 2 números diferentes y nos diga cuál es el mayor de los 2 números.
	
     int num1 , num2 ;
	
	System.out.print("dame el numero 1 : ");
	num1= teclado.nextInt();
	
	System.out.print("dame el numero 2 : ");
	num2= teclado.nextInt();
	
	if (num1>num2) {
		System.out.println("El numero "+ num1 + " es el mayor ");
	}else if (num2>num1) {
		System.out.println("El numero "+ num2 + " es el mayor ");
		}else {
			System.out.println("Los dos numeros "+ num1 + " y "+num2+" son eguales ");
		}
	
System.out.println("--------------------------");		
	}
	
	private static void ejer10 () {
	System.out.println("--> Ejercicio10 : ");
	/*Crear un programa en el que se almacenen 3 números en 3 variables A, B y C. 
	 * Se debe mostrar decidir cuál es el mayor y cuál es el menor. 
	 * (En caso de ser los mayores o menos iguales se mostrará uno de ellos)
	 */
	 int A , B , C ;
		
		System.out.print("dame el numero 1 : ");
		A= teclado.nextInt();
		
		System.out.print("dame el numero 2 : ");
		B= teclado.nextInt();
	
		System.out.print("dame el numero 3 : ");
		C= teclado.nextInt();
		
		if (A>B && A>C) {
			System.out.println("El numero "+ A + " es el Mayor ");
		}else if(B>A && B>C) {
				System.out.println("El numero "+ B + " es el Mayor ");
			}else {
				System.out.println("El numero "+ C + " es el Mayor ");
			}
			
		if (A<B && A<C) {
			System.out.println("El numero "+ A + " es el Menor ");
		}else if(B<A && B<C) {
				System.out.println("El numero "+ B + " es el Menor ");
			}else {
				System.out.println("El numero "+ C + " es el Menor ");
			}	
		
		
System.out.println("--------------------------");
		
	}
	
	
}
