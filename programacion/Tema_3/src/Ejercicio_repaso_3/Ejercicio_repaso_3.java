package Ejercicio_repaso_3;
import java.util.Scanner;

public class Ejercicio_repaso_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10}; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Que nota estas buscando?");
		int nota = sc.nextInt();
		
		boolean bsq = false;
		
		for(int busqueda : listaNotas) {
			if(nota == busqueda) {
				System.out.println("Se ha encontado la nota "+nota+" en la posicion "+busqueda);
				bsq = true;
				break;
			}
		}
		if(bsq == false) {
			System.out.println("La nota buscada no existe");
		}
	}

}
