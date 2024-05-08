package ej2;

import java.util.Arrays;

public class Ej2 {

	public static void main(String[] args) {
		
		//Creamos el array
		int[] grupo = new int[20];
		
		//Lo rellenamos de manera aleatoria con un ciclo for
		for (int i = 0; i < grupo.length; i++) {
			grupo[i]= (int) (Math.random()*50 +1);
		}
		
		//Mostramos el array
		System.out.println(Arrays.toString(grupo));
		
		//Vamos a crear 2 variables, un comparador y un acumulador, uno que guarde el número más repetido y otro que lo compare con el anterior
		int acumulador = 0;
		int comparador = 0;
		//Vamos a crear otra variable que mantenga la posición del número más repetido
		int maxrepetido = 0;
		
		//Para comparar vamos a hacer 2 for, uno para elegir el número y otro para recorrer el array acumulando los iguales
		for (int i = 0; i < grupo.length; i++) {
			for (int j = 0; j < grupo.length; j++) {
				if (grupo[j] == grupo[i]) {
					acumulador ++;
				}
			}
			//Hacemos la comparación
			if (acumulador> comparador) {
				comparador=acumulador;
				maxrepetido = i;
			}
			//reiniciamos la variable
			acumulador = 0;
		}
		
		//Escribimos el resultado
		System.out.println("El número más repetido es: " + grupo[maxrepetido]);
		
		

	}

}
