package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Productos;

public class DAOProductos {

	public DAOProductos() {
		//Constructor vacío
	}

	//Método para guardar un objeto en la tabla
	public void add(Productos h) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			//De otra manera, usando un PreparedStatement
			String sql = "INSERT INTO Productos VALUES (?,?,?,?)";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setString(1, h.getCodigo());
			sentencia.setString(2, h.getNombre());
			sentencia.setDouble(3, h.getPrecio());
			sentencia.setString(4, h.getImagen());
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
	public void update(Productos h) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "UPDATE Productos SET Nombre = ?, precio = ?, imagen = ? WHERE Codigo = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setString(4, h.getCodigo());
			sentencia.setString(1, h.getNombre());
			sentencia.setDouble(2, h.getPrecio());
			sentencia.setString(3, h.getImagen());
			//Ejecuto
			sentencia.executeUpdate();
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Productos");
			e.printStackTrace();
		}
	}
	
	
	//Método para eliminar un objeto en la tabla
	public void remove(Productos h) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			//De otra manera, usando un PreparedStatement
			String sql = "DELETE from Productos where Codigo = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setString(1, h.getCodigo());
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
	public ArrayList<Productos> get() {
		ArrayList<Productos> lista = new ArrayList<Productos>();
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Productos";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
	//			new Productos(resultado.getString("nombre"), resultado.getString("email"), resultado.getInt("edad"), resultado.getString("poblacion"));
				lista.add( new Productos(resultado.getString(1), resultado.getString(2), resultado.getDouble(3), resultado.getString(4)));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Productos");
			e.printStackTrace();
		}
		
		
		
		return lista;
	}
	
	
	//Método para obtener un objeto concreto de la tabla dado su nombre	
	public Productos get(int idProductos) {
		//Variable Productos
		Productos h = null;
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Productos WHERE CodigoProductos = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setInt(1, idProductos);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				h = new Productos(resultado.getString(1), resultado.getString(2), resultado.getDouble(3), resultado.getString(4));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Productos");
			e.printStackTrace();
		}
		
		
		
		return h;
	}
	
	/*
	//Método para obtener todos los objetos de la tabla
	public ArrayList<Productos> getProductosPorGrupo(String Nombre) {
		ArrayList<Productos> lista = new ArrayList<Productos>();
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Productos where idGrupo = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1, Nombre);
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
	//			new Productos(resultado.getString("nombre"), resultado.getString("email"), resultado.getInt("edad"), resultado.getString("poblacion"));
				lista.add(resultado.getInt("idProductos"), resultado.getString("nomProductos"), resultado.getInt("idGrupo"), resultado.getDouble("Precio"));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Productos");
			e.printStackTrace();
		}
		
		
		
		return lista;
	}

*/
	
	
	
}
