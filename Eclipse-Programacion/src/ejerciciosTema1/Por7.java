package ejerciciosTema1;

import java.util.Scanner;

public class Por7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;  	//Variables para guardar los datos
		
		//Preparar un objeto para poder hablar con el teclado
		Scanner teclado = new Scanner ( System.in);
		
		// Mostrar un mejsaje para que el usuari teclee algo
		System.out.print("Teclee un número: "); 
		
		//Le digo al teclado que esté atento para guardar lo que tecleen
		numero = teclado.nextInt();
		
		
		//Imprimo el resultado
		System.out.println(numero%7 == 0);
		
		//Cierro el teclado (el objeto)
		teclado.close();
		
		//CORRECTO

	}

}
