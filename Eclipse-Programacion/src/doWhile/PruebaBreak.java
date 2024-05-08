package doWhile;

import java.util.Scanner;

public class PruebaBreak {

	public static void main(String[] args) {
		//Solución poniendo break
		
		
		Scanner teclado = new Scanner (System.in);
		int numero, suma = 0; //a la variable que suma le llamamos "acumulador"
		
		do {
			System.out.println("Teclea numero: ");
			numero = teclado.nextInt();
			if (numero == 0) {
				break;
			}
			suma+= numero;
		} while (true);
		teclado.close();
		System.out.println("Hasta escribir cero, los numeros que has escrito suman: " + suma);

	}

}
