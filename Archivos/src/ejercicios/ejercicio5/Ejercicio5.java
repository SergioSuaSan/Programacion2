package ejercicios.ejercicio5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ejercicio5 {

	
	private static File achivoJugadores = new File(".\\src\\ejercicios\\ejercicio5\\jugadores.txt");
	private static File achivoSelecciones = new File(".\\src\\ejercicios\\ejercicio5\\selecciones.txt");
	private static File achivoDemarcaciones = new File(".\\src\\ejercicios\\ejercicio5\\demarcaciones.txt");
	private static File achivoCombinacion = new File(".\\src\\ejercicios\\ejercicio5\\Combinacion.txt");
	
	public static void main(String[] args) {
		// Obtengo las selecciones y genero los objetos
		ArrayList<Seleccion> listaSelecciones = getSelecciones();
		// Obtengo las demarcaciones y genero los objetos
		ArrayList<Demarcacion> listaDemarcaciones = getDemarcaciones();
		// Obtengo los jugadores
		ArrayList<Jugador> listaJugadores = getJugadores(listaDemarcaciones, listaSelecciones);
		//generar el archivo combinado
		generarArchivoCombinacion(listaJugadores, listaDemarcaciones, listaSelecciones);
		
	}

	private static ArrayList<Jugador> getJugadores(ArrayList<Demarcacion> listaDemarcaciones,
			ArrayList<Seleccion> listaSelecciones) {
		// TODO Auto-generated method stub
		ArrayList<Jugador> lista = new ArrayList<Jugador>();
	
		
		
		
		
		
		
		//Stream
		
		
		BufferedReader stream = null;
		
		try {

			stream = new BufferedReader(new FileReader(achivoJugadores));
			
			String linea;
			while ( (linea  = stream.readLine()) != null ) {
				StringTokenizer st = new StringTokenizer(linea, ":");
				String nombre = st.nextToken();
				String codigoDemarcacion = st.nextToken();
				String codigoSeleccion = st.nextToken();
				lista.add(new Jugador(nombre, codigoSeleccion, codigoDemarcacion));
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
		return null;
	}

	private static ArrayList<Demarcacion> getDemarcaciones() {
		// TODO Auto-generated method stub
		
		//Stream
		BufferedReader stream = null;
		
		try {
			ArrayList<Demarcacion> lista = new ArrayList<Demarcacion>();
			stream = new BufferedReader(new FileReader(achivoDemarcaciones));
			
			String linea;
			while ( (linea  = stream.readLine()) != null ) {
				
				lista.add(new Demarcacion( linea.substring(3),  linea.substring(0, 2)));
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
		return null;
	}

	private static ArrayList<Seleccion> getSelecciones() {
		// TODO Auto-generated method stub
		
		//Stream
		BufferedReader stream = null;
		
		try {

			ArrayList<Seleccion> lista = new ArrayList<Seleccion>();
			stream = new BufferedReader(new FileReader(achivoSelecciones));
			
			String linea;
			while ( (linea  = stream.readLine()) != null ) {
				lista.add(new Seleccion( linea.substring(3),  linea.substring(0, 2)));
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
		return null;
	}

	private static void generarArchivoCombinacion(ArrayList<Jugador> listaJugadores,
			ArrayList<Demarcacion> listaDemarcaciones, ArrayList<Seleccion> listaSelecciones) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
