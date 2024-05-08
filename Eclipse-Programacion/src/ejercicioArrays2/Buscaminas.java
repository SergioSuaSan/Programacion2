package ejercicioArrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Buscaminas {

	public static void main(String[] args) {
		/*
		 * Programa que simule el juego de las minas. El programa rellenará de forma
aleatoria un array de 5x5 con 10 minas. Una vez relleno, pedirá que escribamos
coordenada y mostrará el mensaje MINA, en caso de haber pisado una, o bien un
numero que indica cuantas minas hay alrededor.
		 */
		
		
		int[][] campo = new int [5][5];
		
		Scanner teclado = new Scanner (System.in);
		
		int bombas = 10;
		for (int i = 0; i < campo.length; i++) {
			for (int j = 0; j < campo[i].length; j++) {
			}
			System.out.println(Arrays.toString(campo[i]));
		}
		
		
		while (bombas>0) {
			int x =(int)(Math.random()*5);
			int y =(int)(Math.random()*5);
			if (campo[x][y] ==1) {
				continue;
			} else {
				bombas --;
				campo[x][y] =1;	
			}
		}
		
		System.out.println();		
		
		for (int i = 0; i < campo.length; i++) {
			for (int j = 0; j < campo[i].length; j++) {
			}
			System.out.println(Arrays.toString(campo[i]));
		}
	
	}

}
