package UD6_OOP.Animales;

public class Perro {

	private String nombre ;
	private double peso ;
	private double altura ; 
	private String genero ;
	private String raza ;
	private int edad = 0 ;
	private boolean esBacunado = false ;
	
	
	public Perro(String nombre, String genero, String raza) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.raza = raza;
	}

	public void ladrar() {
		System.out.println("Gouu ghou... : " + nombre);
	}

	public void jugar() {
		
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public boolean isEsBacunado() {
		return esBacunado;
	}


	public void setEsBacunado(boolean esBacunado) {
		this.esBacunado = esBacunado;
	}


	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + ", genero=" + genero + ", raza="
				+ raza + ", edad=" + edad + ", esBacunado=" + esBacunado + "]";
	}

	
}
