package doWhile;

import java.util.Scanner;

public class PruebaWhile {

	public static void main(String[] args) {
		/*
		 * Bucle mientras
		 * 
		 * while (condición) {
		 * 		Instrucciones a repetir;
		 * }
		 * 
		 * Bucle hacer mientras
		 * 
		 * do {
		 * 		Instrucciones a repetir;
		 * } while (condición);
		 * 
		 */
		
		
		
		//Pedir número hasta que tecleemos el 0
		
//		Scanner teclado = new Scanner (System.in);
//		int numero;
//		System.out.println("Teclea el 0");
//		numero = teclado.nextInt();
//
//
//		while (numero!= 0) {
//			System.out.println("Numero incorrecto, teclea el 0");
//			numero = teclado.nextInt();
//		}
//
//		System.out.println("Correcto");
		
		
		
		
		Scanner teclado = new Scanner (System.in);
		int numero;
		
		do {
			System.out.println("Teclea el 0");
			numero = teclado.nextInt();
		} while (numero!= 0);
		teclado.close();		
		System.out.println("Correcto");

	}

}
