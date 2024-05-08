package doWhile;

import java.util.Scanner;

public class EjExamen2 {

	public static void main(String[] args) {
		

		int numero, suma = 0, resto;

		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea un numero: ");
		numero = teclado.nextInt();
		teclado.close();
		
//		int divisor = numero-1;
//		
//		for (int i = divisor; i >0; i--) {
//			resto = numero%divisor;
//			if (resto == 0) {
//				suma += divisor;
//			}
//			divisor --;
//		}
//		
		
		// se puede realizar sin el int divisor, usando la propia i
		
		for (int i = numero-1; i >0; i--) {
			resto = numero%i;
			if (resto == 0) {
				suma += i;
			}
		}
			
		if (suma == numero) {
			System.out.println("el numero es perfecto");
			
		} else {
			System.out.println("el numero no es perfecto");
		}
		
		
	}

}