package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.DBConnection;

import entidades.Habitante;

public class DAOHabitantes {

	public DAOHabitantes() {
		//Constructor vacío
	}

	//Método para guardar un objeto en la tabla
	public void add(Habitante h) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			//De otra manera, usando un PreparedStatement
			String sql = "INSERT INTO Habitante VALUES (?,?,?,?)";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setString(1, h.getNombre());
			sentencia.setString(2, h.getEmail());
			sentencia.setInt(3, h.getEdad());
			sentencia.setString(4, h.getPoblacion());
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
	public void update(Habitante h) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "UPDATE Habitante SET edad = ?, email = ? WHERE nombre = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setString(3, h.getNombre());
			sentencia.setString(2, h.getEmail());
			sentencia.setInt(1, h.getEdad());
			//Ejecuto
			sentencia.executeUpdate();
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Habitante");
			e.printStackTrace();
		}
	}
	
	
	//Método para eliminar un objeto en la tabla
	public void remove(Habitante h) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
//			//Preparamos el objeto Sentencia(Statement)
//			Statement sentencia = conexion.createStatement();		
//			//Preparamos el instert
//			String sql = "INSERT INTO Habitantes VALUES(' " +c.getNombre()+ " ' , "+c.getTelefono() + ")";
//			sentencia.executeUpdate(sql);
//			//Cerrar conexión
//			conexion.close();
			
			//De otra manera, usando un PreparedStatement
			String sql = "DELETE from Habitante where nombre = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setString(1, h.getNombre());
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
	public ArrayList<Habitante> get() {
		ArrayList<Habitante> lista = new ArrayList<Habitante>();
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Habitante";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
	//			new Habitante(resultado.getString("nombre"), resultado.getString("email"), resultado.getInt("edad"), resultado.getString("poblacion"));
				lista.add(new Habitante(resultado.getString("nombre"), resultado.getString("email"), resultado.getInt("edad"), resultado.getString("poblacion")));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Habitante");
			e.printStackTrace();
		}
		
		
		
		return lista;
	}
	
	
	//Método para obtener un objeto concreto de la tabla dado su nombre	
	public Habitante get(String nombre) {
		//Variable Habitante
		Habitante h = null;
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Habitante WHERE nombre = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1, nombre);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				h = new Habitante(resultado.getString("nombre"), resultado.getString("email"), resultado.getInt("edad"), resultado.getString("poblacion"));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Habitante");
			e.printStackTrace();
		}
		
		
		
		return h;
	}
	
	
	//Método para obtener todos los objetos de la tabla
	public ArrayList<Habitante> getHabitantesPorPoblacion(String Nombre) {
		ArrayList<Habitante> lista = new ArrayList<Habitante>();
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Habitante where poblacion = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1, Nombre);
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
	//			new Habitante(resultado.getString("nombre"), resultado.getString("email"), resultado.getInt("edad"), resultado.getString("poblacion"));
				lista.add(new Habitante(resultado.getString("nombre"), resultado.getString("email"), resultado.getInt("edad"), resultado.getString("poblacion")));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Habitante");
			e.printStackTrace();
		}
		
		
		
		return lista;
	}
	
	
	
}
