package Ejercicio_Repaso_4;

import java.util.Scanner;

public class Ejercicio_Repaso_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10}; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Que nota estas buscando?");
		int nota = sc.nextInt();
		
		int cont = 0;
		
		for(int busqueda : listaNotas) {
			if(nota > busqueda) {
				cont++;
			}
		}
		System.out.println("hay "+cont+" mayores a la indicada");
	}
}


