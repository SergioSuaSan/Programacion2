package pruebaArray;

public class Temperaturas {

	public static void main(String[] args) {
		// Crear un Array con las temperaturas de la semana
		
		double[] temperaturas = {14,12,13.4,16,11,14.6,15};
		
		
		
		
		//Calcular la temperatura media de la semana
		
		double acumulador = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			acumulador += temperaturas[i];
		}
		
		System.out.println(acumulador/temperaturas.length);
		double maximo = temperaturas[0];
		//Averiguar la temperatura máxima
		for (int i = 1; i < temperaturas.length; i++) {
			if (temperaturas[i]> maximo) {
				maximo = temperaturas[i];
			}
		}
		
		System.out.println(maximo);
		
		//Averigua qué dia fue la temperatura mínima
		int minimo = 0;
		int posicion = 0;
		for (int i = 1; i < temperaturas.length; i++) {
			if (temperaturas[i]< temperaturas[minimo]) {
				minimo = i;
			}
		}
			
		String[] dias = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};

		System.out.println("El día más frío fue el " + dias[minimo] + " con " + temperaturas[minimo] +"º");

	}

}
