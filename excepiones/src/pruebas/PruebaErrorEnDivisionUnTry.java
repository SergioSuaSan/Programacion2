package pruebas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaErrorEnDivisionUnTry {

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

		try {
			System.out.println("Teclea el dividendo:");
			a = teclado.nextInt();
			System.out.println("Teclea el divisor:");
			b = teclado.nextInt();
			
			System.out.println("La solución es: " + a / b);
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir entre 0: " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Has escrito mal el número");	
		} catch (Exception e) {
			System.out.println("No sé el qué, pero algo pasó.");
		}


		
		
	}

}
