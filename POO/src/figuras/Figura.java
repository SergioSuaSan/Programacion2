package figuras;

public abstract class Figura {
	
	protected String color;

	public Figura(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}
	
	
	
	/*
	 * Dos métofos que todas las clases deben tener 
	 * Le ponemos abstractos porque no sabemos hacerlos todavía
	 * Las clases que hereden de Figura, deben tener la obligación de hacerlo
	 */
	
	public abstract int area();
	public abstract int perimetro();
	
	

}
