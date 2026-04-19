package ud9_Ejemplo.Controlador;

import ud9_Ejemplo.Modelo.Bbdd.Gestor.GestorAlumnos;
import ud9_Ejemplo.Modelo.Pojos.Alumno;

public class Controlador {
   
	    /**
	     * retorna del BBDD el alumno y las notas dado el nombre y apellidos.
	     * @param nombre El nombre del alumno a buscar
	     * @param apellidos Los apellidos del alumno a buscar
	     * @return El objeto Alumno encontrado o null si no se encuentra
	     */
	    public Alumno buscarAlumnoPorNombreyApellido(String nombre, String apellidos) {
	    	Alumno ret = null ;
	        GestorAlumnos gestorAlumnos = new GestorAlumnos();
	        ret = gestorAlumnos.buscarAlumnoPorNombreyApellidos(nombre, apellidos);
	        return  ret ;
	    }
	    
}
