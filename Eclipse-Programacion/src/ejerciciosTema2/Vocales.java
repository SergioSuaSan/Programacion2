package ejerciciosTema2;

import java.util.Scanner;

public class Vocales {

	public static void main(String[] args) {
		/*
		 * Pedimos una letra por teclado y respondemos si es vocal o consonante
		 */
		
		char letra;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea letra: ");
		letra = teclado.nextLine().charAt(0);
		teclado.close();
		
		if (letra == 'a'|| letra== 'e'|| letra == 'i'|| letra == 'o'|| letra == 'u') {
			System.out.println("La letra es vocal");
		} else {
			System.out.println("La letra es consonante");
		}
		
		if ("aeiouAEIOUáéíóúÁÉÍÓÚÄËÏÖäëïöü".contains(String.valueOf(letra))) {
			System.out.println("La letra es vocal");
		} else {
			System.out.println("La letra es consonante");
		}


	}

}
