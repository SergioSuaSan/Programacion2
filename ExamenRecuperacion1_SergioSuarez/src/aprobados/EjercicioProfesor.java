package aprobados;

import java.util.Scanner;

public class EjercicioProfesor {



	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int tamaño;

		System.out.print("¿De qué tamaño quieres la X?: ");
		tamaño=teclado.nextInt();

		System.out.println( dibujarX(tamaño) );
	}

	public static String dibujarX(int tamaño) {

		String resultado = "";
		
		for (int i = 1; i <=tamaño; i++) {

			for (int j = 1; j <=tamaño; j++) {
				if(i==j || i+j-1==tamaño) {
					resultado = resultado.concat("x");
				}else {
					resultado = resultado.concat(" ");
				}
			}
			resultado = resultado.concat("\n");
		}
		
		return resultado;
	}
	
	
}

