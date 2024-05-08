package aprobados;

import java.util.Arrays;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Creamos el array
		int[] datos = new int[10];
		
		//Rellenamos aleatoreamente
		for (int i = 0; i < datos.length; i++) {
			datos[i] = (int) (Math.random()*99+1);
		}

		System.out.println(Arrays.toString(datos));
		
		//Calculamos el centro de masas
		int posicion = 0, diferencia = Integer.MAX_VALUE, difmin =Integer.MAX_VALUE, suma1 = 0, suma2 = 0;
		
		//Hacemos un for que pase por todos los valores exceptuando el 0 y el último
		
		for (int i = 1; i < datos.length -1; i++) {
			//Hacemos las sumas
			for (int j = 0; j < i; j++) {
				suma1+= datos[j];
			}
	
			for (int j = datos.length-1; j > i; j--) {
				suma2+= datos[j];
			}
			
			//Restamos el menos al mayor
			if (suma1>suma2) {
				diferencia = suma1-suma2;
			} else {
				diferencia = suma2-suma1;				
			}
			
			//Comprobamos si la diferencia es menor, y si es así, escribimos su posición
			if (diferencia<difmin) {
				difmin = diferencia;
				posicion = i;
			}	
			
			//Reiniciamos las variables de las sumas, las otras NO
			suma1 = 0; suma2 = 0;
		}
		System.out.println("El centro de masas está en la posición " + posicion + ", con una diferencia de " + difmin);
		
		
	}

}
