package ejercicios.examen1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class EjercicioExamen1 {
	
	private static File archivoCombinaciones = new File(".\\src\\ejercicios\\examen1\\combinaciones.txt");
	private static File archivoCombiGanadora = new File(".\\src\\ejercicios\\examen1\\combiGanadora.txt");
	private static File archivoPremios = new File(".\\src\\ejercicios\\examen1\\premios.txt");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Obtengo los objetos combinacion
		ArrayList<Combinacion> listaCombinaciones = getCombinaciones();
		
		//Obtener la combinacion ganadora
		Combinacion combinacionGanadora = getCombiGanadora();
		
		//gENERAR EL ARCHIVO DE PREMIOS
		generarArchivoPremios(listaCombinaciones,combinacionGanadora);
		

	}
	
	public static void generarArchivoPremios(ArrayList<Combinacion> listaCombinaciones,
			Combinacion combinacionGanadora) {

		
		//Stream
		BufferedWriter stream = null;
		
		try {
			stream = new BufferedWriter(new FileWriter(archivoPremios));
			
			for (Combinacion combinacion : listaCombinaciones) {
				String linea = "";
				for (Integer numero : combinacion.getListaNumeros()) {
					linea += numero + ",";
				}
				linea = linea.substring(0, linea.length()-1); //Quitamos la ultima coma
				linea += ": ";
				linea += combinacion.getAciertos(combinacionGanadora);
				linea += " aciertos.";
				stream.write(linea);
				stream.newLine();
			}

			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error escribiendo el archivoPremios");
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

	public static Combinacion getCombiGanadora() {
		//Para poder retornar c, necesito declararlo fuera del try;
		Combinacion c = null;
		//Stream
		BufferedReader stream = null;
		
		try {

			stream = new BufferedReader(new FileReader(archivoCombiGanadora));
			String linea = stream.readLine();
				ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
				StringTokenizer st = new StringTokenizer(linea, ",");
				while (st.hasMoreTokens()) {
					listaNumeros.add(Integer.parseInt( st.nextToken()));
				}
				c = new Combinacion(listaNumeros);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error escribiendo el getCombiganadora");
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
		return c;
	}

	public static ArrayList<Combinacion> getCombinaciones() {
		ArrayList<Combinacion> lista= new ArrayList<Combinacion>();
		//Stream
		BufferedReader stream = null;
		
		try {

			stream = new BufferedReader(new FileReader(archivoCombinaciones));
			
			String linea;
			while ( (linea  = stream.readLine()) != null ) {
				ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
				StringTokenizer st = new StringTokenizer(linea, ",");
				while (st.hasMoreTokens()) {
					listaNumeros.add(Integer.parseInt( st.nextToken()));
				}
				Combinacion c = new Combinacion(listaNumeros);
				lista.add(c);
				
			}
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error escribiendo el getCombinaciones");
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
		
	

}
