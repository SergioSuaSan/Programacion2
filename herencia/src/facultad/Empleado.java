package facultad;

public class Empleado extends Persona {
	
	protected int annoIncorporacion;
	protected int despacho;
	public Empleado(String nombre, String apellido, String dNI, int annoIncorporacion, int despacho) {
		super(nombre, apellido, dNI);
		this.annoIncorporacion = annoIncorporacion;
		this.despacho = despacho;
	}
	public int getAnnoIncorporacion() {
		return annoIncorporacion;
	}
	public void setAnnoIncorporacion(int annoIncorporacion) {
		this.annoIncorporacion = annoIncorporacion;
	}
	public int getDespacho() {
		return despacho;
	}
	public void setDespacho(int despacho) {
		this.despacho = despacho;
	}
	@Override
	public String toString() {
		return "Empleado [annoIncorporacion=" + annoIncorporacion + ", despacho=" + despacho + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", DNI=" + DNI + "]";
	}
	
	

}
