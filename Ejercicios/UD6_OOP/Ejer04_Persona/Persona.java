package UD6_OOP.Ejer04_Persona;

import java.util.Random;

public class Persona {

	public static final int debajoPeso = -1;
    public static final int idealPeso = 0;
    public static final int sobrePeso = 1;
	private static final char sexoDefecto = 'M'; 

	private String nombre ;
	private int edad ;
	private String DNI;
	private char sexo ; 
	private double peso;
	private double altura;
	
	
	
//CONSTRUCTORES -------------------------------------------------------------------------------------
	// constructor por defecto:
	public Persona() {
		this.nombre = "";
        this.edad = 0;
        this.DNI = generaDNI();
        this.sexo = sexoDefecto;
        this.peso = 0.0;
        this.altura = 0.0;
	}
	
	//constructor con el nombre, edad y sexo, el resto por defecto:
	public Persona(String nombre, int edad,  char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.DNI = generaDNI();
        this.peso = 0.0;
        this.altura = 0.0;
	}
	
	//constructor con todos los atributos como parámetro:
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {	
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
		this.DNI = generaDNI();
	}
	
//METODOS---------------------------------------------------------------------------------------------
/**
 * 	
 * @return
 */
	public int calcularIMC() {
		int num = 0 ; 
		
		if (altura <=0) {
			System.out.println("La altura debe ser mayor que 0 ");
		}else {
			double IMC = peso/(altura*altura);
			if(IMC<20) {
				num = debajoPeso ;
				
			}else if(IMC<=25) {
				num = idealPeso ;	
			}else {
				num = sobrePeso ;
			}
		}
		
	return num ;
	}
	
/**
 * 
 * @return
 */
	public boolean esMayorDeEdad() {
		boolean esMayorDeEdad = false ;
		
		 if(edad >=18) {
			 esMayorDeEdad = true ;
		 }
		
	 return esMayorDeEdad;
	}
/**
 * 
 * @param sexo
 */
	private char comprobarSexo(char sexo) {
		char sexoCorrecto;
		if (sexo=='H' || sexo=='M') {
			sexoCorrecto = sexo ;
		}else {
			sexoCorrecto='H' ;	
		}
	return sexoCorrecto ;
	}
	
//GENERAR DNI ------------------------------------------------------------------
	private int generaNum8Cifras() {
	    int num8Cifras;
	    num8Cifras = (int) (Math.random() * 90000000) + 10000000;
	    return num8Cifras;
	}
	
	private char letraDni(int Num8Cifras) {
		
		char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                          'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		int posLetra = Num8Cifras%23 ;
		char letraDni = letras[posLetra] ;	
		
	return 	letraDni ;
	}
	
	private String generaDNI() {
		int Num8Cifras = generaNum8Cifras() ;
		char letraDni = letraDni(Num8Cifras);
		
		String DNI = Num8Cifras +""+letraDni;
	
	 return DNI ;
	}
	

//GETTERS Y SETTERS------------------------------------------------------------------------------------
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDNI() {
		return DNI;
	}

	/* public void setDNI(String dNI) {
		DNI = dNI;
	}  */

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = comprobarSexo(sexo);
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

//TO STRING------------------------------------------------------------------------------------------------------------
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	

	
	
	
}
