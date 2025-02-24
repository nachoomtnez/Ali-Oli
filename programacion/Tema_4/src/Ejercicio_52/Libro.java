package Ejercicio_52;

import java.math.BigDecimal;

public class Libro extends Articulo{
	
	private String autor;
	
	

	public Libro(String autor,String descripcion, BigDecimal precio) {
		super(descripcion, precio);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	

	@Override
	public String toString() {
		return "Libro [autor=" + autor + "]";
	}
	
	
}
