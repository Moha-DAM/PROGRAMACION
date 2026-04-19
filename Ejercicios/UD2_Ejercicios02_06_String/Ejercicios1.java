package UD2_Ejercicios02_06_String;

import java.util.Scanner;

public class Ejercicios1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in); 
		String texto ;
		
		System.out.print("dame un texto : ");
		texto = teclado.nextLine() ; 
		
		
		System.out.println(" Longitud : "+ texto.length());
		
		if (texto.length()<7) {
			System.out.println(" Longitud del texto es menor que 7 !!!! ");
		}else {
			System.out.println(" El carácter en la posición 7 : "+ texto.charAt(7));
		}
		
		
		if (texto.indexOf('x')!=-1) {
			System.out.println(" La posición donde aparece el primer carácter 'x' : "+ texto.indexOf('x'));
		}else {
			System.out.println(" Carácter no encontrado!! ");
		}
		
		System.out.println(" Texto en mayúsculas : "+ texto.toUpperCase());
		
		
		teclado.close();
	}

}
