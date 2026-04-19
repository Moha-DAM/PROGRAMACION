package UD9_GestorAlumnos.Modelo.Pojos;

public class Alumno {

	private String dni = null ;
	private String nombre = null ;
	private String apellidos = null ;
	private String grupo = null ;
	
//CONSTRUCTORES
	public Alumno() {
		
	}
	
	public Alumno(String dni, String nombre, String apellidos, String grupo) {
		this.dni = dni ;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.grupo = grupo;	
	} 
	
//GETTERS- SETTERS
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	@Override
	public String toString() {
		return "Alumno [Dni=" + dni + ", Nombre=" + nombre + ", Apellidos=" + apellidos + ", Grupo=" + grupo + "]";
	}
	
}
