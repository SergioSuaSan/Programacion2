package primerosProgramas;

import java.util.Scanner;

public class Doble {

	public static void main(String[] args) {

		/*
		 * Programa que pida al usuario que teclee un número
		 * y nosotros imrimimos el doble de ese número
		 */
		
		double numero, doble;  	//Variables para guardar los datos
		
		//Preparar un objeto para poder hablar con el teclado
		Scanner teclado = new Scanner ( System.in);
		
		// Mostrar un mejsaje para que el usuari teclee algo
		System.out.print("Teclee un número: "); 
		
		//Le digo al teclado que esté atento para guardar lo que tecleen
		numero = teclado.nextDouble();
		
		//Calcular el doble
		doble = numero * 2;
		
		//Imprimo el resultado
		System.out.println("El doble es: " + doble);
		
		//Cierro el teclado (el objeto)
		teclado.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
