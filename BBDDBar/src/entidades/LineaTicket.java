package entidades;

public class LineaTicket {
	private int numeroTicket;
	private String CodigoProducto;
	private int cantidad;
	
	public LineaTicket(int numeroTicket, String codigoProducto, int cantidad) {
		super();
		this.numeroTicket = numeroTicket;
		CodigoProducto = codigoProducto;
		this.cantidad = cantidad;
	}

	public int getNumeroTicket() {
		return numeroTicket;
	}

	public void setNumeroTicket(int numeroTicket) {
		this.numeroTicket = numeroTicket;
	}

	public String getCodigoProducto() {
		return CodigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		CodigoProducto = codigoProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "LineaTicket [numeroTicket=" + numeroTicket + ", CodigoProducto=" + CodigoProducto + ", cantidad="
				+ cantidad + "]";
	}
	
	

}
