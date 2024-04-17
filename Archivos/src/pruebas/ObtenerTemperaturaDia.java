package pruebas;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ObtenerTemperaturaDia {

	public static void main(String[] args) {
		// Pedir en el teclado quñé día quiere consultar
		int diapedido;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qué día quieres?");
		diapedido = teclado.nextInt();
		
		//Escribimos en el teclado esa temperatura concreta
		
		File archivo = new File ("Temperaturas.dat");
		DataInputStream stream = null ; //Declaramos el stream fuera
		
		try {
			stream = new DataInputStream(new FileInputStream(archivo));
			
			for (int i = 1; i < diapedido; i++) {
				stream.readDouble();
			}
			System.out.println(stream.readDouble());
			
		} catch (EOFException e) {
			//Esta excepción salta cuando se acaba el archivo
			//Muchas veces no habrá que hacer nada aquí
			System.out.println("No hay tantos datos");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Archivo no encontrado"	);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error leyendo temperatura");
		} finally {
			try {
				stream.close();
			} catch (IOException e) {
				System.out.println("Error cerrando el stream");
			}
		}
		

	}

}
