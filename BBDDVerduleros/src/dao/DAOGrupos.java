package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Grupo;

public class DAOGrupos {

	/*
	 * Gestor encargado de la tabla Grupos
	 * Debería saber hacer un INSERT, UPDATE, DELETE, SELECT
	 * Transformará los objetos en sentencias SQL y viceversa
	 */
	
	
	public DAOGrupos() {
		//Nada, constructor vacío
	}
	
	//Método para guardar un objeto en la tabla
	public void add(Grupo c) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
//			//Preparamos el objeto Sentencia(Statement)
//			Statement sentencia = conexion.createStatement();		
//			//Preparamos el instert
//			String sql = "INSERT INTO Grupos VALUES(' " +c.getNombre()+ " ' , "+c.getTelefono() + ")";
//			sentencia.executeUpdate(sql);
//			//Cerrar conexión
//			conexion.close();
			
			//De otra manera, usando un PreparedStatement
			String sql = "INSERT INTO Grupos VALUES (?,?)";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setLong(1, c.getIdGrupo());
			sentencia.setString(2, c.getNombre());
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
	public void update(Grupo c) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "UPDATE Grupos SET nombreGrupo = ? WHERE IdGrupo = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setLong(1, c.getIdGrupo());
			sentencia.setString(2, c.getNombre());
			//Ejecuto
			sentencia.executeUpdate();
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Grupo");
			e.printStackTrace();
		}
	}

	//Método para eliminar un objeto en la tabla
	public void remove(Grupo c) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {

			//De otra manera, usando un PreparedStatement
			String sql = "DELETE from Grupos where idGrupo = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setLong(1, c.getIdGrupo());
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
	public ArrayList<Grupo> get() {
		ArrayList<Grupo> lista = new ArrayList<Grupo>();
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Grupos";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
//				new Grupo(resultado.getString("nombre"), resultado.getLong("telefono"));
				lista.add(new Grupo(resultado.getLong("idgrupo"),resultado.getString("nombregrupo")));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Grupo");
			e.printStackTrace();
		}
		
		
		
		return lista;
	}

	//Método para obtener un objeto concreto de la tabla dado su nombre
	public Grupo get(long idProducto) {
		//Variable Grupo
		Grupo c = null;
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Grupos WHERE idGrupo = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setLong(1, idProducto);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				c = new Grupo(resultado.getLong("idgrupo"),resultado.getString("nombregrupo"));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Grupo");
			e.printStackTrace();
		}
		
		
		
		return c;
	}
	
	
}
