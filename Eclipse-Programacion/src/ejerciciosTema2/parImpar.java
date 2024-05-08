package ejerciciosTema2;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		
		
		/*
		 * Programa que pida um número entero y me diga si es par o impar
		 */
		
		int numero;

		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea un número: ");
		numero = teclado.nextInt();
		teclado.close();
		
		if (numero%2==0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
		
	}

}
