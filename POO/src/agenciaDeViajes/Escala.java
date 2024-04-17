package agenciaDeViajes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Escala {

	protected String nombreCiudad;
	protected LocalDateTime horaBajada;
	protected LocalDateTime horaRegreso;
	
	//Métodos
	public Escala(String nombreCiudad, LocalDateTime horaBajada, LocalDateTime horaRegreso) {
		super();
		this.nombreCiudad = nombreCiudad;
		this.horaBajada = horaBajada;
		this.horaRegreso = horaRegreso;
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public LocalDateTime getHoraBajada() {
		return horaBajada;
	}

	public void setHoraBajada(LocalDateTime horaBajada) {
		this.horaBajada = horaBajada;
	}

	public LocalDateTime getHoraRegreso() {
		return horaRegreso;
	}

	public void setHoraRegreso(LocalDateTime horaRegreso) {
		this.horaRegreso = horaRegreso;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return "Escala [nombreCiudad=" + nombreCiudad + ", horaBajada=" + horaBajada.format(dtf) + ", horaRegreso=" + horaRegreso.format(dtf)
				+ "]";
	}
	
	
	
	
	
	
	
	
}
