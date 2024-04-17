package agenda;

public class AgendaConArray {
	
	//Atributos
	private Contacto[] contactos;
	
	
	//Métodos

	public AgendaConArray() {  			//Constructor para crear una agenda vacía
		super();
		this.contactos = new Contacto[200];
	}
	public AgendaConArray( int tamaño) {  			//Constructor para crear una agenda vacía de tamaño personalizado
		super();
		this.contactos = new Contacto[tamaño];
	}
	public AgendaConArray(Contacto[] contactos) {
		super();
		this.contactos = contactos;
	}
	public Contacto[] getContactos() {
		return contactos;
	}
	public void setContactos(Contacto[] contactos) {
		this.contactos = contactos;
	}
	
	//Método para buscar un Contacto por Nombre
	public Contacto getContacto(String nombre) {
		for (Contacto contacto : contactos) {
			if (contacto.getNombre().equals(nombre)) {
				return contacto;
			}
		}
		return null;
	}
	
	public boolean removeContacto(String nombre) {
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i].getNombre().equals(nombre) ) {
				contactos[i] = null; //Borro el contacto
				return true;
			}
		}
		return false;
	}
	
	
	

}
