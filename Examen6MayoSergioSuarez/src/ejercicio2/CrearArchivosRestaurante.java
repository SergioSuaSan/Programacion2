package ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CrearArchivosRestaurante {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File archivoPlatos=new File("platos.obj");
		File archivoMenus=new File("menus.obj");

		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(archivoPlatos));
		
		Plato m1=new Plato("Revuelto de setas",9.00F);oos.writeObject(m1);
		Plato m2=new Plato("Croquetas caseras",12.00F);oos.writeObject(m2);
		Plato m3=new Plato("Pulpo a la gallega",12.00F);oos.writeObject(m3);
		Plato m4=new Plato("Morcilla de burgos",10.00F);oos.writeObject(m4);
		Plato m5=new Plato("Ensalada de la casa con ventresca",13.50F);oos.writeObject(m5);
		Plato m6=new Plato("Bacalao al horno",22.00F);oos.writeObject(m6);
		Plato m7=new Plato("Calamar relleno de gambas",20.00F);oos.writeObject(m7);
		Plato m8=new Plato("Chuleton de ternera",23.00F);oos.writeObject(m8);
		Plato m9=new Plato("Chuletillas de lechal",19.00F);oos.writeObject(m9);
		Plato m10=new Plato("Presa iberica",21.00F);oos.writeObject(m10);
		Plato m11=new Plato("Leche Frita",6.00F);oos.writeObject(m11);
		Plato m12=new Plato("Natillas",4.00F);oos.writeObject(m12);
		Plato m13=new Plato("Tiramisu",6.00F);oos.writeObject(m13);
		
		oos.close();
		
		
		oos=new ObjectOutputStream(new FileOutputStream(archivoMenus));
		
		Menu m;
		m=new Menu(1, "Menu de Comunion Economico");
		m.addPlato(m1);
		m.addPlato(m4);
		m.addPlato(m9);
		m.addPlato(m12);
		oos.writeObject(m);
		m=new Menu(2, "Menu de Comunion Elegante");
		m.addPlato(m3);
		m.addPlato(m5);
		m.addPlato(m10);
		m.addPlato(m11);
		oos.writeObject(m);
		m=new Menu(3, "Menu de Comunion Superior");
		m.addPlato(m2);
		m.addPlato(m3);
		m.addPlato(m7);
		m.addPlato(m8);
		m.addPlato(m13);
		oos.writeObject(m);
		m=new Menu(4, "Menu de Empresa 1");
		m.addPlato(m3);
		m.addPlato(m4);
		m.addPlato(m10);
		m.addPlato(m12);
		oos.writeObject(m);
		oos.close();

		System.out.println("Archivos creados");
	}

}
