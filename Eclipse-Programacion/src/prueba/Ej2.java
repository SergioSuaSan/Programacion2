package prueba;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un número");
		String numero = teclado.nextLine();
		teclado.close();
		
		int siafort = 0, noafort = 0;
		
		for (int i = 0; i < numero.length(); i++) {
			switch (numero.charAt(i)) {
			case 0, 1, 2, 4, 5, 7:
				noafort++;
				break;

			default: siafort++;
				break;
			}

		}

		if (siafort>noafort) {
			System.out.println("si");
		} else {
			System.out.println("no");
		}
		
	}

}
