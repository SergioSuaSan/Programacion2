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




public class GestorMenu {
	private File archivo;
	
	
	

	public GestorMenu(File archivo) {
		super();
		this.archivo = archivo;
	}
	

	public File getArchivo() {
		return archivo;
	}


	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}


	//Recuperar Menus
	public  ArrayList<Menu> getMenus() {

		ArrayList<Menu>lista = new ArrayList<Menu>();
		ObjectInputStream stream = null;
		
		try {
			stream = new ObjectInputStream(new FileInputStream(archivo));
			
			//Recuperamos el objeto
			while (true) {
				Menu p = (Menu) stream.readObject();	
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
	
	//Guardar Menus
	public  void saveMenus(ArrayList<Menu> listaDeMenus) {
	
		
		ObjectOutputStream stream = null;
		
		try {
			stream =new ObjectOutputStream(new FileOutputStream(archivo));
			
			for (Menu Menu : listaDeMenus) {
				stream.writeObject(Menu);				
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

//Añadir un menu
	public  ArrayList<Menu> addPlato(Menu menu) {
		ArrayList<Menu> lista = getMenus();
		lista.add(menu);
		return lista;
	}


	//Encontrar un menu por su código
	public  Menu findMenu(int codigo) {
		
		ArrayList<Menu> lista = getMenus();
		for (Menu menu : lista) {
			if (codigo == menu.getCodigo()) {
				return menu;
			}
		}
		
		return null;
		
	}


}