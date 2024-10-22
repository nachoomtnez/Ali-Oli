package Ejercicio12;
import java.util.Scanner;


public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		boolean cmp = false;
		
		while(cmp == false) {
			System.out.println("Introduce un nombre d usuario");
			String user = sc.nextLine().trim().toUpperCase();
			
			int bsq = user.indexOf(' ');
			
			if(user.length()>10 && bsq == -1 ) {
				System.out.println("usuario aceptado");
				cmp = true;
			}else {
				System.out.println("usuario no valido,prueba d nuevo\n");
			}
		}

	}

}
