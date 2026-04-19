package UD11_Mascota;

public class Canario extends Aves {

	private String color ;
	private boolean canta ;
	
	
	
	
	public Canario(String nombre, int edad, Estado estado, int fechaNacimiento, Pico pico, boolean vuela,
			String color, boolean canta) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		this.color = color;
		this.canta = canta;
	}

	
	@Override
	public void muestra() {
		System.out.println("\nCanario= " + this.nombre + ", edad= " + this.edad + ", estado= "
				+ this.estado + ", fechaNacimiento= " + this.fechaNacimiento
		+ ", pico= " + this.pico + ", vuela= " + this.vuela 
		+", color= " + this.color + ", canta= " + this.canta);


	}

	@Override
	public void habla() {
		if(estado == Estado.vivo && canta) {
			System.out.println("El Canario "+this.nombre+" dice : PIOPIO!! PIIIIO!!!");
		}else if(!canta){
			System.out.println("El Canario  "+this.nombre+" NO Canta");
			}else {
				System.out.println("El Canario  "+this.nombre+" Muerto no puede Cantar");
			}
	}
	
	@Override
	public void volar() {
		if(estado == Estado.vivo && vuela) {
			System.out.println("El Canario "+this.nombre+" Volando ");
		}else if(!vuela){
			System.out.println("El Canario  "+this.nombre+" NO Volar");
			}else {
				System.out.println("El Canario  "+this.nombre+" Muerto no puede Volar");
			}

	}

}
