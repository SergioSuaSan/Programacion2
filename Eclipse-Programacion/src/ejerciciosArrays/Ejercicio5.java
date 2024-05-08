package ejerciciosArrays;

import java.util.Arrays;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Dado un array de 50 números entre 1 y 100, Escribir una lista ordenada con los
			valores que no aparecen en el array.
		 */
		
		
		int[] datos = new int[50];
		
	
		//Rellenamos el array con datos aleatorios
		for (int i = 0; i < datos.length; i++) {
			datos [i] =  (int) (Math.random()*100) +1;
		}
		
		Arrays.sort(datos);
		System.out.println(Arrays.toString(datos));
		
		for (int i = 1; i <=100; i++) {
			if (Arrays.binarySearch(datos, i) <0) {
				System.out.print(i + " , ");
			}
		}
	
		
		
		
		
		
		
		
		
		
		
	}

}
