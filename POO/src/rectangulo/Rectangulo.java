package rectangulo;

public class Rectangulo {

	//Atributos
	private long ancho;
	private long alto;
	
	//Métodos
	
	//Constructores
	
	public Rectangulo() {
		super();
		this.alto = 10;
		this.ancho =20;
	}

	public Rectangulo(long ancho, long alto) {
		super();
		if (alto >0&&ancho>0) {
			this.ancho = ancho;
			this.alto = alto;			
		} else {
			this.alto = 10;
			this.ancho =20;
		}
	}

	
	//Getters and Setters
	public boolean positivo(long ancho) {
		if (ancho>= 0) {
			return true;
		} else {return false;}
	}
	
	public long getAncho() {
		return ancho;
	}
	
	public void setAncho(long ancho) {
		if (positivo(ancho)) {
			this.ancho = ancho;			
		}
	}
	
	public long getAlto() {
		return alto;
	}
	
	public void setAlto(long alto) {
		if (positivo(alto)) {
			this.alto = alto;			
		}
	}
	
	public long area() {
		return this.alto*this.ancho;
	}
	public long perimetro() {
		return (this.alto+this.ancho) * 2;
	}
	
	public boolean isVertical() {
		if (this.ancho>this.alto) {
			return false;
		} else {
			return true;
		}
	}
	public boolean isHorizontal() {
		if (this.ancho<this.alto) {
			return false;
		} else {
			return true;
		}
	}

	//ToString	
	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}
	
	
	public String dibujar() {
		String resultado = "";
		for (int i = 0; i < this.alto; i++) {
			for (int j = 0; j < this.ancho; j++) {
				 resultado += "* ";
			}
			resultado += "\n";
		}
		return resultado;
	}
	
	
	
	
	
	
	
	
	
	
}
