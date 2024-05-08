package pruebaArray;


import java.util.Arrays;

public class PruebasArrays {

	public static void main(String[] args) {
		
		
		//Vamos a probar los Arrays
		
		//Declaración de una variable individual
		int a;
		
		//Declaración de un Array
		int[] b, c, d, e; 		//Todas las variables son arrays 
		int f[], g, h, i, j;		// Solo la variable f es un array
		
		//Dimensionar el array
		b = new int[20];   //Dimensiono la estructura para 20 datos, de 0 a 19
		
		
		//Declararlo y dimensionarlo  todo en la misma línea
		int[] w = new int [20];
		
		//Cambiar el tamaño del array, tirando el anterior y haciendo una nueva
		w = new int [12];
		
		//Uso de la variable
		w[0] = 83;
		w[2] = 45;
		w[5] = 8;
		w[8] = 3;
		
		System.out.println(w[0]);
		System.out.println(w);
		
		for (int k = 0; k < w.length; k++) {
			System.out.print(w[k] + ", ");
		}
		
		//diferentes tipos de arrays
		double[] l;
		boolean[] m;
		String[] n; 
		Object [] o;
		int [][] p; //Array en dos dimensiones
		
		//Declarar un array ya con los valores dentro
		int q[] = {12,13, 143,15,23,46,34,23,12,3,6,7,4,6,3};
		
		//Modificaciones
		q[3]++;
		q[2] += q[6];
		
		System.out.println();
		System.out.println(Arrays.toString(q));
		
		

	}

}
