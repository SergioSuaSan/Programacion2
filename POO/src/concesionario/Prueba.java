package concesionario;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche c1 = new Coche("BMW", "X3", 25000, "Rojo", 2500, "Gasolina", 5);
		Coche c2 = new Coche("Peugeot", "207", 30000, "Gris", 1000, "Diesel", 5);
		
		Moto  m1 = new Moto("Ducati", "Nose"	, 27000, "Azul", 500, "Gasoil", "Fea");
		
		Bicicleta b1 = new Bicicleta("Alpina", "CBCX", 2000, "Roho", 65, "Calle");
		
		
		
		
		ArrayList<Vehiculo> Algo = new ArrayList<Vehiculo>();
		Algo.add(m1);
		Algo.add(c1);
		Algo.add(c2);
		Algo.add(b1);
		
		System.out.println(Algo);
		
		System.out.println("Precio total de la lista: " +  precioTotal(Algo));
		System.out.println(cuantosDeGasolina(Algo));
		

	}
	
	
	public static int precioTotal(ArrayList<Vehiculo> lista) {
		int total = 0;
		for (Vehiculo vehiculo : lista) {
			total += vehiculo.getPrecio();
		}
		return total;
	}
	public static int cuantosDeGasolina(ArrayList<Vehiculo> lista	) {
		int contador = 0;
		for (Vehiculo vehiculo : lista) {
			if (vehiculo instanceof VehiculosConMotor) {
			if (((VehiculosConMotor) vehiculo).getCombustible().equals("Gasolina")) {
				contador++;
			}
			}
		}
		return contador;
	}

}
