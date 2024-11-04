package Ejercicio_6;
import java.util.Scanner;
public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] palabra = new String[50];
		Scanner sc = new Scanner(System.in);
		
		String palabreo = " ";
		
		String concatenar = " ";
		String concatenar2 = " ";
		
		for(int i = 0; i < 3 ; i++) {
			System.out.println("Introduce una palabra");
			palabreo = sc.nextLine();
			
			palabra[i] = palabreo;
		}
		
		for(int i = 0; i < 3; i++) {
			concatenar = concatenar + palabra[i] + " ";
		
		}
		
		System.out.println(concatenar);
	}

}
