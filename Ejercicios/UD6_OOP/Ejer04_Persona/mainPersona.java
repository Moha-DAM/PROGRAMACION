package UD6_OOP.Ejer04_Persona;

import java.util.Scanner;
public class mainPersona {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//Persona 1 :--------------------------------------------------------
		System.out.println("\n----------<  Persona 1 >----------");
		String nombre1 = PedirNombre();
		int edad1 = PedirEdad() ;
		char sexo1 = PedirSexo();
		double peso1 = PedirPeso();
		double altura1 = PedirAltura();
		Persona persona1 = new Persona(nombre1, edad1, sexo1, peso1, altura1 );
		
//Persona 2 :--------------------------------------------------------	
		System.out.println("\n----------<  Persona 2 >----------");
		String nombre2 = PedirNombre();
		int edad2 = PedirEdad() ;
		char sexo2 = PedirSexo();
		Persona persona2 = new Persona(nombre2, edad2, sexo2);

//Persona 3 :--------------------------------------------------------		
		System.out.println("\n----------<  Persona 3 >----------");
		Persona persona3 = new Persona();
		String nombre3 = PedirNombre();
		int edad3 = PedirEdad() ;
		char sexo3 = PedirSexo();
		double peso3 = PedirPeso();
		double altura3 = PedirAltura();
		persona3.setNombre(nombre3);
		persona3.setEdad(edad3);
		persona3.setSexo(sexo3);
		persona3.setPeso(peso3);
		persona3.setAltura(altura3);
		
//Mostrar Datos Personas:--------------------------------------------------------		
		mostrarDatosPersona(persona1);
		mostrarDatosPersona(persona2);
		mostrarDatosPersona(persona3);
		
	teclado.close();
	}
	
	
//METODOS---------------------------------------------------------------------------------------------
	public static void mostrarDatosPersona(Persona persona) {
		System.out.println("\n--->Datos del Persona : "+persona.getNombre());
		System.out.println(persona);
		comprobarPesoIdeal(persona);
		esMayorEdad(persona);	
	}
	
	
	public static void esMayorEdad(Persona persona) {
		if(persona.esMayorDeEdad() == true) {
			System.out.println("La persona "+persona.getNombre()+" es mayor de edad");
		}else {
			System.out.println("La persona "+persona.getNombre()+" NO es mayor de edad");
		}
		
	}
	
	public static void comprobarPesoIdeal(Persona persona) {
		int num = persona.calcularIMC();
		
			if(num == persona.debajoPeso) {
				System.out.println("El peso está por debajo del peso ideal");	
			}else if(num == persona.idealPeso) {
				System.out.println("Tiene peso ideal");
			}else {
				System.out.println("Tiene sobrepeso");
			}
	}
	
	public static String PedirNombre() {	
		System.out.print("Introducir el Nombre de Persona : ");
		String nombre = teclado.nextLine();

	return nombre;	
	}
	
	public static int PedirEdad() {	
		System.out.print("Introducir el Edad de Persona : ");
		int edad = teclado.nextInt();
		teclado.nextLine();
		
	return edad;	
	}
	
	public static char PedirSexo() {	
		System.out.print("Introducir el Sexo de Persona : ");
		char sexo = teclado.next().charAt(0);
		teclado.nextLine();
		
	return sexo;	
	}
			
	public static double PedirPeso() {	
		System.out.print("Introducir el Peso de Persona : ");
		double peso = teclado.nextDouble();
		teclado.nextLine();
		
	return peso;	
	}

	public static double PedirAltura() {	
		System.out.print("Introducir el Altura de Persona : ");
		double altura = teclado.nextDouble();
		teclado.nextLine();
		
	return altura;	
	}
	
}
