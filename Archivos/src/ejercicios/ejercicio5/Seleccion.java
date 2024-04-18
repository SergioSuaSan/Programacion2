package ejercicios.ejercicio5;

public class Seleccion {

	private String selecciones;
	private String codigo;
	public Seleccion(String pais, String codigo) {
		super();
		this.selecciones = pais;
		this.codigo = codigo;
	}
	public String getSelecciones() {
		return selecciones;
	}
	public void setSelecciones(String pais) {
		this.selecciones = pais;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
}
