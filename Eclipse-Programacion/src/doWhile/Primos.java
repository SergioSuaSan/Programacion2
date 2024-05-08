package doWhile;

import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		/*
		 * Pedimos un número por teclado y decimos si es primo
		 */
		
		int numero;
		
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea numero: ");
		numero = teclado.nextInt();
		
		int contador = numero -1;  
		teclado.close();
		
		while (numero%contador!=0) {
			contador --;	
			}
		
		if (contador == 1) {
			System.out.println("El numero es primo");
		} else {
			System.out.println("El numero no es primo, es múltiplo de: " + numero/contador);
		}
				
	}

}
