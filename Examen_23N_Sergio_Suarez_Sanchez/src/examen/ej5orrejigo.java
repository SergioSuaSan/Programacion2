package examen;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ej5orrejigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner (System.in);
		String frase,resultado = "", vocales = "aeiou";
		
		System.out.print("Teclea una frase: ");
		frase=teclado.nextLine();
		teclado.close();

		StringTokenizer listaPalabras=new StringTokenizer(frase);
		
		while(listaPalabras.hasMoreTokens()){
			String palabra = listaPalabras.nextToken();
			String palabraEnMinusculas = palabra.toLowerCase(); //pongo la palabra en minusculas antes de buscar las vocales
			int vocalesDiferentes=0;
			for (int i = 0; i < vocales.length(); i++) {//miro todas las vocales
				//si la palabra contiene la vocal, una mas
				if(palabraEnMinusculas.indexOf(vocales.charAt(i)) != -1) vocalesDiferentes++;
			}
			
			if(vocalesDiferentes >= 3){ //si hay tres o más vocales diferentes, añado la palabra al resultado
				resultado += palabra + " ";
			}
		}
		
		System.out.println("Resultado: " + resultado);
		
	}

}
