package ejercicios2;

public class RomboDeAsteriscos {

	public static void main(String[] args) {
		/*
		 * Programa que visualice en la pantalla la siguiente figura:

		 				
		 						*
		 					* * *
		 					* * * * *
* * * * * * *
* * * * *
* * *
*
		 				
		 				
		 */
	
		
		for (int i = 1; i < 8; i+=2) {
			//Imprimo espacios
			for (int j = 0; j < (7-i)/2; j++) {
				System.out.print("  ");
			}
			//Imprimo asteriscos
			for (int j = 0; j < i; j++) {			
				System.out.print("* ");
				
			}
			//Cambio de linea
			System.out.println("");		
		}
		
		
		
		for (int i = 5; i >0; i-=2) {
			//Imprimo los espacios
			for (int j = 0; j < (7-i)/2; j++) {
				System.out.print("  ");
			}
			//Imprimo asteriscos
			for (int j = 0; j < i; j++) {
				System.out.print("* ");			
			}
			//Cambio de linea
			System.out.println("");		
		}

		
		
		
		
		
		
	}

}
