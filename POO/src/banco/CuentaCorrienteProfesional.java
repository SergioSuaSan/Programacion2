package banco;

public class CuentaCorrienteProfesional {

	//Atributos
	private String iban;
	private Persona titular;
	private double saldo;
	
	//Constructor
	public CuentaCorrienteProfesional(String iban, Persona titular, double saldo) {
		super();
		this.iban = iban;
		this.titular = titular;
		this.saldo = saldo;
	}
	public CuentaCorrienteProfesional(String iban, Persona titular) {
		super();
		this.iban = iban;
		this.titular = titular;
		}	
	public CuentaCorrienteProfesional(String iban) {
		super();
		this.iban = iban;
		}
	
	//Getter y setter
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public Persona getTitular() {
		return titular;
	}
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Métodos hechos a mano
	public void ingresarDinero (double cantidad) {
		saldo +=cantidad;
	}
	public boolean retirarDinero (double cantidad) {
		if (saldo-cantidad >= 0) {
			saldo -=cantidad;
			return true;
		} else {
			return false;
		}
	}
	
	//ToString
	@Override
	public String toString() {
		return "CuentaCorrienteProfesional [iban=" + iban + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	
	
	
	
	
}
