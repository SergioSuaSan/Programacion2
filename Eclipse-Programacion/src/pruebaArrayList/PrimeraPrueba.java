package pruebaArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class PrimeraPrueba {
	
	public static void main(String[] args) {
		
		//Probando la estructura dinámica ArrayList
		
		
		ArrayList lista = new ArrayList();  //Creo un ArrayList vacío
		
		lista.add("Hola");
		lista.add(35);
		lista.add(45.43);
		lista.add(true);

		System.out.println(lista);
		//Al ArrayList no le gusta que los datos estén mezclados
		System.out.println();
		
		
		//Declaramos una lista con un tipo fijo de datos
		ArrayList<String> nombres = new ArrayList<String>();
		
	
		nombres.add("Hola");
		nombres.add("hadios");
		nombres.add("haventura");
		nombres.add("harigato");
		
		System.out.println(nombres);
		
		
//		//Declarar una lista generica tipada para que no te salgan avisos
//		
//		ArrayList<Object> datos = new ArrayList<Object>();
//		
//		datos.add("buenas");
//		datos.add(35);
//		
//		System.out.println(datos);
		
		
		//añadir nombres en una posicion concreta
		nombres.add(2,"carla");
		System.out.println(nombres);
		
		//Sustituir un obheto por otro
		nombres.set(0, "Ahora me pongo yo");
		System.out.println(nombres);
		
		//Borrar un objeto
		nombres.remove(3);
		System.out.println(nombres);
		
		nombres.remove("hadios"	);
		System.out.println(nombres);
	
//		nombres.clear();
//		System.out.println(nombres);
		
		System.out.println();
		
		//Recorrer un ArrayList
		for (int i = 0; i < nombres.size(); i++) {
			System.out.println(nombres.get(i));
			
		}
		
		System.out.println();
		
		//foreach
		for (String string : nombres) {
			System.out.println(string);
		}
		
		System.out.println();
		//Con un Iterador
		for (Iterator iterator = nombres.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		//Array multidimensional
		ArrayList<ArrayList<String>> matriz = new ArrayList<ArrayList<String>>();
		
		//Buscar dentro de un ArrayList
		System.out.println("Luis está en la posición" + nombres.indexOf("Luis"));
		System.out.println("Está carla? " + nombres.contains("carla"));
		
		//Ordenar un arrayList
		Collections.sort(nombres);
		System.out.println(nombres);
		
		
		
		//Convertir un Array clásico a un ArrayList
		String[] array = {"angel", "Marta", "Carlos"};
		ArrayList<String> listanombres = new ArrayList<String>(Arrays.asList(array));
		System.out.println(listanombres);
		
		
		//Convertir un ArrayList a un Array clásico
		Object[] array2 = listanombres.toArray();
		
		
		
		
		
		
		
		
		
	}

}