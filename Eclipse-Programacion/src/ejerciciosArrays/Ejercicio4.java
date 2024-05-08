package ejerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Programa que ordene los índices de un array de enteros. A partir del array
			original debe generar otro donde aparezcan ordenados los índices de mayor a
			menor.	
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuántos números vas a meter?");
		int numero = teclado.nextInt();
		
		int[] datos = new int[numero];
		int[] resultado = new int[numero];
		
		//Rellenamos el array con datos aleatorios
		for (int i = 0; i < datos.length; i++) {
			datos [i] =  (int) (Math.random()*50);
		}
		
		
		System.out.println(Arrays.toString(datos));
		for (int i = 0; i < datos.length; i++) {
			int posicionmayor = 0;
			for (int j = 1; j < datos.length; j++) {
				if (datos[j]>datos[posicionmayor]) {
					posicionmayor = j;
				}
			}
			resultado[i] = posicionmayor;
			
			datos[posicionmayor] = 0;
			
		}
		System.out.println(Arrays.toString(resultado));
		
		
		
	}

}
