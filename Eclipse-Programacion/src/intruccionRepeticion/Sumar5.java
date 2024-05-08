package intruccionRepeticion;

import java.util.Scanner;

public class Sumar5 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner (System.in);
		int numero, suma = 0; //a la variable que suma le llamamos "acumulador"
		
		for (int i= 0; i<5; i++) {
			System.out.println("Teclea numero: ");
			numero = teclado.nextInt();
			suma= suma + numero; //suma+=numero;
		}
		teclado.close();
		

		System.out.println("Los numeros sumados son:" + suma);
		
		
		
		
		
		
		

	}

}
