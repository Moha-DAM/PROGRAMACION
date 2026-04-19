package UD9_GestorAlumnos.Controlador;

import java.util.ArrayList;

import UD9_GestorAlumnos.Modelo.Bbdd.Gestor.GestorCalificaciones;
import UD9_GestorAlumnos.Modelo.Pojos.Alumno;
import UD9_GestorAlumnos.Modelo.Pojos.Asignatura;
import UD9_GestorAlumnos.Modelo.Pojos.Calificacion;


public class ControladorCalificacion {
	
	
	public ArrayList <Calificacion> mostrarNotasTodosAlumnos() {
		ArrayList <Calificacion> Calificaciones = new ArrayList <Calificacion>();
		GestorCalificaciones gestorCalificacion = new GestorCalificaciones();
		Calificaciones= gestorCalificacion.mostrarNotasTodosAlumno();
		
		return Calificaciones;
	}
	
	public ArrayList <Calificacion> mostrarNotasAlumno(String dni){
		ArrayList <Calificacion> Calificaciones = new ArrayList <Calificacion>();
		GestorCalificaciones gestorCalificacion = new GestorCalificaciones();
		Calificaciones= gestorCalificacion.mostrarNotasAlumno(dni);
		
		return Calificaciones;
	}
	
	public void insertarNotas(Alumno alumno, Asignatura asignatura  ,int nota) {
		
		GestorCalificaciones gestorCalificacion = new GestorCalificaciones();
		gestorCalificacion.insertarNota(alumno, asignatura, nota);	
	}
	
	
	
}
