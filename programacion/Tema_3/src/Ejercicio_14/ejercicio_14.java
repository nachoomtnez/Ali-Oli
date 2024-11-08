package Ejercicio_14;
import java.util.Scanner;

public class ejercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una palabra: ");
		String palabra = sc.nextLine();
		
		String[] palabraSE = palabra.split(" ");
		
		
		for(String imprimer : palabraSE) {
			System.out.print(imprimer);
		}
		
	}

}
