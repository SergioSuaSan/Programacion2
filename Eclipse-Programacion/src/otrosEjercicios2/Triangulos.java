package otrosEjercicios2;

import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A, B, C;

		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea la hipotenusa: ");
		A = teclado.nextInt();
		System.out.println("Teclea el primer cateto: ");
		B = teclado.nextInt();
		System.out.println("Teclea el segundo cateto: ");
		C = teclado.nextInt();
		teclado.close();
		
		if (A>= B+C) {
			System.out.println("No es un triángulo");
		} else if (A*A==B*B+C*C) {
			System.out.println("Es un triángulo rectángulo");
		} else if (A*A>B*B+C*C) {
			System.out.println("Es un triángulo obstusángulo");
		} else if (A*A<B*B+C*C) {
			System.out.println("Es un triángulo acutángulo");
		}
		
		
		
		
		
		
	}

}
