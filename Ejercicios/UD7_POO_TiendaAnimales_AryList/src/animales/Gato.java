package animales;

import java.util.Objects;

public class Gato {

	private int     id    = 0 ;
	private String nombre = null ;  
	private String raza   = null ;
	private String color  = null ;
	

	
// Constructor:
	public Gato() {	
		
	}
	
	public Gato(int id , String nombre , String raza, String color ) {
		this.id = id ; 
		this.nombre = nombre ; 
		this.raza = raza ; 
		this.color = color ;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
//--------------------------------------
	@Override
	public int hashCode() {
		return Objects.hash(color, id, nombre, raza);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(color, other.color) && id == other.id && Objects.equals(nombre, other.nombre)
				&& Objects.equals(raza, other.raza);
	}
	
// ------------------------------------------
	@Override
	public String toString() {
		return "Gato [id=" + id + ", nombre=" + nombre + ", raza=" + raza + ", color=" + color + "]";
	}
	
	
	
	
}
