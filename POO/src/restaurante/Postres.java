package restaurante;

public class Postres extends Platos {

	protected boolean tieneAzucar;

	public Postres(String nombre, float precio, boolean tieneAzucar) {
		super(nombre, precio);
		this.tieneAzucar = tieneAzucar;
	}

	public boolean isTieneAzucar() {
		return tieneAzucar;
	}

	public void setTieneAzucar(boolean tieneAzucar) {
		this.tieneAzucar = tieneAzucar;
	}
	

	@Override
	public String toString() {
		return "Postres [tieneAzucar=" + tieneAzucar + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
	
}
