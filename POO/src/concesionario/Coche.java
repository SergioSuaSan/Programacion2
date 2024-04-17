package concesionario;

public class Coche extends VehiculosConMotor {
	
	protected int puertas;

	public Coche(String marca, String modelo, int precio, String color, int cilindrada, String combustible,
			int puertas) {
		super(marca, modelo, precio, color, cilindrada, combustible);
		this.puertas = puertas;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		return "Coche [puertas=" + puertas + ", cilindrada=" + cilindrada + ", combustible=" + combustible + ", marca="
				+ marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color + "]";
	}
	
	
}
