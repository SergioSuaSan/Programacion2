package empresa;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c = new Cliente("12345678A", "Javieh", 678678678, 1);
		Empleado e = new Empleado("23456789B", "Pepe", 670234567, 1400);
		Jefe j = new Jefe("11122233C", "Jefe", 681681681, 2000, "1234AAA");
		System.out.println(c);
		System.out.println(e);
		System.out.println(j);
		System.out.println();
		
		ArrayList<Persona> gente = new ArrayList<Persona>();
		gente.add(e);
		gente.add(c);
		gente.add(j);
		
		for (Persona persona : gente) {
			System.out.println(persona);
		}

//		Persona p = new Persona("654654654", "Marta", 654654654); //No se puede crear un ainstancia.
		
		
	}

}
