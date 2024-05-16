package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.DBConnection;

import entidades.Producto;

public class DAOProductos {

	public DAOProductos() {
		//Constructor vacío
	}

	//Método para guardar un objeto en la tabla
	public void add(Producto h) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			//De otra manera, usando un PreparedStatement
			String sql = "INSERT INTO Productos VALUES (?,?,?,?)";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setInt(1, h.getIdProducto());
			sentencia.setString(2, h.getNombre());
			sentencia.setLong(3, h.getIdGrupo());
			sentencia.setDouble(4, h.getPrecio());
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
	public void update(Producto h) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "UPDATE Productos SET nomProducto = ?, idgrupo = ?, precio = ? WHERE idproducto = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setInt(4, h.getIdProducto());
			sentencia.setString(1, h.getNombre());
			sentencia.setLong(2, h.getIdGrupo());
			sentencia.setDouble(3, h.getPrecio());
			//Ejecuto
			sentencia.executeUpdate();
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Producto");
			e.printStackTrace();
		}
	}
	
	
	//Método para eliminar un objeto en la tabla
	public void remove(Producto h) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			//De otra manera, usando un PreparedStatement
			String sql = "DELETE from Productos where idProducto = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setInt(1, h.getIdProducto());
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
	public ArrayList<Producto> get() {
		ArrayList<Producto> lista = new ArrayList<Producto>();
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
	//			new Producto(resultado.getString("nombre"), resultado.getString("email"), resultado.getInt("edad"), resultado.getString("poblacion"));
				lista.add(new Producto(resultado.getInt("idProducto"), resultado.getString("nomProducto"), resultado.getInt("idGrupo"), resultado.getDouble("Precio")));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Producto");
			e.printStackTrace();
		}
		
		
		
		return lista;
	}
	
	
	//Método para obtener un objeto concreto de la tabla dado su nombre	
	public Producto get(int idProducto) {
		//Variable Producto
		Producto h = null;
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Productos WHERE idProducto = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setInt(1, idProducto);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				h = new Producto(resultado.getInt("idProducto"), resultado.getString("nomProducto"), resultado.getInt("idGrupo"), resultado.getDouble("Precio"));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Producto");
			e.printStackTrace();
		}
		
		
		
		return h;
	}
	
	/*
	//Método para obtener todos los objetos de la tabla
	public ArrayList<Producto> getProductosPorGrupo(String Nombre) {
		ArrayList<Producto> lista = new ArrayList<Producto>();
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
	//			new Producto(resultado.getString("nombre"), resultado.getString("email"), resultado.getInt("edad"), resultado.getString("poblacion"));
				lista.add(resultado.getInt("idProducto"), resultado.getString("nomProducto"), resultado.getInt("idGrupo"), resultado.getDouble("Precio"));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Producto");
			e.printStackTrace();
		}
		
		
		
		return lista;
	}

*/
	
	
	
}
