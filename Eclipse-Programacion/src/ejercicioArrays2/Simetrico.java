package ejercicioArrays2;



public class Simetrico {

	public static void main(String[] args) {
		/*
		 * Elabora un programa al que se le pasa un array de 2 dimensiones y averigua si es
simétrica, retornando un valor booleano. Un array es simétrico si contiene los
mismos valores por encima y por debajo de la diagonal principal.
		 */

		
		int[][] cuadro = {	{1, 4, 6, 2, 9},
									{4, 8, 5, 5, 3},
									{6, 5, 4, 7, 2},
									{2, 5, 7, 9, 4},
									{9, 3, 2, 4, 3}	};
		boolean simetrico = true;
		for (int i = 0; i < cuadro.length; i++) {
			for (int j = 0; j < cuadro[i].length; j++) {
				if(cuadro[i][j] != cuadro[j][i]) {
					simetrico = false;
				}	
			}	
		}
		System.out.println(simetrico);
		
	}

}
