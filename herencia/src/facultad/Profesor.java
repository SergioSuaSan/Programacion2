package facultad;

public class Profesor extends Empleado{
	

	public enum Departamento {
		LENGUAJE, MATEMATICAS, ARQUITECTURA, SISTEMAS
	}
	protected Departamento departamento;
	
	
	public Profesor(String nombre, String apellido, String dNI, int annoIncorporacion, int despacho,
			Departamento departamento) {
		super(nombre, apellido, dNI, annoIncorporacion, despacho);
		this.departamento = departamento;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	@Override
	public String toString() {
		return "Profesor [departamento=" + departamento + ", annoIncorporacion=" + annoIncorporacion + ", despacho="
				+ despacho + ", nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + "]";
	}
	
	
	
	

	
}
