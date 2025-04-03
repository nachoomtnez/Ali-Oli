package Ejercicio_4;

import java.util.ArrayList;
import java.util.List;

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
	
}
