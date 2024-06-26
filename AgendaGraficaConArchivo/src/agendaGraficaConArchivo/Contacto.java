package agendaGraficaConArchivo;

import java.io.Serializable;

public class Contacto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1053368128609148912L;
	//Atributos
	private String nombre;
	private long telefono;
	
	
	//Métodos
	
	public Contacto(String nombre, long telefono) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public Contacto(String nombre) {
		super();
		this.nombre = nombre;
	}


	public Contacto(long telefono) {
		super();
		this.telefono = telefono;
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
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	
	
	
}
