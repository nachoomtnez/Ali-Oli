package Ejercicio_1_repaso;

public class Ejercicio_1_repaso {
	public static void main(String[] args) {
		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10}; 
		
		int cont = 0;
		
		for(int contador : listaNotas) {
			if(contador < 5) {
				cont++;
			}
		}
		
		System.out.print("El total de alunnos suspensos es: "+cont);
	}
}
