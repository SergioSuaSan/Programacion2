package otrosEjercicios2;

import java.util.Scanner;

public class ONCE {

	public static void main(String[] args) {
		
		
		int tunumero, loteria, unitunu, unilote, primetunu, primelote;
		loteria = (int) (Math.random()*100000);

		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea el número de la lotería: ");
		tunumero = teclado.nextInt();
		teclado.close();
		
		unitunu= tunumero%10;
		unilote = loteria%10;
		primetunu = tunumero/10000;
		primelote = loteria/10000;
		
	System.out.println(loteria);
		if (unitunu==unilote||primetunu==primelote) {
			System.out.println("Recibes el reintregro");
		} else {
			System.out.println("No ganaste nada");

		}
		
		

	}

}
