package ejercicio2;

import java.io.Serializable;

public class Plato implements Serializable {
	private String descripcion;
	private float precio;
	
	public Plato(String descripcion, float precio) {
		this.descripcion = descripcion;
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
		
}
