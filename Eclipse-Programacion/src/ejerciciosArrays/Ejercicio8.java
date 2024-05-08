package ejerciciosArrays;

import java.util.Arrays;
import java.util.Iterator;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * Comprobar si un array de 5x5 es un cuadro mágico. Se considera un cuadro
mágico aquel en el que las filas, las columnas y las diagonales suman igual.

15 8 1 24 17
16 14 7 5 23
22 20 13 6 4
3 21 19 12 10
9 2 25 18 11
		 */

		int[][] array =	{	{15, 8, 1, 24, 17},
									{16, 14, 7, 5, 23},
									{22, 20, 13, 6, 4},
									{3, 21, 19, 12, 10},
									{9, 2, 25, 18, 11}		};
		
		int[]filas = new int [5], columnas = new int [5], diagonal = new int[2];
		int numeromagico = 0;
		boolean magico = true;
		
		
		
		//Creamos el array de filas
		for (int i = 0; i < array.length; i++) {
			int acumulador = 0;
			for (int j = 0; j < array[i].length; j++) {
				acumulador += array[i][j];
			}
			filas[i] =acumulador;
			if (numeromagico == 0) {
				numeromagico = acumulador;
			}
			
		}
		System.out.println("La suma de sus filas son: " +Arrays.toString(filas));

		
		//Creamos el array de columnas
		for (int j = 0; j < array[0].length; j++) {
			int acumulador = 0;
			for (int i = 0; i < array.length; i++) {
				acumulador += array[i][j];
			}
			columnas[j] =acumulador;
		}
		System.out.println("La suma de sus columnas son: " +Arrays.toString(columnas));
		
		//Creamos el array de una diagonal
			int acumulador = 0;
			for (int i = 0; i < array.length; i++) {
				acumulador += array[i][i];
			}
			diagonal[0] += acumulador;
	
		
			//Creamos el array de la otra diagonal
			acumulador = 0;
			for (int i = 0; i < array.length; i++) {
				acumulador += array[i][4-i];
			}
			diagonal[1] += acumulador;
			

		
		System.out.println("La suma de sus Diagonales son: " +Arrays.toString(diagonal));
		
		
		//Comparamos que todos los datos de los arrays sean iguales al número mágico
		for (int i = 0; i < diagonal.length; i++) {
			if (numeromagico!= diagonal[i]) {
				magico = false;
			}
		}
		for (int i = 0; i < filas.length; i++) {
			if (numeromagico!= filas[i]) {
				magico = false;
			}
		}
		for (int i = 0; i < columnas.length; i++) {
			if (numeromagico!= columnas[i]) {
				magico = false;
			}
		}
		
		if (magico) {
			System.out.println("Es un cuadrado mágico");
		} else {
			System.out.println("No es un cuadrado mágico");
		}
		
		
		
		
		
		
	}

}
