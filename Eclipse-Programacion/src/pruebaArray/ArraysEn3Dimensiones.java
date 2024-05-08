package pruebaArray;


import java.util.Arrays;
import java.util.Iterator;

public class ArraysEn3Dimensiones {

	public static void main(String[] args) {
		/*
		 * Ejemplo de array de 3 dimensiones
		 * 
		 * Organizar los datos de los alumnos de la universidad
		 * 		Filas: Datos de cada alumnos
		 * 		Columna: Cursos de 1º a 4º
		 * 		Profundidad: Sexo de los alumnos
		 */
		
		int [][][] datos = { 	{ 	{20, 22}, {19, 21}, {20, 18}, {22, 23}	},
										{ 	{23, 21}, {18, 22}, {19, 19}, {20, 19}	},
										{ 	{16, 19}, {18, 20}, {22, 22}, {21, 16}	},
										{ 	{18, 20}, {22, 21}, {21, 22}, {19, 20}	},
										{ 	{20, 22}, {22, 20}, {20, 19}, {17, 20}	}	};
		
		String[] grados = { "Derecho", "Informática", "Magisterio", "Física", "ADE" };
		String[] cursos = { "Primero", "Segundo", "Tercero", "Cuarto"};
		String[] sexo  = {"Mujeres", "Hombres"};
		
		
		//Total alumnos de la universidad
		int suma =  0;
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				for (int j2 = 0; j2 < datos[i][j].length; j2++) {
					suma+= datos [i][j][j2];
				}
			}
		}
		System.out.println("Total de alumnos: " + suma);
		System.out.println();
		
		
		
		
		//Total alumnos por grado
		System.out.println("Alumnos por grado");
		for (int i = 0; i < datos.length; i++) {
			suma = 0;
			for (int j = 0; j < datos[i].length; j++) {
				for (int j2 = 0; j2 < datos[i][j].length; j2++) {
					suma+= datos [i][j][j2];
				}
			}
			System.out.println("Total de alumnos del grado de " + grados[i] + ": " + suma);
		}
		System.out.println();
		
		//Total alumnos por curso
		System.out.println("Alumnos por curso");
		for (int j = 0; j < datos[0].length; j++) {
			suma = 0;
			for (int i = 0; i < datos.length; i++) {	
				for (int j2 = 0; j2 < datos[i][j].length; j2++) {
					suma+= datos [i][j][j2];
				}
			}
			System.out.println("Total de alumnos de " + cursos[j] + ": " + suma);
		}
		System.out.println();
		
		//Total alumnos por sexo
		System.out.println("Alumnos por sexo");
		for (int j2 = 0; j2 < datos[0][0].length; j2++) {
			suma = 0;
			for (int i = 0; i < datos.length; i++) {
				for (int j = 0; j < datos[i].length; j++) {
					suma+= datos [i][j][j2];
				}
			}
			System.out.println("Total de alumnos de " + sexo[j2] + ": " + suma);
		}
		System.out.println();
		
		//Lista de alumnos por grado y curso
		
		System.out.println("Alumnos por grado");
		for (int i = 0; i < datos.length; i++) {
			System.out.print(grados[i] + ": ");
			for (int j = 0; j < datos[i].length; j++) {
				suma = 0;
				for (int j2 = 0; j2 < datos[i][j].length; j2++) {
					suma+= datos [i][j][j2];
				}
				System.out.print( cursos[j] + ": "+ suma + ", ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		//Clase con más diferencia entre mujeres y hombres
		int acumulador = 0, iMasDiferencia = 0, jMasDiferencia = 0;
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				int diferencia = Math.abs(datos[i][j][0]-datos[i][j][1]);
				if (diferencia >acumulador) {
					iMasDiferencia = i;
					jMasDiferencia =j;
					acumulador = diferencia;
				}
			}
		}

		System.out.println("El grupo con mayor diferencia es del módulo de " +  grados[iMasDiferencia] + " en el curso " + cursos[jMasDiferencia] );
		
		
	}

}
