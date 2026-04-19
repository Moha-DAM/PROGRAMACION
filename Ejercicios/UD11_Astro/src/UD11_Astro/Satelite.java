package UD11_Astro;

public class Satelite extends Astro {
	
	
	private double distanciaAlPlaneta;
	private double orbitaPlanetaria;
	private Planeta planetaPertenece;
	
	
	public Satelite(String nombre, double radioEcuatorial, double rotacionEje, double masa, double temperaturaMedia, double gravedad,
			double distanciaAlPlaneta, double orbitaPlanetaria, Planeta planetaPertenece) {
		super(nombre, radioEcuatorial, rotacionEje, masa, temperaturaMedia, gravedad);
		this.distanciaAlPlaneta = distanciaAlPlaneta;
		this.orbitaPlanetaria = orbitaPlanetaria;
		this.planetaPertenece = planetaPertenece;
	}


	@Override
	public void mustrar() {

		System.out.println("\nnombre= " + this.nombre + ", radioEcuatorial= "+ this.radioEcuatorial 
				+ ", rotacionEje= " + this.rotacionEje + ", masa= " + this.masa 
				+ ", temperaturaMedia= "	+ this.temperaturaMedia + ", gravedad= " + this.gravedad
				+", distanciaAlPlaneta= " + this.distanciaAlPlaneta 
				+ ", orbitaPlanetaria= "+ this.orbitaPlanetaria 
				+ ", planetaPertenece= "+this.planetaPertenece.getNombre()
				);

	}

	public double getDistanciaAlPlaneta() {
		return distanciaAlPlaneta;
	}


	public double getOrbitaPlanetaria() {
		return orbitaPlanetaria;
	}


	public Planeta getPlanetaPertenece() {
		return planetaPertenece;
	}

	
}
