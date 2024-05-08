package doWhile;

import java.util.Scanner;

public class Consecutivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		Scanner teclado = new Scanner (System.in);
		int numero, consecutivo;
		boolean consecu= false;
		
		
		//Lectura anticipada
		System.out.println("Teclea un numero: ");
		numero = teclado.nextInt();
		consecutivo = numero;
		
		//Con la lectura anticipada, en lugar de do while, se hace directamente un while, pues ya hemos introducido el 1 dato.
		while (numero>= 0) {
			System.out.println("Teclea un numero: ");
			numero = teclado.nextInt();
			if (numero!=consecutivo) {
				consecutivo = numero;
			} else {
				consecu = true;
			}
		} while (numero>= 0);
		if (consecu== true) {
			System.out.println("Sí");
		} else {
			System.out.println("No");

		}
		teclado.close();
		
		
		
		
		
	}

}
