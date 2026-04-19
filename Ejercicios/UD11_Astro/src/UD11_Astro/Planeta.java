package UD11_Astro;

import java.util.ArrayList;

public class Planeta extends Astro {

	private double distanciaAlSol;
	private double orbitaAlSol; 
	private boolean tieneSatelites;
	private ArrayList <Satelite> lstSatelites ;

	
	public Planeta(String nombre ,double radioEcuatorial, double rotacionEje, double masa, double temperaturaMedia, double gravedad,
			double distanciaAlSol, double orbitaAlSol, boolean tieneSatelites) {
		super(nombre, radioEcuatorial, rotacionEje, masa, temperaturaMedia, gravedad);
		this.distanciaAlSol = distanciaAlSol;
		this.orbitaAlSol = orbitaAlSol;
		this.tieneSatelites = tieneSatelites;
		this.lstSatelites = new ArrayList <Satelite>();
	}



	@Override
	public void mustrar() {
		System.out.println("\nnombre= " + this.nombre + ", radioEcuatorial= "+ this.radioEcuatorial 
				+ ", rotacionEje= " + this.rotacionEje + ", masa= " + this.masa 
				+ ", temperaturaMedia= "	+ this.temperaturaMedia + ", gravedad= " + this.gravedad
				+", distanciaAlSol= " + this.distanciaAlSol + ", orbitaAlSol=" + this.orbitaAlSol 
				+ ", tieneSatelites= "+ this.tieneSatelites
				);
	}


	public double getDistanciaAlSol() {
		return distanciaAlSol;
	}

	public double getOrbitaAlSol() {
		return orbitaAlSol;
	}

	public boolean isTieneSatelites() {
		return tieneSatelites;
	}

	public ArrayList<Satelite> getLstSatelites() {
		return lstSatelites;
	}

	public void anadirSatelite(Satelite stl) {
		lstSatelites.add(stl);
	}

}
