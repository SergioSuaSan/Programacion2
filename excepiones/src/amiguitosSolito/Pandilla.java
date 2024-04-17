package amiguitosSolito;

import java.util.ArrayList;

public class Pandilla {
	
	protected int capacidad;
	protected ArrayList<Amigo> lista;
	
	




	public Pandilla(int capacidad, ArrayList<Amigo> lista) {
		super();
		this.capacidad = capacidad;
		this.lista = lista;
	}






	public Pandilla(int capacidad) {
		super();
		this.capacidad = capacidad;
		this.lista = new ArrayList<Amigo>();
	}






	public Pandilla() {
		// TODO Auto-generated constructor stub
	}






	public int getCapacidad() {
		return capacidad;
	}






	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}






	public ArrayList<Amigo> getLista() {
		return lista;
	}






	public void setLista(ArrayList<Amigo> lista) {
		this.lista = lista;
	}






	@Override
	public String toString() {
		return "Pandilla [capacidad=" + capacidad + ", lista=" + lista + "]";
	}






	public void add(Amigo a) throws PandillaCompletaException, NoMeGustaTuNombreException {
		if (lista.size()< capacidad) {
			if (!a.getNombre().toLowerCase().endsWith("s") ) {
				lista.add(a);						
			} else {
				throw new NoMeGustaTuNombreException("Tu nombre acaba en s");
			}	
		} else {
			throw new PandillaCompletaException("Se llenó la Pandilla");
		}
	}
	
	
	
	
}
