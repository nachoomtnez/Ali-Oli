package Ejercicio_2;
import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		System.out.println("INtroduce numero: ");
		int num = sc.nextInt();

		
		int[] tabla = new int[5];
		
		for(int i = 0;i < 5; i++ ) {
			
			tabla[i] = num + i;
			
		}
		for(int i = 0 ; i < tabla.length; i++) {
			
			System.out.println("El numero es "+tabla[i]);
			
		}
		sc.close();
	}

}
