package ejercicios2;

import java.util.Iterator;
import java.util.Scanner;

public class binario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numero, copia;
		String resultado = "";
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Teclea un numero: ");
		numero = teclado.nextInt();
		teclado.close();
		copia = numero;
		
		while (copia!=0) {
			resultado = copia%2 + resultado; 
			copia/=2;
		}
		
			System.out.print(resultado);
	}

}
