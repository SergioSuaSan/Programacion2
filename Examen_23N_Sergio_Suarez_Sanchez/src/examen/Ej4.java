package examen;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que averigua si un número es vampiro o no. El método
			debe recibir como parámetro un número entero de 4 cifras y responderá si el
			número es vampiro o no.
			Para averiguar si un número es vampiro hay que dividirlo en dos partes(dos
			colmillos), darle la vuelta a la primera parte(colmillo retorcido) y luego
			multiplicamos las dos partes a ver si obtenemos el número original.
			Ejemplo de cómo funciona:
			Teclea un número de 4 cifras: 1435
			Resultado: Es Vampiro
			Se divide el número en dos partes
			
			14 y 35
			
			Se le da la vuelta al primer número
			
			41 y 35
			
			Luego hace la multiplicación de los dos trozos
			
			41 x 35 = 1435
			
			Como el resultado de la multiplicación es el número original, entonces
			responderá que es “Vampiro”.
			Otros números vampiros son el 1260,1530 y 6880.
			
			Nota. Si se teclea un número que no tenga 4 cifras, se debe pedir otro hasta que
			pongan uno correcto.
		 */

		
		
		int numero, resultado;
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Escribe un número de 4 cifras");
		numero = teclado.nextInt();
		
		String texto = String.valueOf(numero);
		
		//Mientras el número no tenga 4 cifras, se vuelve a pedir
		while (texto.length()!=4) {
			System.out.println("Ese número no tiene 4 cifras, escribe otro:");
			numero = teclado.nextInt();
			texto = String.valueOf(numero);
		}
		
		//Dividimos el número en 2 factores con substring	
		String factor1 = texto.substring(0, 2);
		String factor2 = texto.substring(2, 4);
		
		//Para darle la vuelta al factor1, podemos usar el metodo reverse que te da el StringBuilder
		
		StringBuilder sb = new StringBuilder(factor1);
		sb.reverse();
		
		//Por si acaso, lo volvemos a transformar a texto, sustituimos el valor de factor1
		
		factor1 = sb.toString();
		
		//Ahora solo queda multiplicarlo y compararlo
		
		resultado = Integer.parseInt(factor1)*Integer.parseInt(factor2);
		
		if (resultado==numero) {
			System.out.println("El número es vampiro");
		} else {
			System.out.println("El número no es vampiro");
		}
		teclado.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
