package hotel;


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GestorArchivoHabitaciones
{
	private  File archivoHabitaciones=new File("habitaciones.obj");


	public GestorArchivoHabitaciones() 
	{	
		if(!archivoHabitaciones.exists()){
			try {
				new ObjectInputStream(new FileInputStream(archivoHabitaciones)).close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

//	public ArrayList<Habitacion> get(){
//		
//	}
//
//	public ArrayList<Habitacion> getHabitacionesLibres(){
//		
//	}

	public void desalojar(int numero){
		
	}

	public void alojar(int numero,String dni){
		
		
	}

	public void setDisponible(int numero,boolean estado){
		

	}
}
