package pruebaArray;

public class Notas2DimensionesConNombres {

	public static void main(String[] args) {
	
		int suma = 0;
		double media = 0;
		
		int [][] notas = {   	{8, 5, 3, 7, 9, 5, 10},
										{8, 7, 4, 5, 3, 8, 1},
										{8, 2, 6, 8, 9, 4, 7}     };
		
		String[] modulos = {"LM", "Inglés", "Prog", "BBDD", "FOL", "SISI", "ENDE"};
		String[] evaluaciones = {"1ªEv", "2ªEv", "3ªEv"};
		
		//Listado de módulos aprobados en cáda evaluacion
		System.out.println("Módulos aprobados en cada evaluación");
		for (int i = 0; i < notas.length; i++) {
			String total = "";
			for (int j = 0; j < notas[i].length; j++) {
				if (notas[i][j] >= 5) {
					total += modulos[j]+ " ";
				}
			}
			System.out.println(evaluaciones[i] + ": " + total);
			
		}
		
		System.out.println();
		
		//Media de cada módulo
		System.out.println("Media de cada módulo");
		for (int j = 0; j < notas[0].length; j++) {
			suma = 0;
			media = 0;
			for (int i = 0; i < notas.length; i++) {
				suma += notas[i][j];
			}
			media = (double) suma/notas.length;
			System.out.println(modulos[j] + ": " + String.format("%.1f", media));
		}
		System.out.println();
		
		//módulo con mejor media
		System.out.println("Módulo con mejor media");
		double acumulador = 0;
		String diferenciador = modulos[0];
		
		for (int j = 0; j < notas[0].length; j++) {
			suma = 0;
			media = 0;
			for (int i = 0; i < notas.length; i++) {
				suma += notas[i][j];
			}
			media = (double) suma/notas.length;
			if (media> acumulador) {
				diferenciador = modulos[j];
				acumulador = media;
			}
		}
		System.out.println("El módulo con mejor nota es: " + diferenciador + " con " + acumulador);
		System.out.println();
		
		//Resultado final (Si hay alguna evaluación suspensa , queda pendiente)
		System.out.println("Resultado de la evaluación:");
		for (int j = 0; j < notas[0].length; j++) {
			suma = 0;
			media = 0;
			for (int i = 0; i < notas.length; i++) {
				suma += notas[i][j];
			}
			media = (double) suma/notas.length;
			if (media>= 5) {
			System.out.println(modulos[j] + ": " + "Aprobado");
			} else {
				System.out.println(modulos[j] + ": " + "Pendiente");
			}
		}
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		
		
		
 
	}

}
