package doWhile;

import java.util.Scanner;

public class AveriguarNumeroSecreto {

	public static void main(String[] args) {
		/*
		 * Pedir un numero hasta que adivinemos un número secreto
		 */

		
		
		int secreto = (int) (Math.random()*11);
		
		Scanner teclado = new Scanner (System.in);
		int numero, intentos = 0;
		
		
			
		do {
			System.out.print("Teclea numero entre 0 y 10: ");
			numero = teclado.nextInt();
			intentos += 1;
			//dar ayuda si hemos fallado
			if (numero< secreto ) {
				System.out.println("El número es mayor");
			} else if (numero > secreto) {
				System.out.println("el numero es menor");
			}
		} while (numero!= secreto && intentos < 4);
		teclado.close();		
		
		
		if (numero== secreto && intentos < 4) {
			System.out.println("Correcto");
			System.out.println("Lo has intentado " + intentos + " veces.");			
		} else  {
			System.out.println("Has perdido");		
		}	
		
		
		
		
		
			
		
		
	}

}
