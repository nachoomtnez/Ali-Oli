package Modelo;

import java.math.BigDecimal;

public class Libro_segundaMano extends Libro{
	private Integer antiguedad;

	
	
	public Libro_segundaMano() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Libro_segundaMano(String titulo, String autor, String iSBN, BigDecimal precio,Integer antiguedad) {
		super();
		this.antiguedad = antiguedad;
	}



	@Override
	public BigDecimal getPrecio() {
		return getPrecio().divide(BigDecimal.valueOf(2));
	}



	public Integer getAntiguedad() {
		return antiguedad;
	}



	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}
	

}
