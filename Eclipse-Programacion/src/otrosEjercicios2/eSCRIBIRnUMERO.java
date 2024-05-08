package otrosEjercicios2;

import java.util.Scanner;

public class eSCRIBIRnUMERO {

	public static void main(String[] args) {



		int numero, unidades, decenas;
		String numes;
		String deces, unies;

		Scanner teclado = new Scanner (System.in);
		System.out.println("Teclea numero del 0 al 99: ");
		numero = teclado.nextInt();
		teclado.close();

		if (numero > 9 && numero < 21 || numero == 20 || numero == 30 || numero == 40 || numero == 50 || numero == 60
				|| numero == 70 || numero == 80 || numero == 90) {
			switch (numero) {
			case 10: numes ="diez"; break;
			case 11: numes ="once"; break;
			case 12: numes ="doce"; break;
			case 13: numes ="trece"; break;
			case 14: numes ="catorce"; break;
			case 15: numes ="quince"; break;
			case 16: numes ="dieciseis"; break;
			case 17: numes ="diecisiete"; break;
			case 18: numes ="dieciocho"; break;
			case 19: numes ="diecinueve"; break;
			case 20: numes = "veinte"; break;
			case 30: numes = "treinta"; break;
			case 40: numes = "cuarenta"; break;
			case 50: numes = "cincuenta"; break;
			case 60: numes = "sesenta"; break;
			case 70: numes = "setenta"; break;
			case 80: numes = "ochenta"; break;
			case 90: numes = "noventa"; break;
			default: numes = ""; break;
			}
			System.out.println(numes);
		} else {


			unidades= numero%10;
			decenas = numero/10;


			switch (unidades) {
			case 1: unies ="uno"; break;
			case 2: unies ="dos"; break;
			case 3: unies ="tres"; break;
			case 4: unies ="cuatro"; break;
			case 5: unies ="cinco"; break;
			case 6: unies ="seis"; break;
			case 7: unies ="siete"; break;
			case 8: unies ="ocho"; break;
			case 9: unies ="nueve"; break;
			default: unies =""; break;
			}

			switch (decenas) {
			case 2: deces = "veinti"; break;
			case 3: deces = "treinta y "; break;
			case 4: deces = "cuarenta y "; break;
			case 5: deces = "cincuenta y "; break;
			case 6: deces = "sesenta y "; break;
			case 7: deces = "setenta y "; break;
			case 8: deces = "ochenta y "; break;
			case 9: deces = "noventa y "; break;
			default: deces = ""; break;
			}

			System.out.println(deces + unies);

		}

	}

}
