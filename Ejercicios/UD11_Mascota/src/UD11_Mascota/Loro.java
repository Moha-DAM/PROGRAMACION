package UD11_Mascota;

public class Loro extends Aves {

	private String origen ;
	private boolean habla ;
	
	
	
	public Loro(String nombre, int edad, Estado estado, int fechaNacimiento, Pico pico, boolean vuela, String origen,
			boolean habla) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		this.origen = origen;
		this.habla = habla;
	}

	

	@Override
	public void muestra() {
		System.out.println("\nLoro= " + this.nombre + ", edad= " + this.edad + ", estado= "
				+ this.estado + ", fechaNacimiento= " + this.fechaNacimiento
		+ ", pico= " + this.pico + ", vuela= " + this.vuela 
		+", origen= " + this.origen + ", habla= " + this.habla);

	}

	
	@Override
	public void habla() {
		if(estado == Estado.vivo && habla) {
			System.out.println("El Loro "+this.nombre+" dice : KAKA!! KAKAOU!!!");
		}else if(!habla){
			System.out.println("El Loro  "+this.nombre+" NO Habla");
			}else {
				System.out.println("El Loro  "+this.nombre+" Muerto no puede Hablar");
			}
	}

	@Override
	public void volar() {
		if(estado == Estado.vivo && vuela) {
			System.out.println("El Loro "+this.nombre+" Volando ");
		}else if(!vuela){
			System.out.println("El Loro  "+this.nombre+" NO Volar");
			}else {
				System.out.println("El Loro  "+this.nombre+" Muerto no puede Volar");
			}
	}
}
