package ejerciciosTema2;

import java.util.Scanner;

public class ejercicioMayordeEdad {

	public static void main(String[] args) {


		//Pedimos por teclado la edad de una persona y contestamos si es mayor de edad o no
		int edad;

		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea tu edad: ");
		edad = teclado.nextInt();
		teclado.close();
		
//		//Alternativa simple para contestar si es mayor de edad
//		if (edad >= 18) {
//			System.out.println("Eres mayor de edad");
//		}
		
		

//		Alternativa doble 
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}

	}

}
