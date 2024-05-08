package ejerciciosTema2;

import java.util.Scanner;

public class DiasdeMes {

	public static void main(String[] args) {
		
		
		
		
		int mes;

		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea el número del mes: ");
		mes = teclado.nextInt();
		
		teclado.close();
		
		
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("31");
			break;
		case 2:
			System.out.println("28");
			break;
		case 4,6, 9, 11:
			System.out.println(" 30");
			break;
	
		default:
			System.out.println("Número incorrecto");
			break;
		}
		
		

	}

}
