package pruebas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PruebaExcepcionesChecked {

	public static void main(String[] args) {
		// Vamos a hacer excepciones CHECKED
		//Estamos obligados a tratarla sio si
		
		int numero = 0;
		try {
			numero = leerDatoEntero();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println("El valor tecleado es: " + numero);		

	}
	
	
	//La idea es que los métodos no se encarguen de sus excepciones
	//Y lo haga solo un método de manera centralizada
	public static int leerDatoEntero() throws NumberFormatException, IOException  {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Teclea un número");
		int a = 0;
		

		a = Integer.parseInt(teclado.readLine());

		return a;		
	}

	
	
	//método para leer un dato entero del teclado
	//Esto es una MIERDA. La idea es centralizar el tratamiento de las excepciones
	
//		public static int leerDatoEntero()  {
//		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
//		
//		System.out.println("Teclea un número");
//		int a = 0;
//		
//		try {
//			a = Integer.parseInt(teclado.readLine());
//		} catch (NumberFormatException e) {
//			System.out.println("El formato no es correcto");
//		} catch (IOException e) {
//			System.out.println("Error en el teclado");
//		}
//		return a;		
//	}

}
