package UD11_Troya;

public class Guerrero {

	protected String Nombre ;
	protected int edad ;
	protected int fuerza ;
	protected boolean herido ;
	protected boolean muerto ;
	
	
//CONSTRUCTOR ----------------------------------------------------------------
	
public Guerrero(String nombre, int edad, int fuerza) {
		this.Nombre = nombre;
		
		if(comprobarEdad(edad)) {
			this.edad = edad;
		}else {
			this.edad = 25;
		}
		
		if(comprobarFuerza(fuerza)) {
			this.fuerza = fuerza;
		}else {
			this.fuerza = 5;
		}
	
		this.herido = false ;
		this.muerto = false ;
	}

//METODOS ----------------------------------------------------------------	
	public boolean retirarse() {
	  return false ;
	};
	
	public static boolean comprobarEdad(int edad) {
		boolean edadValido = false ;
		
		if(edad>=15 && edad<=60) {
			edadValido = true ;
		}else {
			edadValido = false ;
		}
		
	return edadValido ;
	}
	
	public static boolean comprobarFuerza(int f) {
		boolean fuerzaValida = false ;
		
		if(f>=1 && f<=10) {
			fuerzaValida = true ;
		}else {
			fuerzaValida = false ;
		}
		
	return fuerzaValida ;
	}
	
//GETTERS SETTERS ----------------------------------------------------------
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public boolean isHerido() {
		return herido;
	}
	public void setHerido(boolean herido) {
		this.herido = herido;
	}
	public boolean isMuerto() {
		return muerto;
	}
	public void setMuerto(boolean muerto) {
		this.muerto = muerto;
	}
	
	
}
