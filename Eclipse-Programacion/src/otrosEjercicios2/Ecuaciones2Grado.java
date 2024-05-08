package otrosEjercicios2;

import java.util.Scanner;

public class Ecuaciones2Grado {

	public static void main(String[] args) {
		
		double a, b, c, discriminante;
		

		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea a: ");
		a = teclado.nextInt();
		System.out.println("Teclea b: ");
		b = teclado.nextInt();
		System.out.println("Teclea c: ");
		c = teclado.nextInt();
		teclado.close();
		
	
		discriminante= Math.pow(b, 2) - 4*a*c;
		
		if (discriminante== 0) {
			System.out.println("X=" +  (-b)/2*a);
		} else if (discriminante < 0) {
			System.out.println("No existe numero real");
		} else {
			System.out.println("Existen 2 soluciones: X=" + ((-b) + Math.sqrt(discriminante) )/2*a + " y X=" + ((-b) - Math.sqrt(discriminante))/2*a);
		}

		
		
		
		

	}

}
