package prueba;

import java.util.Scanner;
import java.util.StringTokenizer;

public class pruebaexaneb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		String frase, palabra, trozo;
		System.out.println("Escribe una frase");
		frase = teclado.nextLine();
		System.out.println("Escribe una palabra");
		palabra = teclado.nextLine();
		teclado.close();
		
		
		StringTokenizer st = new StringTokenizer(frase, " , . ; : ", true);
		
		while (st.hasMoreTokens()) {
			trozo = st.nextToken();
			if (trozo.equalsIgnoreCase(palabra)) {
				System.out.print(trozo.toUpperCase());
			} else {
				System.out.print(trozo);
			}
			if (st.hasMoreTokens()) {
				System.out.print(" ");
				
			} else {
				System.out.print(".");
			}
		
		
		
		}
		
		
		
		
		
	
		
		
	}

}
