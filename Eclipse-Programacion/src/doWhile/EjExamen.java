package doWhile;

import java.util.Scanner;

public class EjExamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		int numero, unidades, decenas;
		
		
			
		do {
			System.out.print("Teclea numero entre 10 y 99: ");
			numero = teclado.nextInt();
			unidades = numero%10;
			decenas = numero/10;
		} while (decenas!=unidades);
		teclado.close();

	}

}
