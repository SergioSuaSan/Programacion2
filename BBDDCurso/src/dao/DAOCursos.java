package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Curso;

public class DAOCursos {

	/*
	 * Gestor encargado de la tabla Cursos
	 * Debería saber hacer un INSERT, UPDATE, DELETE, SELECT
	 * Transformará los objetos en sentencias SQL y viceversa
	 */
	
	
	public DAOCursos() {
		//Nada, constructor vacío
	}
	
	//Método para guardar un objeto en la tabla
	public void add(Curso c) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
//			//Preparamos el objeto Sentencia(Statement)
//			Statement sentencia = conexion.createStatement();		
//			//Preparamos el instert
//			String sql = "INSERT INTO Cursos VALUES(' " +c.getNombre()+ " ' , "+c.getTelefono() + ")";
//			sentencia.executeUpdate(sql);
//			//Cerrar conexión
//			conexion.close();
			
			//De otra manera, usando un PreparedStatement
			String sql = "INSERT INTO Cursos VALUES (?,?,?,?,?,?)";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setInt(1, c.getCodigoCurso());
			sentencia.setString(2, c.getCurso());
			sentencia.setDate(3, c.getFechaInicio());
			sentencia.setDate(4, c.getFechaFin());
			sentencia.setString(5, c.getHoraInicio());
			sentencia.setString(6, c.getHoraFin());
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
	public void update(Curso c) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "UPDATE Cursos SET Curso = ?, FechaInicio = ?, FechaFin = ?, HoraInicio = ?, HoraFin = ? WHERE CodigoCurso = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setInt(6, c.getCodigoCurso());
			sentencia.setString(1, c.getCurso());
			sentencia.setDate(2, c.getFechaInicio());
			sentencia.setDate(3, c.getFechaFin());
			sentencia.setString(4, c.getHoraInicio());
			sentencia.setString(5, c.getHoraFin());
			//Ejecuto
			sentencia.executeUpdate();
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Curso");
			e.printStackTrace();
		}
	}

	//Método para eliminar un objeto en la tabla
	public void remove(Curso c) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {

			//De otra manera, usando un PreparedStatement
			String sql = "DELETE from Cursos where CodigoCurso = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setLong(1, c.getCodigoCurso());
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
	public ArrayList<Curso> get() {
		ArrayList<Curso> lista = new ArrayList<Curso>();
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Cursos ORDER BY idCurso";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
//				new Curso(resultado.getString("nombre"), resultado.getLong("telefono"));
				lista.add(new Curso(resultado.getInt("CodigoCurso"),resultado.getString("Curso"), resultado.getDate("FechaInicio"), resultado.getDate("Fechafin"), resultado.getString("Horainicio"), resultado.getString("Horafin")));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Curso");
			e.printStackTrace();
		}
		
		
		
		return lista;
	}
	
	
	//Método para obtener un objeto concreto de la tabla dado su nombre
	public Curso get(String idProducto) {
		//Variable Curso
		Curso c = null;
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Cursos WHERE nombreCurso = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1, idProducto);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				c = new Curso(resultado.getInt("CodigoCurso"),resultado.getString("Curso"), resultado.getDate("FechaInicio"), resultado.getDate("Fechafin"), resultado.getString("Horainicio"), resultado.getString("Horafin"));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Curso");
			e.printStackTrace();
		}
		
	
	return c;
}


	//Método para obtener un objeto concreto de la tabla dado su nombre
	public Curso get(long idProducto) {
		//Variable Curso
		Curso c = null;
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Cursos WHERE idCurso = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setLong(1, idProducto);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				c = new Curso(resultado.getInt("CodigoCurso"),resultado.getString("Curso"), resultado.getDate("FechaInicio"), resultado.getDate("Fechafin"), resultado.getString("Horainicio"), resultado.getString("Horafin"));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Curso");
			e.printStackTrace();
		}
		
		
		
		return c;
	}
	
	
}
