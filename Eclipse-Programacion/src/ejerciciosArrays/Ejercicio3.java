package ejerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Crea una agenda para almacenar nombres y direcciones de N personas. Después
haz un programa que permita ir consultando el nombre y la dirección de las
personas almacenadas.
		 */

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuántas personas vas a meter?");
		int numero = teclado.nextInt();
		teclado.nextLine();
		
		String[] nombres = new String[numero];
		String[] direcciones = new String[numero];
		
		for (int i = 0; i < numero; i++) {
			System.out.println("Escribe un nombre: ");
			String nombre = teclado.nextLine();
			System.out.println("Escribe una dirección: ");
			String direccion = teclado.nextLine();
			nombres[i] =nombre;
			direcciones [i] = direccion;
		}
		
		System.out.println("¿A quién buscas?");
		String nombreabuscar = teclado.nextLine();
		
		for (int i = 0; i < nombres.length; i++) {
			if (nombreabuscar.equalsIgnoreCase(nombres[i])) {
				System.out.println("Su dirección es: " + direcciones[i]);
			}
		}
		
		System.out.println(Arrays.toString(nombres));
		
		
	}

}
