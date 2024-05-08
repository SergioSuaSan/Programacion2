package doWhile;

import java.util.Scanner;

public class Cincoceros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner teclado = new Scanner (System.in);
		int numero, suma = 0, contadordeceros =0; //a la variable que suma le llamamos "acumulador"
		
		do {
			System.out.println("Teclea numero: ");
			numero = teclado.nextInt();
			suma+= numero;
			if (numero==0) {
				contadordeceros++;
			}
		} while (contadordeceros!=5);
		teclado.close();
		System.out.println("Hasta escribir 5 ceros, los numeros que has escrito suman: " + suma);
		
		
		

	}

}
