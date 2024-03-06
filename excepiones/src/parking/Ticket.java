package parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
	protected String matricula;
	protected LocalDateTime hora;
	protected boolean pagado;
	
	public static final float PRECIO_MINUTO = 0.03F;
	public static final float PRECIO_HORA = 1.7F;
	public static final float PRECIO_DIA = 17;
	
	public Ticket(String matricula, LocalDateTime hora, boolean pagado) {
		super();
		this.matricula = matricula;
		this.hora = hora;
		this.pagado = pagado;
	}
	


	public Ticket(String matricula) {
		super();
		this.matricula = matricula;
		this.pagado = false;
		this.hora = LocalDateTime.now();
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
		LocalDateTime ahora = LocalDateTime.now();
		Duration duracion = Duration.between(this.hora, ahora);
		float resultado = duracion.getSeconds();
		if (resultado<0) {
			throw new TicketException("Error en el precio del ticket");
		}
		
		long dias = duracion.toDays();
		long horas = duracion.toHoursPart(); //horas que restan
		long  minutos = duracion.toMinutesPart(); //Minutos que restan
		
		//Si alguien está más de 10 horas, le ponemos el día completo, si no, es la suma de todo
		if (horas >=10) {
			dias++;
			horas = 0;
			minutos = 0;
		}
		return dias * PRECIO_DIA + horas*PRECIO_HORA + minutos * PRECIO_MINUTO;
		
	
	}
	
	
}
