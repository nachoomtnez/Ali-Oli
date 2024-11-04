package Ejercicio_12;
import java.util.Scanner;


public class Ejercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] web_completa = new String[50];
		String[] web_completa2 = new String[50];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una pagina web");
		String web = sc.nextLine();
		
		web_completa = web.split("//");
		web_completa2 = web.split(".");
		
		for(int i = 0; i < web.length(); i++) {
			System.out.println(web_completa[i]);
			System.out.println(web_completa2[i]);
		}
		
		
	}

}
