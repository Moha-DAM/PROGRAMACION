package UD06_GestorAlumnos;
import java.util.Objects;

public class Alumno {
	
//Atributos :	
private String nombre = null, apellido = null;
private int edad = 0 ,  nota = 0 ;

//Constructores:	

public Alumno() {
	
}

public Alumno(String nombre, String apellido, int edad, int nota) {
	
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.nota = nota;
	}

//Getters/Settters:
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
//----------------------------------------
	@Override
	public int hashCode() {
		return Objects.hash(apellido, edad, nombre, nota);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellido, other.apellido) && edad == other.edad && Objects.equals(nombre, other.nombre)&& nota == other.nota;
	}
	
//----------------------------------------
	@Override
	public String toString() {
		return "Alumno : [nombre= " + nombre + ", apellido= " + apellido + ", edad= " + edad + ", nota= " + nota+ "]";
	}
}
