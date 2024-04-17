package errorcitos;

public class ContadorEntero implements Interfaz {

	protected int cuenta = 0;



	@Override
	public void resetear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incrementar() throws TasPasaoEception {
		// TODO Auto-generated method stub
		if (cuenta <10) {
			cuenta ++;
		} else {
			throw new TasPasaoEception();
		}
		
	}

	@Override
	public void decrementar() {
		// TODO Auto-generated method stub
		
	}

}
