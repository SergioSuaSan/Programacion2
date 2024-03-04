package grupoAmigos;

import java.util.ArrayList;

public class Pandilla {
	protected int capacidad;
	protected ArrayList<Amigo> lista;

	
	
	public Pandilla(int capacidad) {
		super();
		this.capacidad = capacidad;
		this.lista= new ArrayList<Amigo>();
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
		if (this.lista.size()==this.capacidad) {
			throw new PandillaCompletaException("La pandilla está completa");
		} else {
			if (a.nombre.toLowerCase().endsWith("s")) {
				throw new NoMeGustaTuNombreException("No puedes meter un nombre acabado en S");
			} else {
				lista.add(a);
			}
		}
	}
	
	
	
	
	
	
}
