package Service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
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
				try {
					if (rs.next()) {
						Persona persona1 = new Persona();
						persona1.setNombre(rs.getString("NOMBRE"));
						persona1.setDni(rs.getString("DNI"));
						String apellidos = rs.getString("APELLIDOS");
						persona1.setApellidos(apellidos);
						persona1.setFecha_nacimiento(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
						// persona1.setFecha_nacimiento(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
						
						busqueda.add(persona1);
					}
				} catch(SQLException e) {
					System.out.println("Fallo al ingresar la cadena");
				}
			return busqueda;
		}
		}
		public void insertarPersona(Persona p) throws SQLException {		
			String sql = "INSERT INTO PERSONAS VALUES (?, ?, ?, ?)";
			try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
				stmt.setString(1, p.getDni());
				stmt.setString(2, p.getNombre());
				stmt.setString(3, p.getApellidos());
				stmt.setDate(4, Date.valueOf(p.getFecha_nacimiento()));
				System.out.println(sql);
				stmt.execute();
			}
		}
}

	


