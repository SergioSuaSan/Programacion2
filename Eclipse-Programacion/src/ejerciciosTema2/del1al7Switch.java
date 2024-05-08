package ejerciciosTema2;

import java.util.Scanner;

public class del1al7Switch {

	public static void main(String[] args) {
		/*
		 * Pedir un número del 1 al 7 e imprimimos el nombre del día de la semana
		 * Vamos a usar la estructura switch
		 */
		
		
		
		int numero;

		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea numero del 1 al 7: ");
		numero = teclado.nextInt();
		
		teclado.close();
		
		switch (numero) {		//Estructura switch, aquí tengo que poner una variable o expresión
		case 1:						//Rótulo de uno de los caminos
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Numero incorrecto");
			break;
		}

	
		
		
	}
}


