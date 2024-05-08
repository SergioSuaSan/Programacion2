package stringBuilderEjs;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que intercale las letras de dos palabras. El programa
			debe pedir 2 palabras y luego dar otra palabra resultado con las letras de las
			dos palabras intercaladas.
			Introduciendo: Primera palabra “INTERNET”
			Segunda palabra “correo”
			Da como salida: “IcNoTrErReNoET”
		 */

	Scanner teclado = new Scanner(System.in);
		
		String palabra1,palabra2, resultado ="";
		int larga = 0;
		System.out.println("Escribe una frase");
		palabra1 = teclado.nextLine();
		System.out.println("Escribe una frase");
		palabra2 = teclado.nextLine();
		teclado.close();
		
		if ( palabra1.length()>palabra2.length()) {
			larga = palabra1.length();
		} else {
			larga = palabra2.length();
		}
		
		for (int i = 0; i < larga; i++) {
			if (i<palabra1.length()) {
				resultado += palabra1.charAt(i);				
			}
			if (i<palabra2.length()) {
				resultado += palabra2.charAt(i);				
			}
			
		}
		
		System.out.println(resultado);
		
		
	}

}
