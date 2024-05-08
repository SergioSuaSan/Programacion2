package ejerciciosTema1;

import java.util.Scanner;

public class Circunferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		double radio, longitud, area;
		final double Pi = Math.PI ;
		
		Scanner teclado = new Scanner ( System.in);
		
		System.out.print("Teclee el radio en cm: ");
		
		radio = teclado.nextDouble();
		
		longitud = 2*Pi*radio;
		area = Pi*radio*radio;
		
		//System.out.println("La longitud de la circunferencia es " + longitud + " cm, y su área es " + area + " cm^2");
		System.out.printf("La longitud de la circunferencia es  %.2f  cm y su área es %.2f cm^2", longitud, area);

		teclado.close();
	}

}
