package otrosEjercicios2;

import java.io.Closeable;
import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) {
		
		
	
		
		int dia,mes, ano, diamaximo, mesmaximo;
		mesmaximo=12;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea el día: ");
		dia = teclado.nextInt();
		System.out.println("Teclea el mes: ");
		mes = teclado.nextInt();
		System.out.println("Teclea el año: ");
		ano = teclado.nextInt();
		teclado.close();
		
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			diamaximo=31;
			break;
		case 2:
			diamaximo=28;
			break;
		case 4, 6, 9, 11:
			diamaximo= 30;
			break;
		default:
			diamaximo=0;
			break;
		}
		
		
		if (dia+ 1 >diamaximo) {
			dia= 1;
			mes = mes+1;
			if (mes > mesmaximo) {
				mes = 1;
				ano  = ano + 1;
			} 
		}else {
			dia = dia + 1;

		} 
		System.out.println("El día siguiente es: " + dia + " del " + mes + " del " + ano);

	}

}
