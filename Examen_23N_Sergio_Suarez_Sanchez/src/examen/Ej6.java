package examen;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej6 {

	public static void main(String[] args) {
		/*
		 * Siempre que escribimos un texto nos surge la duda de si estamos escribiendo
			demasiadas palabras largas; así que vamos a hacer un programa que lea una
			frase y nos diga la longitud media de las palabras.
			Ejemplo:
			Teclea una frase: Que la fuerza te acompañe
			Longitud media: 4.2
		 */

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una frase:");
		String frase = teclado.nextLine();
		teclado.close();
		
		String token;
		double resultado, longitud = 0, acumulador = 0;
		//Vamos a dividir la frase con un tokenizer, y mediante un bucle contar el número de palabras, y la longitud de cada palabra.
		StringTokenizer st = new StringTokenizer(frase);
		
		while (st.hasMoreTokens()) {
			token = st.nextToken();
			acumulador++;
			longitud+=token.length();
		}
		
		//ahora queda hacer la media y ponerlo en el resultado
		resultado =longitud/acumulador;
		
		System.out.println("Longitud media: "+ resultado);
		
		
		
		
		
		
		
		
		
	}

}
