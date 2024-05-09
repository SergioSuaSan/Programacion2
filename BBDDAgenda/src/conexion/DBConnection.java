package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private Connection conexion;

	public DBConnection() {
		try {
			//Cargar el driver JDBC
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//Conectar con la BBDD
			//Primero preparamos la url de conexion
			String url = "jdbc:mysql://localhost/agenda";
			//Creo el objeto conexion
			 conexion = DriverManager.getConnection(url, "root", "");
			 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error cargando el Driver");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en la sentencia SQL");
			e.printStackTrace();
		}
		
	}

	public Connection getConexion() {
		return conexion;
	}


	

}
