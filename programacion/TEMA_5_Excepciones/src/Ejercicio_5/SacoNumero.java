package Ejercicio_5;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class SacoNumero {
	private List<Integer> numeros;

	public SacoNumero(List<Integer> numero) {
		this.numeros = new ArrayList<>();
	}
	
	public void addNumero(Integer numero) {
		this.numeros.add(numero);
	}
	
	 public Integer getNumero(int posicion) {
	        if (posicion >= 0 && posicion < this.numeros.size()) {
	            return this.numeros.get(posicion);
	        } else {
	            return null;
	        }
	    }
	 

	@Override
	public String toString() {
		return  this.numeros.toString();
	}
	
	
	public BigDecimal division() {
		if(numeros.size() < 2) {
			return BigDecimal.ZERO;
		}
		 BigDecimal resultado = BigDecimal.valueOf(this.numeros.get(0));
	        try {
	            for (int i = 1; i < this.numeros.size(); i++) {
	                BigDecimal divisor = BigDecimal.valueOf(this.numeros.get(i));
	                resultado = resultado.divide(divisor, 2, RoundingMode.HALF_UP);
	            }
	        } catch (ArithmeticException e) {
	            System.out.println("Error: División por cero encontrada. El resultado será igual a cero.");
	            return BigDecimal.ZERO;
	        }

	        return resultado;
		
	}
	
}
