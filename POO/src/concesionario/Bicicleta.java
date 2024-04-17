package concesionario;

public class Bicicleta extends VehiculosSinMotor {
	
	protected int marchas;
	protected String tipo;
	public Bicicleta(String marca, String modelo, int precio, String color, int marchas, String tipo) {
		super(marca, modelo, precio, color);
		this.marchas = marchas;
		this.tipo = tipo;
	}
	public int getMarchas() {
		return marchas;
	}
	public void setMarchas(int marchas) {
		this.marchas = marchas;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Bicicleta [marchas=" + marchas + ", tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo
				+ ", precio=" + precio + ", color=" + color + "]";
	}
	
	

}
