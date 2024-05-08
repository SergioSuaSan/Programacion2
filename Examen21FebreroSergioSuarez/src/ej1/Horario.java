package ej1;

import java.util.Arrays;

public class Horario {

	
	//Atributos
	public String[][] horario = new String[6][5];
	public String[] modulos = {"LM", "Inglés", "Prog", "BBDD", "FOL", "SISI", "ENDE"};
	public int [] horas = {1,2,3,4,5,6};
	public int [] dias = {1,2,3,4,5};

	
	//Constructor
	public Horario(String[][] horario) {
		super();
		this.horario = horario;
	}
	

	
	//Constructor vacío
	public Horario() {
		super();
		this.horario = new String[6][5];
	}


	//Getters y Setters
	public void setModulo(String modulo, int dia, int hora) {
		horario[dia][hora] = modulo;
	}


	public String getModulo( int dia, int hora) {
		return horario[dia][hora];
	}


	public String[][] getHorario() {
		return horario;
	}


	public void rellenar(String[] modulos, int[] horas) {
		for (int i = 0; i < modulos.length; i++) {
			for (int j = 0; j < horas.length; j++) {
				int diarandom = (int) (Math.random()*6);
				int horarandom = (int) (Math.random()*5);
				if (horario[diarandom][horarandom] == null) {
					setModulo(modulos[i] ,diarandom,horarandom);
				} else {
					//No me gusta mucho, pero la idea es que no aumente las horas hasta que haya puesto todos los módulos en algúna hora nula, antes de pasar
					//al siguiente
					j--;
				}
			}
		}
		
	}
	

	
	//Aquí podremos probar si funciona
	public static void main(String[] args) {

		String[] modulos= { "Prog", "BBDD", "FOL", "SISI"};
		int[] horas={10,10,8,2};
		Horario h=new Horario();
		h.rellenar(modulos,horas);
		
	
		
		
		
		
		
	
	}





	



	
	

}
