package restaurante;

public abstract class Pescados extends Platos {

	public Pescados(String nombre, float precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pescados [nombre=" + nombre + ", precio=" + precio + "]";
	}

	
	
}
