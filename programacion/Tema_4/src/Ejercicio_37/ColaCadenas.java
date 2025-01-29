package Ejercicio_37;
import java.util.ArrayList;
import java.util.List;

public class ColaCadenas {
	
	private List<String> cola;
	
	
	public ColaCadenas() {
		cola = new ArrayList<>();

	}

	public void añadirCadena(String cadena) {
		cola.add(cadena);
	}
	
	public String sacarCadena() {
		if(!cola.isEmpty()) {
			return cola.remove(0);
		}else {
			return "Cadena vacia";
		}
		
		
	}
	
	public int getTamaño() {
		return cola.size();
	}

	@Override
	public String toString() {
		return "Cola: "+cola.toString();
	}
	
	
}
