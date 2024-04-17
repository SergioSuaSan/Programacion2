package facultad;

import java.util.ArrayList;

public class Facultad{
	

	ArrayList<Persona> lista = new ArrayList<Persona>();

	public Facultad(ArrayList<Persona> facultad) {
		super();
		this.lista = facultad;
	}

	public Facultad() {
		super();
		this.lista = new ArrayList<Persona>();
	}

	public ArrayList<Persona> getFacultad() {
		return lista;
	}

	@Override
	public String toString() {
		return "Facultad [Lista=" + lista + "]";
	}
	
	public void addPersona(Persona persona) {
		lista.add(persona);
	}

	public void removePersona(Persona persona	 ) {
		lista.remove(persona);
	}
	

	public ArrayList<Estudiante> getAlumnosPorCurso(int curso) {
		ArrayList<Estudiante> listaEstudiante= new ArrayList<Estudiante>();
		for (Persona persona  : lista) {
			if (persona instanceof Estudiante&& curso== ((Estudiante) persona).curso) {
				listaEstudiante.add((Estudiante) persona);
			}
		}
		return listaEstudiante;
		
	}

	public ArrayList<Empleado> getPersonalPorDespacho(int despacho) {
		ArrayList<Empleado> listaEmpleado	= new ArrayList<Empleado>();
		for (Persona persona : lista) {
			if (persona instanceof Empleado && despacho == ((Empleado)persona).despacho) {
				listaEmpleado.add((Empleado) persona);
			}
		}
		return listaEmpleado;
	}

}
