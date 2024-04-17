package amiguitosSolito;

public class Amigo {
	
	protected String nombre;
	protected String apodo;

	
	
	
	@Override
	public String toString() {
		return "Amigo [nombre=" + nombre + ", apodo=" + apodo + "]";
	}
	public Amigo(String nombre, String apodo) {
		super();
		this.nombre = nombre;
		this.apodo = apodo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
	
	

}
