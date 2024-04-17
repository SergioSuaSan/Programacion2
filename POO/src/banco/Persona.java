package banco;

public class Persona {

	//Atributos
	private String dni;
	private String nombre;
	private long telefono;
	
	//Constructor
	public Persona(String dni, String nombre, long telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public Persona(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	
	
	//Getter y setter
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

	public String getDni() {
		return dni;
	}
	
	//ToString	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	
	
	
	
}
