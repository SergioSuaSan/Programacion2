package ejerciciosTema1;

import java.util.Scanner;

public class PesoLunar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double peso;  	//Variables para guardar los datos
		
		//Preparar un objeto para poder hablar con el teclado
		Scanner teclado = new Scanner ( System.in);
		
		// Mostrar un mejsaje para que el usuari teclee algo
		System.out.print("Teclee su peso: "); 
		
		//Le digo al teclado que esté atento para guardar lo que tecleen
		peso = teclado.nextDouble();
		
		
		//Imprimo el resultado
		System.out.println("Usted pesaría en la Luna: " + (peso/9.8*1.62) + " kgs.");
		System.out.printf("Usted pesaría en la Luna:  %.2f kgs", (peso/9.8*1.62)); 
		
		//Cierro el teclado (el objeto)
		teclado.close();
		
		//CORRECTO
		
	}

}
