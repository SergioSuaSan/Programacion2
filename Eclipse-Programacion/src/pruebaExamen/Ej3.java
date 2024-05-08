package pruebaExamen;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		/*
		 * Ante el grave problema de calvicie que asola las cabezas de los hombres
españoles, vamos a averiguar cuando un hombre se quedará calvo dependiendo
del ritmo de pérdida de cabello.
Realiza un programa que pida por teclado la edad del individuo cuando
comenzó a perder pelo, el porcentaje de pelo que pierde cada año, y calcule a
qué edad estará calvo.
Ejemplo de cómo funcionará el programa:
¿A qué edad comenzó la pérdida de cabello?: 20
Porcentaje de pérdida de cabello (%): 15
Te quedarás calvo a los 39 años
La forma de calcular los años es:
- Al principio el hombre tiene el 100% de pelo.
- El primer año pierde el 15%
100 - 100*15/100 = 85

- El segundo año pierde el 15% de lo que quedaba.

85 - 85*15/100 = 73

- El tercer año pierde el 15% de lo que aún quedaba

73 – 73*15/100 = 62

- Y así sucesivamente hasta que el hombre tenga menos del 5% de
cabello, en ese momento se considerará que está calvo.
		 */

		double edadinicial,edadfinal, porcentaje, cabello=100; 
		Scanner teclado = new Scanner (System.in);
		System.out.println("¿A qué edad comenzó su pérdida de cabello?: ");
		edadinicial = teclado.nextInt();
		System.out.println("Porcentaje de pérdida de cabello (%): ");
		porcentaje = teclado.nextInt();
		teclado.close();
		
		edadfinal=edadinicial;
		while (cabello>=5) {
			edadfinal++;
			cabello= cabello- (cabello*porcentaje/100);
		}
		
		System.out.print("Te quedarás calvo a los " + (int)edadfinal + " años");
		

		
		
		
		
	}

}
