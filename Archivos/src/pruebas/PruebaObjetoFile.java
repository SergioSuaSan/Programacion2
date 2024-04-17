package pruebas;

import java.io.File;
import java.text.DateFormat;

public class PruebaObjetoFile {

	public static void main(String[] args) {
		
		//Probar cómo funciona el objeto File
		
		File archivo = new File("C:\\windows\\notepad.exe");
		if (archivo.exists()) {
			System.out.println("El archivo es real");
			System.out.println(archivo.getAbsolutePath());
			System.out.println(archivo.length());
			System.out.println(DateFormat.getInstance().format(archivo.lastModified()));
			System.out.println(archivo.canRead());
			System.out.println(archivo.canWrite());

		} else {
			System.out.println("El archivo no existe");
		}

	}

}
