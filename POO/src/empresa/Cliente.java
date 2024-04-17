package empresa;

public class Cliente extends Persona{

	private int numSocio;

	

	public Cliente(String dni, String nombre, long telefono, int numSocio) {
		super(dni, nombre, telefono);
		this.numSocio = numSocio;
	}

	public int getNumSocio() {
		return numSocio;
	}

	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}

	@Override
	public String toString() {
		return "Cliente [numSocio=" + numSocio + ", dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	
	
	
}
