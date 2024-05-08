package ejerciciosTema1;

import java.util.Scanner;

public class Banco {
	
	public static void main(String[] args) {
		
		int dinero, quinientos, doscientos, cien, cincuenta, veinte, diez, cinco;
		
		Scanner teclado = new Scanner ( System.in);
		
		System.out.print("¿Cuánto quiere sacar?: ");		
		dinero= teclado.nextInt();		
		
		quinientos = dinero/500;
		dinero = dinero%500;
		
		doscientos = dinero / 200;
		dinero = dinero%200;
		
		cien = dinero/100;
		dinero = dinero%100;
		
		cincuenta =dinero/50;
		dinero = dinero%50;
		
		veinte = dinero/20;
		dinero = dinero%20;
		
		diez = dinero / 10;
		dinero = dinero%10;
		
		cinco = dinero /5;
			
		
		System.out.println("La cantidad de billetes que le tengo que dar es: \n" + quinientos + " billetes de 500€ \n" + doscientos + " billetes de 200€ \n" + cien + " billetes de 100€ \n" + cincuenta + " billetes de 50€ \n" + veinte + " billetes de 20€\n" + diez + " billetes de 10€\n" + cinco + " biletes de 5€");
	
		teclado.close();
		
	}

}
