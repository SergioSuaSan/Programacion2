package intruccionRepeticion;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner teclado = new Scanner (System.in);
		int numero, multiplocinco = 0, multiplotres = 0, nomultiplo= 0;
		
		for (int i= 0; i<5; i++) {
			System.out.println("Teclea numero: ");
			numero = teclado.nextInt();
			
			if (numero%5==0) {
				multiplocinco++;
			} 
			if (numero%3==0) {
				multiplotres++;
			} 
			if (numero%5!=0&&numero%3!=0){
				nomultiplo++;
			} 		
		}
		
		System.out.println(multiplocinco + " multiplos de 5");
		System.out.println(multiplotres +  " multiplos de 3");
		System.out.println(nomultiplo + " multiplos de nada");
		teclado.close();
		
	}

}
