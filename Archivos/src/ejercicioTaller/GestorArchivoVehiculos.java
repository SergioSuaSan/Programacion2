package ejercicioTaller;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import PruebasConObjetos.Contacto;
import ejercicios.ejercicio2.Planta;

public class GestorArchivoVehiculos {

	private File archivo;

	public GestorArchivoVehiculos(File archivo) {
		super();
		this.archivo = archivo;
	}

	public File getArchivo() {
		return archivo;
	}

	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}
	
	//Obtener todos los objetos vehículo
	public ArrayList<Vehiculo> getVehiculos() {
		ArrayList<Vehiculo>listaVehiculos = new ArrayList<Vehiculo>();
		ObjectInputStream stream = null;
		
		try {
			stream = new ObjectInputStream(new FileInputStream(archivo));
			
			//Recuperamos el objeto
			while (true) {
				Vehiculo v = (Vehiculo) stream.readObject();	
				listaVehiculos.add(v);
			}
		
		} catch (EOFException e) {
			//Cuando salte esta excepción la recuperación de datos se ha acabado
			return listaVehiculos;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Archivo no encontrado"	);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error de escritura");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
	System.out.println("Error: ");
		} finally {
			try {
				stream.close();
			} catch (IOException e) {
				System.out.println("Error cerrando el stream");
			}
		}
		return null;
		
	}

	//guardar los objetos vehículo
	public  void setVehículos(ArrayList<Vehiculo> lista) {
		ObjectOutputStream stream = null;
		
		try {
			stream =new ObjectOutputStream(new FileOutputStream(archivo));
			
			for (Vehiculo vehiculo : lista) {
				stream.writeObject(vehiculo);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Archivo no encontrado");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error de escritura");
			e.printStackTrace();
		} finally {
			try {
				stream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error al cerrar");
			}
		}
		
	}
	//añadir un objeto vehículo más
	public void addVehiculo(Vehiculo nuevo) {
		ArrayList<Vehiculo> lista = this.getVehiculos();
		lista.add(nuevo);
		this.setVehículos(lista);
	}
	
}
