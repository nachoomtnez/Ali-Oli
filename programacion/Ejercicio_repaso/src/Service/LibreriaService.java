package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Modelo.Libro;

public class LibreriaService extends OpenConection{
	private OpenConection openConn;
	
	public LibreriaService() {
		openConn = new OpenConection();
	}
	
	public void insertaLibroNuevo(Libro l) throws SQLException, LibroException {
		String sql="INSERT INTO libros values (?,?,?,?)";
		
		try(Connection conn = getNewConnection();
			PreparedStatement stmt = conn.prepareStatement(sql)){
			
	
				stmt.setString(1, l.getISBN());
				stmt.setString(2, l.getTitulo());
				stmt.setString(3, l.getAutor());
				stmt.setBigDecimal(4, l.getPrecio());
				
				
			}catch(SQLException e){
				throw new LibroException("ERROr");
			}
			
		}
	
	
	public boolean actualizarPrecioLibroNuevo(Libro l) throws SQLException, LibroException {
		boolean actualizacion = false;
		String sql = "UPDATE libro SET precio = ? WHERE ISBN = ?";
		
		try(Connection conn = getNewConnection();
			PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setBigDecimal(1, l.getPrecio());
			stmt.setString(2,l.getISBN());
			
			actualizacion = stmt.execute();
			return actualizacion;
		}catch(SQLException e){
			throw new LibroException("ERROr");
		}
		
	}
}
