package parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
	protected String matricula;
	protected LocalDateTime hora;
	protected boolean pagado;
	
	
	public Ticket(String matricula, LocalDateTime hora, boolean pagado) {
		super();
		this.matricula = matricula;
		this.hora = hora;
		this.pagado = pagado;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public LocalDateTime getHora() {
		return hora;
	}


	public void setHora(LocalDateTime hora) {
		this.hora = hora;
	}


	public boolean isPagado() {
		return pagado;
	}


	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}


	@Override
	public String toString() {
		return "Ticket [matricula=" + matricula + ", hora=" + hora + ", pagado=" + pagado + "]";
	}
	
	
	public float calcularPrecio() throws TicketException {
		Duration duracion = Duration.between(this.hora, LocalDateTime.now());
		float resultado = duracion.getSeconds();
		if (resultado<0) {
			throw new TicketException("Error en el precio del ticket");
		}
		return resultado;
	}
	
	
}
