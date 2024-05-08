package claseStrings;

//Importado automáticamente
import java.util.StringTokenizer;

public class PruebaTokenizer {

	public static void main(String[] args) {
			
		//troceamos una palabra
		String frase = "Hola holita vecinito.Buenos días, por la:mañana mañanita ";
		
		//Creamos un Objeto StringTokenizer
		StringTokenizer st = new StringTokenizer(frase, ". , : ;");
		//Le preguntamos cuantos trozos tiene la frase
		System.out.println("La frase tiene " + st.countTokens() + " palabras.");
		
		System.out.println();
		
		//Pedir la primera palabra
		System.out.println("La 1 palabra es: " + st.nextToken());
		//Pedir la siguiente palabra
		System.out.println("La siguiente palabra es: " + st.nextToken());
		//Pedir la siguiente palabra
		System.out.println("La siguiente palabra es: " + st.nextToken());
		//Pedir la siguiente palabra

		System.out.println();
		
		//Le preguntamos cuantos trozos tiene la frase
		System.out.println("La frase tiene " + st.countTokens() + " palabras.");
		//Pedir el siguiente token resta los tokens totales
		
		System.out.println();
		
		while (st.hasMoreTokens()) {
			System.out.println("La siguiente palabra es: " + st.nextToken());
		}
	}

}
