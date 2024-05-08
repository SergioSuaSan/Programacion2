package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Ejercicio1 {
	static File archivo = new File(".\\src\\ejercicio1\\llamadas.txt");


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Recuperamos el texto
		String lista =recuperarTexto();
	
		//Escribimos el texto
		guardarTexto(lista);
	
	
	}

	



	public static String recuperarTexto() {

	
	//Stream
	BufferedReader stream = null;
	
	try {

		stream = new BufferedReader(new FileReader(archivo));
		
		String linea;
		linea  = stream.readLine();
		linea  += "-" +stream.readLine();
		
	
		
		
		return linea;
		
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
	return null;
	}

	public static void guardarTexto(String texto) {
		// TODO Auto-generated method stub
		File archivo = new File(".\\src\\ejercicio1\\llamadasArregladas.txt");
		
		//Stream
		BufferedWriter stream = null;
		
		try {
			stream = new BufferedWriter(new FileWriter(archivo));
			
			for (int i = 1; i <=8; i++) {
				StringTokenizer st = new StringTokenizer(texto, "-");
		
				int contador = 0;
				String numerosDestino = "";
				while (st.hasMoreTokens()) {
					String linea = st.nextToken();
					int numero1 = Integer.parseInt(linea.substring(0,1));
					int numero2 = Integer.parseInt(linea.substring(2,3));
					if (numero1 ==i) {
						contador++;
						numerosDestino+= " " + numero2;
					}
				}
				stream.write(i + ":" + contador + ":" + numerosDestino);
				stream.newLine();
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
		

	}
	
	
	
	
}
