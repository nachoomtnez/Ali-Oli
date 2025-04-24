package prueba;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Persona;

	public class PersonaService extends OpenConection{
		private OpenConection openConn;
	 
		public PersonaService() {
			openConn = new OpenConection();
	 
		}
	 
		public Persona consultarPersona(String dni) throws SQLException {
			ResultSet rs = null;
	 
			try (Connection conn = getNewConnection(); 
			
					Statement stmt = conn.createStatement()) {
				//Creamos consulta
				String sql = "SELECT * FROM PERSONAS where dni = '" + dni + "'";
				//Ejecutamos sql
				rs = stmt.executeQuery(sql);
	 
				if (rs.next()) {
					Persona persona1 = new Persona();
					persona1.setNombre(rs.getString("NOMBRE"));
					persona1.setDni(rs.getString("DNI"));
					String apellidos = rs.getString("APELLIDOS");
					persona1.setApellidos(apellidos);
					// persona1.setFecha_nacimiento(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
					return persona1;
	 
				} else {
	 
					System.err.println("Error accediendo a BBDD");
					return null;
				}
			}
	 
		}
	}




	