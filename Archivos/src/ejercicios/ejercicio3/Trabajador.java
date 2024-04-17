package ejercicios.ejercicio3;

public class Trabajador {

	private String nombre;
	private int peonadas;
	
	public Trabajador(String nombre, int contador) {
		super();
		this.nombre = nombre;
		this.peonadas = contador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", contador=" + peonadas + "]";
	}

	public int getPeonadas() {
		return peonadas;
	}

	public void setPeonadas(int peonadas) {
		this.peonadas = peonadas;
	}
	
	
}
