package Ejercicio_7;

import java.math.BigDecimal;

public class Persona {
	
	private String genero;
	private BigDecimal altura;
	
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) throws ParametroIncorrectoException {//Cuando vayamos a lanzar una excepcion tenemos que poner el throws
		
		if(genero.equalsIgnoreCase("h") || genero.equalsIgnoreCase("m")) {
			this.genero = genero;
		}else {
			throw new ParametroIncorrectoException("ERROR PARAMETRO INCORRECTO");
			}
		}
		
	
	public BigDecimal getAltura() {
		return altura;
	}
	
	public void setAltura(BigDecimal altura) throws ParametroIncorrectoException {
		
		if(altura.compareTo(BigDecimal.ZERO) > 0 || altura.compareTo(BigDecimal.valueOf(3)) >= 0) {
			this.altura = altura;
		}else {
			throw new ParametroIncorrectoException("ERROR ALTURA INCORRECTA");
		}
		
	}
	@Override
	public String toString() {
		return   genero + ", altura=" + altura;
	}
	
	
}
