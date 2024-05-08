package ejerciciosTema2;

import java.util.Scanner;

public class del1al7 {

	public static void main(String[] args) {
		/*
		 * Pedir un número del 1 al 7 e imprimimos el nombre del día de la semana
		 * Vamos a usar la estructura switch
		 */
		
		
		
		int numero;

		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea numero del 1 al 7: ");
		numero = teclado.nextInt();

		
		while (numero<1||numero>7) {
			System.out.println("Este número no es correcto.");
			System.out.println("Vuelve a escribirlo: ");
			numero = teclado.nextInt();
		}
		if (numero==1){
			System.out.println("El dia de la semana es Lunes.");
		} else if (numero==2){
			System.out.println("El dia de la semana es Martes.");
		} else if (numero==3){
			System.out.println("El dia de la semana es Miércoles.");
		} else if (numero==4){
			System.out.println("El dia de la semana es Jueves.");
		} else if (numero==5){
			System.out.println("El dia de la semana es Viernes.");
		} else if (numero==6){
			System.out.println("El dia de la semana es Sábado.");
		} else if (numero==7){
			System.out.println("El dia de la semana es Domingo.");
		}

		teclado.close();
	}

}
