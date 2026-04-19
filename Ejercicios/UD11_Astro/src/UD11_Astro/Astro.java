package UD11_Astro;

public abstract class Astro {

	protected String nombre ;
	protected double radioEcuatorial;
	protected double rotacionEje;
	protected double masa ;
	protected double temperaturaMedia;
	protected double gravedad ;
	
	
	public Astro(String nombre, double radioEcuatorial, double rotacionEje, double masa, double temperaturaMedia, double gravedad) {
		this.nombre = nombre ;
		this.radioEcuatorial = radioEcuatorial;
		this.rotacionEje = rotacionEje;
		this.masa = masa;
		this.temperaturaMedia = temperaturaMedia;
		this.gravedad = gravedad;
	}
//METODOS -----------------------------------------------------------------------------
	public abstract void mustrar();
	
	
//GETTERS  ---------------------------------------------------------------
public String getNombre() {
	return nombre;
}
public double getRadioEcuatorial() {
	return radioEcuatorial;
}
public double getRotacionEje() {
	return rotacionEje;
}
public double getMasa() {
	return masa;
}
public double getTemperaturaMedia() {
	return temperaturaMedia;
}
public double getGravedad() {
	return gravedad;
}
	
	
	
}
