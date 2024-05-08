package stringBuilderEjs;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		/*
		 * Programa que codifique una cadena cambiando cada letra por la siguiente en
			el código ASCII.
			Introduciendo: “Lunes”
			Da como salida: “Mvoft”
		 */

		
		Scanner teclado = new Scanner(System.in);
		String frase, resultado = "";
		char letra;
		
		System.out.println("Teclea una frase");
		frase = teclado.nextLine();
		teclado.close();
		
//		for (int i = 0; i < frase.length(); i++) {
//			//Saco una letra
//			letra =frase.charAt(i);
//			//La modifico
////			letra= (char) (letra + 1);
//			letra ++;
//			//La añado al resultado
//			resultado += letra;
//		}
//		
//		System.out.println(resultado);
		
		StringBuilder fr = new StringBuilder(frase);
		for (int i = 0; i < fr.length(); i++) {
		//Saco una letra
		letra =fr.charAt(i);
		//La modifico
//		letra= (char) (letra + 1);
		letra ++;
		//La vuelvo a poner en su lugar
		fr.setCharAt(i, letra);
		}		
		System.out.println(fr);
		
	}

}
