package entidades;

public class Productos {
	
	private String Codigo;
	private String nombre;
	private double precio;
	private String imagen;
	
	public Productos(String codigo, String nombre, double precio, String imagen) {
		super();
		Codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.imagen = imagen;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Productos [Codigo=" + Codigo + ", nombre=" + nombre + ", precio=" + precio + ", imagen=" + imagen + "]";
	}
	
	
	

}
