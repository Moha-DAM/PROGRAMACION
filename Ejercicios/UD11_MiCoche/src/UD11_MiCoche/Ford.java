package UD11_MiCoche;

public class Ford extends Coche {

	private int anyo;
	private int descuentoFabricante;


	public Ford(int velicidad, double precio, String color, int anyo, int descuentoFabricante) {
		super(velicidad, precio, color);
		this.anyo = anyo;
		this.descuentoFabricante = descuentoFabricante;
	}

	@Override
	public double getPrecio() {
		double precio = 0 ;
		precio = this.precio - descuentoFabricante;
		
	return precio;
	}
	
	
}
