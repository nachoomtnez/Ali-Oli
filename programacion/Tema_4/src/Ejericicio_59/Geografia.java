package Ejericicio_59;
import java.util.*;
import java.util.Map.Entry;

public class Geografia {

		private Map<String,String> mapa = new HashMap<>();
		
		
		
		public boolean agregarPais(String pais,String capital) {
			
			boolean estar = false;
			
			pais = pais.toUpperCase();
			
			if(mapa.containsKey(pais)) {
				mapa.put(pais, null);
				
				mapa.put(pais, capital);
				estar = true;
				
			}else {
				mapa.put(pais, capital);
				estar = false;
			}
			
			return estar;
			
		}
		
		public String obtenerCapital(String pais) {
			pais = pais.toUpperCase();
			String capital = "";
			
			Set<Entry<String, String>> pares = mapa.entrySet();
			
			for(Entry<String, String> par : pares) {
				if(par.getKey().equals(pais)) {
					capital = par.getValue();
				}
			}
			return capital;
		}

		public String imprimirPaises() {
			String cadena = "";
			Set<Entry<String, String>> pares = mapa.entrySet();
			
			for(Entry<String, String> par : pares) {
				cadena = cadena + "Pais: "+par.getKey()+" - Capital: "+par.getValue()+"\n";
			}
			
			return cadena;
		}
		
		public void borrarPais(String pais) {
			pais = pais.toUpperCase();
			mapa.remove(pais);
		}
		
		public Double calcularLongitudMediaPaises() {
			
			double suma = 0;
			Set<Entry<String, String>> pares = mapa.entrySet();
			
			for(Entry<String, String> par : pares) {
				suma = suma + par.getValue().length();
			}
			
			return suma/mapa.size();
		}
		
		public void eliminarPaisConCapitalLetra(String letra) {
			Set<Entry<String, String>> pares = mapa.entrySet();
			
			for(Entry<String, String> par : pares) {
				if(par.getKey().startsWith(letra)) {
					
					break;
				}
			}
		}
		
		public Integer numeroPaisConCapitalLetra(String letra) {
			
			Integer numero = 0;
			Set<Entry<String, String>> pares = mapa.entrySet();
			
			for(Entry<String, String> par : pares) {
				if(par.getKey().startsWith(letra)) {
					numero++;
				}
			}
			
			return numero;
		}
		
		public String imprimirNUmeroPaisesLetra(String e) {
			
			String cadena = "";
			Set<Entry<String, String>> pares = mapa.entrySet();
			
			for(Entry<String, String> par : pares) {
				if(par.getKey().startsWith(e)) {
					cadena = cadena + "Pais: "+par.getKey()+" - Capital: "+par.getValue()+"\n";
				}else {
					System.out.println("No hay ningun pais que empiece por esa letra");
				}
			}
			
			return cadena;
		}
		
		public String mismaLetra() {
			Set<Entry<String, String>> pares = mapa.entrySet();
			String cadena = "";
			
			for(Entry<String, String> par : pares) {
				
				String letra = par.getKey().substring(0, 1);
			
				
				if(par.getKey().startsWith(letra) && par.getValue().startsWith(letra)) {
					cadena = cadena + "Pais: "+par.getKey()+" - Capital: "+par.getValue()+"\n";
				}else {
					cadena = "No hay ningun pais que empiece por esa letra";
				}
			}
			return cadena;
		}
}
