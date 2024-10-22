package Ejercicio10;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean cd = false;
		
		
		
		String cad1 = "";
		String cad2 = "";
		
		Scanner sc = new Scanner(System.in);
		
		while( cd == false) {
			System.out.println("Introduce una primera cadena: ");
			  cad1 = sc.nextLine();
			sc.nextLine();
			
			System.out.println("Introduce una segunda cadena: ");
			  cad2 = sc.nextLine();
			  sc.close();
			
			if(cad1.isBlank() || cad1.isEmpty() || cad2.isBlank() || cad2.isEmpty() ) {
				cd = false;
			}else {
				
				cd = true;
			}
			
		} 
		
		if (cad1.compareToIgnoreCase(cad2) < 0) {
		    System.out.println("Cadenas en orden alfabético:");
		    System.out.println(cad1);
		    System.out.println(cad2);
		} else {
		    System.out.println("Cadenas en orden alfabético:");
		    System.out.println(cad2);
		    System.out.println(cad1);
		}

	}

}
