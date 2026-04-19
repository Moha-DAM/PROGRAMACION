package UD6_OOP.Ejer02_Persona;

public class Persona {

	
	private String nombre;
	private String apellidos;
	private int edad ;
	private boolean casado ;
	private String numeroDocumentoIdentidad;
	
	
	public Persona() {
		
	}

	
	
	public Persona(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public String getNumeroDocumentoIdentidad() {
		return numeroDocumentoIdentidad;
	}

	public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad) {
		this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", casado=" + casado
				+ ", numeroDocumentoIdentidad=" + numeroDocumentoIdentidad + "]";
	}
	
	
	
	
	
}
