package ejerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * 2. Dado un array de números enteros, realiza un programa que diga si está
ordenado o no.
		 */
		
		
	int[] datos = new int[3];
		
	
		//Rellenamos el array con datos aleatorios
		for (int i = 0; i < datos.length; i++) {
			datos [i] =  (int) (Math.random()*50);
		}
		
		int[]clon = datos.clone();
		Arrays.sort(clon);
		System.out.println(Arrays.toString(datos));
		System.out.println(Arrays.toString(clon));
		if (Arrays.equals(datos, clon)) {
			System.out.println("Está ordenado");
		} else {
			System.out.println("No está ordenado");
		}
		
		

	}

}
