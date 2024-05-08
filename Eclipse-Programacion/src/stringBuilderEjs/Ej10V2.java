package stringBuilderEjs;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Ej10V2 {

	public static void main(String[] args) {
		/*
		 * 10. Programa que simule el juego del ahorcado. Elegimos una palabra y vamos
					pidiendo letras al usuario. Cada vez mostramos la palabra solo con las letras
					acertadas. Si no acierta todas las letras en 8 intentos, se da el juego por
					perdido.
		 */
		

		Scanner teclado = new Scanner(System.in);
		String palabra,letra;
		int contador = 0, position = 0, position2 = 0; 
		
		
		//Pedir palabra secreta
		JPasswordField jpf = new JPasswordField();
		JOptionPane.showConfirmDialog(null, jpf, "Palabra secreta", JOptionPane.CLOSED_OPTION);
		palabra = String.valueOf(jpf.getPassword());
		
		//Variable para poner los guiones
		StringBuilder adivinado = new StringBuilder();
		
		//relleno la variable adivinado con los guiones
		
		for (int i = 0; i < palabra.length(); i++) {
			adivinado.append("_ ");
		}
		
		//Mientras tenga vidas y no haya hacertado la palabra completa
			//Muestro los guiones
			//Busco pido una letra
			//Busco la letra en la palabra
			//Si la encuentra
				//Cambio los guiones por la letra
			//Si no
				// Un fallo más
		
		
		
	
		
		while (contador <8&&palabra.equals(adivinado.toString())) {
			System.out.println(adivinado);
			System.out.println("Teclea una letra");
			letra = teclado.nextLine();
			if (palabra.indexOf(letra)==-1) {
				contador ++;
				System.out.println("Fallos. " + contador);
			} else {
				position = palabra.indexOf(letra);
				System.out.println(position);
				
			}
			
		}
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
