package ejerciciosTema2;

import java.util.Scanner;

public class EstadoCivil {

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
	
		
		if (letra == 's'|| letra== 'S') {
			System.out.println("Usted esta Soltero");
		} else if (letra == 'c' || letra== 'C') {
			System.out.println("Usted esta Casado");
		} else if (letra == 'd' || letra== 'D') {
			System.out.println("Usted esta Divorciado");
		} else if (letra == 'v' || letra== 'V') {
			System.out.println("Usted esta Viudo");
		} else {
			System.out.println("Ha introducido una letra incorrecta");
		}
		
		
	}

}
