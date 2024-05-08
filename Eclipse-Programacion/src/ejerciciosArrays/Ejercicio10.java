package ejerciciosArrays;

import java.util.Arrays;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * Dado un array de 5x5, realizar un algoritmo que lo rellene como en la figura.

0 1 2 3 4
1 2 3 4 3
2 3 4 3 2
3 4 3 2 1
4 3 2 1 0
		 */
		
		int[][] array = new int [5][5];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j+i<=4) {
					array[i][j] =j+i;					
				} else {
					array[i][j] = (array.length-1 +array[i].length-1)- (j+i);
				}
			}
			System.out.println(Arrays.toString(array[i]));
		}
		
		
		
		
		

	}

}
