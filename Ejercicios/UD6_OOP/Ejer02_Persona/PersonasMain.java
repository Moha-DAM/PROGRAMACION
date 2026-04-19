package UD6_OOP.Ejer02_Persona;

import java.util.Scanner;

public class PersonasMain {

	public static Scanner teclado = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona persona1 = datosPersona();
		Persona persona2 = datosPersona();
		
		System.out.println("\n***Datos del Persona***  ");
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		
		  personaMayor(persona1 , persona2);
		  	  	  
	}

	public static Persona datosPersona() {	
		Persona persona = new Persona ();

			System.out.print("\nIntroducir el Nombre de Persona : ");
			String nombre = teclado.nextLine();
			persona.setNombre(nombre); 
			
			System.out.print("Introducir el Apellidos de Persona : ");
			String apellidos = teclado.nextLine();
			persona.setApellidos(apellidos);
			
			System.out.print("Introducir el Edad de Persona : ");
			int edad = teclado.nextInt();
			persona.setEdad(edad);
			
			System.out.print("La  Persona es Casado ? : ");
			boolean casado = teclado.nextBoolean();
			persona.setCasado(casado);
			
			System.out.print("Introducir el NumeroDocumentoIdentidad de Persona : ");
			String numeroDocumentoIdentidad = teclado.next();
			persona.setNumeroDocumentoIdentidad(numeroDocumentoIdentidad); 
			teclado.nextLine();

			
	return persona;		
	}
	
	public static void personaMayor(Persona persona1 , Persona persona2) {
		
		if(persona1.getEdad() > persona2.getEdad()) {
			System.out.println(persona1.getNombre()+" "+persona1.getApellidos()+ " es Mayor que "+ persona2.getNombre()+" "+persona2.getApellidos());
		}else {
			System.out.println(persona2.getNombre()+" "+persona2.getApellidos()+ " es Mayor que "+ persona1.getNombre()+" "+persona1.getApellidos());
		}
	}
	
}
