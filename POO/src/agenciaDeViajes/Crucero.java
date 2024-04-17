package agenciaDeViajes;

import java.time.LocalDate;
import java.util.ArrayList;

public class Crucero {
	private int codigo;
	private String nombreComercial;
	private String nombreBarco;
	private LocalDate fechaPartida;
	private LocalDate fechaRegreso;
	private ArrayList<Escala> listaEscalas;
	

	
	public Crucero(int codigo, String nombreComercial, String nombreBarco, LocalDate fechaPartida,
			LocalDate fechaRegreso, ArrayList<Escala> listaEscalas) {
		super();
		this.codigo = codigo;
		this.nombreComercial = nombreComercial;
		this.nombreBarco = nombreBarco;
		this.fechaPartida = fechaPartida;
		this.fechaRegreso = fechaRegreso;
		this.listaEscalas = listaEscalas;
	}


	public Crucero(int codigo, String nombreComercial, String nombreBarco, LocalDate fechaPartida,
			LocalDate fechaRegreso) {
		super();
		this.codigo = codigo;
		this.nombreComercial = nombreComercial;
		this.nombreBarco = nombreBarco;
		this.fechaPartida = fechaPartida;
		this.fechaRegreso = fechaRegreso;
		this.listaEscalas = new ArrayList<Escala>();
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getNombreBarco() {
		return nombreBarco;
	}

	public void setNombreBarco(String nombreBarco) {
		this.nombreBarco = nombreBarco;
	}

	public LocalDate getFechaPartida() {
		return fechaPartida;
	}

	public void setFechaPartida(LocalDate fechaPartida) {
		this.fechaPartida = fechaPartida;
	}

	public LocalDate getFechaRegreso() {
		return fechaRegreso;
	}

	public void setFechaRegreso(LocalDate fechaRegreso) {
		this.fechaRegreso = fechaRegreso;
	}

	public ArrayList<Escala> getEscalas() {
		return listaEscalas;
	}

	public void setEscalas(ArrayList<Escala> escalas) {
		listaEscalas = escalas;
	}

	@Override
	public String toString() {
		return "Crucero [\ncodigo=" + codigo + ", \nnombreComercial=" + nombreComercial + ", \nnombreBarco=" + nombreBarco
				+ ", \nfechaPartida=" + fechaPartida + ", \nfechaRegreso=" + fechaRegreso + ", \nEscalas=" + listaEscalas + "\n]";
	}
	
	
	//Coste
	public void coste() {
		int total=600;
		for (Escala escala : listaEscalas) {
			if (escala instanceof EscalaCultural) {
				total +=100 + ((EscalaCultural)escala).getPrecioGuia();
			} else {
				total +=100;
			}
		}
		System.out.println("Coste total = " +total + "€");
	}
	
	
	//Añadir una escala
	public void add(Escala e) {
		this.listaEscalas.add(e);
	}
	
	//Borrar una escala
	public void remove(Escala e) {
		this.listaEscalas.remove(e);
	}
	
	
	
	
}
