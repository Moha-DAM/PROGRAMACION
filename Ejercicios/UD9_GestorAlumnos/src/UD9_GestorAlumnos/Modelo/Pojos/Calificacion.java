package UD9_GestorAlumnos.Modelo.Pojos;

public class Calificacion {

	private int nota = 0 ;
	Alumno alumno = null ;
	Asignatura asignatura = null ;
	

	//CONSTRUCTORES
	public Calificacion() {
		
	}
	
	public Calificacion(Alumno alumno, Asignatura asignatura, int nota) {
		this.nota = nota;
		this.alumno = alumno;
		this.asignatura = asignatura;
	}

//GETTERS- SETTERS
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

//
	@Override
	public String toString() {
		return "Calificacion [nota=" + nota + ", alumno=" + alumno + ", asignatura=" + asignatura + "]";
	}
	

}
