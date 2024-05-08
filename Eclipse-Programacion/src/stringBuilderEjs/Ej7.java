package stringBuilderEjs;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		/*
		 * Programa que sume todas las cifras de los números que aparecen en una
cadena de caracteres.
Introduciendo: “15 de Noviembre de 2022”
Da como salida: 12
		 */

		Scanner teclado = new Scanner(System.in);
		String frase;
		char letra;
		int suma = 0;
		
		System.out.println("Teclea una frase");
		frase = teclado.nextLine();
		teclado.close();
//		
//		
//		String numero = "1234567890";
//		int contador = 0;
//		
//		for (int i = 0; i < frase.length(); i++) {
//			if (numero.indexOf ( frase.charAt(i) ) != -1 ) {
//				letra =String.valueOf(frase.charAt(i));
//			}
//		}
//		
//		System.out.println(contador);
		for (int i = 0; i < frase.length(); i++) {
			//Saco la letra que voy a examinar
			letra = frase.charAt(i);
			//Compruebo que sea un digito
			Character.isDigit(letra);
			//Si es un dígito, la convierto a numero y la sumo
			if (Character.isDigit(letra)) {
				//No se puede convertir directamente, primero lo pasamos a texto
				String texto = String.valueOf(letra);
				//Para pasarlo a número necesitamos el Objeto Integer
				int valor = Integer.valueOf(texto);
				suma += valor;
			}
		}

		System.out.println(suma);
		
		
		
		
	}

}
