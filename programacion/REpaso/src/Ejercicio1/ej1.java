package Ejercicio1;
import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce tu año de nacimiento");
		int año = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		sc.close();
		
		System.out.println("Tu nombre es "+nombre+" y tu en 2030 tendras "+(2030-año)+"años");
	}

}
