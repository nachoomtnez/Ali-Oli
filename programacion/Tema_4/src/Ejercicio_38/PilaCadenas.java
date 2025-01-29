package Ejercicio_38;
import java.util.ArrayList;
import java.util.List;

public class PilaCadenas {
private List<String> pila;
	
	
	public PilaCadenas() {
		pila = new ArrayList<>();

	}

	public void añadirCadena(String cadena) {
		pila.add(cadena);
	}
	
	public String sacarCadena() {
		if(pila.isEmpty()) {
			return "Cadena vacia";
			
		}else {
			return pila.remove(pila.size()-1);
		}
		
		
	}
	
	public int getTamaño() {
		return pila.size();
	}

	@Override
	public String toString() {
		return "Pila: "+pila.toString();
	}
	
}
