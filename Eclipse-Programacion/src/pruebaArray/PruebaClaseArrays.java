package pruebaArray;

import java.util.Arrays;

public class PruebaClaseArrays {

	public static void main(String[] args) {
		// Probamos la clase Arrays, que es una clase especial que nos ayuda con el manejo de los arrays
		
		
		int[] numeros = {4, 7, 45, 32, 6, 34,23, 4};
		
		//Imprimir array en pantalla
		System.out.println(Arrays.toString(numeros));

		//buscar un valor en un array (Tiene que estar ordenado)
		System.out.println("Búsqueda: " + Arrays.binarySearch(numeros, 31));
		
		//Ordenar un array
		numeros[3] = 58;
		System.out.println(Arrays.toString(numeros));
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		
		//Copiar trozos de un array
		int[] numeros2 = Arrays.copyOf(numeros, 4);
		System.out.println(Arrays.toString(numeros2));
		
		//Copiar un ntrozo, indicando el principio y el final
		int[] numeros3 = Arrays.copyOfRange(numeros, 2, 6);
		System.out.println(Arrays.toString(numeros3));
		
		//Comparar si dos arrays son iguales
		System.out.println( Arrays.equals(numeros2, numeros3));
		
		//Rellenar un array con un valor
		Arrays.fill(numeros3, 7);
		System.out.println(Arrays.toString(numeros3));
		
		//Clonar un array
		int[]numeros4 = numeros.clone();
		System.out.println(Arrays.toString(numeros4));
		
		
		
		
		
	}

}
