package ejerciciosHuelga;

import java.util.Scanner;

public class CuadradoAsteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int numero;
		Scanner teclado = new Scanner (System.in);		
		System.out.print("Teclea un dia: ");
		numero = teclado.nextInt();
		

//		for (int i = 1; i <= numero; i++) {			
//			for (int j = 1; j <= numero; j++) {
//				if (i==1||i==numero) {
//					System.out.print("* ");
//				}else if (j==1||j==numero) {
//					System.out.print("* "); 					
//				} else {
//					System.out.print("  ");
//				}
//				
//			} System.out.println();			
//		}
		for (int i = 1; i <= numero; i++) {			
			for (int j = 1; j <= numero; j++) {
				if (i==1||i==numero||j==1||j==numero) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				
			} System.out.println();			
		}
		
		
		
		
		
	}

}
