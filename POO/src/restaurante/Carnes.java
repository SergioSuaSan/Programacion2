package restaurante;

import java.util.Arrays;

public class Carnes extends Platos {
	
//	protected String[] gradoDeCocion = new String []{"Poco hecho", "Al punto", "Muy hecho", "Carbonizado"};

	public enum gradoDeCocion {POCO_HECHA, AL_PUNTO, MUY_HECHA, CARBONIZADA};
	protected gradoDeCocion cocion;
	public Carnes(String nombre, float precio, gradoDeCocion cocion) {
		super(nombre, precio);
		this.cocion = cocion;
	}
	public gradoDeCocion getCocion() {
		return cocion;
	}
	public void setCocion(gradoDeCocion cocion) {
		this.cocion = cocion;
	}
	@Override
	public String toString() {
		return "Carnes [cocion=" + cocion + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	

	
	
	
	
	
	
	
}