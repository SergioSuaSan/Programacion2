package ejerciciosArrays;

import java.util.Scanner;

public class Ej3Profesor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[][] agenda = { 	{"Ana", "Calle Urano, 18 Toledo"},
											{"Marcos", "Avda.Europa 16 48"},
											{"Sara", "Calle Amanecer 18, Olías"},
											{"Luis", "Gran cia 148 5C, Madrid" }
																											};
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿A quién buscas?");
		String nombreabuscar = teclado.nextLine();
		
		boolean encontrado = false;
//		for (int i = 0; i < agenda.length; i++) {
//			if (nombreabuscar.equals(agenda[i][0])) {
//				System.out.println("Su direccion es: " + agenda[i][1]);
//				encontrado = true;
//			}
//		}
		for (String[] fila : agenda) {
			if (nombreabuscar.equalsIgnoreCase(fila[0])) {
				System.out.println("Su direccióon es: "+ fila[1]);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("No está en la Base de datos");
		}
		
		
	}

}
