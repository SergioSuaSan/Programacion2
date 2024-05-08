package otrosEjercicios2;

import java.util.Scanner;

public class RecolocarTiempo {

	public static void main(String[] args) {


		int horas, minutos,segundos;

		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea las horas: ");
		horas = teclado.nextInt();
		System.out.println("Teclea los minutos: ");
		minutos = teclado.nextInt();
		System.out.println("Teclea los segundos: ");
		segundos = teclado.nextInt();
		teclado.close();
		
		if (segundos>=60) {
			minutos = minutos + segundos/60;
			segundos = segundos%60;	
		} 
		if (minutos>=60) {
			horas = horas + minutos /60;
			minutos = minutos%60;
		}
		
		System.out.printf(" Equivale a: %d:%02d:%02d ", horas, minutos, segundos);

	}

}
