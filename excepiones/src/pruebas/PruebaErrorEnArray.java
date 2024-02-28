package pruebas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaErrorEnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Proteger un programa que trabaja con un array
		
		Scanner teclado = new Scanner(System.in);
		int[] temperaturas = {15,16,17,18,14,13,21};
		

		
		try {	
			System.out.println("¿Qué día quieres consultar(1-7)");
			int dia  = teclado.nextInt();
			System.out.println("La temperatura ese día fue: " + temperaturas[dia-1]);
		} catch (InputMismatchException e) {
			System.out.println("Has escrito cosas raras");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Solo del 1 al 7");
		} catch (Exception e) {
		System.out.println("Error 404");
		} finally {
			System.out.println("Fin del programa");
		}
		
		
		
		
		
	}

}
