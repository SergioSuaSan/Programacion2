package ejercicios.ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Crear una clase Cuenta con un método llamado “cuentaPalabras()” que cuente las
palabras existentes en un archivo de texto pasado como parámetro.
El método recibirá como parámetro un objeto File y retornará la cantidad de palabras que
componen el texto.
El proceso será ir leyendo líneas del archivo y contar cuantas palabras hay en cada una.
Recordad que esto lo hicimos con un StringTokenizer.
*/
		
		
		System.out.println( "El archivo tiene " + cuentaPalabras("quijote.txt") + " palabras");
		
	}
	
	public static int cuentaPalabras(String string) {
		File archivo = new File(".\\src\\ejercicios\\ejercicio1\\quijote.txt");
		//Stream
		BufferedReader stream = null;
		int contadorPalabras = 0;
		try {

			stream = new BufferedReader(new FileReader(archivo));
			
			String linea;
			while ( (linea  = stream.readLine()) != null ) {
//				System.out.println(linea);
//				StringTokenizer st = new StringTokenizer(linea);
//				contadorPalabras += st.countTokens();
				contadorPalabras += new  StringTokenizer(linea).countTokens();
			}	
			
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error escribiendo el archivo");
		} finally {
			try {
				if (stream != null) {
					stream.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return contadorPalabras;
	}

}
