package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Ticket;

public class DAOTicket {

	/*
	 * Gestor encargado de la tabla Ticket
	 * Debería saber hacer un INSERT, UPDATE, DELETE, SELECT
	 * Transformará los objetos en sentencias SQL y viceversa
	 */
	
	
	public DAOTicket() {
		//Nada, constructor vacío
	}
	
	//Método para guardar un objeto en la tabla
	public void add(Ticket c) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
//			//Preparamos el objeto Sentencia(Statement)
//			Statement sentencia = conexion.createStatement();		
//			//Preparamos el instert
//			String sql = "INSERT INTO Ticket VALUES(' " +c.getNombre()+ " ' , "+c.getTelefono() + ")";
//			sentencia.executeUpdate(sql);
//			//Cerrar conexión
//			conexion.close();
			
			//De otra manera, usando un PreparedStatement
			String sql = "INSERT INTO Ticket VALUES (?,?)";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setInt(1, c.getNumero());
			sentencia.setDate(2, c.getFecha());
			//Ejecuto
			sentencia.executeUpdate();
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//Método para actuaizar un objeto en la tabla
	public void update(Ticket c) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "UPDATE Ticket SET Fecha = ? WHERE Numero = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setInt(2, c.getNumero());
			sentencia.setDate(1, c.getFecha());
			//Ejecuto
			sentencia.executeUpdate();
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Ticket");
			e.printStackTrace();
		}
	}

	//Método para eliminar un objeto en la tabla
	public void remove(Ticket c) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {

			//De otra manera, usando un PreparedStatement
			String sql = "DELETE from Ticket where numero = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setLong(1, c.getNumero());
			//Ejecuto
			sentencia.executeUpdate();
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//Método para obtener todos los objetos de la tabla
	public ArrayList<Ticket> get() {
		ArrayList<Ticket> lista = new ArrayList<Ticket>();
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Ticket ORDER BY idTicket";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
//				new Ticket(resultado.getString("nombre"), resultado.getLong("telefono"));
				lista.add(new Ticket(resultado.getInt("Numero"), resultado.getDate("Fecha")));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Ticket");
			e.printStackTrace();
		}
		
		
		
		return lista;
	}
	
	/*
	//Método para obtener un objeto concreto de la tabla dado su nombre
	public Ticket get(String idProducto) {
		//Variable Ticket
		Ticket c = null;
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Ticket WHERE nombreTicket = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1, idProducto);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				c = new Ticket(resultado.getInt("Numero"), resultado.getDate("Fecha"));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Ticket");
			e.printStackTrace();
		}
		
	
	return c;
}


	//Método para obtener un objeto concreto de la tabla dado su nombre
	public Ticket get(long idProducto) {
		//Variable Ticket
		Ticket c = null;
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Ticket WHERE idTicket = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setLong(1, idProducto);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				c = new Ticket(resultado.getInt("Numero"), resultado.getDate("Fecha"));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Ticket");
			e.printStackTrace();
		}
		
		
		
		return c;
	}
	*/
	
}
