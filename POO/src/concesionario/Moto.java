package concesionario;

public class Moto extends VehiculosConMotor {

	protected String estilo;

	public Moto(String marca, String modelo, int precio, String color, int cilindrada, String combustible,
			String estilo) {
		super(marca, modelo, precio, color, cilindrada, combustible);
		this.estilo = estilo;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	@Override
	public String toString() {
		return "Moto [estilo=" + estilo + ", cilindrada=" + cilindrada + ", combustible=" + combustible + ", marca="
				+ marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color + "]";
	}
	
	
}
