package UD11_TiendaMascota.modelo.pojos;

public class Cocodrilo extends Reptil {
 
	private int numDientes ;

	
	
	public Cocodrilo() {
		super();
	}

	public Cocodrilo(int idCollar, String especie, boolean aguaDulce, int numDientes) {
		super(idCollar, especie, aguaDulce);
		this.numDientes = numDientes;
	}

	
	
	public int getNumDientes() {
		return numDientes;
	}

	public void setNumDientes(int numDientes) {
		this.numDientes = numDientes;
	}

	@Override
	public String toString() {
		return "Cocodrilo [idCollar= " + idCollar + ", especie= " + especie
				+ ", aguaDulce= " + aguaDulce + ", numDientes= " + numDientes + "]";
	}

}
