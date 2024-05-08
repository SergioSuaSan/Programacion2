package claseStrings;

import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		String frase;
		String vocales ="aeiouáéíóúäëïöüàèìòùâêûîô";
		int contador = 0;
		System.out.println("Teclea una frase");
		frase = teclado.nextLine();
		teclado.close();
		frase = frase.toLowerCase();
		for (int i = 0; i < frase.length(); i++) {
			if (vocales.indexOf ( frase.charAt(i) ) != -1 ) {
				contador+=1;
			}
		}
		System.out.println("Total vocales: " + contador);
		
	}

}
