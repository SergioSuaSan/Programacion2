package ejerciciosTema1;

import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;  	//Variables para guardar los datos
		
		//Preparar un objeto para poder hablar con el teclado
		Scanner teclado = new Scanner ( System.in);
		
		// Mostrar un mejsaje para que el usuari teclee algo
		System.out.print("Teclee su edad: "); 
		
		//Le digo al teclado que esté atento para guardar lo que tecleen
		numero = teclado.nextInt();
		
		//Calcular el doble
		
		
		//Imprimo el resultado
		System.out.println(numero >= 18);
		
		//Cierro el teclado (el objeto)
		teclado.close();
		
		//CORRECTO

	}

}
