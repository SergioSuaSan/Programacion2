package banco;

//Vamos a simular cómo se comporta una cuenta corriente de un banco
public class CuentaCorriente {
	
	//Atributos: Datos que va a manejar la clave
	//Ponemos el modificador privado para que nadie toque los atributos directamente.
	private String iban;
	private String titular;
	private double saldo;
	
	
	//Métodos: Comportamientos que la cuenta coriente debe tener.
	public String dimeElTitular() {
		return titular;
	}
	
	public String dimeElIban() {
		return iban;
	}
	
	public double dimeElSaldo() {
		return saldo;
	}
	
	public void cambiaElTitular (String nuevoTitular) {
		titular = nuevoTitular;
	}
	
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
	

}
