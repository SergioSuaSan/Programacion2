package ejercicio2;

import java.io.Serializable;
import java.util.ArrayList;


public class Menu implements Serializable{

	private int codigo;
	private String denominacion;
	private ArrayList<Plato> listaDePlatos;
	
	public Menu(int codigo, String denominacion) {
		this.codigo=codigo;
		this.denominacion = denominacion;
		this.listaDePlatos=new ArrayList<Plato>();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public ArrayList<Plato> getListaDePlatos() {
		return listaDePlatos;
	}

	public void setListaDePlatos(ArrayList<Plato> listaDePlatos) {
		this.listaDePlatos = listaDePlatos;
	}
	
	public void addPlato(Plato p){
		listaDePlatos.add(p);
	}
	
	public void removePlato(Plato p){
		listaDePlatos.remove(p);
	}
	
	public float getPrecio(){
		float total=0;
		for(Plato p:listaDePlatos){
			total+=p.getPrecio();
		}
		return total;
	}
}
