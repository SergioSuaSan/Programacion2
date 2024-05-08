package ejerciciosTema2;

import java.util.Scanner;

public class Gentilicio {

	public static void main(String[] args) {
		// Tecleamos el nombre de un pueblo y nos pone el gentilicio
		
		
		
		
		String pueblo;

		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea el nombre de un pueblo: ");
		pueblo = teclado.nextLine();
		
		teclado.close();
		
		
		switch (pueblo) {
		case "Toledo":
			System.out.println("Eres toledano/a");
			break;
		case "Pantoja":
			System.out.println("Eres pantojano/a");
			break;
		case "Yuncos":
			System.out.println("Eres Yunquero/a");
			break;
		case "Mora":
			System.out.println("Eres Moracho/a");
			break;
			

		default:
			System.out.println("Pueblo desconocido");
			break;
		}
		
		
		
		
		
		

	}

}
