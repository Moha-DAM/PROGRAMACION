package GestorAlumnos;
import java.util.ArrayList;
import java.util.Scanner;

import AlumnoPojo.Alumno;

public class Menu {
	
	private Scanner teclado = null;
	private ArrayList <Alumno> alumnos = null;
	private static final int max_opciones_menu = 10 ;// al declararlo static, significa que este valor es constante y pertenece a la clase, no a los objetos.
	 
	
	public Menu() {
		teclado = new Scanner(System.in);
		alumnos = new ArrayList <Alumno>();
	}
	//--------------------------------------------------		
	public void EjecutarMenu() {
	  int  opcion = 0 ;
	  
	  do {
		  opcion = MostrarMenu() ;
		switch (opcion) {
			case 0 : 	System.out.println("Adios ! ");
				break ;
			case 1 :	anadirAlumno();		
				break ;
			case 2 : 	mostrarTodosAlumnos();
				break ;
			case 3 : 	visualUnAlumno(buscarAlumno());
				break ;
			case 4 : 	modificarAlumno();
				break ;
			case 5 : 	borrarAlumno();
				break ;
			case 6 : 	insertarNota();
				break ;
			case 7 : 	modificarNota();
				break ;
			case 8 : 	borrarNota();
				break ;
			case 9 : 	notaMediaAlumnos();
				break ;
			case 10 : 	notaMaxMin();
				break ;   
		}		
	  }while(opcion!=0);
	}	
//--------------------------------------------------		
	public void pintarMenu(){
		System.out.println("");
		System.out.println("--Menu Principal--");
		System.out.println("0.Salir");
		System.out.println("1.Añadir un Alumno");
		System.out.println("2.Mostrar todos los Alumnos");
		System.out.println("3.Buscar un Alumno");
		System.out.println("4.Modificar un Alumno");
		System.out.println("5.Borrar un Alumno");
		System.out.println("6.Insertar Nota");
		System.out.println("7.Modificar Nota");
		System.out.println("8.Borrar Nota");
		System.out.println("9.Nota Media Todo los Alumnos");
		System.out.println("10.Nota Maxima y Minima");
		System.out.println("");
	}

	public int MostrarMenu() {
		int ret = 0;
		do { 
			try {
				pintarMenu();
				System.out.print("Dame una Opcion : ");
				ret = teclado.nextInt();
				teclado.nextLine();
					if ((ret<0) || (ret>max_opciones_menu)) {
					System.out.println("Opcion fuera del rango permitido (0-10), Inténtalo de nuevo. ");
					}
			}catch(Exception e) {
				System.out.println("ERROR! Opcion NO valida ! ");
				teclado.nextLine();
				ret = -1 ;
			}	
		}while((ret<0) || (ret>max_opciones_menu) );
		
	return ret ;
	}
	
	public Alumno PedirAlumno() {
		Alumno alumno = new Alumno ();
		String nombre = null , apellido = null ;
		int edad = 0 ;
		
		System.out.print("Dame el Nombre : ");
		nombre = teclado.nextLine().trim();
		
		System.out.print("Dame el Apellido : ");
		apellido = teclado.nextLine().trim();
		
		edad = PedirEdadAlumno();
		
		alumno.setNombre(nombre);
		alumno.setApellido(apellido);
		alumno.setEdad(edad);
		
	return alumno ;
	}
	
	public int PedirEdadAlumno() {
		int ret = 0 ;
		do {
			try {
				System.out.print("Dame la Edad : ");
				ret = teclado.nextInt();
				teclado.nextLine();
					if (ret < 16 || ret > 100) {
		                System.out.println("Edad fuera del rango permitido (16-100). Inténtalo de nuevo.");
		            }
			}catch (Exception e) {
				System.out.println("la Edad es No valido!! entre un numero ");
				teclado.nextLine();
				ret = -1 ;
			}
		}while((ret<16) || (ret>100)); // si tenemos en cuenta la edad entre 16 y 100 anos,
		
	return ret ;
	}
	
	public String PedirNombreAlumno() {
		String ret = null ;
		
		System.out.print("Dame el Nombre : ");
		ret = teclado.nextLine().trim();
		
		return ret ;
	}
	
	public void anadirAlumno() {
		Alumno alumno = PedirAlumno();
		alumnos.add(alumno);
		System.out.println("El Alumno anadido con exito! : "+alumno);		
	}
	
	public void mostrarTodosAlumnos() {
		//if((alumnos!= null) && (alumnos.size() == 0) )--> de abajo es mas claro:
		if (alumnos == null || alumnos.isEmpty()) { //"Si la lista de alumnos no ha sido creada o está vacía, entonces..."
			System.out.println("No hay alumnos , Array vacio !! ");
		}else {
			for (Alumno alumno : alumnos) {
					System.out.println("--> " +alumno);
			}
		}
	}
	
	public Alumno buscarAlumno() {
		Alumno ret  = null;
		
		if (alumnos == null || alumnos.isEmpty()) { 
			System.out.println("No hay alumnos , Array vacio !!");
		}else {
		    String nombre = PedirNombreAlumno();
			for(Alumno alumno : alumnos) {
				if (alumno.getNombre().equalsIgnoreCase(nombre)) {
					ret = alumno ;
					break;
				}
			}
		}
		
	return ret ;
	}	
	
	public void visualUnAlumno(Alumno alumno) {
        if(alumno!=null) {
			System.out.println("El Alumno encontrado ");
			System.out.println(alumno);
        }else {
        	System.out.println("El Alumno No Encontrado ! ");
        }	
	}
	
	public void modificarAlumno() {
		Alumno alumno = buscarAlumno() ;
		if (alumno==null){
			System.out.println("El Alumno NO encontrado !!");
		}else {
			System.out.println("El Alumno encontrado");
				alumnos.remove(alumno);
				alumno = PedirAlumno();
				alumnos.add(alumno);

				System.out.println(alumno) ;
				System.out.println("El Alumno Modificado con exito. ");
		}
	}	

	
	public void borrarAlumno() {
		Alumno alumno = buscarAlumno() ;
		if (alumno==null){
			System.out.println("El Alumno NO encontrado !!");
		}else {
				alumnos.remove(alumno);
				System.out.println("El Alumno Borrado con exito. ");
		}
	}	

	public int pedirNota() {
		int ret = 0 ;
		do {
			try {
				System.out.print("Dame la nota : ");
				ret = teclado.nextInt();
				teclado.nextLine();
				
			}catch(Exception e) {
				System.out.println("ERROR ! La nota NO valida ");
				teclado.nextLine();
				ret = -1 ;
			}
		}while((ret<0) || (ret>10));
		
	return ret ;	
	}
	
	public void insertarNota() {
	
	  Alumno alumno = buscarAlumno() ;
		if (alumno==null){
			System.out.println("El Alumno NO encontrado !!");
		}else {
			  System.out.println("El Alumno encontrado");
			  if(alumno.getNota()==0) {
				  int nota = pedirNota();
	
				alumno.setNota(nota);;
				System.out.println(alumno) ;
				System.out.println("La nota insertada con exito. ");		
			  }else {
				  System.out.println("La nota ya esta insertada !!!");
			  }
		}
	}	
	
	public void modificarNota() {
		
	  Alumno alumno = buscarAlumno() ;
		if (alumno==null){
			System.out.println("El Alumno NO encontrado !!");
		}else {
			  System.out.println("El Alumno encontrado");
			  if(alumno.getNota()!=0) {
				  int nota = pedirNota();
	
					alumno.setNota(nota);;
					System.out.println(alumno) ;
					System.out.println("La nota modificada con exito. ");		
			  }else {
				  System.out.println("La nota NO esta insertada, debe insertarla en primero !!!");
			  }
		}
	}	
	
public void borrarNota() {
	Alumno alumno = buscarAlumno() ;
		if (alumno==null){
			System.out.println("El Alumno NO encontrado !!");
		}else {
			  System.out.println("El Alumno encontrado");
			  if(alumno.getNota()!=0) {
	
					alumno.setNota(0);;
					System.out.println(alumno) ;
					System.out.println("La nota Borrada con exito. ");		
			  }else {
				  System.out.println("La nota NO esta insertada, ya esta en 0 !!!");
			  }
		}
	}	
	
	public void notaMediaAlumnos() {
		int nota = 0 , sumaNota = 0 , countAlumnos = 0;
		double mediaNota = 0 ;
		for(Alumno alumno : alumnos) {
			if (alumno!=null) {
				nota = alumno.getNota() ;
				sumaNota = sumaNota +  nota  ;
				countAlumnos++;
			}	
		}
		if (countAlumnos==0 ) {
			System.out.println("NO hay Alumnos Rejestrados !! ");
		}else {
			mediaNota = (double )sumaNota/countAlumnos ;
			System.out.printf("La Media nota de todos los Alumnos es : %.2f",mediaNota);
			System.out.println("");
		}
	}
	
	public void notaMaxMin() {
		int nota = 0 , countAlumnos = 0; 
		int notaMax = Integer.MIN_VALUE , notaMin = Integer.MAX_VALUE;
		
		for(Alumno alumno : alumnos)  {
			if (alumno!=null) {
				nota = alumno.getNota() ;
			
				if(nota>notaMax) {
					notaMax = nota ;
				}
				
				if(nota<notaMin) {
					notaMin = nota ;
				}
			  countAlumnos++;
			}		
		}	
		if (countAlumnos==0) {
			System.out.println("NO hay Alumnos Rejestrados !! ");
		}else {
			System.out.println("La  nota Max es : "+notaMax);
			System.out.println("La  nota Min es : "+notaMin);
		}
	} 		 
}
	
