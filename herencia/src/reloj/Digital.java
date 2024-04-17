package reloj;

import java.text.DecimalFormat;
import java.time.LocalTime;

public class Digital implements Reloj{

	@Override
	public String getHora() {
		LocalTime horaDelSistema= LocalTime.now();  //Obtiene la hora del Sistema
		int hora = horaDelSistema.getHour();
		int minuto = horaDelSistema.getMinute();
		
		DecimalFormat formato = new DecimalFormat("00");
		return formato.format(hora) + ":" + formato.format(minuto) ;
	}

	
}
