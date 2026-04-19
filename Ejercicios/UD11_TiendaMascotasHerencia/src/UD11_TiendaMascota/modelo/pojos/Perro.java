package UD11_TiendaMascota.modelo.pojos;

public class Perro extends Mamifero {
   
    private boolean vacunado;

	public Perro() {
		super();
	}

	public Perro(int idCollar, String nombre, String raza, boolean vacunado) {
		super(idCollar, nombre, raza);
		this.vacunado = vacunado ;
	}

	
	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	@Override
	public String toString() {
		return "Perro [" + " idCollar= " + idCollar +", nombre= " + nombre + ", raza= " + raza+", vacunado= " + vacunado + "]";
	}

   
}