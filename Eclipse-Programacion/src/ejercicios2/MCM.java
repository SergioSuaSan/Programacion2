package ejercicios2;

import java.util.Scanner;

public class MCM {

	public static void main(String[] args) {
		/*
		 * Programa que obtenga el minimo comun multiplo(mcm) de dos numeros.
			Ejemplo: descomponemos los numeros en sus factores 10 (2 * 5) y 18 (2 * 9)
			entonces el mcm es (2 * 5 * 9).
			Introduciendo: 10 18
			Da como salida: 90
		 */

		int numero1, numero2, copia1, copia2, acumulador1 =1, factor = 2;
		Scanner teclado = new Scanner (System.in);		
		System.out.print("Teclea un numero: ");
		numero1 = teclado.nextInt();
		System.out.print("Teclea otro numero: ");
		numero2 = teclado.nextInt();
		teclado.close();
		copia1 = numero1;
		copia2 = numero2;
		
		//El bucle ocurrirá mientras que  cualquiera de las copias de los numeros dados sean distintas de uno
		// (Si se coloca && en el momento en el que una de las dos llegue a 1, el bucle se acaba, de esta forma deben llegar las 2)
		while (copia1!=1||copia2!=1) {
			//Si el factor puede dividir a cualquiera de las dos copias, se multiplicará por el acumulador (el mcm)
			if (copia1%factor == 0|| copia2%factor ==0) {
				System.out.println(factor);
				acumulador1 *= factor;
				//se dividirá la copia que quede con resto 0 entre el factor, para buscar un nuevo número que la divida
				if (copia1%factor == 0) {
					copia1/=factor;
				}
				if (copia2%factor == 0) {
					copia2/=factor;
				}
			} else {
				factor ++;
			}
		}
		
		System.out.println("El mcm es " +acumulador1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		while (copia1!=1) {
//			for (int i = 2; i <= copia1; i++) {
//				if (copia1%i==0) {
//					System.out.print(i + " ");
//					copia1 = copia1/i;
//					if (acumulador1%i!=0) {
//						acumulador1*=i;						
//					}
//					break;
//				}			
//			}
//			
//		}
//		System.out.println(acumulador1);
//		
//		while (copia2!=1) {
//			for (int i = 2; i <= copia2; i++) {
//				if (copia2%i==0) {
//					System.out.print(i + " ");
//					copia2 = copia2/i;
//					if (acumulador1%i!=0) {
//						acumulador1*=i;						
//					}
//					break;
//				}			
//			}
//		}
//		System.out.println(acumulador1);
//		
	
		
		
		
	}

}
