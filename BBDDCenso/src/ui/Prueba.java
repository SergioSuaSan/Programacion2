package ui;

import dao.DAOHabitantes;
import dao.DAOPoblacion;

public class Prueba {

	public static void main(String[] args) {
		DAOHabitantes daoHabitantes = new DAOHabitantes();
		DAOPoblacion daoPoblacion = new DAOPoblacion();
		
		System.out.println(daoHabitantes.get());
		System.out.println(daoHabitantes.getHabitantesPorPoblacion("Madrid"));
		System.out.println(daoPoblacion.get());

	}

}
