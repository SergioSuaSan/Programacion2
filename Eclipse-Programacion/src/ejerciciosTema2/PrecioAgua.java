package ejerciciosTema2;

import java.util.Scanner;

public class PrecioAgua {

	public static void main(String[] args) {
		/*
		 * Calcular precio de recibo del agua
		 * pedimos los m3 y calculamos el resultado
		 * 
		 * de 0 a 10 = 1€ el m3
		 * de 10 a 20 = 4€ m3
		 * más de 20 = 10€ m3
		 */

		int m3 ;
		int pb = 1;
		int pm = 4;
		int pa = 10;

		Scanner teclado = new Scanner (System.in);
		System.out.println("Cuantos m3 has usado: ");
		m3 = teclado.nextInt();
		teclado.close();
		
		if (m3<=10) {
			System.out.println("Has gastado " + ( m3*pb) + " euros");
		} else if (/*m3 >10 &&*/ m3 <=20) {
			System.out.println("Has gastado " + (10*pb + (m3-10)*pm) + " euros");
		} else {
			System.out.println("Has gastado " + (50 + (m3-20)*10) + " euros");
		}
		
		
	}

}
