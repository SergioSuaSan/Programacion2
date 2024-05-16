package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Alumno;

public class DAOAlumnos {

	public DAOAlumnos() {
		//Constructor vacío
	}

	//Método para guardar un objeto en la tabla
	public void add(Alumno h) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			//De otra manera, usando un PreparedStatement
			String sql = "INSERT INTO Alumnos VALUES (?,?,?,?,?)";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setInt(1, h.getCodigoAlumno());
			sentencia.setString(2, h.getNombre());
			sentencia.setString(3, h.getApellidos());
			sentencia.setString(4, h.getTelefono());
			sentencia.setDate(5, h.getFechaNacimiento());
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
	public void update(Alumno h) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "UPDATE Alumnos SET Nombre = ?, Apellidos = ?, telefono = ?, fechaNacimiento =? WHERE CodigoAlumno = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setInt(5, h.getCodigoAlumno());
			sentencia.setString(1, h.getNombre());
			sentencia.setString(2, h.getApellidos());
			sentencia.setString(3, h.getTelefono());
			sentencia.setDate(4, h.getFechaNacimiento());
			//Ejecuto
			sentencia.executeUpdate();
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Alumno");
			e.printStackTrace();
		}
	}
	
	
	//Método para eliminar un objeto en la tabla
	public void remove(Alumno h) {
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			//De otra manera, usando un PreparedStatement
			String sql = "DELETE from Alumnos where idAlumno = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Tengo que decirle qué dato va en cada interrogación
			sentencia.setInt(1, h.getCodigoAlumno());
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
	public ArrayList<Alumno> get() {
		ArrayList<Alumno> lista = new ArrayList<Alumno>();
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Alumnos";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
	//			new Alumno(resultado.getString("nombre"), resultado.getString("email"), resultado.getInt("edad"), resultado.getString("poblacion"));
				lista.add(new Alumno(resultado.getInt("CodigoAlumno"), resultado.getString("Nombre"), resultado.getString("Apellidos"), resultado.getString("Telefono"), resultado.getDate("FechaNacimiento")));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Alumno");
			e.printStackTrace();
		}
		
		
		
		return lista;
	}
	
	
	//Método para obtener un objeto concreto de la tabla dado su nombre	
	public Alumno get(int idAlumno) {
		//Variable Alumno
		Alumno h = null;
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Alumnos WHERE CodigoAlumno = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setInt(1, idAlumno);
			
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				h = new Alumno(resultado.getInt("CodigoAlumno"), resultado.getString("Nombre"), resultado.getString("Apellidos"), resultado.getString("Telefono"), resultado.getDate("FechaNacimiento"));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Alumno");
			e.printStackTrace();
		}
		
		
		
		return h;
	}
	
	/*
	//Método para obtener todos los objetos de la tabla
	public ArrayList<Alumno> getAlumnosPorGrupo(String Nombre) {
		ArrayList<Alumno> lista = new ArrayList<Alumno>();
		//Obtener una conexión a la base de datos
		Connection conexion = new DBConnection().getConexion();
		
		try {
			
			// Usando un PreparedStatement
			String sql = "SELECT *  FROM Alumnos where idGrupo = ?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1, Nombre);
			//Ejecuto
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
	//			new Alumno(resultado.getString("nombre"), resultado.getString("email"), resultado.getInt("edad"), resultado.getString("poblacion"));
				lista.add(resultado.getInt("idAlumno"), resultado.getString("nomAlumno"), resultado.getInt("idGrupo"), resultado.getDouble("Precio"));
			}
			//Cerrar conexión
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error actualizando el Alumno");
			e.printStackTrace();
		}
		
		
		
		return lista;
	}

*/
	
	
	
}
