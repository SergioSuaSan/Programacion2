package claseStrings;

import java.util.Scanner;

public class ContarLetra {

	public static void main(String[] args) {
		// Pedimos una frase y la letra a buscar
		
		Scanner teclado = new Scanner(System.in);
		String frase, letra;
		int contador = 0;
		
		System.out.println("Teclea una frase");
		frase = teclado.nextLine();
		System.out.println("Teclea la letra a buscar");
		letra = teclado.nextLine();
		teclado.close();
		frase =frase.toLowerCase();
		letra = letra.toLowerCase();
		for (int i = 0; i < frase.length(); i++) {
			if (letra.indexOf ( frase.charAt(i) ) != -1 ) {
				contador+=1;
			}
		}
		System.out.println("Total letra: " + contador);
		

	}

}
