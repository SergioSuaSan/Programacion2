 package recup_15Abril_SergioSuarez;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] sopa = {  {"A","N","Z","E","T"},
							  {"D","F","R","M","A"},
							  {"R","A","U","C","F"},
							  {"I","S","T","O","E"},
							  {"O","C","A","S","A"}   };
		
    	buscaPalabra(sopa, "CASA");
		buscaPalabra(sopa, "RAFU");
		buscaPalabra(sopa, "RUTA");
		
		
		
		
	}
	
	 public static void buscaPalabra(String[][] sopa, String string)  {
		String linea = "";
		int posicionfila = -1;
		int posicioncolumna= -1;
		 for (int i = 0; i < sopa.length; i++) {
			for (int j = 0; j < sopa.length; j++) {
				linea = linea.concat(sopa[i][j]);		
			}
			if (linea.indexOf(string)!= -1) {
				posicionfila = i;
			} 
			linea = "";
		}
		 for (int j = 0; j < sopa[0].length; j++) {
			 for (int i = 0; i < sopa.length; i++) {
				 linea = linea.concat(sopa[i][j]);		
			 }
			 if (linea.indexOf(string)!= -1) {
				 posicioncolumna = j;
			 } 
			 linea = "";
		 }
		 if (posicionfila == -1&&posicioncolumna==-1) {
			System.out.println("NE");
		} else  if (posicionfila !=-1){
			System.out.println("F" + posicionfila);			
		} else {
			System.out.println("C" + posicioncolumna);						
		}
	 }
	

}
