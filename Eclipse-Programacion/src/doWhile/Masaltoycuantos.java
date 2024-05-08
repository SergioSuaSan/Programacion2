package doWhile;

import java.util.Scanner;

public class Masaltoycuantos {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que lea varios números por teclado hasta que se introduzca
			un cero, y entonces diga cuál es el mayor de los números introducidos y cuantas
			veces se repite ese número.
			Introduciendo: 1 3 5 5 4 6 6 7 1 4 7 2 0
			Da como salida: El mayor es el 7
			Se repite 2 veces
		 */
		
		Scanner teclado = new Scanner (System.in);
		int numero, mayor, acumulador = 1;
		
		
		//Lectura anticipada
		System.out.print("Teclea un numero: ");
		numero = teclado.nextInt();
		mayor = numero;
		
		//Con la lectura anticipada, en lugar de do while, se hace directamente un while, pues ya hemos introducido el 1 dato.
		while (numero!= 0) {
			System.out.print("Teclea un numero: ");
			numero = teclado.nextInt();
			if (numero>mayor) {
				acumulador= 1;
				mayor= numero;
			} else if ( numero == mayor) {
				acumulador += 1;
			}	
		} 
		
		teclado.close();
		System.out.println("El número mayor es " + mayor + " y se ha repetido " + acumulador + " veces.");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
