package UD11_Troya;

import java.util.ArrayList;

public class Caballo {

	private final int capacidad;  //Nº Max de griegos 
	private int ocupacion ; //Nº Actual de griegos
	private ArrayList <Guerrero> ocupantes ;
	
	
	public Caballo(int capacidad) {
		this.ocupacion = 0 ;
		this.capacidad = capacidad;
		this.ocupantes = new ArrayList <Guerrero>();
	}
	
	public int buscar(String nombre) {
		int pos = -1 ;
		for(int i=0 ; i<ocupantes.size(); i++ ) {
			if(ocupantes.get(i).getNombre().equalsIgnoreCase(nombre)) {
				pos = i ;
				break;
			}
		}

	return pos ;
	}
	
	public void mostrarGuerreroPosicion(int pos) {
		
		if(pos>=0 && pos<ocupantes.size()){
			Guerrero gr = ocupantes.get(pos);
			System.out.println("\n*** DATOS del GUERRERO ***");
			System.out.println("Nombre : "+gr.getNombre());
			System.out.println("Edad : "+gr.getEdad());
			System.out.println("Fuerza : "+gr.getFuerza());
			System.out.println("Herido : "+gr.isHerido());
			System.out.println("Muerto : "+gr.isMuerto());	
		}else{
			System.out.println("\nPocicion NO es Valida. Guerrero NO Existe!! ");	
		}	
	}
	
	public void montarseEnCaballo(Guerrero guerrero) {
		
		if(guerrero instanceof Griego) {
			if(ocupacion<capacidad) {
				ocupantes.add(guerrero) ;
				ocupacion++;
				System.out.println("\nGuerrero Griego "+guerrero.getNombre()+" montado en caballo");
			}else {
				System.out.println("NO HAY Espacio en el caballo!!!");
			}
		}else {
			System.out.println("\nAtencion!!!"
			+"\nGuerrero Troyano "+guerrero.getNombre()+" intentando acceder al caballo!!");
			guerrero.setMuerto(true);
		}	
	}
	
	public void mostrarCaballo() {
		System.out.println("\n*** Info del Caballo ***");
		System.out.println("Capacidad "+capacidad+" || "+" Ocupacion "+ocupacion);
		for(Guerrero gr : ocupantes) {
			System.out.println("\n---> Guerrero : "
			+"Nombre : "+gr.getNombre()
			+" || "+"Edad : "+gr.getEdad()
			+" || "+"Fuerza : "+gr.getFuerza()
			+" || "+"Herido : "+gr.isHerido()
			+" || "+"Muerto : "+gr.isMuerto());	
		}
	}
	
}
	

