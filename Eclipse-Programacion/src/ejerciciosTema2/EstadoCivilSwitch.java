package ejerciciosTema2;

import java.util.Scanner;

public class EstadoCivilSwitch {

	public static void main(String[] args) {
		/*
		 * Programa que pide letra del estado civil y responde con el nombre completo
		 * 
		 * sS Soltero
		 * cC Casado
		 * vV Viudo
		 * dD Divorciado
		 */
		

		char letra;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea letra: ");
		letra = teclado.nextLine().charAt(0);
		teclado.close();
	
		
		
		switch (letra) {
		case 's':
		case 'S':
			System.out.println("Usted esta Soltero");
			break;
		case 'c', 'C':
			System.out.println("Usted esta Casado");
			break;
		case 'd','D':
			System.out.println("Usted esta Divorciado");
			break;
		case 'v','V':
			System.out.println("Usted esta Viudo");
			break;
		default:
			System.out.println("Ha introducido una letra incorrecta");
			break;
		}
	
		
		
		
	}

}
