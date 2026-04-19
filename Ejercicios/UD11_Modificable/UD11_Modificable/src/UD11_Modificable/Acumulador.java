package UD11_Modificable;

public class Acumulador implements Modificable {

	private int valor ;
	
	
	
//CONSTRUCTOR ----------------------------------------
	public Acumulador(int valor) {
		this.valor = valor;
	}


//METODOS --------------------------------------
	
	@Override
	public void incremento(int incr) {	
		this.valor = valor+ incr ;	
	}

	
	public int getValor() {
		return valor;
	}

	

}
