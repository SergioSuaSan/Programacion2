package stringBuilderEjs;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		/*
		 * 1. Programa que pase un String a mayúsculas y diga cuantas letras han
			cambiado.
			Introduciendo: “Hola a Todos”
			Da como salida: “HOLA A TODOS” 8 cambios
		 */

		
		Scanner teclado = new Scanner(System.in);
		String frase;
		int contador = 0;
		
		System.out.println("Teclea una frase");
		frase = teclado.nextLine();
		teclado.close();
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i)!=frase.toUpperCase().charAt(i)) {
				contador+=1;
			}
		}
		frase= frase.toUpperCase();
		System.out.println(frase + ". Total cambios: " + contador);
		
		
		
	}

}
