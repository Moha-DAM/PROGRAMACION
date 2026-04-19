package UD11_Multimedia;

public class Disco extends Multimedia {
	
	private Genero genero ;

	public Disco(String titulo, String autor, Formato formato, int duracion, Genero genero) {
		super(titulo, autor, formato, duracion);
		this.genero = genero;
	}

	
	public Genero getGenero() {
		return genero;
	}


	@Override
	public String toString() {
		return "Disco [" +super.toString() +", genero=" + genero + "]";
	}
	
	
	
}
