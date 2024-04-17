package restaurante;

public abstract class Platos {

	protected String nombre;
	protected float precio;
	public Platos(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Platos [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
	
}
