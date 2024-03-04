package grupoAmigos;

public class Prueba {

	public static void main(String[] args) throws PandillaCompletaException, NoMeGustaTuNombreException {
		
		Pandilla p = new Pandilla(1);
		
		Amigo a1 = new Amigo("Javi", "Coé");
		Amigo a2 = new Amigo("Javis", "Coé");
		Amigo a3 = new Amigo("Javi3", "Coé");
				
				

		p.add(a2);
		System.out.println(p);


	}

}
