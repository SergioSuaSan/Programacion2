package pruebas;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RecuperarTemperaturas {

	public static void main(String[] args) {
		// Imprimimos en pantalla las temperaturas del mes
		
		File archivo = new File ("Temperaturas.dat");
		DataInputStream stream = null ; //Declaramos el stream fuera
		int dias= 1;
		try {
			stream = new DataInputStream(new FileInputStream(archivo));
			
			while(true) {
				System.out.println( dias + " " +stream.readDouble());
				dias ++;
			}
			
		} catch (EOFException e) {
			//Esta excepción salta cuando se acaba el archivo
			//Muchas veces no habrá que hacer nada aquí
			System.out.println("Ya hemos terminado");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Archivo no encontrado"	);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error guardando temperatura");
		} finally {
			try {
				stream.close();
			} catch (IOException e) {
				System.out.println("Error cerrando el stream");
			}
		}
		

	}

}
