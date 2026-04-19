package UD6_OOP.Ejer01_Taxi;

public class TaxiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Taxi miTaxi = new Taxi();
		
		miTaxi.setProvincia("Bizkaia");
		miTaxi.setMatricula("8444ES");
		miTaxi.setMunicipio("Bibao");
		miTaxi.setMotor(1);
		
		//Mostrar Datos de Taxi :
		System.out.println(miTaxi.toString());
		
		System.out.println("\nCaracteristicas de mi Taxi :");
	    System.out.println("Provincia: " + miTaxi.getProvincia());
	    System.out.println("Matricula: " + miTaxi.getMatricula());
	    System.out.println("Municipio: " + miTaxi.getMunicipio());
	    System.out.println("Motor: " + miTaxi.getMotor());	
		
	}
}
