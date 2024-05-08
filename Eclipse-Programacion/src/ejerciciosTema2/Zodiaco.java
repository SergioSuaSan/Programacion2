package ejerciciosTema2;

import java.util.Scanner;

public class Zodiaco {

	public static void main(String[] args) {
		/*
		 * Zodiaco
		 */
		
		int dia, mes;

		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea tu día de nacimiento: ");
		dia = teclado.nextInt();
		System.out.println("Teclea tu mes de nacimiento:: ");
		mes = teclado.nextInt();
	
		
		
		
		while (mes>12 ||mes<1 && dia<1||dia>31) {
			System.out.println("Datos incorrectos. ");
			System.out.println("Teclea tu día de nacimiento: ");
			dia = teclado.nextInt();
			System.out.println("Teclea tu mes de nacimiento:: ");
			mes = teclado.nextInt();
		}
		
		
		teclado.close();
		
		if (mes ==1) {
			if (dia <=19) {
				System.out.println("Eres Capricornio");
			} else {
				System.out.println("Eres Acuario");
			}
		} else 	if (mes ==2) {
			if (dia <=19) {
				System.out.println("Eres Acuario");
			} else {
				System.out.println("Eres Piscis");
			}
		} else 	if (mes ==3) {
			if (dia <=20) {
				System.out.println("Eres Piscis");
			} else {
				System.out.println("Eres Aries");
			}
		} else 	if (mes ==4) {
			if (dia <=20) {
				System.out.println("Eres Aries");
			} else {
				System.out.println("Eres Tauro");
			}
		} else 	if (mes ==5) {
			if (dia <=21) {
				System.out.println("Eres Tauro");
			} else {
				System.out.println("Eres Géminis");
			}
		} else 	if (mes ==6) {
			if (dia <=22) {
				System.out.println("Eres Géminis");
			} else {
				System.out.println("Eres Cáncer");
			}
		} else 	if (mes ==7) {
			if (dia <=23) {
				System.out.println("Eres Cáncer");
			} else {
				System.out.println("Eres Leo");
			}
		} else 	if (mes ==8) {
			if (dia <=23) {
				System.out.println("Eres Leo");
			} else {
				System.out.println("Eres Virgo");
			}
		} else 	if (mes ==9) {
			if (dia <=23) {
				System.out.println("Eres Virgo");
			} else {
				System.out.println("Eres Libra");
			}
		} else 	if (mes ==10) {
			if (dia <=23) {
				System.out.println("Eres Libra");
			} else {
				System.out.println("Eres Escorpio");
			}
		} else 	if (mes ==11) {
			if (dia <=22) {
				System.out.println("Eres Escorpio");
			} else {
				System.out.println("Eres Sagitatio");
			}
		} else 	if (mes ==12) {
			if (dia <=21) {
				System.out.println("Eres Sagitario");
			} else {
				System.out.println("Eres Capricornio");
			}
		}
		
		

	}

}
