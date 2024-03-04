package contadorConInterfaz;

public interface Contador {
	
	
	public abstract void incrementar() throws ContadorExcepcion;
	public abstract void decrementar() throws ContadorExcepcion;
	public abstract void resetear();

}
