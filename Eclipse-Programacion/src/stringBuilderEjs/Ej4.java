package stringBuilderEjs;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		/*
		 * Programa que rote una cadena tantas veces como se le diga.
			Introduciendo: “Lunes”
			Rotaciones: 3
			Da como salida: “nesLu”
		 */

		Scanner teclado = new Scanner(System.in);
		String frase;
		char letra;
		int rotaciones;
		
		System.out.println("Teclea una frase");
		frase = teclado.nextLine();
		System.out.println("Teclea un numero");
		rotaciones = teclado.nextInt();
		teclado.close();
		
		StringBuilder fr= new StringBuilder(frase);
		for (int i = 0; i < rotaciones; i++) {
			//Saco la última letra letra
			letra =fr.charAt(fr.length()-1);
			//Elimino la última letra
			fr.deleteCharAt(fr.length()-1);
			//Inserto la última letra en la primera posicion
			fr.insert(0, letra);	
		}	
		System.out.println(fr);
		
		
		
		
		
	}

}
