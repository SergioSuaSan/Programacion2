package doWhile;

import java.util.Scanner;

public class MediaDeVariosNumeros {

	public static void main(String[] args) {
		/*
		 * Calcular la media de los numeros que tecleemos hasta poner un cero
		 */
		
		Scanner teclado = new Scanner (System.in);
		int numero, suma = 0;
		int contador =  0; 
		
		do {
			System.out.println("Teclea numero: ");
			numero = teclado.nextInt();
			suma+= numero;
			contador++;
		} while (numero!= 0);
		teclado.close();
		
		System.out.println("La media aritmética es: " + suma/(contador-1));

	}

}
