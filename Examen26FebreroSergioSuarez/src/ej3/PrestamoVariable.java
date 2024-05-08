package ej3;

public class PrestamoVariable extends Prestamo{
	
	protected double euribor;
	protected double diferencial;
	protected int revisionMes;
	
	


	public PrestamoVariable(String titular, double capitalPrestado, int duracion, double euribor,
			double diferencial, int revisionMes) {
		super(titular, capitalPrestado, duracion);
		this.euribor = euribor;
		this.diferencial = diferencial;
		this.revisionMes = revisionMes;
	}


	public double getEuribor() {
		return euribor;
	}


	public void setEuribor(double euribor) {
		this.euribor = euribor;
	}


	public double getDiferencial() {
		return diferencial;
	}


	public void setDiferencial(double diferencial) {
		this.diferencial = diferencial;
	}


	public int getRevisionMes() {
		return revisionMes;
	}


	public void setRevisionMes(int revisionMes) {
		this.revisionMes = revisionMes;
	}





	@Override
	public String toString() {
		return "PrestamoVariable [euribor=" + euribor +  "%" + ", diferencial=" + diferencial + "%, revisionMes=" + revisionMes
				+ ", titular=" + titular + ", capitalPrestado=" + capitalPrestado + ", duracion=" + duracion + "]";
	}


	@Override
	public double cuota() {
		double resultado;
		resultado= (capitalPrestado*(euribor+diferencial)/100)/(double) (1-(Math.pow((1+(euribor+diferencial)/100), -(duracion*12))));
		return resultado;
	}
	

	
}
