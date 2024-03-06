package parking;

import java.util.ArrayList;

public class Parking {
	protected int capacidad;
	ArrayList<Ticket> tickets;
	
	
	public Parking(int capacidad) {
		super();
		this.capacidad = capacidad;
		this.tickets = new ArrayList<Ticket>();
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	public ArrayList<Ticket> getTickets() {
		return tickets;
	}


	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}


	@Override
	public String toString() {
		return "Parking [capacidad=" + capacidad + ", tickets=" + tickets + "]";
	}
	
	public Ticket getTicket(String matricula) { //Busca un ticket dada una matrícula.
		for (Ticket ticket : tickets) {
			if (ticket.getMatricula().equals(matricula)) {
				return ticket;
			}
		}
		return null;
	}
	
	public void add(Ticket a) throws TicketException {
		if (this.tickets.size()== this.capacidad) {
			throw new TicketException("Parking lleno");
		} 
		if (this.getTicket(a.getMatricula()) !=null){
			throw new TicketException("Ya está esta matricula");
		} 
			tickets.add(a);
		
	}
	
	public void remove(Ticket a) throws TicketException {
		if (a.pagado) {
			tickets.remove(a);			
		} else {
			throw new TicketException("No ha sido pagado");
		}
	}
	
	
	
	
	

}
