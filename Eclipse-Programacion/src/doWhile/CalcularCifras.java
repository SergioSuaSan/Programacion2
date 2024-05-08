package doWhile;

import java.util.Scanner;

public class CalcularCifras {

	public static void main(String[] args) {
		/*
		 * Pones un número entero y calculas cuantas cifras tiene
		 */
		
		int numero, contador = 0;  
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea numero: ");
		numero = teclado.nextInt();
		
		do {
			numero /= 10;
			contador +=1;
		} while (numero!=0);
		System.out.println("El numero tiene de cifras: " + contador);

	}

}
