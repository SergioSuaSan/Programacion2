package doWhile;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		/*
		 * Quiero que eligiendo un numero n, te de n números de la sucesión de fibonacci
		 */
		
		

		Scanner teclado = new Scanner (System.in);
		int numero, anterior1 = 0, anterior2 =1;
		System.out.println("Teclea un numero: ");
		numero = teclado.nextInt();
		
		System.out.print("0 1 ");
		for (int i = 0; i < numero - 2; i++) {
			System.out.print(( anterior1 + anterior2) + " ");
			int suma= anterior1 + anterior2;
			anterior1 = anterior2;
			anterior2= suma;
		}
		

	}

}
