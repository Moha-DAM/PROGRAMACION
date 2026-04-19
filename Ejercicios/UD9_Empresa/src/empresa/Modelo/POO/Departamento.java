package empresa.Modelo.POO;

public class Departamento {
	
	private int num=0;
	private String nombre=null;
	private String ubicacion=null;
	
	
//constructor
	public Departamento() {

	}
	
	public Departamento(int num, String nombre, String ubicacion) {
		this.num = num;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "Departamento [num=" + num + ", nombre=" + nombre + ", ubicacion=" + ubicacion + "]";
	}
	
	
	
}
