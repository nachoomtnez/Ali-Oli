package Service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OpenConection {
	public Connection  getNewConnection() throws SQLException{
		
		String usuario = "System";
		String password = "root";
		
		String url = "jdbc:oracle:thin:@localhost:1521/XE";
		String driverClass = "oracle.jdbc.driver.OracleDriver";
		
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
