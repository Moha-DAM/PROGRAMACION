package UD11_MiCoche;

public class Sedan extends Coche {

	private int longitud ;

	
	public Sedan(int velicidad, double precio, String color, int longitud) {
		super(velicidad, precio, color);
		this.longitud = longitud;
	}


	@Override
	public double getPrecio() {
		double precio = 0 ;
		if(longitud>3){
			precio = this.precio * 0.95 ;
		}else {
			precio = this.precio * 0.90 ;
		}
		
	return precio;
	}

}
