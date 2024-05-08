package stringBuilderEjs;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		String frase,palabra;
		char letra;
		boolean esnumero = true;
		int suma = 0;
		
		System.out.println("Teclea una frase");
		frase = teclado.nextLine();
		teclado.close();

		StringTokenizer st = new StringTokenizer(frase, "  , . ; :");
		
		while (st.hasMoreTokens()) {
			palabra =st.nextToken();
			esnumero= true;
			for (int i = 0; i < palabra.length(); i++) {
				letra = palabra.charAt(i);
				if (!Character.isDigit(letra)) {
					esnumero = false;
				}
			}
			if (esnumero) {
				suma += Integer.parseInt(palabra);
			}
		}
		
		System.out.println(suma);
		
	}

}
