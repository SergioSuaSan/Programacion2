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
	
	
	public void add(Ticket a) throws TicketException {
		if (this.tickets.size()== this.capacidad) {
			throw new TicketException("Parking lleno");
		} else  if (tickets.contains(a)){
			throw new TicketException("Ya está esta matricula");
		} else {
			tickets.add(a);
		}
	}
	
	public void remove(Ticket a) throws TicketException {
		if (a.pagado) {
			tickets.remove(a);			
		} else {
			throw new TicketException("No ha sido pagado");
		}
	}
	
	
	
	
	

}
