package intruccionRepeticion;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		int numero; 
		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea numero: ");
		numero = teclado.nextInt();
		teclado.close();

		if (numero <10) {
			for (int i= 1; i<=10; i++) {
				System.out.println(numero + " * " + i + " = " + (numero*i));
				
			}	
		} else {
			for (int i= 1; i<=numero; i++) {
				System.out.println(numero + " * " + i + " = " + (numero*i));
			}
		}
		
		

	}

}
