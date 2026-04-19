package UD11_Multimedia;

import java.util.Objects;

public class Multimedia {

	protected String titulo ;
	protected String autor ;
	protected Formato formato ;
	protected int duracion ;
	
//CONSTRUCTOR ----------------------------------------------------------------
	public Multimedia(String titulo, String autor, Formato formato, int duracion) {
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}

//GETTERS METODOS ------------------------------------------------------------------------
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Formato getFormato() {
		return formato;
	}

	public int getDuracion() {
		return duracion;
	}
	
// TO STRING ---------------------------------------------------------------------------------
	@Override
	public String toString() {
		return "titulo=" + titulo + ", autor=" + autor + ", formato=" + formato 
				+ ", duracion=" + duracion;
	}

	
// EQUALS -------------------------------------------------------------------------------	

	public boolean equals(Multimedia multimedia) {
	    boolean equals = false;
	    
	    if (multimedia == null) {
	        equals = false;
	    } else {
	        equals = Objects.equals(autor, multimedia.autor) && 
	               Objects.equals(titulo, multimedia.titulo);
	    }
	   return equals;
	}

	
}
