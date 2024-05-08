package ejerciciosHuelga;

import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) {
		/*
		 * Recoger día y mes
		 * Calcular el día y mes de pago (90 días)
		 * Febrero siempre tiene 28 días
		 */
		
		
		int dia, mes, diamax, anno, plazo = 90;
		Scanner teclado = new Scanner (System.in);		
		System.out.print("Teclea un dia: ");
		dia = teclado.nextInt();
		System.out.print("Teclea otro mes: ");
		mes = teclado.nextInt();
		System.out.print("Teclea un año: ");
		anno = teclado.nextInt();
		teclado.close();
		
		int  diafinal = dia + plazo;
		//Para que el siwtch siempre estñé activo, debe estar en el propio WHILE

		//No puedes hacer esto porque el día máximo no está inicializado
//		while (dia + plazo>diamax) {
		while (plazo != 0) {
			switch (mes) {
			case 2: diamax =28; break;
			case 4, 6, 9, 11: diamax =30; break;
			default: diamax = 31;		break;
			}	
			if (dia + plazo >diamax) {
				plazo -=diamax ;
				dia=  diamax- (diamax-dia);
				mes ++;
				if (mes>12) {
					mes = 1;
					anno ++;
				}	
				diafinal = dia + plazo;	
			} else {
				diafinal = dia +  plazo;
				plazo=0;
				if (dia >diamax) {
					dia = dia-diamax;
					mes++;
				}
			}
		}

		
		
		System.out.println("El fin del plazo es. " + diafinal +" del " + mes + " del "  +anno);
		
		
		
		
	}

}
