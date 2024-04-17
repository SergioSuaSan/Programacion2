package electrodomestico;

public class Lavadora extends Electrodomestico {

	public static final int CARGA_POR_DEFECTO = 5;
	
	protected int carga;

	public Lavadora() {
		super();
		this.carga = CARGA_POR_DEFECTO;
	}
	public Lavadora(int carga) {
		super();
		this.carga = carga;
	}
	public Lavadora(float precioBase, Colores color, CategoriaEnergetica consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga=carga;
	}
	public Lavadora(float precioBase, int peso) {
		super(precioBase, peso);
		this.carga=CARGA_POR_DEFECTO;
	}

	public int getCarga() {
		return carga;
	}
	
	@Override
	public float precioFinal() {
		if (carga<=30) {
			return super.precioFinal();			
		} else {
			return super.precioFinal() + 50;						
		}
	}
	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
	
	
	
	
	
	
}
