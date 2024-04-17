package tienda;

import java.util.ArrayList;

public class CajonFactura {

	//atributos
	private ArrayList<Factura>  facturas;

	
	//Métodos
	
	public CajonFactura(ArrayList<Factura> facturas) {
		super();
		this.facturas = facturas;
	}


	public ArrayList<Factura> getFacturas() {
		return facturas;
	}


	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}
	
	//Añadir factura
	public void add(Factura factura) {
		this.facturas.add(factura);
	}
	
	//Buscar una factura usando el nº de factura
	public Factura get (int numero) {
		for (Factura factura : facturas) {
			if (factura.getNumero() == numero) {
				return factura;
			}
		}
		return null;
	}
	
	//Obtener facturas pendientes de cobro
	public ArrayList<Factura> getFacturasPendientes () {
		ArrayList<Factura> pendientes = new ArrayList<Factura>();
		for (Factura factura : this.facturas) {
			if (!factura.isPagada()) {
				pendientes.add(factura);
			}
		}
		return pendientes;
	}


	@Override
	public String toString() {
		return "CajonFactura [facturas=" + facturas + "]";
	}
	
	

}
