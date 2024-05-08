package ej3;

public class PrestamoFijo extends Prestamo {
	
	protected double interes;

	
	

	public PrestamoFijo(String titular, double capitalPrestado, int duracion, double interes) {
		super(titular, capitalPrestado, duracion);
		this.interes = interes;
	}


	@Override
	public String toString() {
		return "PrestamoFijo [titular=" + titular + ", capitalPrestado=" + capitalPrestado + ", duracion=" + duracion
				+ ", interes=" + interes + "%" + "]";
	}


	@Override
	public double cuota() {
		double resultado;
		resultado= (capitalPrestado*interes/100)/(double)(1-(Math.pow((1+interes/100), -(duracion*12))));
		return resultado;
	}
	
	
	
	
	

}
