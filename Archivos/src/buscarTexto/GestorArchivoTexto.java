package buscarTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestorArchivoTexto {
	//Esta clase se encargará de toda la gestión del arvchivo de texto
	//Debe saber guardar, recuperar texto  plano
	
	private File archivo; //Atributo para guardar el archivo que debo gestionar

	public GestorArchivoTexto(File archivo) {
		super();
		this.archivo = archivo;
	}

	public File getArchivo() {
		return archivo;
	}

	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}
	
	//Método para recuperar el texto del archivo
	public ArrayList<String> getTexto() {
		ArrayList<String> listaDeLineas = new ArrayList<String>();
		//Stream
		BufferedReader stream = null;
		
		try {

			stream = new BufferedReader(new FileReader(archivo));
			
			String linea;
			while ( (linea  = stream.readLine()) != null ) {
				listaDeLineas.add(linea);
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
		return listaDeLineas;
	}
	//Método para guardar el texto en el archivo
	public void setTexto( String texto) {
		//Stream
		BufferedWriter stream = null;
		
		try {
			stream = new BufferedWriter(new FileWriter(archivo));	
			stream.write(texto); //Escribe el texto de una sola vez

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
