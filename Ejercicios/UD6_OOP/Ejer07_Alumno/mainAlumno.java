package UD6_OOP.Ejer07_Alumno;

import java.util.Scanner;

public class mainAlumno {
	
	public static Scanner teclado = new Scanner(System.in);
	public static Alumno [] alumnos = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjecutarMenu();
	}

	
//METODOS---------------------------------------------------------------------------------------------
	public static void EjecutarMenu() {
		  int  opcion = 0 ;
		  
		  do {
			  opcion = opcionMenu() ;
			switch (opcion) {
				case 0 : 	System.out.println("Adios ! ");
					break ;
				case 1 :	alumnos = cargarDatosAlumno();	
					break ;
				case 2 : 	
						if (alumnos==null ) {
						System.out.println("No hay Alumnos!!!");
						}else {
							promedioEdad(alumnos);
							alumnosAlturaMas(alumnos);
						}
					break ;
				case 3 : 	mostrarDatosAlumnos(alumnos);
					break ;
				case 4 : 	mostrarDatosAlumno(alumnos);
					break ;
			}
			
		  }while(opcion!=0);
	}
	
	public static void mostrarDatosAlumno(Alumno [] alumnos) {
		boolean encontrado = false ;
		
		if (alumnos==null ) {
			System.out.println("No hay Alumnos!!!");
		}else {
			String nombre = PedirNombre();
			
			for(int i = 0 ; i < alumnos.length ; i++) {
				if(alumnos[i].getNombre().equalsIgnoreCase(nombre)) {
					System.out.println("Datos del alumno: ");
					System.out.println(alumnos[i].toString());
					encontrado = true ;
					break;
				}
			}
			
			if(!encontrado) {
				System.out.println("Alumno NO encontrado!!!");
			}
		}	
	}
		
	public static void mostrarDatosAlumnos(Alumno [] alumnos){
		if (alumnos==null ) {
			System.out.println("No hay Alumnos!!!");
		}else {
			System.out.println("------------Listado de alumnos-------------- ");
			System.out.println(" Nombre   Sexo  Edad  Altura  Peso  ");
			System.out.println("-----------------------------------------------");
			for(int i = 0 ; i < alumnos.length ; i++) {
				System.out.printf("%2s %5s %5s %5s %5s \n", alumnos[i].getNombre(), 
						alumnos[i].getSexo(), alumnos[i].getEdad(), 
						alumnos[i].getAltura(), alumnos[i].getPeso()
						);
			}	
		}
	}
	
	//Promedio de edad de las personas cuyo sexo sea masculino
	
	public static void promedioEdad(Alumno [] alumnos) {
		double edadPromedio = 0 ;
		int sumaEdad = 0 , numAlumnos = 0;
		
			for(int i = 0 ; i < alumnos.length ; i++) {
				if(alumnos[i].getSexo()== 'H') {
					sumaEdad = sumaEdad + alumnos[i].getEdad() ;
					numAlumnos++;
				}	
			}
			
			if (numAlumnos == 0) {
	            System.out.println("No hay alumnos hombres para calcular el promedio de edad");
	        }else {
				edadPromedio = (double)sumaEdad/numAlumnos ;
				System.out.printf("Promedio de edad de los Alumnos cuyo sexo sea masculino : %.2f",edadPromedio);
	        }
	}
	
//Total de las personas (hombres y mujeres) que miden más de 1.65 metros.
	
	public static void alumnosAlturaMas(Alumno [] alumnos) {
		int total = 0;
		System.out.println("\nAlumnos que miden mas de 1.65 metros : ");
		for(int i = 0 ; i < alumnos.length ; i++) {
			if(alumnos[i].getAltura() > 1.65 ) {
				System.out.println(alumnos[i].getNombre());
				total++;
			}	
		}
		if (total == 0) {
		    System.out.println("Ningun alumno supera los 1.65 metros");
		}else {
			System.out.println("Total de alumnos que miden mas de 1.65 metros: " + total);
		}
	}
	
	
	public static Alumno [] cargarDatosAlumno() {
		
		System.out.print("Dame el numero de Alumnos a Introducir : ");
		int numAlumno = teclado.nextInt();
		teclado.nextLine();
		
		Alumno [] alumnos = new Alumno[numAlumno];
		for (int i = 0  ; i<alumnos.length ; i++) {
			alumnos[i] = datosAlumno();
		}
		
		return alumnos ;
	} 
	
//DATOS ALUMNOS ----------------------------------------------------------------------
	public static Alumno datosAlumno() {
		Alumno alumno = new Alumno();
		
		alumno.setNombre(PedirNombre());
		alumno.setSexo( PedirSexo());
		alumno.setEdad(PedirEdad());
		alumno.setAltura(PedirAltura());
		alumno.setPeso(PedirPeso());
		
	 return alumno ;
	}
	
	public static String PedirNombre() {	
		System.out.print("\nIntroducir el Nombre de Persona : ");
		String nombre = teclado.nextLine().trim();

	return nombre;	
	}
		
	public static char PedirSexo() {
		char sexoCorrecto, sexo;
		
		System.out.print("Introducir el Sexo de Persona (H/M) : ");
		String sexoEntrada = teclado.nextLine().trim();
		
		sexo = Character.toUpperCase(sexoEntrada.charAt(0));
	
		if (sexo=='H' || sexo=='M') {
			sexoCorrecto = sexo ;
		}else {
			sexoCorrecto = 'M' ;	
		}
		
	return sexoCorrecto;	
	}
		
		
	public static int PedirEdad() {	
		int edadValido = 0 , edad;
		
		do {
			System.out.print("Introducir el Edad de Persona : ");
			edad = teclado.nextInt();
			teclado.nextLine();
			
			if(edad>0) {
				edadValido = edad ;
			}else {
				System.out.println("El Edad debe ser mayor que 0  ");
				edadValido = -1 ;
			}
			
		}while(edadValido<=0);
		
		return edadValido ;	
	}
				
	public static double PedirAltura() {	
		double alturaValido = 0 , altura = 0;
		do {
			System.out.print("Introducir el Altura de Persona : ");
			String alturaEntrada = teclado.next();
			 teclado.nextLine();
			altura = Double.parseDouble(alturaEntrada);
	
			if(altura>0 && altura <= 2.5) {
				alturaValido = altura ;
			}else {
				System.out.println("La altura debe ser entre 0 y 2.5 ");
				alturaValido = -1 ;
			}
			
		}while(alturaValido<=0);
			
     return alturaValido ;
	}
	
	public static double PedirPeso() {	
		double pesoValido = 0 , peso = 0  ;	
		do{
			System.out.print("Introducir el Peso de Persona : ");
			peso = teclado.nextDouble();
			teclado.nextLine();
	
			if(peso>0 && peso <= 150) {
				pesoValido = peso ;
			}else {
				System.out.println("El Peso debe ser entre 0 y 150 ");
				pesoValido = -1 ;
			}
		
		}while(pesoValido<=0);
		
	 return pesoValido ;
	}	
	
// -----------------------------------------------------------------------
	
	public static void pintarMenu(){
		System.out.println("");
		System.out.println("--Menu Principal--");
		System.out.println("0.Fin");
		System.out.println("1.Cargar datos alumnos");
		System.out.println("2.Procesar los datos");
		System.out.println("3.Mostrar datos de los alumnos");
		System.out.println("4.Mostrar datos de un alumno");
		System.out.println("");
	}

	public static int opcionMenu() {
		int ret = 0;
		do { 
			try {
				pintarMenu();
				System.out.print("Dame una Opcion : ");
				ret = teclado.nextInt();
				teclado.nextLine();
					if ((ret<0) || (ret>4)) {
					System.out.println("Opcion fuera del rango (0-4).");
					}
			}catch(Exception e) {
				System.out.println("ERROR! Opcion NO valida ! ");
				teclado.nextLine();
				ret = -1 ;
			}	
		}while((ret<0) || (ret>4) );
		
	return ret ;
	}
	
	
		

	
}
