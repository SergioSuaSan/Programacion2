package claseStrings;

public class PruebadeVelocidad {

	public static void main(String[] args) {
		//  Comprobar velocidad de un string y un StringBuilder
		
		String s = "";
		long inicio = System.currentTimeMillis();
		//Trabajo a realizar
		
		for (int i = 0; i < 100000; i++) {
			s=s.concat("Lunes");
		}
		
		long fin = System.currentTimeMillis();
		System.out.println("Tiempo de String: " + (fin - inicio));

		
		
		
		StringBuilder sb = new StringBuilder();
		inicio = System.currentTimeMillis();
		//Trabajo a realizar
		
		for (int i = 0; i < 100000; i++) {
			sb=sb.append("Lunes");
		}
		
		 fin = System.currentTimeMillis();
		System.out.println("Tiempo de StringBuilder: " + (fin - inicio));
		
		
	}

}
