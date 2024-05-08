package doWhile;

import java.util.Scanner;

public class SumaSerie {

	public static void main(String[] args) {
		/*
		 * Programa que sume la serie 1+1/2 + 1/3 + 1/4 + ...
		 * 
		 *  Por teclado pediremos la suma total que quiero conseguir y nos dirá cuando termine,
		 *  cuántos términos ha tenido que sumar.
		 */
		

		double denominador = 0;
		int contador = 0;
		double acumulador = 0;
		double SumaAConseguir; 
		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea el numero al que quieres llegar: ");
		SumaAConseguir = teclado.nextDouble();
		teclado.close();
		
		while (acumulador < SumaAConseguir) {
			contador ++;
			denominador++;
			acumulador = acumulador + 1/denominador;
		}
		
		System.out.println("Para llegar a " + acumulador + " has utilizado " +  contador + " sumandos.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
