package tienda;

public class LineaFactura {

	private int codigo;
	private float precio;
	private int cantidad;
	
	public LineaFactura(int codigo, float precio, int cantidad) {
		super();
		this.codigo = codigo;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public LineaFactura(int codigo, float precio) {
		super();
		this.codigo = codigo;
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "LineaFactura [codigo=" + codigo + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	

}
