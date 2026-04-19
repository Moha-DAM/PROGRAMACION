package UD6_OOP.Ejer05_Temperatura;

public class Temperatura {
	
	private double gradoTemperatura = 0 ;
	
	public Temperatura() {
		
	}
	
	public double celsiusToFahrenheit(double gradoCelsius) {
		double gradoFahrenheit = 0 ;
		gradoFahrenheit = (gradoCelsius * 1.8) + 32 ;
		
	return gradoFahrenheit;
	}
	
	public double fahrenheitToCelsius(double gradoFahrenheit) {
		double gradoCelsius = 0 ;
		gradoCelsius = (gradoFahrenheit - 32) * 5/9 ;
		
	return gradoCelsius;
	}

	
	
	public double getGradoTemperatura() {
		return gradoTemperatura;
	}

	public void setGradoTemperatura(double gradoTemperatura) {
		this.gradoTemperatura = gradoTemperatura;
	}

	@Override
	public String toString() {
		return "Temperatura [gradoTemperatura=" + gradoTemperatura + "]";
	}
	

}
