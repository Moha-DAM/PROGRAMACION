package UD11_Parlanchin;

public class TestInterface {

	public static void hazleHablar(Parlanchin pl) {
        pl.hablar();
    }
	
	
	public static void main(String[] args) {
	
			Perro perro = new Perro();
	        Gato gato = new Gato();
	        Cucu cucu = new Cucu();

	//LLamada al metodo hablar()   
	        System.out.println("---> LLamada al Metodo hablar() :");    
	        perro.hablar();
	        gato.hablar();
	        cucu.hablar();

	// LLamada al metodo hazleHablar       
	        System.out.println("\n---> LLamada al Metodo hazleHablar() :");    
	        hazleHablar(perro);
	        hazleHablar(gato);
	        hazleHablar(cucu);

	}

	
	
	
}
