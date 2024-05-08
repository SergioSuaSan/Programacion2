package doWhile;

import java.util.Scanner;

public class PruebaContinue {

	public static void main(String[] args) {
		/*
		 * Pedimos numeros por teclado y los vamos sumando
		 * sumamos los positivos, los negativos no.
		 * Hasta que tecleemos un 0
		 * usaremos un CONTINUE para no sumar los negarivos.
		 */

		Scanner teclado = new Scanner (System.in);
		int numero, suma = 0; //a la variable que suma le llamamos "acumulador"
		
		do {
			System.out.println("Teclea numero: ");
			numero = teclado.nextInt();
			if (numero<0) {
				continue;
			}
			suma+= numero;
		} while (numero!= 0);
		teclado.close();
		System.out.println("Hasta escribir cero, los numeros que has escrito suman: " + suma);
		
		
		
	}

}
