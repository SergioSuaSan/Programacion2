package pruebas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PruebaExcepcionesChecked {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Vamos a hacer excepciones CHECKED
		//Estamos obligados a tratarla sio si
		
		//Usams el teclado como antiguamente, sin la clase Scanner
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Teclea un número");
		int a = Integer.parseInt(teclado.readLine());
		
		System.out.println("El valor tecleado es: " + a);

	}

}
