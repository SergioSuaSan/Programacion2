package entidades;

public class Poblacion {
	private String nombre;
	private long numeroHabitantes;
	
	public Poblacion(String nombre, long numeroHabitantes) {
		super();
		this.nombre = nombre;
		this.numeroHabitantes = numeroHabitantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getNumeroHabitantes() {
		return numeroHabitantes;
	}

	public void setNumeroHabitantes(long numeroHabitantes) {
		this.numeroHabitantes = numeroHabitantes;
	}

	@Override
	public String toString() {
		return "Poblacion [nombre=" + nombre + ", numeroHabitantes=" + numeroHabitantes + "]";
	}
	
	

}
