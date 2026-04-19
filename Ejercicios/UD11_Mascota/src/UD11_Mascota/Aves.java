package UD11_Mascota;

public abstract class Aves extends Mascota {

	protected Pico pico ;
	protected boolean vuela ;
	
	
	public Aves(String nombre, int edad, Estado estado, int fechaNacimiento, Pico pico, boolean vuela) {
		super(nombre, edad, estado, fechaNacimiento);
		this.pico = pico;
		this.vuela = vuela;
	}
	
	public abstract void volar() ;
	

}
