package entidades;

public class Producto {

	private int idProducto;
	private String nomProducto;
	private int idGrupo;
	private double precio;
	
	public Producto(int idProducto, String nombre, int idGrupo, double precio) {
		super();
		this.idProducto = idProducto;
		this.nomProducto = nombre;
		this.idGrupo = idGrupo;
		this.precio = precio;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nomProducto;
	}

	public void setNombre(String nombre) {
		this.nomProducto = nombre;
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nomProducto + ", idGrupo=" + idGrupo + ", precio="
				+ precio + "]";
	}
	
	
	
	
	
}
