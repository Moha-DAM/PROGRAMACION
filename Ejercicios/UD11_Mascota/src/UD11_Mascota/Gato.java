package UD11_Mascota;

public class Gato extends Mascota {

	private String color ;
	private boolean peloLargo ;
	
	
	
	public Gato(String nombre, int edad, Estado estado, int fechaNacimiento, String color, boolean peloLargo) {
		super(nombre, edad, estado, fechaNacimiento);
		this.color = color;
		this.peloLargo = peloLargo;
	}

	@Override
	public void muestra() {
		System.out.println("\nGato= " + this.nombre + ", edad= " + this.edad + ", estado= "
				+ this.estado + ", fechaNacimiento= " + this.fechaNacimiento
		+", color= " + this.color + ", peloLargo= " + this.peloLargo );


	}

	@Override
	public void habla() {
		if(estado == Estado.vivo) {
			System.out.println("El Gato "+this.nombre+" dice : MAUO!! MAUOU!!!");
		}else {
			System.out.println("El Gato  "+this.nombre+" Muerto no puede Hablar");
		}	
	}

}
