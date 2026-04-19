package UD11_TiendaMascota.modelo.pojos;

public abstract class Mamifero extends Animal {

	protected String nombre;
    protected String raza;
    
    
    public Mamifero() {
		super();
	}
    
	public Mamifero(int idCollar , String nombre, String raza) {
		super(idCollar);
		this.nombre = nombre;
		this.raza = raza;
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

	@Override
	public String toString() {
		return "Mamifero ["+" idCollar= " + idCollar +", nombre= " + nombre + ", raza= " + raza+ "]";
	}
    
    
    
	
}
