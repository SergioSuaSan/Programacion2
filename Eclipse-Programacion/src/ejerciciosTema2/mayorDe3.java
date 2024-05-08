package ejerciciosTema2;

import java.util.Scanner;

public class mayorDe3 {

	public static void main(String[] args) {

		/*
		 * Pedimos 3 números y mostramos cuál es el mayor
		 */
		
		int numero1, numero2, numero3;

		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea el primer número: ");
		numero1 = teclado.nextInt();
		System.out.println("Teclea el segundo número: ");
		numero2 = teclado.nextInt();
		System.out.println("Teclea el tercer número: ");
		numero3 = teclado.nextInt();
		teclado.close();
		
//		if (numero1<numero2) {
//			if (numero2<numero3) {
//				System.out.println(numero3 + " es el mayor");
//			} else {
//				System.out.println(numero2 + " es el mayor");				
//			}
//		} else if (numero1<numero3) {
//			System.out.println(numero3 + " es el mayor");
//		} else {
//			System.out.println(numero1 + " es el mayor");				
//		}
			
		//otra solución usando condiciones más complejas.
		if (numero1>numero2 && numero1>numero3) {
			System.out.println("El mayor es: " + numero1);
		} else if (numero2>numero1 && numero2>numero3) {
			System.out.println("El mayor es: " + numero2);
		} else {
			System.out.println("El mayor es: " + numero3);
		}
		
		
		
		
		
	}

}
