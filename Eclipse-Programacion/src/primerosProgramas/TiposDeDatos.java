package primerosProgramas;

public class TiposDeDatos {

	public static void main(String[] args) {
		
		/* Programa donde probar los diferentes tipos de datos
		 * crearemos variables de todos ellos
		 */
		
		//Declaro una variable del tipo boolean
		boolean tieneCarneDeConducir;
		
		//Guardo un dato en la variable
		tieneCarneDeConducir = true;
		
		//Se puede hacer a la vez
		boolean quieroComer  = true;
		
		System.out.println( "Tiene carné de conducir = " + tieneCarneDeConducir);
		System.out.println(quieroComer);
		System.out.println( 8 + 1.5);
		
		/*
		 * Tipos char y string
		 * El tipo char guarda una única letra, pero no como letra sino como código, de tal forma que se puede operar con ese código, 
		 * cambiar la letra, etc.
		 */
		
		char letra = 'A';
		
		System.out.println( letra );     //Imprimimos la letra
		System.out.println(  (int) letra );     //Imprimimos el código ASCII de la letra
		
		letra =  '\t';     //guardo la tecla tabulador
		letra = '\n';     // guardo la tecla intro (cambio de línea)
		
		String frase = "Buenos días \nclase";
		String vacio = "";
		System.out.println( frase ); 
		
		
		/*
		 * Variables enteras
		 */
		
		byte pequeña = 127;
		short mediana = 32000;
		int grande =  20000000;
		long enorme = 100000000000000000L;
		
		
		mediana = (short) (mediana + pequeña);  		//Hacer un cast (castear)
		
		/*
		 * Variables con decimales
		 */
		
		double muchaPrecision = 2.4798172983749182734;
		float pocaPrecision =  2.98732849752203498f;  		//Necesita la F ó f
		System.out.println( (int) (muchaPrecision + pocaPrecision) );  //Poner (int) hace que tras la suma, utilice solo el número entero
		
		


	}

}
