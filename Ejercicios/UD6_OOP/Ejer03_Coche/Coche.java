package UD6_OOP.Ejer03_Coche;

public class Coche {

	private int velocidad;
	
	
	public Coche() {
			velocidad=0;
	}

	
   // int getVelocidad(). Este método devuelve la velocidad actual.
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	// void acelera(int mas). Este método actualiza la velocidad a más kilometros/h.
	public void acelera(int mas) {
		this.velocidad = velocidad + mas ;
	}
	

	// void frena(int menos). Este método actualiza la velocidad a menos kilometros/h.
	public void frena(int menos) {
		this.velocidad = velocidad - menos ;
	}

	
	
	
	
	
	
	
	
}
