package UD11_Multimedia;

public class Pelicula extends Multimedia {
	
	private String actorPrincipal ;
	private String actrizPrincipal ;
	
//CONSTRUCTOR ----------------------------------------------------------------
	public Pelicula(String titulo, String autor, Formato formato, int duracion, String actorPrincipal,
			String actrizPrincipal) {
		super(titulo, autor, formato, duracion);
		this.actorPrincipal = actorPrincipal;
		this.actrizPrincipal = actrizPrincipal;
	}
	
//GETTERS METODOS ------------------------------------------------------------------------

	public String getActorPrincipal() {
		return actorPrincipal;
	}

	public String getActrizPrincipal() {
		return actrizPrincipal;
	}
	
// TO STRING ---------------------------------------------------------------------------------

	@Override
	public String toString() {
		return "Pelicula [ titulo="+ titulo + ", autor=" + autor + ", formato=" + formato 
				+ ", duracion=" + duracion +", actorPrincipal=" + actorPrincipal + ", actrizPrincipal=" + actrizPrincipal + "]";
	}

	
/* Es  valido Tambien: 
	@Override
	public String toString() {
		return "Pelicula [actorPrincipal=" + actorPrincipal + ", actrizPrincipal=" + actrizPrincipal + ", getTitulo()="
				+ getTitulo() + ", getAutor()=" + getAutor() + ", getFormato()=" + getFormato() + ", getDuracion()="
				+ getDuracion() + "]";
	}
*/
	
	

}
