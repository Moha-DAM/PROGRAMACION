package UD11_Troya;

public class Griego extends Guerrero {

//CONSTRUCTOR ----------------------------------------------------------------
	public Griego(String nombre, int edad, int fuerza) {
		super(nombre, edad, fuerza);	
	}

	public Griego() {
		super("GriegoX",20 ,8);	
	}
	
//METODOS -----------------------------------------------------------------------
	@Override
	public boolean retirarse() {
		boolean retirarse = false ;
		
		System.out.println("*** Accion : Retirarse ***");
		System.out.println("Griego : "+this.getNombre());
		System.out.println("Edad : "+this.getEdad());
		System.out.println("Fuerza : "+this.getFuerza());
		
		if(this.isHerido() && !this.isMuerto()) {
			System.out.println("Esta herido --> RETIRADA ");
			retirarse = true ;
		}else if (!this.isHerido() && !this.isMuerto() ){
			System.out.println("NO Esta herido --> NO RETIRADA ");

			}else {
				System.out.println("Esta Muerto --> NO RETIRADA");		
			}	
		
		return retirarse;
	};

	
}
