package ejercicios.ejercicio5;

public class Jugador {
	
	private String nombre;
	private Seleccion codigoSeleccion;
	private Demarcacion codigoDemarcacion;
	public Jugador(String nombre, Seleccion codigoSeleccion, Demarcacion codigoDemarcacion) {
		super();
		this.nombre = nombre;
		this.codigoSeleccion = codigoSeleccion;
		this.codigoDemarcacion = codigoDemarcacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Seleccion getCodigoSeleccion() {
		return codigoSeleccion;
	}
	public void setCodigoSeleccion(Seleccion codigoSeleccion) {
		this.codigoSeleccion = codigoSeleccion;
	}
	public Demarcacion getCodigoDemarcacion() {
		return codigoDemarcacion;
	}
	public void setCodigoDemarcacion(Demarcacion codigoDemarcacion) {
		this.codigoDemarcacion = codigoDemarcacion;
	}

	
	

	
	
}
