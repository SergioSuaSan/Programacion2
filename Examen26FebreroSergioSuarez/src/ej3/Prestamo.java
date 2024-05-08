package ej3;

public abstract class Prestamo {
	
	protected String titular;
	protected double capitalPrestado;
	protected int duracion;

	
	
	public Prestamo(String titular, double capitalPrestado, int duracion) {
		super();
		this.titular = titular;
		this.capitalPrestado = capitalPrestado;
		this.duracion = duracion;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getCapitalPrestado() {
		return capitalPrestado;
	}


	public void setCapitalPrestado(double capitalPrestado) {
		this.capitalPrestado = capitalPrestado;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}



	@Override
	public String toString() {
		return "Prestamo [titular=" + titular + ", capitalPrestado=" + capitalPrestado + ", duracion=" + duracion
				+  "]";
	}
	
	
	
	public  abstract double cuota();









}
