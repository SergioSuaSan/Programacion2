package ejerciciosTema1;

import java.util.Scanner;

public class DelReves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, unidades, decenas, centenas, umillar, dmillar, resto;
		
		Scanner teclado = new Scanner ( System.in);
		
		System.out.print("Escribe un número de  0 a 99999: ");
		
		numero= teclado.nextInt();
		
		unidades= numero%10;
		resto = numero/10;
		decenas = resto%10;
		resto = resto/10;
		centenas=  resto%10;
		resto = resto/10;
		umillar=resto%10;
		resto = resto/10;
		dmillar=resto%10;
		
		System.out.println(numero + " al reves es: " + unidades+ decenas + centenas + umillar + dmillar );
		
		
		
		
		
	}

}
