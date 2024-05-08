package ej3;

import java.util.ArrayList;

public class Pasivo {
	
	public ArrayList<Prestamo> lista = new ArrayList<Prestamo>();

	public Pasivo(ArrayList<Prestamo> lista) {
		super();
		this.lista = lista;
	}

	public Pasivo() {
		super();
		this.lista =new ArrayList<Prestamo>();
	}

	public ArrayList<Prestamo> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Prestamo> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Pasivo [lista=" + lista + "]";
	}
	
	
	public void addPrestamo(Prestamo prestamo) {
		lista.add(prestamo);
	}
	
	public void removePrestamo (Prestamo prestamo) {
		lista.remove(prestamo);
	}
	
	
	
	public ArrayList<PrestamoFijo> getPrestamoFijos(){
		ArrayList<PrestamoFijo> listaFijos = new ArrayList<PrestamoFijo>();
		for (Prestamo prestamo : lista) {
			if (prestamo instanceof PrestamoFijo) {
				listaFijos.add((PrestamoFijo) prestamo);
			}
		}
		
		return listaFijos;
	}
	
	public ArrayList<PrestamoVariable> getPrestamosVariables() {
		ArrayList<PrestamoVariable> listaVariable = new ArrayList<PrestamoVariable>();
		for (Prestamo prestamo : lista) {
			if (prestamo instanceof PrestamoVariable) {
				listaVariable.add((PrestamoVariable) prestamo);
			}
		}
		return listaVariable;
	}
	
	

}
