package ejercicioArrays2;

import java.util.ArrayList;
import java.util.Scanner;

public class Aumentararray {

	public static void main(String[] args) {
		/*
		 * Programa que lea números enteros hasta que se escriba el -1. Los números deben
ir quedando almacenados en un array. Como no sabemos los números que van a
teclear el array debe ir cambiando de tamaño para irse adaptando al numero de
datos leídos.
		 */
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		Scanner teclado = new Scanner ( System.in);
		int numero;
		do {
			System.out.print("Teclee un numero: "); 
			numero = teclado.nextInt();
			a.add(numero);
		} while (numero!=-1);
		
		a.remove(a.size()-1);
		System.out.println(a);
		teclado.close();
		
	}

}
