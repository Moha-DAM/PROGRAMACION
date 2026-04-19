package UD6_OOP.Ejer01_Taxi;

public class Taxi {

	private String provincia;
	private String matricula;
	private String municipio;
	private int motor ;
	
	
    public Taxi() {
		
	} 
		
	public String getProvincia() {
		return provincia;
	}
	
	public void TaxiApp() {
		
		
	}
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public int getMotor() {
		return motor;
	}
	public void setMotor(int motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Taxi [provincia=" + provincia + ", matricula=" + matricula + ", municipio=" + municipio + ", motor="
				+ motor + "]";
	}

	
}
