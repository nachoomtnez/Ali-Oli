package Ejercicio_Repaso_2;

public class Ejercicio_Repaso_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10}; 
		
		
		int media = 0;
		int cont = 0;
		
		for(int contador : listaNotas) {
			if(contador > 5) {
				media = media+contador;
				cont++;
			}
		}
		
		System.out.print("La media es: "+(media/cont));
	}

}
