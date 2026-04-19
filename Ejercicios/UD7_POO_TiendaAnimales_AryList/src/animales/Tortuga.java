package animales;

import java.util.Objects;

public class Tortuga {

	private int     id    = 0 ;
	private String especie = null ;  
	private boolean deAguaDulce = false ;
	
	
// Constructor:
	public Tortuga() {
		
	}
	public Tortuga(int id, String especie, boolean deAguaDulce) {
		this.id = id;
		this.especie = especie;
		this.deAguaDulce = deAguaDulce;
	}

// GETTERS SETTERS :
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean isDeAguaDulce() {
		return deAguaDulce;
	}

	public void setDeAguaDulce(boolean deAguaDulce) {
		this.deAguaDulce = deAguaDulce;
	}

	
//--------------------------------------
	@Override
	public int hashCode() {
		return Objects.hash(deAguaDulce, especie, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tortuga other = (Tortuga) obj;
		return deAguaDulce == other.deAguaDulce && Objects.equals(especie, other.especie) && id == other.id;
	}
	
//--------------------------------------
	@Override
	public String toString() {
		return "Tortuga [id=" + id + ", especie=" + especie + ", deAguaDulce=" + deAguaDulce + "]";
	}

}
