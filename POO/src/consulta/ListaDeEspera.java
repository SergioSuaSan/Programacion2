package consulta;

import java.util.ArrayList;

public class ListaDeEspera {
	
	private ArrayList<Paciente> ListaDePacientes;

	
	//Métodos
	public ListaDeEspera(ArrayList<Paciente> listaDePacientes) {
		super();
		ListaDePacientes = listaDePacientes;
	}


	public ArrayList<Paciente> getListaDePacientes() {
		return ListaDePacientes;
	}


	public void setListaDePacientes(ArrayList<Paciente> listaDePacientes) {
		ListaDePacientes = listaDePacientes;
	}

	public void add(Paciente paciente) {
		ListaDePacientes.add(paciente);
	}
	public void remove(Paciente paciente) {
		ListaDePacientes.remove(paciente);
	}
	

	@Override
	public String toString() {
		return "ListaDeEspera [ListaDePacientes=" + ListaDePacientes + "]";
	}
	
	
	
	
	
	
	

}
