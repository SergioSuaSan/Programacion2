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

public class GestorArchivoClientes {

	private  File archivoClientes=new File("clientes.obj");
	
	public GestorArchivoClientes(){	
		if(!archivoClientes.exists()){
			try {
				new ObjectInputStream(new FileInputStream(archivoClientes)).close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	public void add(Cliente c){
		
	}


//	public Cliente get(String dni){
//		return null;
//	}
//
//	
//	public ArrayList<Cliente> get(){
//		return null;
//	{
		
}
