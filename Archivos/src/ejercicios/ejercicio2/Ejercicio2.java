package ejercicios.ejercicio2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ejercicio2 {

	private static File archivo = new File(".\\src\\ejercicios\\ejercicio2\\Plantas.venta");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Obtener objetos Planta
		ArrayList<Planta> listaDePlantas =getPlantas();
		System.out.println(listaDePlantas);
		
		//actualizar los precios de Planta
		actualizarPrecio(listaDePlantas);
		System.out.println(listaDePlantas);
		
		//guardar los datos en el archivo
		savePlantas(listaDePlantas);
		System.out.println(listaDePlantas);
		
		
	}
	
	public static ArrayList<Planta> getPlantas() {

		ArrayList<Planta>lista = new ArrayList<Planta>();
		ObjectInputStream stream = null;
		
		try {
			stream = new ObjectInputStream(new FileInputStream(archivo));
			
			//Recuperamos el objeto
			while (true) {
				Planta p = (Planta) stream.readObject();	
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

	public static void actualizarPrecio(ArrayList<Planta> listaDePlantas) {
		
		for (Planta planta : listaDePlantas) {
			if (planta.getCantidad()<20) {
				planta.setPrecio(planta.getPrecio() * .8);
			} else if (planta.getCantidad()<50) {
				planta.setPrecio(planta.getPrecio() * .7);
			}else  {
				planta.setPrecio(planta.getPrecio() * .6);
			}
		}
	
	}
	
	public static void savePlantas(ArrayList<Planta> listaDePlantas) {
	
		
		ObjectOutputStream stream = null;
		
		try {
			stream =new ObjectOutputStream(new FileOutputStream(archivo));
			
			for (Planta planta : listaDePlantas) {
				stream.writeObject(planta);				
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
