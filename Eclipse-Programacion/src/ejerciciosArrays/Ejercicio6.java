package ejerciciosArrays;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * Programa que rellene un array de 4x4 de la siguiente manera:

1 0 0 0
0 1 0 0
0 0 1 0
0 0 0 1
		 */

		int[][] array = new int [4][4];
		
		for (int[] is : array) {
			System.out.println(Arrays.toString(is));
		}
		
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			array[i][i] = 1;
			System.out.println(Arrays.toString(array[i]));
		}
		
		
	}

}
