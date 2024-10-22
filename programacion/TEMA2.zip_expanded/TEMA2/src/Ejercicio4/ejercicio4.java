package Ejercicio4;
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int aux = 0;
		int num = -1;
		
		
		while(num != 0) {
			System.out.println("Introduce un numero mi rey: (0 pa salir)");
			 num = sc.nextInt();
			
			 aux = aux + num;
		}
		System.out.println("LA suma es: "+aux);
		sc.close();
	}

	
	

}
