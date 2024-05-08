package doWhile;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea numero: ");
		numero = teclado.nextInt();  
		teclado.close();
		
		for (int i = 1; i <= numero; i++) {			
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " "); 
			} System.out.println();			
		}
		
	}

}
