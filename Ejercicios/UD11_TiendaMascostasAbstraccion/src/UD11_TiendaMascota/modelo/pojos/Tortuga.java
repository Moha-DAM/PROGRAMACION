package UD11_TiendaMascota.modelo.pojos;


public class Tortuga extends Reptil {
   
    
	public Tortuga() {
		super();
	}
	
	public Tortuga(int idCollar, String especie, boolean aguaDulce) {
		super(idCollar, especie, aguaDulce);
	}

	
	@Override
	public String toString() {
		return "Tortuga [idCollar= " + idCollar + ", especie= " + especie + ", aguaDulce= " + aguaDulce + "]";
	}

   
}