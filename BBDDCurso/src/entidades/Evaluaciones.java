package entidades;

public class Evaluaciones {
	
	private int codigoAlumno;
	private int codigoCurso;
	private int notaFinal;
	private String observaciones;
	
	public Evaluaciones(int codigoAlumno, int codigoCurso, int notaFinal, String observaciones) {
		super();
		this.codigoAlumno = codigoAlumno;
		this.codigoCurso = codigoCurso;
		this.notaFinal = notaFinal;
		this.observaciones = observaciones;
	}

	public int getCodigoAlumno() {
		return codigoAlumno;
	}

	public void setCodigoAlumno(int codigoAlumno) {
		this.codigoAlumno = codigoAlumno;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public int getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Evaluaciones [codigoAlumno=" + codigoAlumno + ", codigoCurso=" + codigoCurso + ", notaFinal="
				+ notaFinal + ", observaciones=" + observaciones + "]";
	}
	
	

}
