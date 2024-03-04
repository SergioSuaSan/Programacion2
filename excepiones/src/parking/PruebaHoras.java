package parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class PruebaHoras {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Cómo saber el tiempo que transcurre entre una hora y otra
		LocalDateTime horaEntrada = LocalDateTime.now();
		System.out.println(horaEntrada);
		
		Thread.sleep(5000);
		
		LocalDateTime horaSalida = LocalDateTime.now();
		System.out.println(horaSalida);
		
		
		//Obtener la diferencia entre 2 horas
		Duration duracion = Duration.between(horaEntrada, horaSalida);
		System.out.println(duracion.getSeconds());
		
		
		
	}
	
}
