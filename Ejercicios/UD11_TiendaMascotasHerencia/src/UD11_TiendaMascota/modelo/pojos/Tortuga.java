package UD11_TiendaMascota.modelo.pojos;

public class Tortuga extends Animal{
   
    private String especie;
    private boolean aguaDulce;
    
    
    
	public Tortuga() {
		super();
	}
	
	public Tortuga(int idCollar, String especie, boolean aguaDulce) {
		super(idCollar);
		this.especie = especie ;
		this.aguaDulce = aguaDulce ;	
		
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
		return "Tortuga ["+" idCollar= " + idCollar +", especie= " + especie + ", aguaDulce= " + aguaDulce + "]";
	}
    
    
    
	

   
}