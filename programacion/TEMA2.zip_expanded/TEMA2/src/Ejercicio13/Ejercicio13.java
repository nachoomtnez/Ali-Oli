package Ejercicio13;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		String mensaje = sc.nextLine();
		sc.nextLine();
		
		for(int i = 0; i < mensaje.length(); i = i + 5) {
			if(i+5>mensaje.length()) {
				System.out.println(mensaje.substring(i,mensaje.length()));
			}else {
				System.out.println(mensaje.substring(i,i+5));
			}
		}
	}

}
