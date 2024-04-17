package concesionario;

public abstract class VehiculosConMotor extends Vehiculo {
	
	protected int cilindrada;
	protected String combustible;
	public VehiculosConMotor(String marca, String modelo, int precio, String color, int cilindrada,
			String combustible) {
		super(marca, modelo, precio, color);
		this.cilindrada = cilindrada;
		this.combustible = combustible;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public String getCombustible() {
		return combustible;
	}
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	@Override
	public String toString() {
		return "VehiculosConMotor [cilindrada=" + cilindrada + ", combustible=" + combustible + ", marca=" + marca
				+ ", modelo=" + modelo + ", precio=" + precio + ", color=" + color + "]";
	}
	
	
	
	
	
	
}
