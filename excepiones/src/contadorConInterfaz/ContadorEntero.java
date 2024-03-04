package contadorConInterfaz;

public class ContadorEntero implements Contador {

	protected int valor;
	protected  int max;
	protected int min;

	


	public ContadorEntero(int valor, int max, int min) {
		super();
		this.valor = valor;
		this.max = max;
		this.min = min;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	@Override
	public String toString() {
		return "ContadorEntero [valor=" + valor + "]";
	}

	
	
	
	//Metemos ahora el override de la interfaz
	@Override
	public void incrementar() throws ContadorExcepcion  {
		if (this.valor<this.max) {
			this.valor++;			
		} else {
			throw new ContadorExcepcion("No puedo subir más");
		}
		
	}

	@Override
	public void decrementar() throws ContadorExcepcion {
		if (this.valor>this.min) {
			this.valor--;			
		} else {
			throw new ContadorExcepcion("No puedo bajar más");
		}
		
	}

	@Override
	public void resetear() {
		this.valor = this.min;
		
	}
	
	
	
	
	
	
	
}
