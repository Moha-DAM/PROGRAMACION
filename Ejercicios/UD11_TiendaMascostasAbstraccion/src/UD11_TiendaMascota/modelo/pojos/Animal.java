package UD11_TiendaMascota.modelo.pojos;

public abstract class Animal {

	protected int idCollar ;

	public Animal() {
		
	}
	
	public Animal(int idCollar) {
		this.idCollar = idCollar;
	}

	
	public int getIdCollar() {
		return idCollar;
	}

	public void setIdCollar(int idCollar) {
		this.idCollar = idCollar;
	}

	
	@Override
	public String toString() {
		return "Animal [idCollar= " + idCollar + "]";
	}
	
	
	
}
