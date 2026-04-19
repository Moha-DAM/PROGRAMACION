package UD11_TiendaMascota.modelo.pojos;

public class Gato extends Mamifero {
   
    private String color;
    

	public Gato() {
		super();
	}

	public Gato(int idCollar, String nombre, String raza, String color) {
		super(idCollar, nombre, raza);
		this.color = color ;
	}

//GETTERS SETTERS --------------------------------------------------------------------------------
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Gato [" + " idCollar= " + idCollar +", nombre= " + nombre + ", raza= " + raza+ ", color= " + color + "]";
	}

	
    
}