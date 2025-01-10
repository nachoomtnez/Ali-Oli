package Ejercicio_9;
import java.util.Scanner;

public class Ejercicio_9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuantas componentes quiere en el vector?");
		int cont = sc.nextInt();
		sc.nextLine();
		
		String[] vector = new String[cont];
		
		for(int i = 0; i < cont; i++) {
			System.out.println("¿Que palabra quieres meter?");
			vector[i] = vector[i];
		}
		
	   ArrayUtils.impirmirArray(vector,cont);
	}
	
	
}

