package tienda;

import java.util.ArrayList;

public class Stock {
	
	//Atributos
	private ArrayList<Producto> productos;
	
	//Métodos
		//constructor
	
	public Stock(ArrayList<Producto> productos) {
		super();
		this.productos = productos;
	}

	public Stock() {
		super();
		this.productos = new ArrayList<Producto>();
	}
	
	//Aádir producto
	public void add(Producto producto) {
		this.productos.add(producto);
	}
	
	//Eliminar producto
	public boolean delete(Producto producto) {
		return this.productos.remove(producto);
	}
	//Buscar un producto usando un código
	public Producto getProducto(int codigo) {
		for (Producto producto : this.productos) {
			if (codigo==producto.getCodigo()) {
				return producto;
			}
		}
		return null;
	}
	
	//Obtener los productos agotados
	public ArrayList<Producto> getAgotados() {
		ArrayList<Producto> agotados = new ArrayList<Producto>();
		for (Producto producto : this.productos) {
			if (producto.getCantidad()==0) {
				agotados.add(producto);
			}
		}
		return agotados;
	}
	//Obtener los productos najo ínimos
	public ArrayList<Producto> getBajoMinimos() {
		ArrayList<Producto> bajoMinimo = new ArrayList<Producto>();
		for (Producto producto : this.productos) {
			if (producto.getCantidad()<producto.getMinimo()) {
				bajoMinimo.add(producto);
			}
		}
		return bajoMinimo;
	}

	@Override
	public String toString() {
		return "Stock [productos=" + productos + "]";
	}
	
	
	
	

}
