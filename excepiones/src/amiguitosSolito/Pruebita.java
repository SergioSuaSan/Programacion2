package amiguitosSolito;


public class Pruebita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Pandilla p = new Pandilla(1);
		
		Amigo a1 = new Amigo("Javi", "Coé");
		Amigo a2 = new Amigo("Javis", "Coé");
		Amigo a3 = new Amigo("Javi3", "Coé");
				
				

		try {
			p.add(a2);
		} catch (PandillaCompletaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (NoMeGustaTuNombreException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	
		System.out.println(p);
		
	}

}
