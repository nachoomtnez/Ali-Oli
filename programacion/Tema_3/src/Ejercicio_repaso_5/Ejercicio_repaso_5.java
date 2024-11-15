package Ejercicio_repaso_5;

import java.util.Scanner;

public class Ejercicio_repaso_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10}; 
		
		int cambio = 5;
		
		for(int imp : listaNotas) {
			if(imp < 5) {
				System.out.print(cambio+ " ");
			}else {
				System.out.print(imp+" ");
			}
		}
	}

}
