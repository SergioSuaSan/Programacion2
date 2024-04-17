package concesionario;

public class Patinete extends VehiculosSinMotor{

	protected int bateria;

	public Patinete(String marca, String modelo, int precio, String color, int bateria) {
		super(marca, modelo, precio, color);
		this.bateria = bateria;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	@Override
	public String toString() {
		return "Patinete [bateria=" + bateria + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
				+ ", color=" + color + "]";
	}
	
	
	
}
