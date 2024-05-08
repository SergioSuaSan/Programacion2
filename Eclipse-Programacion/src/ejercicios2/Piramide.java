package ejercicios2;

import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numero;
		
		Scanner teclado = new Scanner (System.in);		
		System.out.print("Teclea un numero: ");
		numero = teclado.nextInt();
		teclado.close();
		
		for (int i = 1; i <= numero; i++) {
			//Imprimo espacios
			for (int j = 0; j < (numero-i); j++) {
				System.out.print("   ");
			}
			//Imprimo numero
			for (int j = 1; j <= i; j++) {			
				System.out.print(j + " ");				
			}
			//Imprimo la otra parte inversa
			for (int j = (i-1); j >=1; j--) {			
				System.out.print(j + " ");				
			}
			//Cambio de linea
			System.out.println("");		
		}
		
		
		
		
		
		
	}

}
