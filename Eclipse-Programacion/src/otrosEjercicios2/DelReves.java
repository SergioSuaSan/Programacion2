package otrosEjercicios2;

import java.util.Scanner;

public class DelReves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, unidades, decenas, centenas, umillar,  resto;
		
		Scanner teclado = new Scanner ( System.in);
		
		System.out.print("Escribe un número de  0 a 9999: ");
		
		numero= teclado.nextInt();
		
		unidades= numero%10;
		resto = numero/10;
		decenas = resto%10;
		resto = resto/10;
		centenas=  resto%10;
		resto = resto/10;
		umillar=resto%10;
		
		
		if (numero < 10) {
			System.out.println(numero + " al revés: " + numero);
		} else if ( numero < 100) {
			System.out.println(numero + " al revés: " + unidades + decenas);
		} else if ( numero < 1000) {
			System.out.println(numero + " all revés: " + unidades + decenas + centenas);
		} else {
			System.out.println(numero + " al reves es: " + unidades+ decenas + centenas + umillar);			
		}
		
	
		
		
		
		
		
		
	}

}
