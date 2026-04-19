package UD11_Troya;

public class Troyano extends Guerrero {

//CONSTRUCTOR ----------------------------------------------------------------
	public Troyano(String nombre, int edad, int fuerza) {
		super(nombre, edad, fuerza);
	}

	public Troyano() {
		super("TroyanoX", 18 , 10);
	}
	
//METODOS -----------------------------------------------------------------------
@Override
public boolean retirarse() {	
	System.out.println("*** Accion : Retirarse ***");
	System.out.println("Troyano : "+this.getNombre());
	System.out.println("Edad : "+this.getEdad());
	System.out.println("Fuerza : "+this.getFuerza());
	
	if(this.isHerido()) {
		 System.out.println("Esta herido --> Los Guerreros Troyanos NUNCA se retiran!!!");
	}else {
		System.out.println("NO Esta herido");
	}

  return false; 
};

	
	
}
