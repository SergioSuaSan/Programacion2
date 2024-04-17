package electrodomestico;

public class Televisor extends Electrodomestico {


	public static final int RESOLUCION_POR_DEFECTO = 20;
	public static final boolean SMARTTV_POR_DEFECTO = false;
	
	protected int resolucion;
	protected boolean smartTv;
	
	
	
	public Televisor() {
		super();
		this.resolucion=RESOLUCION_POR_DEFECTO;
		this.smartTv=SMARTTV_POR_DEFECTO;
		// TODO Auto-generated constructor stub
	}
	public Televisor(float precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion=RESOLUCION_POR_DEFECTO;
		this.smartTv=SMARTTV_POR_DEFECTO;
		// TODO Auto-generated constructor stub
	}
	
	public Televisor(float precioBase, Colores color, CategoriaEnergetica consumoEnergetico, int peso, int resolucion,
			boolean smartTv) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.smartTv = smartTv;
	}
	public int getResolucion() {
		return resolucion;
	}
	public boolean isSmartTv() {
		return smartTv;
	}
//	@Override
//	public float precioFinal() {
//		if (resolucion<=40&&!smartTv) {
//			return super.precioFinal();			
//		} else if (resolucion>40 &&!smartTv) {
//			return super.precioFinal() *1.3F;									
//		} else if (smartTv&&resolucion<=40) {
//			return super.precioFinal() + 50;									
//		}else {
//			return super.precioFinal() *1.3F + 50;						
//		}
//	}

	@Override
	public float precioFinal() {
		float total= super.precioFinal();			
		if (resolucion>40) {
			total += 1.3F;
		}
		if (smartTv) {
			total +=50;
		}
			return total;						
		
	}
	
	
	
	
	
	
	

	
	
	
	
}
