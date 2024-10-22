package jerciciorepaso3;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String aux = "",min1 = "", min2= "";
		
		
		System.out.println("Introduce una cidad");
		String ciu1 = sc.nextLine().trim();
		sc.nextLine();
		
		System.out.println("Introduce una cidad");
		String ciu2 = sc.nextLine().trim();
		sc.nextLine();
		
		System.out.println("Introduce una cidad");
		String ciu3 = sc.nextLine().trim();
		sc.close();
		
		if(ciu1.length()<ciu2.length() && ciu1.length()<ciu3.length()) {
			aux = ciu1;
			
			if(ciu2.length()<ciu3.length()) {
				min1 = ciu2;
				min2 = ciu3;
			}else {
				min1 = ciu3;
				min2 = ciu2;
			}
		}else if(ciu2.length()<ciu1.length() && ciu2.length()<ciu3.length()) {
			aux = ciu2;
			
			if(ciu1.length()<ciu3.length()) {
				min1 = ciu1;
				min2 = ciu3;
			}else {
				min1 = ciu3;
				min2 = ciu1;
			}
		}if(ciu3.length()<ciu2.length() && ciu3.length()<ciu1.length()) {
			aux = ciu3;
			
			if(ciu2.length()<ciu1.length()) {
				min1 = ciu2;
				min2 = ciu1;
			}else {
				min1 = ciu1;
				min2 = ciu2;
			}
		}
		System.out.println("La mas chica es "+aux+" ,la segunda es "+min1+" y por ultimo "+min2);
	}

}
