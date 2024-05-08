package ejerciciosTema1;

import java.util.Scanner;

public class Orden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		int num1, num2, num3;
		
		Scanner teclado1 = new Scanner ( System.in);
		
		System.out.print("Vamos a ver si los números que tiene están ordenados de menor a mayor: \nTeclee el 1 número: ");
		num1= teclado1.nextInt();
		//CON UN SOLO TECLADO FUNCIONA, NO NECESITAS ESCANEAR UN TECLADO POR NÚMERO
		
		//Scanner teclado2 = new Scanner ( System.in);
		System.out.print("Teclee el 2 número: ");
		num2= teclado1.nextInt();
		//num2= teclado2.nextInt();
		
		//Scanner teclado3 = new Scanner ( System.in);
		System.out.print("Teclee el 3 número: ");
		num3= teclado1.nextInt();
		//num3= teclado3.nextInt();
		
		System.out.println(num1<=num2&&num2<=num3||num3<=num2&&num2<=num1);
		
		teclado1.close();
		//teclado2.close();
		//teclado3.close();
	}

}
