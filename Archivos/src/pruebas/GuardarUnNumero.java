package pruebas;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GuardarUnNumero {

	public static void main(String[] args) {
		//Guardamos un numero entero en un archivo
		
		int valor = 123456;
		
		//Tengo que crear el objeto File
		File archivo = new File("numero.dat");
		
		//Ahora necesitamos un Strea,
		try {
			FileOutputStream stream = new FileOutputStream(archivo);
			//Mejoramos el Stream par que me permita enviar los datos mejor
			DataOutputStream streamMejorado = new DataOutputStream(stream);
			//Enviar el dato hacia el archivo
			streamMejorado.writeInt(valor);
			//Cerrar Stream
			streamMejorado.close();
			//Datos guardados correctamente.
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no existe");
		} catch (IOException e) {
			System.out.println("Error escribiendo en el archivo");
		}
		
		
	}

}
