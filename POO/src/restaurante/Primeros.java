package restaurante;

public class Primeros extends Platos{

	protected boolean compartir;

	public Primeros(String nombre, float precio, boolean compartir) {
		super(nombre, precio);
		this.compartir = compartir;
	}

	public boolean isCompartir() {
		return compartir;
	}

	public void setCompartir(boolean compartir) {
		this.compartir = compartir;
	}
	
	
	
	
}
