 package prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OpenConection {

		public Connection getNewConnection() throws SQLException{
			
			String usuario = "System";
			String password = "Ceu.2025";
			
			String url = "jdbc:oracle:thin@//192.168.56.1:1521/XE";
			String driverClass = "oracle.jbc.drive.OracleDriver";
			
			
			try {
				Class.forName(driverClass);
				
			}catch(ClassNotFoundException e ) {
				System.out.println("No se encuentra el driver JDBC. Revisa su configuración");
				throw new RuntimeException(e);
			}
			Connection conn = DriverManager.getConnection(url,usuario,password);
			return conn;
		}
}
