package Ejercicio_9;

public class ArrayUtils {

	public static void impirmirArray(String[] vector1, int conteo) {

		for (int i = 0; i < conteo; i++) {
			System.out.println(vector1[i]);
		}
	}
	
	public static void obtenerPalabra(String[] vector,int contad, int n) {
		
		boolean cmp = false;
		
		for(int i = 0; i < contad; i++) {
			if(i == n) {
				System.out.println(vector[i]);
				cmp = true;
			}
		}
		
		if(cmp == false) {
			
		}
	}
	
	public static void buscarPalabra(String[] vector, int cont, String bsq) {
		
		boolean ext = false;
		
		for(int i = 0; i < cont; i++) {
			if(vector[i].equals(bsq)) {
				System.out.println(i);
				ext = true;
			}
		}
		if(ext = false) {
			System.out.println("-1");
		}
	}
}