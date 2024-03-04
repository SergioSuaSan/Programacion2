package pruebas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PruebaExcepcionesChecked2 {

	public static void main(String[] args) {
		// Vamos a hacer excepciones CHECKED
		//Estamos obligados a tratarla sio si
		
		//Usams el teclado como antiguamente, sin la clase Scanner
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Teclea un número");
		int a = 0;
		
		try {
			a = Integer.parseInt(teclado.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		try {
//			a = Integer.parseInt(teclado.readLine());
//		} catch (NumberFormatException e) {
//			System.out.println("El formato no es correcto");
//		} catch (IOException e) {
//			System.out.println("Error en el teclado");
//		}
//		
		System.out.println("El valor tecleado es: " + a);

	}

}
