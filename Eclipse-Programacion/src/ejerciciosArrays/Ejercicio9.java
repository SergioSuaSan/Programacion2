package ejerciciosArrays;

import java.util.Arrays;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		 * 9. Programa que mezcla dos arrays ordenados de N elementos, consiguiendo un
array de N*2 elementos igualmente ordenados.

Array A

4 8 15 22 25 40

Array B

3 6 18 21 25 47

Array C

3 4 6 8 15 18 21 22 25 25 40 47
		 */

		
		int[] A = {4, 8, 15, 22, 25, 40}, B = {3, 6, 18, 21, 25, 47};
		int[] C = new int[A.length+B.length];
		C =Arrays.copyOf(A, A.length+B.length);		
		System.arraycopy(B, 0, C, A.length, B.length);
		Arrays.sort(C);
		System.out.println(Arrays.toString(C));
		
		
	}

}
