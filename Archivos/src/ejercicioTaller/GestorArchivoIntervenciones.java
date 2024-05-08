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

public class GestorArchivoIntervenciones {

	private File archivo;

	public GestorArchivoIntervenciones(File archivo) {
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
	public ArrayList<Intervencion> getIntervenciones() {
		ArrayList<Intervencion>listaIntervenciones = new ArrayList<Intervencion>();
		ObjectInputStream stream = null;
		
		try {
			stream = new ObjectInputStream(new FileInputStream(archivo));
			
			//Recuperamos el objeto
			while (true) {
				Intervencion v = (Intervencion) stream.readObject();	
				listaIntervenciones.add(v);
			}
		
		} catch (EOFException e) {
			//Cuando salte esta excepción la recuperación de datos se ha acabado
			return listaIntervenciones;
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
	public  void setIntervenciones(ArrayList<Intervencion> lista) {
		ObjectOutputStream stream = null;
		
		try {
			stream =new ObjectOutputStream(new FileOutputStream(archivo));
			
			for (Intervencion Intervencion : lista) {
				stream.writeObject(Intervencion);
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
	//añadir un objeto intervencion más
	public void addIntervencion(Intervencion nuevo) {
		ArrayList<Intervencion> lista = this.getIntervenciones();
		lista.add(nuevo);
		this.setIntervenciones(lista);
	}
	
	//Obtener las intervenciones de una matricula concreta
	public ArrayList<Intervencion> getIntervenciones(String matricula) {
	ArrayList<Intervencion>lista = new ArrayList<Intervencion>(); 
	ObjectInputStream stream = null;
	
	try {
		stream = new ObjectInputStream(new FileInputStream(archivo));
		
		//Recuperamos el objeto
		while (true) {
			//Falta esta parte
			Intervencion v =  (Intervencion) stream.readObject();	
			if (v.getMatricula().equals(matricula)) {
				lista.add(v);				
			}
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
		e.printStackTrace();
	} finally {
		try {
			stream.close();
		} catch (IOException e) {
			System.out.println("Error cerrando el stream");
		}
	}
	return null;
}
	
}
