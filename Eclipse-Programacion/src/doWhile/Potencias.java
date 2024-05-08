package doWhile;

import java.util.Scanner;

public class Potencias {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que calcule la potencia de un numero a n . La potencia se
			hará por medio de multiplicaciones, está prohibido usar Math.pow().
			si n es mayor que cero se hará una potencia normal
			si n es menor que cero se hará na
			1
			y si n cero la solución será 1
		 */
		
		

		int a, n;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea numero: ");
		a = teclado.nextInt();  
		System.out.println("Teclea la potencia: ");
		n = teclado.nextInt();  
		teclado.close();
		
		double acumulador = a;
		
		if (n>0) {
			for (int i = 0; i <n; i++) {
				acumulador *=a;
			}
			System.out.println("Solución: " + (int) acumulador);
			
		} else if (n==0) {
			System.out.println("Solución: 1");
		} else {
			for (int i = 0; i >n; i--) {
				acumulador *=a;
			}
			System.out.println("Solución: 1/" + (int) acumulador +  " = " + (1/acumulador));

		} 
		
		
		

	}

}
