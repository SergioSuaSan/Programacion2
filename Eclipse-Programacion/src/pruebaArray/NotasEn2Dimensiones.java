package pruebaArray;

import java.util.Iterator;

public class NotasEn2Dimensiones {

	public static void main(String[] args) {
		//Preparar un Array con las notas de las 3 evaluaciones
		
		//Tendríamos 7 notas por 3 evaluaciones, en total 21 notas
		
//		int[] notas= new int [21];  			//Notas lineales
//		int [][] notas = new int [3][7];		//Notas en matriz, en 2 dimensiones
		//El primer corchete [] corresponde a las filas, que serían la fila 0, 1 y 2; 
		//el segundo corchete [][] corresponde a la columna, 7 columnas, que serían la 0, 1, 2, 3, 4, 5, y 6.
		
		
		int [][] notas = {   	{8, 5, 3, 7, 9, 5, 10},
										{8, 7, 4, 5, 3, 8, 1},
										{8, 2, 6, 8, 9, 4, 7}     };
		
		//Para poner los datos de un Array en dos dimensiones, se crea un corchete principal, con los arrays pequeños separados por comas
		//Si no se ha declarado sus longitudes, pueden ponerse longitudes distintas
		
//		int [][] notas = {   	{8, 5, 7, 9, 5, 10},
//										{8, 7, 3, 8, 1},
//										{8, 2, 6, 8, 9,4, 5, 6,  4, 7}     };
		
		System.out.println("Tamaño del Array: " + notas.length);
		System.out.println("Tamaño de la fila 0: " + notas[0].length);
		System.out.println("Tamaño de la fila 1: " + notas[1].length);
		System.out.println("Tamaño de la fila 2: " + notas[2].length);
		System.out.println("Tamaño del huevo 0,3: " + notas[0][3]);
		
		System.out.println();
		System.out.print("Todas las notas: ");
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas [i][j] + " ");
			}
		}
		
		
		int acumulador = 0;
		//Contar cuántos aprobados hay
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				if (notas [i][j] >=5) {
					acumulador++;
				}
			}
		}
		System.out.println();
		System.out.println("Número de aprobados: " + acumulador);

		System.out.println();
//		Media de cada evaluación
		for (int i = 0; i < notas.length; i++) {
			int total = 0;
			acumulador = 0;
			for (int j = 0; j < notas[i].length; j++) {
				total += notas [i][j];
				acumulador ++;
			}
			System.out.println("Media de la EV " + (i +1) + ": " + (double) total/acumulador);
		}
		
		System.out.println();

		
		//Media de cada módulo
		for (int j = 0; j < notas[0].length; j++) { //como no puedes poner el número de filas con [i], se pregunta por defecto la primera, la [0]
			int total = 0;
			acumulador = 0;
			for (int i = 0; i < notas.length; i++) {
				total += notas [i][j];
				acumulador ++;
			}
			System.out.println("Media del módulo  " + (j +1) + ": " + (double) total/acumulador);
		}
		
		System.out.println();
		
		// Aprobados por Evaluación
		
		for (int i = 0; i < notas.length; i++) {
			String total = "";
			int suma = 0;
			for (int j = 0; j < notas[i].length; j++) {
				if (notas[i][j] >= 5) {
					total += notas[i][j] + " ";
					suma ++;
				}
			}
			System.out.println("Aprobados de la EV " + (i +1) + ": " + total);
			System.out.println("Cantidad de aprobados de la EV" + (i + 1) + ": " + suma);
		}
		
		System.out.println();
		
		//Aprobados de cada módulo
		for (int j = 0; j < notas[0].length; j++) { //como no puedes poner el número de filas con [i], se pregunta por defecto la primera, la [0]
			String total = "";
			int suma = 0;
			for (int i = 0; i < notas.length; i++) {
				if (notas[i][j] >= 5) {
					total += notas[i][j] + " ";
					suma ++;
				}
			}
			System.out.println("Aprobados del módulo " + (j +1) + ": " + total);
			System.out.println("Cantidad de aprobados del módulo " + (j + 1) + ": " + suma);
		}
		
		System.out.println();
		
	}

}
