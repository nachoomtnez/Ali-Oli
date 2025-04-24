package Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Persona;


public class PersonaService extends OpenConection{
		private OpenConection openConn;
		
		public PersonaService() {
			openConn = new OpenConection();
	 
		}
	 
		public List<Persona> buscarPersona(String cadena) throws SQLException {
			ResultSet rs = null;
			List<Persona> busqueda = new ArrayList<>();
	 
			try (Connection conn = getNewConnection(); 
			
					Statement stmt = conn.createStatement()) {
				//Creamos consulta
				String sql = "SELECT * FROM PERSONAS where NOMBRE LIKE '%"+cadena+"%' OR APELLIDOS LIKE '%"+cadena+"%'";
				//Ejecutamos sql
				rs = stmt.executeQuery(sql);
				
				if (rs.next()) {
					Persona persona1 = new Persona();
					persona1.setNombre(rs.getString("NOMBRE"));
					persona1.setDni(rs.getString("DNI"));
					String apellidos = rs.getString("APELLIDOS");
					persona1.setApellidos(apellidos);
					// persona1.setFecha_nacimiento(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
					
					busqueda.add(persona1);
	 
				} else {
	 
					System.err.println("Error accediendo a BBDD");
				}
			}
			return busqueda;
		}
	}

	


