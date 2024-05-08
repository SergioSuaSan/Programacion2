package ejercicio2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class GestorPlatos {
	 File archivo;
	 
	 
	 
	
	public GestorPlatos(File archivo) {
		super();
		this.archivo = archivo;
	}
	
	


	public File getArchivo() {
		return archivo;
	}




	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}




	//Recuperar platos
	public  ArrayList<Plato> getPlatos() {

		ArrayList<Plato>lista = new ArrayList<Plato>();
		ObjectInputStream stream = null;
		
		try {
			stream = new ObjectInputStream(new FileInputStream(archivo));
			
			//Recuperamos el objeto
			while (true) {
				Plato p = (Plato) stream.readObject();	
				lista.add(p);
			}
		
		} catch (EOFException e) {
			//Cuando salte esta excepción la recuperación de datos se ha acabado
			return lista;

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
	
	
	//Añadir un plato
	public  ArrayList<Plato> addPlato(Plato plato) {
		ArrayList<Plato> lista = getPlatos();
		lista.add(plato);
		return lista;
	}
	//Eliminar un plato
	public ArrayList<Plato> removePlato(Plato plato) {
		ArrayList<Plato> lista = getPlatos();
		lista.remove(plato);
		return lista;
	}
	//Guardar Platos
	public  void savePlatos(ArrayList<Plato> listaDePlatos) {
	
		
		ObjectOutputStream stream = null;
		
		try {
			stream =new ObjectOutputStream(new FileOutputStream(archivo));
			
			for (Plato Plato : listaDePlatos) {
				stream.writeObject(Plato);				
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
}
