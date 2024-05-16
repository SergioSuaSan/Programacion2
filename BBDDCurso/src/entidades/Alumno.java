package entidades;

import java.sql.Date;

public class Alumno {
	
	private Date fechaNacimiento;
	private int codigoAlumno;
	private String nombre;
	private String apellidos;
	private String telefono;
	
	public Alumno(int codigoAlumno, String nombre, String apellidos, String telefono,Date fechaNacimiento) {
		super();
		this.codigoAlumno = codigoAlumno;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getCodigoAlumno() {
		return codigoAlumno;
	}

	public void setCodigoAlumno(int codigoAlumno) {
		this.codigoAlumno = codigoAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Alumno [fechaNacimiento=" + fechaNacimiento + ", codigoAlumno=" + codigoAlumno + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", telefono=" + telefono + "]";
	}
	
	
	
	
}
