package ejerciciosTema1;

import java.util.Scanner;

public class HorasConciertos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int segundos, minutos, horas;
		
		Scanner teclado = new Scanner ( System.in);
		
		System.out.print("Teclee los segundos: ");
		
		segundos= teclado.nextInt();
		
		minutos = segundos/60;
		segundos = segundos%60;
		horas = minutos/60;
		minutos = minutos%60;
		
		//Estoy seguro de que se puede hacer más eficientemente con la mitad de operaciones
		
		
		System.out.println("Equivalen a: " + horas + ":" + minutos + ":" + segundos);
		System.out.printf("Equivale a:  %d:%02d:%02d", horas, minutos, segundos); 
		/*FORMULA PARA ELEGIR EL FORMATO
		 * %d indica números decimales, 
		 * 2 indica el número de espacios que tiene que tener el número
		 * 0 indica que si uno de los espacios no tiene número lo rellene con un 0
		 * por tanto 1:4:6 quedaría 1:04:06
		 */
		
		//No sé cómo mantener 2 dígitos en cada variable
				
		
		teclado.close();
		

	}

}
