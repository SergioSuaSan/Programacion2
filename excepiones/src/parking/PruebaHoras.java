package parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class PruebaHoras {

	public static void main(String[] args) throws InterruptedException, TicketException {
		
		
		//Cómo saber el tiempo que transcurre entre una hora y otra
//		LocalDateTime horaEntrada = LocalDateTime.now();
//		System.out.println(horaEntrada);
//		
//		Thread.sleep(5000);
//		
//		LocalDateTime horaSalida = LocalDateTime.now();
//		System.out.println(horaSalida);
//		
//		
//		//Obtener la diferencia entre 2 horas
//		Duration duracion = Duration.between(horaEntrada, horaSalida);
//		System.out.println(duracion.getSeconds());
//		
		
		Parking parking = new Parking(200);
		Ticket t1 = new Ticket("1234AAA");
		Ticket t2 = new Ticket("1234BBB");
		Ticket t3 = new Ticket("1234CCC");
		parking.add(t1);
		parking.add(t2);
		
		System.out.println(parking.getTickets());
		
		Thread.sleep(60000); //Espero un minuto
		
		System.out.println(parking.getTicket("1234AAA").calcularPrecio() );
	}
	
}
