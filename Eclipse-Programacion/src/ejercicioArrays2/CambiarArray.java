package ejercicioArrays2;

import java.util.ArrayList;

public class CambiarArray {

	public static void main(String[] args) {
		/*
		 * Crea un programa que almacene un array bidimensional (6x6) con pocos valores
en un array unidimensional. En el array unidimensional vamos almacenando
cada valor original junto con su fila y columna, es decir por cada valor del array
original almacenamos tres valores en el resultado.
		 */
		
		int[][] cuadro = {	{0, 0, 6, 0, 9, 0},
									{4, 0, 0, 0, 0, 3},
									{0, 5, 0, 7, 0, 0},
									{0, 0, 0, 7, 6, 0},
									{2, 0, 0, 0, 0, 4},
									{0, 0, 2, 0, 0, 3}	};
		
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for (int i = 0; i < cuadro.length; i++) {
			for (int j = 0; j < cuadro[i].length; j++) {
				if (cuadro[i][j] !=0) {
					resultado.add(cuadro[i][j]);
					resultado.add(i);
					resultado.add(j);
				}
			}
		}
		System.out.println(resultado);
		

	}

}
