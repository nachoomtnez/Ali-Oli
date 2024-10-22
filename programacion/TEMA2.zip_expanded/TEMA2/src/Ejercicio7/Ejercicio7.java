package Ejercicio7;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		boolean exito = false;
		
		while(exito == false) {
			System.out.println("Introduzca numero a: ");
			int a = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Introduce un numero para b: ");
			int b = sc.nextInt();
			
			
			if(a==b) {
				System.out.println("jeje salu2");
				exito = true;
			}
			
		}
	}

}
