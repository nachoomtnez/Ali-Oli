package Ejercicio_16;
import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una palabra: \n");
		String palabra = sc.nextLine();
		
		for(int i = 0; i < palabra.length(); i++) {
			System.out.println(palabra.charAt(i));
			
			
		}
		sc.close();
		
	}
	
}
