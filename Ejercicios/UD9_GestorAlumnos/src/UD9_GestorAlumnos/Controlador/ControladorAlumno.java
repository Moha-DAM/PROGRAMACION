package UD9_GestorAlumnos.Controlador;

import java.util.ArrayList;

import UD9_GestorAlumnos.Modelo.Bbdd.Gestor.GestorAlumnos;
import UD9_GestorAlumnos.Modelo.Pojos.Alumno;

public class ControladorAlumno {
   
	 GestorAlumnos gestorAlumnos = new GestorAlumnos();
	    /**
	     * retorna del BBDD el alumno y las notas dado el nombre y apellidos.
	     * @param nombre El nombre del alumno a buscar
	     * @param apellidos Los apellidos del alumno a buscar
	     * @return El objeto Alumno encontrado o null si no se encuentra
	     */
	    public Alumno buscarAlumnoPorNombreyApellido(String nombre, String apellidos) {
	    	Alumno ret = null ;
	       
	        ret = gestorAlumnos.buscarAlumnoPorNombreyApellidos(nombre, apellidos);
	        return  ret ;
	    }
	    
	    public ArrayList <Alumno> mostrarAlumnos(){
	    	ArrayList <Alumno> alumnos = null;	    	
	    	 alumnos = gestorAlumnos.mostrarTodosAlumnos();
	    
	    return alumnos;	
	    }
	    
	   public void anadirAlumnos(Alumno alumno) {
	    	gestorAlumnos.insertarAlumno(alumno);	
	    }
	    
	    public void modificarDatosAlumnos(String dni, Alumno alumno) { 
	    	 gestorAlumnos.modificarDatosAlumno(dni, alumno);
	    }
	    
	    public void modificarDniAlumnos(String dni, String newDni) { 
	    	 gestorAlumnos.modificarDniAlumno(dni, newDni);
	    }
	    
	    public void modificarNombreAlumnos(String dni, String newNombre) {
	    	gestorAlumnos.modificarNombreAlumno(dni, newNombre);
	    }
	    
	    public void modificarApellidoAlumnos(String dni, String newApellido) {
	    	gestorAlumnos.modificarApellidoAlumno(dni, newApellido);
	    }
	    
	    public void modificarGrupoAlumnos(Alumno alumno, String newGrupo) {
	    	gestorAlumnos.modificarGrupoAlumno(alumno, newGrupo);;
	    }
	    
	    public boolean borrarAlumno( String dni) { 
	    	 boolean encontrado = gestorAlumnos.borrarAlumno(dni);	
	    return encontrado ;
	    }
	    
	    public void BorrarTodosAlumnos() { 
	    	gestorAlumnos.borrarTodosAlumnos();	
	    }
	    
}
