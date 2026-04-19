package UD11_TiendaMascota.modelo.pojos;

public abstract class Reptil extends Animal {

	protected String especie;
    protected boolean aguaDulce;
    
    
    
	public Reptil() {
		super();
	}
	
	public Reptil(int idCollar , String especie, boolean aguaDulce) {
		super(idCollar);
		this.especie = especie;
		this.aguaDulce = aguaDulce;
	}

	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean isAguaDulce() {
		return aguaDulce;
	}

	public void setAguaDulce(boolean aguaDulce) {
		this.aguaDulce = aguaDulce;
	}

	@Override
	public String toString() {
		return "Reptil [especie=" + especie + ", aguaDulce=" + aguaDulce + ", idCollar=" + idCollar + "]";
	}
  
}
