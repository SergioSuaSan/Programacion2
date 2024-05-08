package otrosEjercicios2;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numero;

		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea numero del 0 al 9999: ");
		numero = teclado.nextInt();
		teclado.close();
		
		
		if (numero < 5) {
			System.out.println("INSUFICIENTE");
		} else if ( numero < 7) {
			System.out.println("SUFICIENTE");
		} else if ( numero < 9) {
			System.out.println("NOTABLE");
		} else {
			System.out.println("SOBRESALIENTE");			
		}
		
	}

}
