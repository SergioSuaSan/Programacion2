package empresa;

public abstract class Persona { //Abstract implica clase NO instanciable
	protected String dni; 			//Los atributos protegidos se pueden heredar, los privados no.
	protected String nombre;
	protected long telefono;
	
	
	
	public Persona(String dni, String nombre, long telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
	}



	public String getDni() {
		return dni;
	}


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public long getTelefono() {
		return telefono;
	}



	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}



	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	
	
	
	
}
