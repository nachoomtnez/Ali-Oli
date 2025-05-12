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
		public Persona consultarPersona(String dni1) {
			String sql = "SELECT * FROM PERSONAS";
			try (Connection conn = openConn.getNewConnection(); Statement stm = conn.createStatement()) {
	 
				ResultSet rs = stm.executeQuery(sql);
				while (rs.next()) {
					String dni = rs.getString("DNI");
					String nombre = rs.getString("NOMBRE");
					String apellidos = rs.getString("APELLIDOS");
					if (dni.equalsIgnoreCase(dni1)) {
						Persona p1 = new Persona();
						p1.setDni(dni1);
						p1.setNombre(nombre);
						p1.setApellidos(apellidos);
						p1.setFecha_nacimiento(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
						return p1;
					}
				}
			} catch (SQLException e) {
				System.out.println("Error accediendo a la Base de Datos");
			} finally {
				System.out.println("");
			}
			return null;
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
			//los signos de interrogacion se hacen para meter tantos valores como signos hayas
			String sql = "INSERT INTO PERSONAS VALUES (?, ?, ?, ?)";
			try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
				//metemos en la posicion 1 el dni
				stmt.setString(1, p.getDni());
				//en la dos el nombre
				stmt.setString(2, p.getNombre());
				//en la tres el apellido
				stmt.setString(3, p.getApellidos());
				//en la 4 la fecha de nacimiento
				stmt.setDate(4, Date.valueOf(p.getFecha_nacimiento()));
				System.out.println(sql);
				stmt.execute();
			}
		}
		
		public void insertarPersonas(List<Persona>lista_p) throws SQLException{
			
			
			String sql = "INSERT INTO PERSONAS VALUES (?, ?, ?, ?)";
			try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
				conn.setAutoCommit(false);
				
				try {
					for(Persona p_buc : lista_p) {
						
						//sim llamar al metodo
						stmt.setString(1, p_buc.getDni());
						stmt.setString(2, p_buc.getNombre());
						stmt.setString(3, p_buc.getApellidos());
						stmt.setDate(4, Date.valueOf(p_buc.getFecha_nacimiento()));
						stmt.execute();
						
						/*Pero si hacemos esto tenemos que pasar la conexion al otro metodo
						insertarPersona(p_buc);*/
					}
					conn.commit();
					
					System.out.println(sql);
					
				}
				catch(SQLException e) {
					conn.rollback();
					throw e;
				}
			}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		
		//Ejercicio 9
		
		
		public void borrarPersona(String dni,Connection conn) throws SQLException {//ponemos lo de connection conn cuando un metodo depende de otr
			String sql = "DELETE FROM PERSONAS WHERE DNI = ?";
			try (PreparedStatement stmt = conn.prepareStatement(sql)) {
				stmt.setString(1, dni);
				stmt.executeUpdate();
			} 
		}
		
		
		public Integer borrarPersonaA(String cadena) throws SQLException {
			List<Persona> lista_2 = buscarPersona("");//las dos comillas son para cogerlo todo
			Integer cont = 0;
			
			try(Connection conn = openConn.getNewConnection();){
				conn.setAutoCommit(false);
				try {
					for(Persona p : lista_2) {
						if(2025 - p.getFecha_nacimiento().getYear() >= 18) {
							borrarPersona(p.getDni(),conn);
							cont++;
							conn.commit();
						}
					}
			}catch (SQLException e) {
				conn.rollback();
			}
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
			return cont;
	}
}


	


