package stringBuilderEjs;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		/*
		 * 10. Programa que simule el juego del ahorcado. Elegimos una palabra y vamos
					pidiendo letras al usuario. Cada vez mostramos la palabra solo con las letras
					acertadas. Si no acierta todas las letras en 8 intentos, se da el juego por
					perdido.
		 */
		

		Scanner teclado = new Scanner(System.in);
		String palabra,letra;
		int contador = 0, position = 0, position2 = 0; 
		
		
		palabra = "Calamitoso";
		
		StringBuilder sb = new StringBuilder(palabra);
		
		for (int i = 0; i < sb.length(); i++) {
			sb.replace(i, i+1, "_");
			
		
		}
		
		while (contador <8) {
			System.out.println("Teclea una letra");
			letra = teclado.nextLine();
			if (palabra.indexOf(letra)==-1) {
				contador ++;
				System.out.println(sb);
				System.out.println("Fallos. " + contador);
			} else {
				for (int i = 0; i < palabra.length(); i++) {
					position = palabra.indexOf(letra);
					String algo = palabra.substring(position, position+1);
					System.out.println(position + algo);
					position = palabra.indexOf(palabra, position +1);
					sb.replace(position, position+1, algo);
					System.out.println(sb);
				}
		
			}
			
		}
		
		System.out.println("Has perdido");
		
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
