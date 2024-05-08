package doWhile;

import java.util.Scanner;

public class Factorizar {

	public static void main(String[] args) {
		/*
		 * Programa que descomponga un número en sus factores primos.

			Introduciendo: 75
			Da como salida : 3 5 5
		 */

		
		int numero, copia;
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Teclea un numero: ");
		numero = teclado.nextInt();
		teclado.close();
		copia = numero;
		
		while (copia!=1) {
			for (int i = 2; i <= copia; i++) {
				if (copia%i==0) {
					System.out.print(i + " ");
					copia = copia/i;
					break;
				}			
			}
		}
		
		

		
		
	}

}
