package stringBuilderEjs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PonerComas {

	public static void main(String[] args) {
		/*
		 * Programa que lea un numero double, lo convierta a una cadena y le añada las
			comas separadoras de los miles.
			Introduciendo: 2388432.34
			Da como salida: “2,388,432.34”
		 */

		Scanner teclado = new Scanner(System.in);
		double numero;
		int posicionpunto;
		
		System.out.println("Teclea un numero");
		numero = teclado.nextDouble();
		teclado.close();
		
		//No se puede convertir directamente de double a StrigBuilder, por lo que primero lo pasamos a texto
		
		String texto = String.valueOf(numero);
		StringBuilder sb = new StringBuilder(texto);
		
		//Opción 2
		StringBuilder ejemplo2= new StringBuilder(String.valueOf(numero));
		
		posicionpunto=sb.indexOf(".");
		for (int i = posicionpunto-3; i >0; i-=3) {
			sb.insert(i, ",");
		}
		
		System.out.println(sb);
		
	}

}
