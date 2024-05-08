package pruebaArray;

public class ArraysSimultaneos {

	public static void main(String[] args) {
		// Trabajos con arrays simultaneos
		
		int[] notas = {8, 6, 10, 3, 5, 7};
		String[] modulos = {"LM", "Inglés", "Prog", "BBDD", "FOL", "SISI"};
		
		//Listado de módulos aprobados
		/*Modulos aprobados
			LM
			Ingles
			Prog
			Fol
			SIsi
		*/
		System.out.println("Módulos aprobados:");
		
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >=5) {
				System.out.println("\t" +modulos[i]);
			}
		}
		
		System.out.println();
		System.out.println("Módulos favoritos:");
		//Módulo favorito
		int posicionnotamayor = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >=notas[posicionnotamayor]) {
			posicionnotamayor = i;
			}
		}
		System.out.println("\t" + modulos[posicionnotamayor]);
		
		System.out.println();
		
		//Media de notas
		int acumulador = 0;
		for (int i = 0; i < notas.length; i++) {
			acumulador += notas[i];
		}
		double media = (double)acumulador/notas.length;
		System.out.println("Media: " + media);
		System.out.println("Módulos por encima de la media");
		for (int i = 0; i < notas.length; i++) {
			if (notas[i]> media) {
				System.out.println("\t" + modulos[i]);
			}
		}
		
		
		
		
		
	}

}
