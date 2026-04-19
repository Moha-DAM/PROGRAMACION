package ud9_Ejemplo.Modelo.Pojos;

public class Alumno {

	private String Dni = null ;
	private String nombre = null ;
	private String apellidos = null ;
	private String Grupo = null ;
	
	
	
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
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
		return Grupo;
	}
	public void setGrupo(String grupo) {
		Grupo = grupo;
	}
	
	@Override
	public String toString() {
		return "Alumno [Dni=" + Dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", Grupo=" + Grupo + "]";
	}
	
}
