package Ejercicio_52;

import java.math.BigDecimal;

public class Articulo {
	
	BigDecimal precio;// = new BigDecimal();
	
	private String descripcion;
	
	
	
	
	public Articulo(String descripcion, BigDecimal precio) {
		
		this.descripcion = descripcion;
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	
	public BigDecimal getPrecio() {
		return precio;
	}
	
	@Override
	public String toString() {
		return "Articulo [descripcion=" + descripcion + ", precio=" + precio + "]";
	}
	
	
}
