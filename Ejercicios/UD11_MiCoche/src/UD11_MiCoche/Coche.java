package UD11_MiCoche;

public class Coche {

	protected int velicidad;
	protected double precio;
	protected String color;
	
	
	public Coche(int velicidad, double precio, String color) {
		this.velicidad = velicidad;
		this.precio = precio;
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}
	
}
