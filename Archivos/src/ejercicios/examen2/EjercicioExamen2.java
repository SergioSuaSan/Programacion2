package ejercicios.examen2;

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

public class EjercicioExamen2 {

	private static File archivoCompras = new File(".\\src\\ejercicios\\examen2\\compras.obj");
	private static File archivoFusion = new File(".\\src\\ejercicios\\examen2\\fusion.obj");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Compra> listaCompras = getCompras();
		
		//generar el archivo fusion
		generarFusion(listaCompras);

	}
	
	
	private static ArrayList<Compra> getCompras() {
		ArrayList<Compra> lista = new ArrayList<Compra>();
		ObjectInputStream stream = null;
		
		try {
			stream = new ObjectInputStream(new FileInputStream(archivoCompras));
			
			//Recuperamos el objeto
			while (true) {
				Compra c = (Compra) stream.readObject();
				lista.add(c);
			}
			
		} catch (EOFException e) {
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
	
	
	private static void generarFusion(ArrayList<Compra> listaCompras) {
		// TODO Auto-generated method stub
		ArrayList<Compra> listaResultados = new ArrayList<Compra>();
		ObjectOutputStream stream = null;
		
		try {
			stream =new ObjectOutputStream(new FileOutputStream(archivoFusion));
			
			for (Compra compra : listaCompras) {
				Compra compraBuscada = buscarCompra(listaResultados,compra);
				if (compraBuscada!=null) {
					compraBuscada.setCantidad(compraBuscada.getCantidad()+compra.getCantidad());
				} else {
					listaResultados.add(compra);
				}
			
			
			}
			for (Compra compra : listaResultados) {
				stream.writeObject(compra);
				System.out.println(compra.getDepartamento());
				System.out.println(compra.getCantidad());
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
	
	//metodo para buscar una compra
	public static Compra buscarCompra(ArrayList<Compra> listacompras, Compra c) {
		for (Compra compra : listacompras) {
			if (compra.getDepartamento().equals(c.getDepartamento())) {
				return compra;
			}
		}
		return null;
	}

}
