package agenda;

import java.util.ArrayList;

public class Agenda {
	
	//Atributos
	private ArrayList<Contacto> listaDeContactos;
	
	//Métodos
	public Agenda() { //Agenda vacía por defecto
		listaDeContactos= new ArrayList<Contacto>();
		
	}

	public Agenda(ArrayList<Contacto> listaDeContactos) {		//Clonar una agenda
		super();
		this.listaDeContactos = listaDeContactos;
	}

	public ArrayList<Contacto> getListaDeContactos() {
		return listaDeContactos;
	}

	public void setListaDeContactos(ArrayList<Contacto> listaDeContactos) {
		this.listaDeContactos = listaDeContactos;
	}
	
	//añadir un contacto
	public void add(Contacto nuevo) {
		this.listaDeContactos.add(nuevo);
	}
	
	//Buscar un contacto si me dan su nombre
	public Contacto get(String nombre) {
		for (Contacto contacto : listaDeContactos) {
			if (contacto.getNombre().equals(nombre)) {
				return contacto;
			}		
		}
		return null;
	
	}


	//Borrar un contacto
	public boolean delete(Contacto viejo) {
		return this.listaDeContactos.remove(viejo);
	}
	
	//Borrar un contacto si me dan su nombre
	public boolean delete(String nombreViejo) {
		for (Contacto contacto : listaDeContactos) {
			if (contacto.getNombre().equals(nombreViejo)) {
				this.delete(contacto);
				return true;
			}
		}
		return false;
	}
	
	//Buscar un contacto dada su posición en la lista
	public Contacto get(int position) {
		return listaDeContactos.get(position);
	}

	
	//Actualizar un contacto
	public boolean update(String nombreAntiguo, String nombreNuevo) {
		Contacto c = this.get(nombreAntiguo);
		if (c!=null) {
			c.setNombre(nombreNuevo);
			return true;
		}
		return false;
		
		
		//		for (Contacto contacto : listaDeContactos) {
//			if (contacto.getNombre().equals(nombreAntiguo)) {
//				contacto.setNombre(nombreNuevo);
//				return true;
//			}
//		}
//		return false;
	}
	
	public void update (Contacto contactoViejo,Contacto contactoNuevo) {
		this.delete(contactoViejo);
		this.add(contactoNuevo);
	}
	
	//Método longitud
	public int length() {
		return this.listaDeContactos.size();
	}

	@Override
	public String toString() {
		return "Agenda [listaDeContactos=" + listaDeContactos + "]";
	}
	
	
	
	
	
	
}
