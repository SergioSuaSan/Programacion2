package ui;

import dao.DAOContactos;
import entidades.Contacto;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAOContactos daoContactos = new DAOContactos();
//		daoContactos.add(new Contacto("Sandra", 654987654L));
		daoContactos.add(new Contacto("Carlos", 343534543L));
//		daoContactos.update(new Contacto("Carlos", 111111111L));
		System.out.println(daoContactos.get());
		System.out.println(daoContactos.get("Carlos"));
		daoContactos.remove(daoContactos.get("Carlos"));
		System.out.println(daoContactos.get());
	}

}
