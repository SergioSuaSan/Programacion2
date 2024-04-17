package facultad;

public class Servicio extends Empleado {
	
	public enum Seccion {
		BIBLIOTECA, DECANATO, SECRETARIA
	}
	
	protected Seccion seccion;

	public Servicio(String nombre, String apellido, String dNI, int annoIncorporacion, int despacho, Seccion seccion) {
		super(nombre, apellido, dNI, annoIncorporacion, despacho);
		this.seccion = seccion;
	}

	public Seccion getSeccion() {
		return seccion;
	}

	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}

	@Override
	public String toString() {
		return "Servicio [seccion=" + seccion + ", annoIncorporacion=" + annoIncorporacion + ", despacho=" + despacho
				+ ", nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + "]";
	}
	
	
	

}
