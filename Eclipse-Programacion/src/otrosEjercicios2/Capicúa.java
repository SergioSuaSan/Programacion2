package otrosEjercicios2;

import java.util.Scanner;

public class Capicúa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, unidades, decenas, centenas, umillar, resto, reves ;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea numero del 0 al 9999: ");
		numero = teclado.nextInt();
		teclado.close();
		

		unidades= numero%10;
		resto = numero/10;
		decenas = resto%10;
		resto = resto/10;
		centenas=  resto%10;
		resto = resto/10;
		umillar=resto%10;
	
	
		
		if (numero < 10) {
			System.out.println("Sí es capicúa");
		} else if ( numero < 100) {
			if (unidades == decenas) {
				System.out.println("Sí es capicúa");
			} else {
				System.out.println("No es capicúa");
			}
		} else if ( numero < 1000) {
			if (unidades ==centenas) {
				System.out.println("Sí es capicúa");
			} else {
				System.out.println("No es capicúa");
				}
			}else if (numero < 10000) {
			if (unidades == umillar && decenas == centenas) {
				System.out.println("Sí es capicúa");
			} else {
				System.out.println("No es capicúa");			
		}
			}
		
	
		
	
	}

}
