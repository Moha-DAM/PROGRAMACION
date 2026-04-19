package UD9_GestorAlumnos.Modelo.Pojos;

public class Asignatura {

	private String codasignatura = null;
	private String nombreasignatura = null;
	private String descripcion = null;
	
	
//CONSTRUCTORES
	public Asignatura() {
	
	}
	
	public Asignatura(String codasignatura, String nombreasignatura, String descripcion) {
	
		this.codasignatura = codasignatura;
		this.nombreasignatura = nombreasignatura;
		this.descripcion = descripcion;
	}

//GETTERS- SETTERS
	public String getCodasignatura() {
		return codasignatura;
	}

	public void setCodasignatura(String codasignatura) {
		this.codasignatura = codasignatura;
	}

	public String getNombreasignatura() {
		return nombreasignatura;
	}

	public void setNombreasignatura(String nombreasignatura) {
		this.nombreasignatura = nombreasignatura;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	//
	@Override
	public String toString() {
		return "Asignatura [codasignatura=" + codasignatura + ", nombreasignatura=" + nombreasignatura
				+ ", descripcion=" + descripcion + "]";
	}

	
}
