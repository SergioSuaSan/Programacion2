package pruebaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Guardarnumeros {

	public static void main(String[] args) {
		/*
		 * Pedir por teclado numeros hasta que pongan el 0 y los vamos a ir guardando en un arraylist
		 * Sin repetir los numeros
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int numero;
		do {
			System.out.print("Escribe un numero");
			numero = teclado.nextInt();
			if (!numeros.contains(numero)) {
				numeros.add(numero);				
			}
		} while (numero!= 0);
		
		//Eliminar el 0 de varias formas
		numeros.remove(numeros.size()-1);
		numeros.add(0);
		numeros.remove(numeros.indexOf(0));
		numeros.add(0);
		numeros.remove(Integer.valueOf(0));
		System.out.println(numeros);
	}

}
