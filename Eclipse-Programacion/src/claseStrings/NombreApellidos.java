package claseStrings;

import java.util.Scanner;

public class NombreApellidos {

	public static void main(String[] args) {
		/*
		 * Pido por teclado un nombre completo
		 * y retorno: 
		 * 		Nombre	
		 * 		Apellido1:
		 * 		Apellido2:
		 * 
		 * Si solo ha escrito una palabra o dos palabras, dará error.
		 */
		
		
		String nombrecompleto, nombre, apellido1, apellido2;
		int espacio1, espacio2;
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("Escribe el nombre completo");
		nombrecompleto = teclado.nextLine();
		
		espacio1 = nombrecompleto.indexOf(' ');
		espacio2 = nombrecompleto.lastIndexOf(' ');

		
		while (nombrecompleto.isEmpty() == true| espacio1 ==-1|espacio1==espacio2) {
			espacio1 = nombrecompleto.indexOf(' ');
			espacio2 = nombrecompleto.lastIndexOf(' ');
			if (nombrecompleto.isEmpty()== true) {
				System.out.println("No has escrito nada");
				System.out.println("Escribe el nombre completo");
				nombrecompleto = teclado.nextLine();
			} else if (espacio1 == -1) {
				System.out.println("Error, solo hay una palabra");
				System.out.println("Escribe el nombre completo");
				nombrecompleto = teclado.nextLine();
			} else if (espacio1 == espacio2) {
				System.out.println("Error, no hay 2 apellidos");
				System.out.println("Escribe el nombre completo");
				nombrecompleto = teclado.nextLine();
			}
		}
		
		teclado.close();
		
		
		
		nombre = nombrecompleto.substring(0, espacio1);
		apellido1 = nombrecompleto.substring(espacio1 +1, espacio2);
		apellido2 = nombrecompleto.substring(espacio2 +1, nombrecompleto.length());
		
		
		System.out.println("Tu nombre es: " + nombre);
		System.out.println("Tu primer apellido es: " + apellido1);
		System.out.println("Tu segundo apellido es: " + apellido2);

		
		
		

	}

}
