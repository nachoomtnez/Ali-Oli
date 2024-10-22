package ejercicio8;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean cmp = false;
		Scanner sc = new Scanner(System.in);
		
		while(cmp == false) {
			System.out.println("Introduce una frase a bb: ");
			String a = sc.nextLine();
			sc.nextLine();
			
			System.out.println("Introduce una frase b amor: ");
			String b = sc.nextLine();
			
			
			if(a.equalsIgnoreCase(b)) {
				System.out.println("Adios.jeje siiu");
				cmp = true;
			}
			
		}
		sc.close();

	}

}
