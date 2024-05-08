package ej3;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pasivo p = new Pasivo();
		
		PrestamoFijo pf = new PrestamoFijo("Pepe", 1000, 2, 2.5);
		PrestamoFijo pf2 = new PrestamoFijo("JAVIER", 12000, 5, 1.5);
		
		PrestamoVariable pv = new PrestamoVariable("Julio", 15000, 4, 2.2, 0.75, 4);
		PrestamoVariable pv2 = new PrestamoVariable("Julia", 5000, 2, 3.1, 0.5, 4);
		
		
		p.addPrestamo(pv2);
		p.addPrestamo(pv);
		p.addPrestamo(pf2);
		p.addPrestamo(pf);
		System.out.println(p);
		
		System.out.println(pf.cuota());
		System.out.println(pf2.cuota());
		System.out.println(pv.cuota());
		System.out.println(pv2.cuota());
		
		System.out.println();
		System.out.println(p.getPrestamoFijos());
		System.out.println(p.getPrestamosVariables());
		
		
		
		
		
		
		
		
		
		
		
	}

}
