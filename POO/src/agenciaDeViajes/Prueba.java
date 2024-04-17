package agenciaDeViajes;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Prueba {

	public static void main(String[] args) {
		// Prueba de la clase Crucero
		Crucero cr = new Crucero(1, "Islas griegas", "Titanic", LocalDate.parse("2024-04-12"), LocalDate.parse("2024-04-18"));
		//Escala de Ocio
		EscalaDeOcio o = new EscalaDeOcio("Atenas", LocalDateTime.parse("2024-04-16T09:00:00"), LocalDateTime.parse("2024-04-16T18:00:00"));
		//Escala cultural
		EscalaCultural c = new EscalaCultural("Génova", LocalDateTime.parse("2024-04-16T15:00:00"), LocalDateTime.parse("2024-04-16T16:30:00"), 150);

		System.out.println(cr);
		System.out.println(o);
		System.out.println(c);
		
		cr.add(c);
		cr.add(o);
		System.out.println(cr);
		cr.coste();
		
	
	}

}
