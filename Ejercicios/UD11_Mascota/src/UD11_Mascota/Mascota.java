package UD11_Mascota;

public abstract class Mascota {
	
	protected String nombre ;
	protected int edad ;
	protected Estado estado ;
	protected int fechaNacimiento ;
	
	
	public Mascota(String nombre, int edad, Estado estado, int fechaNacimiento) {
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public abstract void muestra();
	public abstract void habla();
	
	public void cumpleanos() {
		this.edad++;
	    System.out.println(this.nombre + " ha cumplido " + this.edad + " anos");
	}
	
	public void morir() {
		if(this.estado == Estado.vivo) {
			this.estado = Estado.muerto ;
			System.out.println(this.nombre + " ha muerto");
		}else {
			System.out.println(this.nombre + " ya estaba muerto");
		}
	}
	
	
}
