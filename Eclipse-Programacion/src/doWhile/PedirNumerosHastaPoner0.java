package doWhile;

import java.util.Scanner;

public class PedirNumerosHastaPoner0 {

	public static void main(String[] args) {
		/*
		 * Pedimos numeros y los sumamos hasta tener 0
		 */

		
		Scanner teclado = new Scanner (System.in);
		int numero, suma = 0; //a la variable que suma le llamamos "acumulador"
		
		do {
			System.out.println("Teclea numero: ");
			numero = teclado.nextInt();
			suma+= numero;
		} while (numero!= 0);
		teclado.close();
		System.out.println("Hasta escribir cero, los numeros que has escrito suman: " + suma);
		
		
		
		
	}

}
