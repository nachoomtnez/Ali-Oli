package Ejercicio_12;
import java.util.Scanner;


public class Ejercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una pagina web");
		String web = sc.nextLine();
		
		
		String[] partes = web.split("://");
		
		System.out.println(partes[0] + "://");
		
		String[] partes2 = partes[1].split("\\.");
		
		
		for(int i = 0; i < web.length(); i++) {
			
			System.out.println(partes2[i]);
		}
		
		
	}

}
