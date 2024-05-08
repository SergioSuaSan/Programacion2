package claseStrings;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		/*
		 * Pedir un correo electrónico
		 * javier@ies-azarquiel.es
		 * 
		 * minimo cuatro letras en el nombre
		 * en el dominio habrá un punto
		 * necesita un @
		 * acaba en .es o .com
		 */
		
		String email;
		int espacio, arroba;
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("Escribe tu email");
		email = teclado.nextLine();
		
		arroba = email.indexOf('@');
		espacio = email.indexOf(' ');
		
		if (email.indexOf("@")== -1) {
			System.out.println("Error, necesitas un @");
		} else
		if (email.substring(0, arroba).length() < 4 ) {
			System.out.println("Error, el nombre es demasiado corto");
		} else
		if (espacio != -1) {
			System.out.println("Error, el email no puede contener espacios");
		} else
		if(email.substring( arroba, email.length() ).indexOf (".") == -1) {
			System.out.println("Error, necesitas un punto");
		} else
		if (!email.endsWith(".es")&&!email.endsWith(".com")) {
			System.out.println("Error, no acaba ni en .es ni en .com");
		}
		else {
			System.out.println("correo valido");
		}
		
		

	}

}
