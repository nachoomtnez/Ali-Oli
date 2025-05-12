package Service;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import Modelo.Producto_gourmet;



public class ProductoService extends OpenConection{
		private OpenConection openConn;
		
		public ProductoService() {
			openConn = new OpenConection();
	 
		}
		
		public void añadirProducto(Producto_gourmet p) throws SQLException, ProductoInvalidoException {
			String sql = "INSERT INTO productos_gourmet (id,nombre,tipo,precio,disponible) VALUES (?,?,?,?,?)";
			try(Connection conn = openConn.getNewConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)){
				
				if(p.getPrecio().compareTo(BigDecimal.ZERO) <= 0) {
					
					throw new ProductoInvalidoException("El precio debe ser mayor que cero");
				}
				
				
					stmt.setInt(1, p.getId());
					stmt.setString(2,p.getNombre());
					stmt.setString(3, p.getTipo());
					stmt.setBigDecimal(4, p.getPrecio());
					stmt.setBoolean(5, p.getDisponible());
					
					stmt.execute();
				}
				
			}
		
		public void añadirProductos(List<Producto_gourmet>lista_p) throws SQLException{
			String sql = "INSERT INTO productos_gourmet (id,nombre,tipo,precio,disponible) VALUES (?,?,?,?,?)";
			
			try(Connection conn = openConn.getNewConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)){
				
				conn.setAutoCommit(false);
				try {
					
					for(Producto_gourmet p: lista_p) {
						
						stmt.setInt(1, p.getId());
						stmt.setString(2,p.getNombre());
						stmt.setString(3, p.getTipo());
						stmt.setBigDecimal(4, p.getPrecio());
						stmt.setBoolean(5, p.getDisponible());
						
						stmt.execute();//el executeUpdate() se usa cuando te piden cuantas cosas has metido
						conn.commit();
					}
				}catch(SQLException e) {
					conn.rollback();
					throw e;
				}
			}
		}
		
		public List<Producto_gourmet>consultaTipoProductos(String tipo2) throws SQLException, ProductoNoEncontradoException{
			
			List<Producto_gourmet> lista_filtrada = new ArrayList<>();
			
			
			String sql = "SELECT * FROM productos_gourmet where tipo = ?";
			
			try (Connection conn = openConn.getNewConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)){
				
				stmt.setString(1, tipo2);
				ResultSet rs = stmt.executeQuery();//aqui guardamos datos consulta
				
				while(rs.next()) {
					String tip = rs.getString("tipo");
					
					if(tip.equals(tipo2)) {
						Producto_gourmet p1 = new Producto_gourmet();
						
						p1.setId(rs.getInt("id"));
						p1.setNombre(rs.getString("nombre"));
						p1.setTipo(rs.getString("tipo"));
						p1.setPrecio(rs.getBigDecimal("precio"));
						
						lista_filtrada.add(p1);
					}
				}
				
				if(lista_filtrada.isEmpty()) {
					throw new ProductoNoEncontradoException("No hay producto que ternezca a ese tipo");
				}
			}
			
			
			return lista_filtrada;
		}
		
		public void eliminarProductor(Integer id) throws SQLException, ProductoNoEncontradoException {
		
			String sql = "DELETE FROM productos_gourmet where id = ?";
			
			try(Connection conn = openConn.getNewConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)){
				
				stmt.setInt(1,id);
				int filas = stmt.executeUpdate();//nos dice la cantidad de cosas que borramos
				
				if(filas == 0) {//si la cantidad es cero quiere decir que no hay ningun id que cumpla esa condicion
					throw new ProductoNoEncontradoException("No hay ningun producto con ese id");
				
				}
				
			}
		}
		
	public Map<Integer,Producto_gourmet> consultarProductosDisponibles() throws SQLException{
		
		String sql = "SELECT * FROM productos_gourmet where disponible = 1";
		Map<Integer,Producto_gourmet> mapa = new HashMap<>();
		
		try(Connection conn = openConn.getNewConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery()){
			
			
			while(rs.next()) {
				Producto_gourmet p = new Producto_gourmet();
				
					p.setId(rs.getInt("id"));
					p.setNombre(rs.getString("nombre"));
					p.setTipo(rs.getString("tipo"));
					p.setPrecio(rs.getBigDecimal("precio"));
					p.setDisponible(rs.getBoolean("disponible"));
					
				mapa.put(p.getId(), p);
			}
			
		}
		
		
		
		return mapa;
	}
}


	


