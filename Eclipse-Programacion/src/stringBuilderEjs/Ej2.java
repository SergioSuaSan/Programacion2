package stringBuilderEjs;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej2 {

	public static void main(String[] args) {
		/*
		 * 2. Programa que reciba una cadena y diga cuantas palabras contiene. (Las
				palabras pueden estar separadas por espacios, puntos o comas).
				Introduciendo: “Hola a todos.Adios”
				Da como salida: 4
		 */

		
		Scanner teclado = new Scanner(System.in);
		String frase;
		int contador = 1;
		
		System.out.println("Teclea una frase");
		frase = teclado.nextLine();
		teclado.close();
		
//		for (int i = 0; i < frase.length(); i++) {
//			if (frase.charAt(i)== ' '&&( frase.charAt(i-1)!= ','|| frase.charAt(i-1)!= '.')|| frase.charAt(i)== ','||frase.charAt(i)== '.') {
//				contador ++;
//			}	
//		}
//		System.out.println(frase + " tiene " +  contador + " palabras.");
//			
		
		//Creamos un StringTokenizer
		StringTokenizer st = new StringTokenizer(frase, ", . : ;");
		//Le preguntamos cuantos trozos tiene la frase
		System.out.println("La frase tiene " + st.countTokens() + " palabras.");
		
		
		
		
		
	}

}
