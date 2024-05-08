package prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class PruebaConexionBBDD {
	
	
	public static void main(String[] args) {
		//Probamos la conexion con BBDD mysql
		
		try {
			//Cargar el driver JDBC
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//Conectar con la BBDD
			//Primero preparamos la url de conexion
			String url = "jdbc:mysql://localhost/agenda";
			//Creo el objeto conexion
			Connection conexion = DriverManager.getConnection(url, "root", "");
			
			
			//Ahora lo que vamos a hacer es lanzar sentencias sql
			//Preparamos el objeto Sentencia(Statement)
			Statement sentencia = conexion.createStatement();
			
			//Preparamos el instert
//			String sql = "INSERT INTO contactos VALUES('Javier', 323453454)";
//			sentencia.executeUpdate(sql);
//			String sql = "INSERT INTO contactos VALUES('LUIS', 123456789)";
//			sentencia.executeUpdate(sql);
//			 sql = "INSERT INTO contactos VALUES('María', 987654321)";
//			sentencia.executeUpdate(sql);
			
			//Lanzar un UPDATE
//			String sql = "Update contactos SET telefono = 666666666 WHERE nombre = 'Javier'";
//			sentencia.executeUpdate(sql);
//			String sql = "Update contactos SET nombre = 'Luis' WHERE nombre = 'LUIS'";
//			sentencia.executeUpdate(sql);
			
			//deberíamos hacer un commit para validar los cambios y que se queden guardados.
//			conexion.commit(); //No lo usamos porque tenemos autocommit
			
			//Lanzar un select
			String sql = "SELECT * FROM contactos";
			ResultSet resultado = sentencia.executeQuery(sql);
			
//			resultado.next();  //Avanzo y me situo en la primera tupla
//			System.out.println( resultado.getString("nombre"));
//			System.out.println( resultado.getInt("telefono"));
//			resultado.next();  //Avanzo y me situo en la siguiente tupla
//			System.out.println( resultado.getString(1));
//			System.out.println( resultado.getInt(2));
//			resultado.next();  //Avanzo y me situo en la siguiente tupla
//			System.out.println( resultado.getString(1));
//			System.out.println( resultado.getInt(2));
//			resultado.next();  //Avanzo y me situo en la siguiente tupla
//			System.out.println( resultado.getString(1));
//			System.out.println( resultado.getInt(2));
			
			
			while (resultado.next()) {
				System.out.println( resultado.getString(1) + "  " + resultado.getInt(2));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error cargando el Driver");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en la sentencia SQL");
			e.printStackTrace();
		}
		//hiolkiu
		
	}

}
