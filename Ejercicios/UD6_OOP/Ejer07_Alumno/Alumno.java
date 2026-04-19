package UD6_OOP.Ejer07_Alumno;

public class Alumno {
	
	private String nombre ;
	private char sexo ;
	private int edad ;
	private double altura ;
	private double peso ;
	
//Constructor ----------------------------------------------------------------------
	public Alumno() {
		
	}

// -----------------------------------------------------------------------------------------------------
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Nombre : " + nombre + "\nSexo : " + sexo + "\nEdad : " + edad +" años"+ 
				"\nAltura : " + altura +" m"+ "\nPeso : "
				+ peso +" Kg";
	}

	
}