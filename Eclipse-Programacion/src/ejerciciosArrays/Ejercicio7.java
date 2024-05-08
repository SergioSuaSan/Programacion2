package ejerciciosArrays;

import java.util.Arrays;
import java.util.Iterator;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * Dado un array de 3x3 elementos, calcular la suma de sus filas y sus columnas
almacenándolas en dos array de 3 elementos.
		 */

		
		int[][] array =  {	{1, 2, 3},
									{1, 4, 3},
									{1, 2, 3}	};
		int[]filas = new int [3], columnas = new int [3];
		
		for (int i = 0; i < array.length; i++) {
			int acumulador = 0;
			for (int j = 0; j < array[i].length; j++) {
				acumulador += array[i][j];
			}
			filas[i] =acumulador;
		}
		System.out.println("La suma de sus filas son: " +Arrays.toString(filas));

		
		
		for (int j = 0; j < array[0].length; j++) {
			int acumulador = 0;
			for (int i = 0; i < array.length; i++) {
				acumulador += array[i][j];
			}
			columnas[j] =acumulador;
		}
		System.out.println("La suma de sus columnas son: " +Arrays.toString(columnas));
		
		
		
		
		
		
	}

}
