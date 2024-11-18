package Ejercicio_Repaso_2;

public class Ejercicio_Repaso_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10}; 
		
		
		double media = 0.0;
		int cont = 0;
		
		for(int contador : listaNotas) {
			if(contador >= 5) {
				media = media + contador; /*media = 0 + 7 ; media = 7 + 9; media = 16 + 8; media = 24 + 6*/
				cont++;
			}
		}
		
		System.out.print("La media es: "+(media/cont));
	}

}
