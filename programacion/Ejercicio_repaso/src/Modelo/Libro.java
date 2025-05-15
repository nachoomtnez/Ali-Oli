package Modelo;

import java.math.BigDecimal;

public abstract class Libro {
	
	private String titulo;
	private String autor;
	private String ISBN;
	private BigDecimal precio;
	
	
	public Libro() {//entre los parentesis van los parametros para rellenar la variable
		this.precio = BigDecimal.ZERO;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public abstract BigDecimal getPrecio();
	
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", precio=" + precio + "]";
	}
	
	
	
}
