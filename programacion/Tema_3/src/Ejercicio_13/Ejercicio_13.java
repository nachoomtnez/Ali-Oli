package Ejercicio_13;
import java.util.Scanner;

public class Ejercicio_13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("La palabra a dar la vuelta es: ");
		String palabra = sc.nextLine();
		
		String[] palabraAlreves = palabra.split("");
		
		
		for(int i = palabraAlreves.length - 1; i >= 0 ; i--) {
			System.out.print(palabraAlreves[i]);
		}
		
		System.out.println();
		for(String caracter:palabraAlreves) {
			System.out.print(caracter + " ");
		}
	}
}
