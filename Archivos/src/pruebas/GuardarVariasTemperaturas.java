package pruebas;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class GuardarVariasTemperaturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File archivo = new File ("Temperaturas.dat");
		
		
		try {
			DataOutputStream stream = new DataOutputStream(new FileOutputStream(archivo));
			
			for (int i = 1; i <= 30; i++) {
				stream.writeDouble(Math.random()*20+10);
			}
			
			stream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Archivo no encontrado"	);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error guardando temperatura");
		}
		

		
		
	}

}
