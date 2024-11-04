package Ejercicio_11;
import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String[] nombre = new String[50];
		
		System.out.println("Introduce tu nombre completo");
		String nombresito = sc.nextLine();
		
		nombre = nombresito.split(" ");
		
		System.out.println("MY NAME IS...WHAT...MY NAME IS...WHAT...CHIKI CHIKI....");
		
		for( int i = 0; i< nombre.length; i++) {
			System.out.println(nombre[i]);
		}
		
		

	}

}
