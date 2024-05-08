package claseStrings;

import java.util.Scanner;

public class ProbarConversiones {

	public static void main(String[] args) {
		/*
		 * Convertir unos datos en otros
		 */
		
		
		int  a= 1234;
		String texto;
		
		//Convertir el numero en texto String
		texto = String.valueOf(a);
		System.out.println(texto);
		
		//Convertir texto a un número
		texto = "5421";
		a = Integer.parseInt(texto);
		//    Double.parseDouble();
		//	  Float.parseFloat();
		//    Long.parseLong();	
		System.out.println(a);
		
		//averiguar las cifras que tiene un número
		System.out.println("cifras: " + String.valueOf(a).length());
		
		//pedir un numero de 4 cifras, dividirlo en 2 trozos y los sumo
		int numero, suma; 
		Scanner teclado = new Scanner (System.in);
		System.out.print("Teclea numero de 4 cifras: ");
		numero = teclado.nextInt();
		
		String sumando1= String.valueOf(numero).substring(0, 2);
		String sumando2= String.valueOf(numero).substring(2, 4);
		
		suma = Integer.parseInt(sumando2) + Integer.parseInt(sumando1);
		System.out.println(suma);
		
		
		
		

	}

}
