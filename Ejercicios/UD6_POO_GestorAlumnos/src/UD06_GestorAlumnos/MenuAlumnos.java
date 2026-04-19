package UD06_GestorAlumnos;
import java.util.Scanner;
public class MenuAlumnos {

	private Scanner teclado = null;
	private Alumno [] alumnos = null;
	private static final int max_opciones_menu = 10 ;// al declararlo static, significa que este valor es constante y pertenece a la clase, no a los objetos.
	
	public MenuAlumnos() {
		teclado = new Scanner(System.in);
		alumnos = new Alumno [3];
	}
	
	
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
	
	public void anadirAlumno(Alumno alumno) { //a bajo hay otra version
	
		boolean hayEspacio = false;
		for(int i = 0 ; i<alumnos.length ; i++) {
			if (alumnos[i]==null) {
				alumnos[i]=alumno;
				System.out.println("--> " +alumno.toString());
				System.out.println("El Alumno anadido con exito!! ");
				hayEspacio = true ;
				break;	
			}
		}
		if(!hayEspacio) {
			System.out.println("NO hay espacio para anadir El Alumno ! ");
		}
	}
	
	public void mostrarTodosAlumnos() {
	
		for(int i = 0 ; i<alumnos.length ; i++) {
			if (alumnos[i]!=null) {
				System.out.println("--> " +alumnos[i].toString());
			}	
		}
	}
	
	public Alumno buscarAlumno() {
		boolean encontrado = false ;
		Alumno ret = new Alumno();
		String nombre = PedirNombreAlumno();
		
		for(int i = 0 ; i<alumnos.length ; i++) {
			if ((alumnos[i]!=null) && (alumnos[i].getNombre().equalsIgnoreCase(nombre))) {
				ret = alumnos[i] ;
				encontrado = true ;
				break; // Sale del bucle al encontrar el primero,
			}	
		}
		if(!encontrado) {
			ret = null;
		}
		
	return ret ;
	}	
	
	public void modificarAlumno() {
		Alumno alumno = buscarAlumno() ;
		if (alumno==null){
			System.out.println("El Alumno NO encontrado !!");
		}else {
			for(int i = 0 ; i<alumnos.length ; i++) {
				if (alumnos[i]==alumno) {
					System.out.println("El Alumno encontrado");
					alumnos[i] = PedirAlumno();
					System.out.println(alumnos[i].toString()) ;
					System.out.println("El Alumno Modificado con exito. ");
				}	
			}
		}
	}	
	
	public void borrarAlumno() {
		Alumno alumno = buscarAlumno() ;
		if (alumno==null){
			System.out.println("El Alumno NO encontrado !!");
		}else {
			for(int i = 0 ; i<alumnos.length ; i++) {
				if (alumnos[i]==alumno) {
					alumnos[i] = null;
					System.out.println("El Alumno Borrado con exito. ");
				}	
			}
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
					System.out.println(alumno.toString()) ;
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
					System.out.println(alumno.toString()) ;
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
					System.out.println(alumno.toString()) ;
					System.out.println("La nota Borrada con exito. ");		
			  }else {
				  System.out.println("La nota NO esta insertada, ya esta en 0 !!!");
			  }
		}
	}	
	
	public void notaMediaAlumnos() {
		int nota = 0 , sumaNota = 0 , countAlumnos = 0;
		double mediaNota = 0 ;
		for(int i = 0 ; i<alumnos.length ; i++) {
			if (alumnos[i]!=null) {
				nota = alumnos[i].getNota() ;
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
		
		for(int i = 0 ; i<alumnos.length ; i++) {
			if (alumnos[i]!=null) {
				nota = alumnos[i].getNota() ;
			
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
	
//--------------------------------------------------		
	public void EjecutarMenu() {
	  int  opcion = 0 ;
	  
	  do {
		  opcion = MostrarMenu() ;
		switch (opcion) {
			case 0 : 	System.out.println("Adios ! ");
				break ;
			case 1 :	Alumno alumno = PedirAlumno();
						anadirAlumno(alumno);
				break ;
			case 2 : 	mostrarTodosAlumnos();
				break ;
			case 3 : 	Alumno buscarAlumno = buscarAlumno();
			            if(buscarAlumno!=null) {
			            	System.out.println(buscarAlumno.toString());
							System.out.println("El Alumno encontrado ");
			            }else {
			            	System.out.println("El Alumno No Encontrado ! ");
			            }
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
	  
	 teclado.close(); 
	}	
}
/* este metodo es correcta y util en caso de intentar a anadir un alumno fuera de length
 * se muestra directamente el mensaje de "No hay espacio" antes de pedir los datos
 *  (en case 1: anadirAlumno());
 * public void anadirAlumno() {
		boolean hayEspacio = false;
		for(int i = 0 ; i<alumnos.length ; i++) {
			if (alumnos[i]==null) {
				alumnos[i]=PedirAlumno();
				System.out.println(alumnos[i].toString());
				System.out.println("El Alumno anadido con exito!! ");
				hayEspacio = true ;
				break;	
			}
		}
		if(!hayEspacio) {
			System.out.println("NO hay espacio para anadir El Alumno ! ");
		}
	}
*/	