package examen;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej5 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que seleccione las palabras de la frase que contengan al
			menos tres vocales distintas.
			
			Ejemplo:
			Teclea una frase: Me gusta muchisimo programar en lenguaje java
			Resultado: muchisimo lenguaje
			
			Nota: Supondremos que la frase que nos escriben por teclado está perfecta y no
			tiene símbolos ni cosas raras. El programa debe funcionar con mayúsculas y
			minúsculas.
		 */
		
		String frase, token, token2, resultado = "";
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una frase:");
		frase = teclado.nextLine();
		teclado.close();
		
		//Vamos a separar cada palabra con un tokenizer y analizar cada una de ellas
		StringTokenizer st = new StringTokenizer(frase);
		
		//Vamos a crear 5 banderas para cada token, una para cada vocal.
		//Una vez se haya leído la palabra, si el número de banderas activadas es 3 o más, contaremos la palabra
		boolean a = false, e = false, i = false, o = false, u = false;
		while (st.hasMoreTokens()) {
			token = st.nextToken();
			//En este caso voy a crear un token2 para ponerlo en minúsculas, ya que no quiero manipular el token original
			//De esta forma, en el resultado ponemos el token original y si tiene mayúsculas se mantendrán
			token2 = token.toLowerCase();
			//Comprobaremos todas las letras de la palabra usando un ciclo for
			for (int j = 0; j < token2.length(); j++) {
				//En este ciclo activaremos todas las banderas pertinentes
				if (token2.charAt(j) =='a') {
					a=true;					
				}
				if (token2.charAt(j) =='e') {
					e=true;					
				}
				if (token2.charAt(j) =='i') {
					i=true;					
				}
				if (token2.charAt(j) =='o') {
					o=true;					
				}
				if (token2.charAt(j) =='u') {
					u=true;					
				}
			}
			//Terminado el bucle for, hacemos una suma de las banderas activadas
			int sumaflag  = 0;
			if (a) {
				sumaflag++;
			}
			if (e) {
				sumaflag++;
			}
			if (i) {
				sumaflag++;
			}
			if (o) {
				sumaflag++;
			}
			if (u) {
				sumaflag++;
			}
			
			//Una vez sumadas todas las banderas, hacemos la comparacion:
			//si el token tiene 3 banderas o más, escribimos el token (el original, con posibles mayúsculas) en el resultado
			if (sumaflag >=3) {
				resultado += token + " ";
			}
			
			//Una vez añadido o no el token, reinicializamos las boolean a falsas para que no se acumulen
			a = false;
			e = false;
			i = false;
			o = false;
			u = false;
			
		//Terminamos el while que se quedó olvidado aquí.	
		}
		
		//Escribimos el resultado eliminando el espacio final
		System.out.println("El resultado es: " + resultado.trim());
		
		

	}

}
