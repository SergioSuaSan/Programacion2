package pruebaExamen;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que averigüe si un número entero tiene todas sus cifras
			ordenadas. El programa debe pedir al usuario que teclee un número, y debe
			responder si el número tiene las cifras ordenadas ascendentemente o no.
			Ejemplo:
			El numero 2568 tiene todas sus cifras ordenadas ascendentemente.
			El numero 4637 no tiene las cifras ordenadas.
			
			Nota: El número puede tener un número cualquiera de cifras, no tiene que tener
			exactamente cuatro como en el ejemplo. Si el número tuviese una sola cifra, se
			entenderá que tiene las cifras ordenadas correctamente.
		 */

		Scanner teclado = new Scanner (System.in);
		System.out.println("Escribe un número: ");
		//Vamos a pedir un número para separar más facilmente las cifras
		String numero = teclado.nextLine();
		teclado.close();
		
		//Cogeremos un acumulador que compruebe que son ascendentemente mayores cada vez y una flag que indique si NO lo es
		int mayor;
		boolean desordenado  =false;
		
		//Si el numero solo tiene una cifra, sale que está ordenado
		if (numero.length()==1) {
			System.out.println("Ordenado");
		} else {
			//Si tiene más de una cifra, hay que compararlas. Indicamos al mayor que coja la primera cifra del número
			mayor = numero.charAt(0);
			//Usamos un bucle de la longitud del número, gracias a ser un texto, eso no es problema.
			for (int i = 1; i < numero.length(); i++) {
				//Indicamos que si el numero anterior es mas grande que el valor numerico de la siguiente cifra del numero (i), active a flag
				if (mayor >numero.charAt(i)) {
					desordenado =true;
				} else {
					//Indicamos que el mayor es el la nueva cifra
					mayor = numero.charAt(i);					
				}
			} 
//			if (numero.length()==1) {
//				System.out.println("Ordenado");
//			} else {
//				//Si tiene más de una cifra, hay que compararlas. Indicamos al mayor que coja la primera cifra del número
//				mayor = Integer.parseInt(numero.substring(0,1));
//				//Usamos un bucle de la longitud del número, gracias a ser un texto, eso no es problema.
//				for (int i = 1; i < numero.length(); i++) {
//					//Indicamos que si el numero anterior es mas grande que el valor numerico de la siguiente cifra del numero (i), active a flag
//					if (mayor >Integer.parseInt(numero.substring(i,i+1))) {
//						desordenado =true;
//					} else {
//						//Indicamos que el mayor es el la nueva cifra
//						mayor = Integer.parseInt(numero.substring(i,i+1));					
//					}
//				} 
			
			//Respondera una u otra cosa según la flag
			if(desordenado) {
				System.out.println("Desordenado");				
			} else {
				System.out.println("Ordenado");				
			}
		}
		
	

	}

}
