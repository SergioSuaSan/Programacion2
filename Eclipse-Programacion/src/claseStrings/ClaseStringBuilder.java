package claseStrings;

public class ClaseStringBuilder {

	
	
	public static void main(String[] args) {
		//  Probando la clase stringbuilder
		String s = "hola qué tal";
		
		//Lo mismo pero con Stringbuilder
		StringBuilder sb1 = new StringBuilder(); //Vacío
		StringBuilder sb2 = new StringBuilder("Hola"); //Con un texto dentro
		StringBuilder sb3 = new StringBuilder(500); //Con una capacidad
		StringBuilder sb4 = new StringBuilder(s); //Contiene un String dentro
		
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());
		System.out.println(sb4.capacity());
		
		
		//Diferencias entre trabajo con String y StringBuilder
		//Para unir dos frases
		String s1 = "Hola,";
		String s2 = " ¿qué tal?";
		s1=s1.concat(s2); //Uno las dos frases, pero tengo que decir dónde se guarda
		System.out.println(s1);
		
		sb1= new StringBuilder("(sb) <<<<Hola,");
		sb2= new StringBuilder(" ¿qué tal?>>>> (sb)");
		sb1.append(sb2); //ahora no hay que poner dónde queda, porque se usa el objeto
		System.out.println(sb1);
		
		
		//Comparar una frase con otra
		s1 = "Hola,";
		s2 = "Hola,";
		System.out.println(s1.compareTo(s2));
		if (s1.equals(s2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintos");
		}
		
		sb1= new StringBuilder("Hola,");
		sb2= new StringBuilder("Hola,");
		
		if ( sb1.toString().equals ( sb2.toString() ) ) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintos");
		}
		
		
		//Convertir una variable en otra :3
		
		//De String a StringBuilder ^^
		sb1= new StringBuilder(s1);
		
		//De SB a String >:3
		s1=sb1.toString();
		
	}
}
