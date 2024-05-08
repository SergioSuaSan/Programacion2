package ejerciciosTema2;

import java.util.Scanner;

public class mayorDe2 {

	public static void main(String[] args) {

		/*
		 * Pedimos 2 números y mostramos cuál es el mayor
		 */
		
		int numero1, numero2;

		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea el primer número: ");
		numero1 = teclado.nextInt();
		System.out.println("Teclea el segundo número: ");
		numero2 = teclado.nextInt();
		teclado.close();
		
		if (numero1<numero2) {
			System.out.println(numero2 + " es mayor que "  + numero1);
		} else if (numero1==numero2) {
			System.out.println(numero2 + " es igual a "  + numero1);
		} else {
			System.out.println(numero1 + " es mayor que "  + numero2);
		}
		
		
	}

}
