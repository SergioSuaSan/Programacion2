package pruebas;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TemperaturaMedia {

	public static void main(String[] args) {
		// Programa que calcula la media de temperatura del archivo
		File archivo = new File ("Temperaturas.dat");
		DataInputStream stream = null ; //Declaramos el stream fuera
		double acumulador = 0;
		double cuenta = 0;
		try {
			stream = new DataInputStream(new FileInputStream(archivo));
			
			while(true) {
				acumulador += stream.readDouble();
				cuenta ++;
			}
			
		} catch (EOFException e) {
			//Esta excepción salta cuando se acaba el archivo
			//Muchas veces no habrá que hacer nada aquí
			System.out.println("Media de temperatura: " +acumulador/cuenta);
			System.out.println("Ya hemos terminado");
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
