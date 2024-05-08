package aprobados;

import java.util.Iterator;

public class Ejercicio4SinMetodo {

	public static void main(String[] args) {
		
		//Esto es lo que tienes que poner para que salga el método
//		System.out.print(dibujarX(3));
		int num =11;

		int division = num/2, espacioInicial = 0, espacioMedio = num;
		
		//Parte1
		for (int i = 1; i <=division; i++) {
			for (int j = 0; j < i-1; j++) {
				System.out.print(" ");
			}
			System.out.print("x");
			for (int j = 0; j <num-2*i; j++) {
				System.out.print(" ");
			}	
			System.out.print("x");
			System.out.println();
		}
		
		//Parte central
		
		for (int i = 1; i <=division; i++) {
			System.out.print(" ");
		}
		System.out.print("x");
		System.out.println();
		
		//Parte3
		for (int i = 1; i <=division; i++) {
			for (int j = 0; j < num-(i+ division+1); j++) {
				System.out.print(" ");
			}
			System.out.print("x");
			for (int j = 0; j <2*i-1; j++) {
				System.out.print(" ");
			}	
			System.out.print("x");
			System.out.println();
		}
		
		
	}
	
	
	//creo que el método necesita un array en 2 dimensiones que guarde todos los strings para que retorne un solo array
	//Método
//	public static String dibujarX(int num) {
//		//Realizamos la division para saber dónde seccionamos los bucles
//	
//	}

}
