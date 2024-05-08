package claseStrings;

public class PruebaObjetos {

	public static void main(PruebaString[] args) {
		/*
		 * Probar diferencia entre un dato primitivo y un objeto
		 */

		int a = 27;

		String frase = "hola";

		System.out.println(a + frase);

		/*
		 * Para cada tipo de dato primitivo hay uno referenciado
		 * 
		 * int Integer long Long double Double float Float boolean Boolean char
		 * Character short Short byte Byte
		 */

		int x = 5, y = 5;
		System.out.println(x == y);

		Integer b = new Integer(7);
		Integer c = new Integer(7);

		System.out.println(b == c);

		System.out.println(b.intValue() == c.intValue());

		System.out.println("Vamos a las frases");

		String frase1 = "Hola";
		String frase2 = "Hola";
		String frase3 = new String("Hola");
		String frase4 = new String("Hola");
		System.out.println(frase1 == frase2);
		System.out.println(frase3 == frase4);

		StringBuilder frase5 = new StringBuilder("Hola");
		StringBuilder frase6 = new StringBuilder("Hola");

		System.out.println(frase5 == frase6);
	}

}
