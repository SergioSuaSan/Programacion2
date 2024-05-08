package stringBuilderEjs;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej13 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que averigüe cual es la palabra que mas letras tiene de
			un String. El String solo contendrá letras y espacios de separación, nada más.
			En el ejemplo: “Este Mp3 lo conecto al puerto usb”
			El método debe retornar la palabra “conecto” que es la que más letras
			tiene.
		 */

		Scanner teclado = new Scanner(System.in);
		
		String frase, trozo, resultado ="";
		System.out.println("Escribe una frase");
		frase = teclado.nextLine();
		teclado.close();
		
	
		StringTokenizer st = new StringTokenizer(frase, " , . ; : ¿ ? ¡ !");
		
		
		while (st.hasMoreTokens()) {
			trozo = st.nextToken();
			if (trozo.length()> resultado.length()) {
				resultado = trozo;
			} else if (trozo.length()== resultado.length()) {
				resultado += " "+trozo;
			}
		}
		System.out.println(resultado);
		
		
		
	}

}
