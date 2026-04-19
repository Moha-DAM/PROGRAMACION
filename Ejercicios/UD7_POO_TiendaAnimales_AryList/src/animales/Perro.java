package animales;

import java.util.Objects;

public class Perro {

	private int     id    = 0 ;
	private String nombre = null ;  
	private String raza   = null ;
	private boolean estaVacunado  = false ;
	

	
// Constructor:
	public Perro() {
		
	}
	public Perro(int id, String nombre, String raza, boolean estaVacunado) {
		this.id = id;
		this.nombre = nombre;
		this.raza = raza;
		this.estaVacunado = estaVacunado;
	}
	
	
	
// GETTERS SETTERS :
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean isEstaVacunado() {
		return estaVacunado;
	}

	public void setEstaVacunado(boolean estaVacunado) {
		this.estaVacunado = estaVacunado;
	}
	
//--------------------------------------
	@Override
	public int hashCode() {
		return Objects.hash(estaVacunado, id, nombre, raza);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perro other = (Perro) obj;
		return estaVacunado == other.estaVacunado && id == other.id && Objects.equals(nombre, other.nombre)
				&& Objects.equals(raza, other.raza);
	}
	
//--------------------------------------
	@Override
	public String toString() {
		return "Perro [id=" + id + ", nombre=" + nombre + ", raza=" + raza + ", estaVacunado=" + estaVacunado + "]";
	}
	
	
	
	
	
}
