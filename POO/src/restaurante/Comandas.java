package restaurante;

import java.util.ArrayList;

public class Comandas {

	private int mesa;
	private int comensales;
	private ArrayList<Platos> listaPlatos;
	public Comandas(int mesa, int comensales, ArrayList<Platos> listaPlatos) {
		super();
		this.mesa = mesa;
		this.comensales = comensales;
		this.listaPlatos = listaPlatos;
	}
	public Comandas(int mesa, int comensales) {
		super();
		this.mesa = mesa;
		this.comensales = comensales;
		this.listaPlatos = new ArrayList<Platos>();
	}
	public int getMesa() {
		return mesa;
	}
	public void setMesa(int mesa) {
		this.mesa = mesa;
	}
	public int getComensales() {
		return comensales;
	}
	public void setComensales(int comensales) {
		this.comensales = comensales;
	}
	public ArrayList<Platos> getListaPlatos() {
		return listaPlatos;
	}
	public void setListaPlatos(ArrayList<Platos> listaPlatos) {
		this.listaPlatos = listaPlatos;
	}
	
	
	public void add(Platos plato	) {
		 listaPlatos.add(plato);
	}
	public void delete(Platos plato	) {
		listaPlatos.remove(plato);
	}
	
	public float Coste() {
		float total= 0;
		for (Platos plato : listaPlatos) {
			total += plato.getPrecio();
			
		}
		return total;
	}
	public boolean hayDiabeticos() {
		for (Platos  plato : listaPlatos) {
			if (plato instanceof Postres && !((Postres) plato).isTieneAzucar() ) {
				return true;
			}
		}
		return false;
	}


	
	
	@Override
	public String toString() {
		return "Comandas [mesa=" + mesa + ", comensales=" + comensales + ", listaPlatos=" + listaPlatos + "]";
	}
	
	
	
	

	
	
	

	
	
}
