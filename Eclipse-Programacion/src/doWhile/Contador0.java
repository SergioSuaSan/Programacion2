package doWhile;

import java.util.Scanner;

public class Contador0 {

	public static void main(String[] args) {

		
		int numero, suma = 0,  contadorde0 = 0;
		
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea numero: ");
		numero = teclado.nextInt();  
		
		do {
			System.out.println("Teclea numero: ");
			numero = teclado.nextInt();
			if (numero<0) {
				continue;
			}
			suma+= numero;
		} while (numero!= 0);
		
		teclado.close();
		
		
		

	}

}
