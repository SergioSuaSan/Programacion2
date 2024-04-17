package facultad;

public class Estudiante extends Persona {

	protected int curso;

	public Estudiante(String nombre, String apellido, String dNI, int curso) {
		super(nombre, apellido, dNI);
		this.curso = curso;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Estudiante [curso=" + curso + ", nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + "]";
	}
	
	
}
