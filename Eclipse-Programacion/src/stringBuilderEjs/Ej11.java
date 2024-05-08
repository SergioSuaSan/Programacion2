package stringBuilderEjs;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		/*
		 * 11. Programa que elimina todas las vocales de una frase.
Introduciendo: “Hola a Todos”
Da como salida: “Hl Tds”
		 */
		
		
		Scanner teclado = new Scanner(System.in);
		String frase, vocales = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ";
		
		
		System.out.println("Teclea una frase");
		frase = teclado.nextLine();
		teclado.close();
		
//		StringBuilder sb = new StringBuilder(frase);
		
//		for (int i = 0; i < sb.length(); i++) {
//			if (vocales.indexOf(sb.charAt(i)) != -1) {
//				sb.deleteCharAt(i);
////				i--; //Retraso el bucle para que no se salte ninguna letra
//				
//				
//			}
			
		
		StringBuilder sb = new StringBuilder();
			for (int i = 0; i < frase.length(); i++) {
				if (vocales.indexOf(frase.charAt(i)) == -1) {
					sb.append(frase.charAt(i));		
				}
			}
		System.out.println(sb);

	}

}
