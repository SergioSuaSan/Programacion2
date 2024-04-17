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
		
		CuentaCorriente2 cuenta = new CuentaCorriente2("ES91 382183882382", "Javier",0);
		
		System.out.println("El número de cuenta es: "+ cuenta.getIban());
		cuenta.ingresarDinero(200);
		cuenta.ingresarDinero(100);
		System.out.println("Saldo  = " + cuenta.getSaldo());
		
		CuentaCorriente2 cuenta2 = new CuentaCorriente2("ES29837429849283");
		System.out.println(cuenta2);
		
		
		
		
	}

}
