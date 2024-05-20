package entidades;

import java.sql.Date;

public class Ticket {
	
	private int numero;
	private Date fecha;
	
	public Ticket(int numero, Date fecha) {
		super();
		this.numero = numero;
		this.fecha = fecha;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Ticket [numero=" + numero + ", fecha=" + fecha + "]";
	}
	
	
	

}
