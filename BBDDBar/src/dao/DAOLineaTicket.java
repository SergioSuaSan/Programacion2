package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.LineaTicket;

public class DAOLineaTicket {

	/*
	 * Gestor encargado de la tabla LineaTicket
	 * Debería saber hacer un INSERT, UPDATE, DELETE, SELECT
	 * Transformará los objetos en sentencias SQL y viceversa
	 */
	
	
	public DAOLineaTicket() {
		//Nada, constructor vacío
	}
	
	//Método para guardar un objeto en la tabla
	public void add(LineaTicket c) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
//			//Preparamos el objeto Sentencia(Statement)
//			Statement sentencia = conexion.createStatement();		
//			//Preparamos el instert
//			String sql = "INSERT INTO LineaTicket VALUES(' " +c.getNombre()+ " ' , "+c.getTelefono() + ")";
//			sentencia.executeUpdate(sql);
//			//Cerrar conexión
//			conexion.close();
			
			//De otra manera, usando un PreparedStatement
			String sql = "INSERT INTO LineaTicket VALUES (?,?, ?)";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setInt(3, c.getCantidad());
			sentencia.setInt(1, c.getNumeroTicket());
			sentencia.setString(2, c.getCodigoProducto());
		
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
	public void update(LineaTicket c) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "UPDATE LineaTicket SET Cantidad = ? WHERE CodigoProducto = ? And numeroTicket = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setInt(1, c.getCantidad());
			sentencia.setString(2, c.getCodigoProducto());
			sentencia.setInt(3, c.getNumeroTicket());
			//Ejecuto
			sentencia.executeUpdate();
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el LineaTicket");
			e.printStackTrace();
		}
	}

	//Método para eliminar un objeto en la tabla
	public void remove(LineaTicket c) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {

			//De otra manera, usando un PreparedStatement
			String sql = "DELETE from LineaTicket where CodigoProducto = ? and NumeroTicket = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			
			sentencia.setString(1, c.getCodigoProducto());
			sentencia.setInt(2, c.getNumeroTicket());
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
	public ArrayList<LineaTicket> get() {
		ArrayList<LineaTicket> lista = new ArrayList<LineaTicket>();
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM LineaTicket";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
//				new LineaTicket(resultado.getString("nombre"), resultado.getLong("telefono"));
				lista.add(new LineaTicket(resultado.getInt("NumeroTicket"), resultado.getString("CodigoProducto"),resultado.getInt("Cantidad")));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el LineaTicket");
			e.printStackTrace();
		}
		
		
		
		return lista;
	}
	
	//Método para obtener todos los objetos de la tabla
	public ArrayList<LineaTicket> get(int Ticket) {
		ArrayList<LineaTicket> lista = new ArrayList<LineaTicket>();
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM LineaTicket where numeroticket = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setInt(1, Ticket);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
//				new LineaTicket(resultado.getString("nombre"), resultado.getLong("telefono"));
				lista.add(new LineaTicket(resultado.getInt("NumeroTicket"), resultado.getString("CodigoProducto"),resultado.getInt("Cantidad")));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el LineaTicket");
			e.printStackTrace();
		}
		
		
		
		return lista;
	}
	
	
	
	//Método para obtener un objeto concreto de la tabla dado su nombre
	public LineaTicket get(int numeroTicket, String codigoProducto) {
		//Variable LineaTicket
		LineaTicket c = null;
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM LineaTicket WHERE numeroTicket = ? and codigoProducto  ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setInt(1, numeroTicket); 
			sentencia.setString(2, codigoProducto); 
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				c = new LineaTicket(resultado.getInt(1),resultado.getString(2),resultado.getInt("Cantidad"));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el LineaTicket");
			e.printStackTrace();
		}
		
	
	return c;
}

	/*

	//Método para obtener un objeto concreto de la tabla dado su nombre
	public LineaTicket get(long idProducto) {
		//Variable LineaTicket
		LineaTicket c = null;
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM LineaTicket WHERE idLineaTicket = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setLong(1, idProducto);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				c = new LineaTicket(resultado.getLong("idLineaTicket"),resultado.getString("nombreLineaTicket"));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el LineaTicket");
			e.printStackTrace();
		}
		
		
		
		return c;
	}
	*/
	
}
