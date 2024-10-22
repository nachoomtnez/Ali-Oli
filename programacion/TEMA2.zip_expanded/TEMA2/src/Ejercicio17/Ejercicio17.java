package Ejercicio17;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre ma g");
		String nombre = sc.nextLine();
		sc.close();
		
		for(int i = 0; i<5; i++) {
			System.out.println("Mi nombre es "+nombre+". Linea "+(i+1));
		}
	}

}
