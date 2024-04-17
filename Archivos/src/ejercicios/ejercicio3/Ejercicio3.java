package ejercicios.ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Ejercicio3 {

	private static File archivoPeonadas = new File(".\\src\\ejercicios\\ejercicio3\\Peonadas.txt");
	private static File archivoTrabajadores = new File(".\\src\\ejercicios\\ejercicio3\\Trabajadores.txt");
	private static File archivoTotal = new File(".\\src\\ejercicios\\ejercicio3\\Total.txt");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Trabajador> listaTrabajadores = getTrabajador();
		CalcularPeonada(listaTrabajadores);
		crearArchivoTotalPeonada(listaTrabajadores);
		
	}

	public static ArrayList<Trabajador> getTrabajador() {

		ArrayList<Trabajador>lista = new ArrayList<Trabajador>();
	
			
			//Recuperamos el objeto

		BufferedReader stream = null;
		
		try {

			stream = new BufferedReader(new FileReader(archivoTrabajadores));
			
			String linea;
			while ( (linea  = stream.readLine()) != null ) {
				lista.add(new Trabajador(linea, 0));
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
		return lista;
	}
		
		public static ArrayList<Trabajador> CalcularPeonada(ArrayList<Trabajador> listaTrabajadores) {
			
			ArrayList<Trabajador>lista = new ArrayList<Trabajador>();
			
			
			//Recuperamos el objeto
			
			BufferedReader stream = null;
			
			try {
				
				stream = new BufferedReader(new FileReader(archivoPeonadas));
				
				String linea;
				while ( (linea  = stream.readLine()) != null ) {
					for (Trabajador trabjador : listaTrabajadores) {
						if (linea.indexOf(trabjador.getNombre()) != -1) {
							trabjador.setPeonadas(trabjador.getPeonadas()+1);
						}
					}
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
			return lista;
			
		}

	public static void crearArchivoTotalPeonada(ArrayList<Trabajador> listaTrabajadores) {
			
	BufferedWriter stream = null;
		
		try {
			stream = new BufferedWriter(new FileWriter(archivoTotal));
			
			for (Trabajador trabajador : listaTrabajadores) {
				stream.write(trabajador.getNombre() + ": " + trabajador.getPeonadas());
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
