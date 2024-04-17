package banco;

public class CuentaCorriente2 {
	
	//Atributos
	private String iban;
	private String titular;
	private double saldo;
	
	
	//Constructor: método que se ejecuta cuando se crea el objeto
	public CuentaCorriente2(String iban, String titular , double saldo) {
		this.iban = iban;
		this.saldo = saldo;
		this.titular = titular;
	}
		
	public CuentaCorriente2(String iban, String titular) {
		this.iban = iban;
		this.titular = titular;
	}

	public CuentaCorriente2(String iban) {
		this.iban = iban;
	}


	//Métodos generados con botón derecho/Source/Getters and Setters
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getIban() {
		return iban;
	}
	public double getSaldo() {
		return saldo;
	}
	
	//Métodos hechos a mano
	public void ingresarDinero (double cantidad) {
		saldo +=cantidad;
	}
	public void retirarDinero (double cantidad) {
		if (saldo-cantidad >= 0) {
			saldo -=cantidad;
			System.out.println("Retirada completada");
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	
	//ToString()
	@Override
	public String toString() {
		return "CuentaCorriente2 [iban=" + iban + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	

}
