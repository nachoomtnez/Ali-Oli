package Ejercicio13;
import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		
		
		String palabra = "";
		String frase = "";
		
		while(!exit) {
			System.out.println("Introduce una palabra: ");
			palabra = sc.nextLine();
			
			frase = frase + palabra;
			
			if(palabra.equalsIgnoreCase("fin")) {
				System.out.print(frase+" ");
				exit = true;
			}
		}
	}

}
