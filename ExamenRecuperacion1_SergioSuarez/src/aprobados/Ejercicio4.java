package aprobados;



public class Ejercicio4 {

	public static void main(String[] args) {
		
	//	Esto es lo que tienes que poner para que salga el método
		dibujarX(11);

	}

	
	
	
	
	public static void dibujarX(int num) {
		
		int division = num/2, espacioInicial = 0, espacioMedio = num;
		
		//Parte1
		for (int i = 1; i <=division; i++) {
			for (int j = 0; j < i-1; j++) {
				System.out.print(" ");
			}
			System.out.print("x");
			for (int j = 0; j <num-2*i; j++) {
				System.out.print(" ");
			}	
			System.out.print("x");
			System.out.println();
		}
		
		//Parte central
		
		for (int i = 1; i <=division; i++) {
			System.out.print(" ");
		}
		System.out.print("x");
		System.out.println();
		
		//Parte3
		for (int i = 1; i <=division; i++) {
			for (int j = 0; j < num-(i+ division+1); j++) {
				System.out.print(" ");
			}
			System.out.print("x");
			for (int j = 0; j <2*i-1; j++) {
				System.out.print(" ");
			}	
			System.out.print("x");
			System.out.println();
		}
	
		
	}

}
