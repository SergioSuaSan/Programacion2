package pruebas;

import java.util.Scanner;

public class PruebaErrorEnDivision {

	public static void main(String[] args) {
		// Probar las posibles excepciones que se producen en una división
		
		/*
		 * Bloque try/catch
		 * 
		 * try {
		 * 	//Aquí ponemos la instrucción que queremos probar
		 * } catch (Exception e) {
		 * 	//aquí la solución a la excepción en caso de que se produzca
		 * }
		 */

		
		
		Scanner teclado = new Scanner(System.in);
		int a,b;
		System.out.println("Teclea el dividendo:");
		try {
			a = teclado.nextInt();
		} catch (Exception e) {
			System.out.println("Debe ser ecrito en números");
			a=1;  //Le pongo un valor por defecto , si no, los otros try dan error.
		}
		System.out.println("Teclea el divisor:");
		try {
			b = teclado.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Debe ser ecrito en números");
			b=1;  //Le pongo un valor por defecto , si no, los otros try dan error.
		}
		
		
		try {
			System.out.println("La solución es: " + a/b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No puedo dividir entre 0");
		}
		
		
		
	}

}
