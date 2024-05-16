package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Evaluaciones;

public class DAOEvaluaciones {

	/*
	 * Gestor encargado de la tabla Evaluaciones
	 * Debería saber hacer un INSERT, UPDATE, DELETE, SELECT
	 * Transformará los objetos en sentencias SQL y viceversa
	 */
	
	
	public DAOEvaluaciones() {
		//Nada, constructor vacío
	}
	
	//Método para guardar un objeto en la tabla
	public void add(Evaluaciones c) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
//			//Preparamos el objeto Sentencia(Statement)
//			Statement sentencia = conexion.createStatement();		
//			//Preparamos el instert
//			String sql = "INSERT INTO Evaluaciones VALUES(' " +c.getNombre()+ " ' , "+c.getTelefono() + ")";
//			sentencia.executeUpdate(sql);
//			//Cerrar conexión
//			conexion.close();
			
			//De otra manera, usando un PreparedStatement
			String sql = "INSERT INTO Evaluaciones VALUES (?,?,?,?)";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setInt(1, c.getCodigoAlumno());
			sentencia.setInt(2, c.getCodigoCurso());
			sentencia.setInt(3, c.getNotaFinal());
			sentencia.setString(4, c.getObservaciones());
		
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
	public void update(Evaluaciones c) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "UPDATE Evaluaciones SET NotaFinal = ?, Observaciones = ? WHERE CodigoAlumno = ? AND CodigoCurso= ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setInt(3, c.getCodigoAlumno());
			sentencia.setInt(4, c.getCodigoCurso());
			sentencia.setInt(1, c.getNotaFinal());
			sentencia.setString(2, c.getObservaciones());
			//Ejecuto
			sentencia.executeUpdate();
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Evaluaciones");
			e.printStackTrace();
		}
	}

	//Método para eliminar un objeto en la tabla
	public void remove(Evaluaciones c) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {

			//De otra manera, usando un PreparedStatement
			String sql = "DELETE from Evaluaciones where CodigoAlumno = ? AND CodigoCurso = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setInt(1, c.getCodigoAlumno());
			sentencia.setInt(2, c.getCodigoCurso());
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
	public ArrayList<Evaluaciones> get() {
		ArrayList<Evaluaciones> lista = new ArrayList<Evaluaciones>();
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Evaluaciones ORDER BY idEvaluaciones";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
//				new Evaluaciones(resultado.getString("nombre"), resultado.getLong("telefono"));
				lista.add(new Evaluaciones(resultado.getInt("CodigoAlumno"),resultado.getInt("CodigoCurso"), resultado.getInt("NotaFinal"), resultado.getString("Observaciones")));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Evaluaciones");
			e.printStackTrace();
		}
		
		
		
		return lista;
	}
	
	/*
	//Método para obtener un objeto concreto de la tabla dado su nombre
	public Evaluaciones get(String idProducto) {
		//Variable Evaluaciones
		Evaluaciones c = null;
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Evaluaciones WHERE nombreEvaluaciones = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1, idProducto);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				c = new Evaluaciones(resultado.getLong("idEvaluaciones"),resultado.getString("nombreEvaluaciones"));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Evaluaciones");
			e.printStackTrace();
		}
		
	
	return c;
}


	//Método para obtener un objeto concreto de la tabla dado su nombre
	public Evaluaciones get(long idProducto) {
		//Variable Evaluaciones
		Evaluaciones c = null;
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Evaluaciones WHERE idEvaluaciones = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setLong(1, idProducto);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				c = new Evaluaciones(resultado.getLong("idEvaluaciones"),resultado.getString("nombreEvaluaciones"));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Evaluaciones");
			e.printStackTrace();
		}
		
		
		
		return c;
	}
	*/
	
}
