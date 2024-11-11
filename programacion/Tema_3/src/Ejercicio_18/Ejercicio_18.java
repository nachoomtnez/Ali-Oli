package Ejercicio_18;
import java.util.Scanner;

public class Ejercicio_18 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una palabra: ");
		String palabra = sc.nextLine();
		
		String[] word = palabra.split("");
		
		for(String cont : word) {
			System.out.println(cont);
		}
	}
}
