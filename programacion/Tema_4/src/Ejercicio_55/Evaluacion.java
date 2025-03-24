package Ejercicio_55;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Evaluacion {
	Map<String,BigDecimal> mapa = new HashMap<>();
	
	
	public Boolean addNota(String dni, BigDecimal nota) {
		if (!mapa.containsKey(dni)) {
			this.mapa.put(dni, nota);
			return true;
		}
		return false;
	}
 
	public Boolean corregirNota(String dni, BigDecimal nota) {
		Set<Entry<String, BigDecimal>> pares = mapa.entrySet();
		for (Entry<String, BigDecimal> par : pares) {
			if (par.getKey().equals(dni)) {
				mapa.put(dni, nota);
				return true;
			}
		}
		return false;
	}
	
	public int obtenerCantidadAprobados() {
		int cantidad = 0 ;
		
		for(BigDecimal notas: mapa.values()) {
			if(notas.compareTo(BigDecimal.valueOf(5)) >= 0) {
				cantidad++;
			}
		}
		
		return cantidad;
	}
	
	public List<String> obtenerSuspensos(){
		List<String> dni_sus = new ArrayList<>();
		Set<Entry<String,BigDecimal>> pares = mapa.entrySet();
		
		for(Entry<String,BigDecimal> par : pares) {
			if(par.getValue().compareTo(BigDecimal.valueOf(5)) < 0) {
				dni_sus.add(par.getKey());
			}
		}
		return dni_sus;
		
	}
	
	 public void borrarAprobados() {
	        Iterator<Map.Entry<String, BigDecimal>> iterator = mapa.entrySet().iterator();
	        while (iterator.hasNext()) {
	            Map.Entry<String, BigDecimal> entry = iterator.next();
	            if (entry.getValue().compareTo(BigDecimal.valueOf(5)) >= 0) {
	                iterator.remove();
	            }
	        }
	    }

	@Override
	public String toString() {
		Set<Entry<String,BigDecimal>> pares = mapa.entrySet();
		String notasAprobadas = "";
		String notasSuspensas = "";
		
		for(Entry<String,BigDecimal> par : pares) {
			if(par.getValue().compareTo(BigDecimal.valueOf(5)) >= 0) {
				notasAprobadas = notasAprobadas + par+"\n";
			}
		}
		for(Entry<String,BigDecimal> par : pares) {
			if(par.getValue().compareTo(BigDecimal.valueOf(5)) < 0) {
				notasSuspensas = notasSuspensas + par +"\n";
			}
		}
		return "Aprobados: \n"+notasAprobadas+"\n Suspensos: "+notasSuspensas;
		
	}
	
	
}
	

