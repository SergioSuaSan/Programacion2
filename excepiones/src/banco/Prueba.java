package banco;

public class Prueba {

	public static void main(String[] args) {
		// Probar la clase CuentaCorriente
		
		//Creamos un objeto Cuentacorriente
//		CuentaCorriente cuenta = new CuentaCorriente();
//		
//		cuenta.ingresarDinero(100);
//		cuenta.retirarDinero(30);
//		System.out.println(cuenta.dimeElSaldo());
//		
		Persona javier = new Persona("34535435", "Javier");
		CuentaCorriente2 cuenta = new CuentaCorriente2("ES91 382183882382", "Javier",0);
		CuentaCorrienteProfesional cuentap = new CuentaCorrienteProfesional("ES91 382183882382", javier ,0);
		
		System.out.println("El número de cuenta es: "+ cuenta.getIban());
		cuenta.ingresarDinero(200);
		cuentap.ingresarDinero(100);
		System.out.println("Saldo  = " + cuenta.getSaldo());
		System.out.println(cuenta);
		
		CuentaCorriente2 cuenta2 = new CuentaCorriente2("ES29837429849283");
		System.out.println(cuentap);
		try {
			cuentap.retirarDinero(450);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
