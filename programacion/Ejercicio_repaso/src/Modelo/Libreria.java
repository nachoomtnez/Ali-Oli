package Modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public class Libreria {
	
	private String nombre;
	private Map<String,Libro> mapa;
	
	public Libreria() {
		mapa = new HashMap<String, Libro>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Map<String, Libro> getMapa() {
		return mapa;
	}
	public void setMapa(Map<String, Libro> mapa) {
		this.mapa = mapa;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(mapa, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libreria other = (Libreria) obj;
		return Objects.equals(mapa, other.mapa) && Objects.equals(nombre, other.nombre);
	}
	
	public BigDecimal getTasacionCompleta() {
		
		BigDecimal tasacion = BigDecimal.ZERO;
		
		Set<Entry<String, Libro>> pares = mapa.entrySet();
		
		for(Entry<String,Libro> par : pares) {
			tasacion = tasacion.add(par.getValue().getPrecio());
		}
		return tasacion;
	}
	
	public BigDecimal getPrecioMedio() {
		return getTasacionCompleta().divide(BigDecimal.valueOf(mapa.size()),2,RoundingMode.HALF_DOWN);
	}
	
	public List<Libro> getLibrosBaratos(){
		
		List<Libro> lista_libro = new ArrayList<>();
		
		Set<Entry<String, Libro>> pares = mapa.entrySet();
		 for(Entry<String,Libro> par : pares) {
			 if(par.getValue().getPrecio().compareTo(BigDecimal.valueOf(10)) < 0) {
				 lista_libro.add(par.getValue());
			 }
		 }
		return lista_libro;
	}
}
