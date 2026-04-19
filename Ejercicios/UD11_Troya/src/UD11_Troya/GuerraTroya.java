package UD11_Troya;

public class GuerraTroya {

	public static void main(String[] args) {
	
		Caballo caballo = new Caballo(20);
		
		Griego griego1 = new Griego("Aquiles",15,1);
		Griego griego2 = new Griego("Agamenon",50,10);
		Griego griego3 = new Griego("Ajax",25,9);
		
		caballo.montarseEnCaballo(griego1);
		caballo.montarseEnCaballo(griego2);
		caballo.montarseEnCaballo(griego3);
		
		caballo.mostrarCaballo();
		
	//guerrero griego anonimo
		Griego griego4 = new Griego();
		caballo.montarseEnCaballo(griego4);
		caballo.mostrarCaballo();
		
	//Buscar a Agamenon en el caballo y mostrar sus datos
		
		int pos =caballo.buscar("Agamenon");
		caballo.mostrarGuerreroPosicion(pos);
		
	//Buscar a Odiseo en el caballo y comprobar que no existe.
		
		int pos2 =caballo.buscar("Odiseo");
		caballo.mostrarGuerreroPosicion(pos2);
		
	//Crear 1 guerrero troyano (Paris).
		
		Troyano tr = new Troyano("Paris",19,5);
		caballo.montarseEnCaballo(tr);

	}

	
}
