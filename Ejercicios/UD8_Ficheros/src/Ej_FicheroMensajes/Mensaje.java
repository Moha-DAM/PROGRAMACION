package Ej_FicheroMensajes;

public class Mensaje {

	
	private String fecha ;
	private String hora ;
	private String de ;
	private String para ;
	private String asunto ;
	private String contenido ;
	
	
	
//Contructor   ---------------------------------------------------------------------------
	
	public Mensaje() {
	
	}
	
	public Mensaje(String fecha, String hora, String de, String para, String asunto, String contenido) {
		this.fecha = fecha;
		this.hora = hora;
		this.de = de;
		this.para = para;
		this.asunto = asunto;
		this.contenido = contenido;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	
	@Override
	public String toString() {
		return "Mensaje [fecha=" + fecha + ", hora=" + hora + ", de=" + de + ", para=" + para + ", asunto=" + asunto
				+ ", contenido=" + contenido + "]";
	}
	
	
}

