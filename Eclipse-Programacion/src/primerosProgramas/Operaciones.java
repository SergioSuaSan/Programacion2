package primerosProgramas;

public class Operaciones {

	public static void main(String[] args) {
		/*
		 * Probando operadores
		 */
		
		int a = 7, b = 5;
		
		System.out.println( "Suma: " + a+b ); 
		System.out.println( "Resta: " + (a-b) ); 
		System.out.println( "División:  " + a/b ); 
		System.out.println( "Resto: " + a%b ); 
		
		//operador incremento
		a++;
		++a;
		System.out.println( a );
		
		//Operador decremento
		b--;
		System.out.println( b );
		
		b = a + b++ + a++;    //No recomendado PARA NADA
		
		
		System.out.println (a != b);
		
		
		//Operadores relacionales y condicionales
		
		boolean hayToner, hayPapel, resultado;
		
		
		hayPapel = true;
		hayToner = false;
		
		resultado = hayToner && hayPapel;
		
		System.out.println( "Podemos imprimir: " +  resultado); 
		
		
		boolean familiaNumerosa, bajosIngresos, beca;
		
		familiaNumerosa = true;
		bajosIngresos = false;
		
		beca = familiaNumerosa || bajosIngresos;
		
		System.out.println( "Beca: " + beca ); 
		
		
		
		
		
		
		

	}

}
