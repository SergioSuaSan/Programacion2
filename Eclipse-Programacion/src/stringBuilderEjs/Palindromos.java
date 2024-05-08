package stringBuilderEjs;

import java.util.Scanner;

public class Palindromos {

	public static void main(String[] args) {
		/*
		 * Programa que descubra si una palabra es o no palíndroma, es decir se lee
			igual del derecho que del revés.
			Introduciendo: “oso”
			Da como salida: true
		 */
		
		Scanner teclado = new Scanner(System.in);
		String frase;
		
		System.out.println("Teclea una frase");
		frase = teclado.nextLine();
		teclado.close();
		
		StringBuilder sb = new StringBuilder(frase);	
		sb.reverse();
		
		if (sb.toString().compareTo(frase) == 0) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
			
		

	}

}
