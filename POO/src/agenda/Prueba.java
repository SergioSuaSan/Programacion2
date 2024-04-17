package agenda;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contacto javier = new Contacto("javier", 670375735);
		System.out.println(javier);
		
		
		AgendaConArray agenda1 = new AgendaConArray();
		AgendaConArray agenda2 = new AgendaConArray(42);
		AgendaConArray agenda3 = new AgendaConArray(agenda2.getContactos());
		
		Agenda agenda = new Agenda();
		agenda.add(javier);
		agenda.add(new Contacto("Carlos", 383727384));
		agenda.add(new Contacto("Laura", 542327384));
		
		System.out.println(agenda);
		agenda.delete("Carlos");
		System.out.println(agenda);
		agenda.update("Laura", "Laurita");
		System.out.println(agenda);
	}
	

}
