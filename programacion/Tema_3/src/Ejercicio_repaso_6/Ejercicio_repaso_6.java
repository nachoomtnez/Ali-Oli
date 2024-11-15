package Ejercicio_repaso_6;

public class Ejercicio_repaso_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10}; 
		
		int aux = 0;
			for(int i = 0 ; i < listaNotas.length; i++) {
				
				if( i %2 == 0) {
					
					aux = listaNotas[i]*2;
					System.out.print(aux+" ");
				}else {
					System.out.print(listaNotas[i]+ " ");
				}
			}
	}

}
