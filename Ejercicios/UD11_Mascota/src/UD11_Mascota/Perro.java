package UD11_Mascota;

public class Perro extends Mascota {

	private String raza ;
	private boolean pulgas ;
	
	
	public Perro(String nombre, int edad, Estado estado, int fechaNacimiento, String raza, boolean pulgas) {
		super(nombre, edad, estado, fechaNacimiento);
		this.raza = raza;
		this.pulgas = pulgas;
	}

	@Override
	public void muestra() {
		System.out.println("\nPerro= " + this.nombre + ", edad= " + this.edad + ", estado= "
				+ this.estado + ", fechaNacimiento= " + this.fechaNacimiento
		+", raza= " + this.raza + ", pulgas= " + this.pulgas );

	}


	@Override
	public void habla() {
		if(estado == Estado.vivo) {
			System.out.println("El perro "+this.nombre+" dice : HAUOOO!! HAUOUUU!!!");
		}else {
			System.out.println("El perro "+this.nombre+" Muerto no puede Hablar");
		}
	}

}
