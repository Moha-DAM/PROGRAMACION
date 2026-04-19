package UD9_GestorAlumnos.Vista;

import java.util.ArrayList;
import java.util.Scanner;

import UD9_GestorAlumnos.Controlador.ControladorAlumno;
import UD9_GestorAlumnos.Controlador.ControladorCalificacion;
import UD9_GestorAlumnos.Modelo.Pojos.Alumno;
import UD9_GestorAlumnos.Modelo.Pojos.Asignatura;
import UD9_GestorAlumnos.Modelo.Pojos.Calificacion;

public class Menu {
	private Scanner teclado = null;
	private ControladorAlumno controladorAlum = null;
	private ControladorCalificacion controladorCalif = null;
	
	public Menu() {
		this.teclado = new Scanner(System.in);
		this.controladorAlum = new ControladorAlumno();
		this.controladorCalif = new ControladorCalificacion();
	}
	

//Menu Principal
	public void pintarMenu() {
		System.out.println("");
		System.out.println("--Menu Principal--");
		System.out.println("0.Salir");
		System.out.println("1.Buscar un Alumno");
		System.out.println("2.Mostrar todos los Alumnos");
		System.out.println("3.Anadir nuevo Alumno");
		System.out.println("4.Modificar Alumno");
		System.out.println("5.Mostrar Todas Notas Alumnos");
		System.out.println("6.Mostrar Nota Alumno");
		System.out.println("7.Insertar Nota");
		System.out.println("8.Borrar Alumno");
		System.out.println("9.Borrar Todos Alumnos");
		System.out.println("");
	}
	
	public int opcionMenu() {
		int ret = 0 ;
		do {
			try {
				pintarMenu() ;
				System.out.print("Dame una opcion : ");
				ret =teclado.nextInt();
				teclado.nextLine();
					if ( (ret<0) || (ret>9) ) {
						System.out.println("Ojo! debe introducir un numero entre 0 y 9 ");
					}
			}catch (Exception e) {
				System.out.println("ERROR! no es un numero ");
				teclado.nextLine();
				ret = -1 ;
			}	
		}while( (ret<0) || (ret>9) ) ;	
	return ret ;	
	}
	
	public void ejecutarGestorAlumnos() {
		int opcion = 0 ;
		do{
			opcion = opcionMenu() ;
			switch (opcion) {
			case 0 : System.out.println("ADIOS !! ");
				break ;
			case 1 : mostrarAlumno();
				break ;
			case 2 : mostrarTodosAlumnos();
				break ;
			case 3 : anadirAlumno();
				break ;
			case 4 : ejecutarMenuUpdate();
				break ;
			case 5 : mostrarNotasTodosAlumnos();
				break ;
			case 6 : mostrarNotasAlumno();
				break ;
			case 7 : insertarNota();
				break ;
			case 8 : borrarAlumno();
				break ;
			case 9 : borrarTodosAlumnos();
				break ;
			}	
		}while(opcion!=0);
	}
	
//MOSTRAR
    private void mostrarAlumno() {
       String nombre = pedirNombre();
       String apellidos = pedirApellidos();

        Alumno alumno = controladorAlum.buscarAlumnoPorNombreyApellido(nombre, apellidos);
        System.out.println("--------------------------------------------");
	        if (alumno != null) {
	        System.out.println(alumno.toString());
	        }else {
	            System.out.println("No se encontro ningun alumno con esos datos");
	        }
        System.out.println("--------------------------------------------");
    }
    
    private void mostrarTodosAlumnos() {
    	 ArrayList <Alumno> alumnos = null;
         alumnos = controladorAlum.mostrarAlumnos();
         System.out.println("--------------------------------------------");
 	        if (alumnos != null) {
 	        	for(Alumno alumno : alumnos) {
 	        		System.out.println(alumno);
 	        	}
 	        }else {
 	            System.out.println("NO hay ningun alumno!!");
 	        }
         System.out.println("--------------------------------------------");
     }
    
    private void mostrarNotasTodosAlumnos() {
    	ArrayList <Calificacion> calificaciones =  null;
    	calificaciones = controladorCalif.mostrarNotasTodosAlumnos();
    	System.out.println("--------------------------------------------");
    	
    	if (calificaciones!=null && !calificaciones.isEmpty()) {
    		for(Calificacion calificacion : calificaciones) {
    			
    			String dni = calificacion.getAlumno().getDni();
    			String codAsignatura = calificacion.getAsignatura().getCodasignatura();
    			int nota = calificacion.getNota();
    			
	        	System.out.println("Calificacion [DNI=" + dni  + ", CodAsignatura=" + codAsignatura + ", Nota=" + nota+ "]");
	        	}
	        }else {
	            System.out.println("NO hay ningun calificacion!!");
	        }
     System.out.println("--------------------------------------------");	
    }
    
    private void mostrarNotasAlumno() { 
    	ArrayList <Calificacion> calificaciones =  null;
    	calificaciones = controladorCalif.mostrarNotasAlumno(pedirDni());
    	System.out.println("--------------------------------------------");
    	
    	if(calificaciones!=null && !calificaciones.isEmpty()) {
    		for(Calificacion calificacion : calificaciones) {
    			
    			String dni = calificacion.getAlumno().getDni();
    			String codAsignatura = calificacion.getAsignatura().getCodasignatura();
    			int nota = calificacion.getNota();
    			
    			System.out.println("Calificacion [DNI=" + dni  + ", CodAsignatura=" + codAsignatura + ", Nota=" + nota+ "]");	
    		}
    			
		}else {
            System.out.println("NO hay ningun calificacion!!");
        }

    	System.out.println("--------------------------------------------");
    }
    
// INSERTS   
    private void anadirAlumno() {
    	System.out.println("-->Anadimos un Nuevo Alumno.");
    	controladorAlum.anadirAlumnos(pedirDatosAlumno());
    	System.out.println("Alumno Anadido con Exito!!");
    }
    
    private void insertarNota() {
    	System.out.println("-->Anadimos Nota.");
    	
    	Alumno alumno = new Alumno();
    	Asignatura asignatura = new Asignatura();
    	
    	String dni = pedirDni();
    	String codAsignatura = pedirCodAsignatura() ;
    	int nota = pedirNota();
    	
    	alumno.setDni(dni);
    	asignatura.setCodasignatura(codAsignatura);
    
    	controladorCalif.insertarNotas(alumno, asignatura, nota);
    	System.out.println("Nota Anadida con Exito!!");	
    }
    
 //UPDATES
 
  	public void pintarMenuUpdate() {
  		System.out.println("");
  		System.out.println("--Menu Update--");
  		System.out.println("0.Volver al Menu Principal");
  		System.out.println("1.Modificar todo los Datos Alumno");
  		System.out.println("2.Modificar el DNI ");
  		System.out.println("3.Modificar el Nombre");
  		System.out.println("4.Modificar el Apellido");
  		System.out.println("5.Modificar el Grupo");
  		System.out.println("");
  	}
  	
  	public int opcionMenuUpdate() {
  		int ret = 0 ;
  		do {
  			try {
  				pintarMenuUpdate() ;
  				System.out.print("Dame una opcion : ");
  				ret =teclado.nextInt();
  				teclado.nextLine();
  					if ( (ret<0) || (ret>5) ) {
  						System.out.println("Ojo! debe introducir un numero entre 0 y 5 ");
  					}
  			}catch (Exception e) {
  				System.out.println("ERROR! no es un numero ");
  				teclado.nextLine();
  				ret = -1 ;
  			}	
  		}while( (ret<0) || (ret>5) ) ;	
  	return ret ;	
  	}
  	
  	public void ejecutarMenuUpdate() {
  		int opcion = 0 ;
  		do{
  			opcion = opcionMenuUpdate() ;
  			switch (opcion) {
  			case 0 : System.out.println("Volver al Menu Principal ");
  				break ;
  			case 1 : modificarDatosAlumno();
  				break ;
  			case 2 : modificarDniAlumnos() ;
  				break ;
  			case 3 : modificarNombreAlumnos();
  				break ;
  			case 4 : modificarApellidoAlumnos();
  				break ;
  			case 5 : modificarGrupoAlumnos();
  				break ;
  			}	
  		}while(opcion!=0);
  	}
  	
    private void modificarDatosAlumno() {
    	System.out.println("-->Primero se debe introducir el DNI actual del alumno, seguido de los nuevos datos.");
    	controladorAlum.modificarDatosAlumnos(pedirDni(), pedirDatosAlumno());
    }
    
    private void modificarDniAlumnos() {
    	System.out.println("-->Primero se debe introducir el DNI actual del alumno, seguido del nuevo DNI.");
    	
    	controladorAlum.modificarDniAlumnos(pedirDni(), pedirDni());
    	System.out.println("Dni Alumno Modificado con Exito!!");
    }
    private void modificarNombreAlumnos() {
    	System.out.println("-->Modificamos el Nombre del alumno.");
    	controladorAlum.modificarNombreAlumnos(pedirDni(), pedirNombre());
    	System.out.println("Nombre del Alumno Modificado con Exito!!");
    }
    private void modificarApellidoAlumnos() {
    	System.out.println("-->Modificamos el Apellido del alumno.");
    	controladorAlum.modificarApellidoAlumnos(pedirDni(), pedirApellidos());
    	System.out.println("Apellido del Alumno Modificado con Exito!!");
    }
    
    private void modificarGrupoAlumnos() {
    	System.out.println("-->Modificamos el Grupo del alumno.");
    	
    	String dni = pedirDni();
    	String grupo = pedirGrupo();
    	
    	Alumno alumno = new Alumno();
    	alumno.setDni(dni);
    	
    	controladorAlum.modificarGrupoAlumnos(alumno, grupo);
    	System.out.println("Grupo del Alumno Modificado con Exito!!");
    }
    
  //DELETE
   private void borrarAlumno() {
	   System.out.println("-->Borramos el Alumno.");
	   
	   String dni = pedirDni();
	   boolean encontrado = controladorAlum.borrarAlumno(dni);;

	    if (encontrado) {
	        System.out.println("Alumno eliminado correctamente");
	    } else {
	        System.out.println("No se encontro alumno con ese DNI");
	    }
   }
   
   private void borrarTodosAlumnos() {
	   System.out.println("-->Borramos TODOS Alumnos.");
	  
	   controladorAlum.BorrarTodosAlumnos();
	   
	   System.out.println("Alumnos Borrados con Exito!!");  
   }
    
  //----------------------------------------------------------  
    private Alumno pedirDatosAlumno() {
    	Alumno ret = new Alumno();
    	ret.setDni(pedirDni());
    	ret.setNombre(pedirNombre());
    	ret.setApellidos(pedirApellidos());
    	ret.setGrupo(pedirGrupo());
    	return ret ;
    }
    
    private String pedirDni() {
    	String ret = null ;
        System.out.print("Dame el Dni : ");
        ret = teclado.nextLine().trim();

      return ret ;
    }
    
    private String pedirNombre() {
    	String ret = null ;
        System.out.print("Dame el Nombre : ");
        ret = teclado.nextLine().trim();

      return ret ;
    }
    
    private String pedirApellidos() {
    	String ret = null ;
        System.out.print("Dame el Apellidos : ");
        ret = teclado.nextLine().trim();
  
      return ret ;
    }
    
    private String pedirGrupo() {
    	String ret = null ;
        System.out.print("Dame el Grupo : ");
        ret = teclado.nextLine().trim();

      return ret ;
    }
    
    private String pedirCodAsignatura() {
    	String ret = null ;
        System.out.print("Dame el Codigo Asignatura : ");
        ret = teclado.nextLine().trim();

      return ret ;
    }
    
    private int pedirNota() {
    	int ret = 0 ;
    	do {
	    	try {
		        System.out.print("Introducir la Nota (entre 0 y 10) : ");
		        ret = teclado.nextInt();
		        teclado.nextLine();
		        	if(ret<0 || ret >10) {
		        		System.out.println("OJO! la Nota debe ser entre 0 y 10 ");
		        	}
	    	}catch(Exception e) {
	    		System.out.println("ERROR!! NO es un numero! ");
	    		teclado.nextLine();
	    		ret= -1 ;
	    	}
    	}while(ret<0 || ret >10);
    	
      return ret ;
    }
    

    
}
