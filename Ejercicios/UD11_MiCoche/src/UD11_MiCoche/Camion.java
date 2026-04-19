package UD11_MiCoche;

public class Camion extends Coche {

	private int peso ;


	public Camion(int velicidad, double precio, String color, int peso) {
		super(velicidad, precio, color);
		this.peso = peso;
	}


	@Override
	public double getPrecio() {
		double precio = 0 ;
		
		if(peso>2000){
			precio = this.precio * 0.90 ;
		}else {
			precio = this.precio * 0.80 ;
		}
		
	return precio;
	}	
	
}
