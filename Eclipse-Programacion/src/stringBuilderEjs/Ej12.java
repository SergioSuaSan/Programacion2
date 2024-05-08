package stringBuilderEjs;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej12 {

	public static void main(String[] args) {
		/*
		 * 12. Realiza un programa que lea un String y elimine las palabras de menos de
tres letras. Una vez eliminadas esas palabras, no deben existir espacios
duplicados.
Ejemplo: “El bar de la plaza”
Dará como resultado: “bar plaza”
		 */

		
	Scanner teclado = new Scanner(System.in);
		
		String frase, trozo;
		System.out.println("Escribe una frase");
		frase = teclado.nextLine();
		teclado.close();
		
		StringBuilder resultado = new StringBuilder();
		StringTokenizer st = new StringTokenizer(frase);
		
		while (st.hasMoreTokens()) {
			trozo = st.nextToken();
			if (trozo.length()>=3) {
				resultado.append(trozo + " ");
			}
		}
		System.out.println(resultado.toString().trim());
		
	}

}
