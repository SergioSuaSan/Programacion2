package stringBuilderEjs;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej9VersionB {

	public static void main(String[] args) {
		/*
		 * Programa que recibe dos cadenas de caracteres y comprueba cuantas veces
			aparece la primera en la segunda.
			Introduciendo: “la”
			“La calle de la plaza”
			Da como salida: 2
		 */
		
		Scanner teclado = new Scanner(System.in);
		String frase,palabra;
		int contador = 0, posicion;
		
		System.out.println("Teclea una frase");
		frase = teclado.nextLine();
		System.out.println("Teclea una palabra");
		palabra = teclado.nextLine();
		teclado.close();
		
		frase =frase.toLowerCase();
		palabra = palabra.toLowerCase();

		posicion = frase.indexOf(palabra, 0);
		
		while (posicion !=-1) {
			contador ++;
			posicion = frase.indexOf(palabra, posicion +1);
		}
		
		
		System.out.println("La palabra aparece " + contador + " veces");
		
		
		

	}

}
