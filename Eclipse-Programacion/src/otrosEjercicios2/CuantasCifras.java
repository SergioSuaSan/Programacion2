package otrosEjercicios2;

import java.util.Scanner;

public class CuantasCifras {

	public static void main(String[] args) {

		
		
		
		int numero;

		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea numero del 0 al 9999: ");
		numero = teclado.nextInt();
		teclado.close();
		
		if (numero <10) {
			System.out.println("Tiene una cifra");
		} else if (numero <100) {
			System.out.println("Tiene 2 cifras");
		} else if (numero<1000) {
			System.out.println("Tiene 3 cifras");
		} else {
			System.out.println("Tiene 4 cifras");
		}
		

		
		
	}

}
