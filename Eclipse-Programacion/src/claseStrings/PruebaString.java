package claseStrings;

public class PruebaString {

	public static void main(java.lang.String[] args) {
		/*
		 * Pruebas de String
		 * 
		 */
		
		String s =new String ("Hola, qué tal");
		
		//Mostrar la longitud de una frase
		System.out.println("Longitud: " + s.length());
		
		//Letra por posicion
		System.out.println("La letra nº 7 es: " + s.charAt(7-1));
		
		//Sacar la última letra
		System.out.println("La última letra es: " + (s.charAt(s.length()-1)));
		
		//Comparar 2 cadenas
		String t = new String ("Hola, qué tal");
		System.out.println(s==t);
		System.out.println(s.equals(t));
		System.out.println(s.equalsIgnoreCase(t));
		
		//Diferencia entre 2 Strings
		System.out.println(s.compareTo(t));

		//Comprobar el inicio y el final de una frase
		System.out.println("¿La frase comienza en: Hola? " + s.startsWith("Hola"));
		System.out.println("¿La frase acaba en: tal? " + s.endsWith("tal"));
		
		//Trozos de frase
		System.out.println("El trozo de la letra 3 a la letra 10 es: " + "<<" + s.substring(3, 11) + ">>");
		System.out.println("El trozo de la letra 3 al final es:: " + "<<" + s.substring(3) + ">>");
		
		//Buscar dentro de la frase
		System.out.println("La letra <<q>> está en la posición: " + s.indexOf('q'));
		//-1 es que no lo encuentra
		System.out.println("La letra <<Q>> está en la posición: " + s.indexOf('Q'));
		System.out.println("La palabra <<qué>> está en la posición: " + s.indexOf("qué"));
		System.out.println("La última <<a>> está en la posición: " + s.lastIndexOf('a'));

	}

}
