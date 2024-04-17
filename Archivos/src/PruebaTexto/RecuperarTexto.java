package PruebaTexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RecuperarTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File archivo = new File("texto.txt");
		
		//Stream
		BufferedReader stream = null;
		
		try {

			stream = new BufferedReader(new FileReader(archivo));
			
			String linea;
			while ( (linea  = stream.readLine()) != null ) {
				System.out.println(linea);
			}
			
//			String linea = stream.readLine();
//			while (linea != null) {
//				System.out.println(linea);				
//				linea = stream.readLine();
//			}
			
			
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
