package empresa.Modelo.POO;

public class Empleado {
	
	private int numEmp = 0 ;
	private String apellido = null ;
	private String oficio = null ;
	private int dir = 0 ;
	private String fecha_alt = null ;
	private Double salario = 0.00 ;
	private Double comision = 0.00 ;
	Departamento departamento = null ;
	
	
	
	public Empleado() {
		
	}
	
	public Empleado(int numEmp, String apellido, String oficio, int dir, String fecha_alt, Double salario,
			Double comision, Departamento departamento) {

		this.numEmp = numEmp;
		this.apellido = apellido;
		this.oficio = oficio;
		this.dir = dir;
		this.fecha_alt = fecha_alt;
		this.salario = salario;
		this.comision = comision;
		this.departamento = departamento;
	}

	
	
	public int getNumEmp() {
		return numEmp;
	}

	public void setNumEmp(int numEmp) {
		this.numEmp = numEmp;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

	public String getFecha_alt() {
		return fecha_alt;
	}

	public void setFecha_alt(String fecha_alt) {
		this.fecha_alt = fecha_alt;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getComision() {
		return comision;
	}

	public void setComision(Double comision) {
		this.comision = comision;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	
	@Override
	public String toString() {
		return "Empleado [numEmp=" + numEmp + ", apellido=" + apellido + ", oficio=" + oficio + ", dir=" + dir
				+ ", fecha_alt=" + fecha_alt + ", salario=" + salario + ", comision=" + comision + ", departamento="
				+ departamento + "]";
	}
	

	
}
