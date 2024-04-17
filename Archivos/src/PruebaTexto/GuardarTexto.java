package PruebaTexto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File archivo = new File("texto.txt");
		
		//Stream
		BufferedWriter stream = null;
		
		try {
			stream = new BufferedWriter(new FileWriter(archivo));
			
			stream.write("Hola");
			stream.newLine();
			stream.write("Buenos días");
			stream.newLine();
			stream.write("Adiosito");

			
			
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
		

	}

}
