package facultad;

import facultad.Servicio.Seccion;

public class Prueba {

	public static void main(String[] args) {


		Estudiante Juan = new Estudiante("Juan"," Sánchez", "03953432B", 1);
		Servicio Pepe = new Servicio("Pepe", "Jolin","234234A", 1,1,Seccion.DECANATO);
		
		Facultad f = new Facultad();
		f.addPersona(Juan);
		f.addPersona(Pepe);
		System.out.println(f);
		System.out.println(	f.getAlumnosPorCurso(1));
		System.out.println(f.getPersonalPorDespacho(1));

	}

}
