package Ejercicio_24;
import java.util.Scanner;

public class Ejercicio_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		boolean exit = false;
		int aux = 0;
		
		while(!exit) {
			System.out.println("Introduce un numero mayor a 0");
			num = sc.nextInt();
			
			if(num != 0) {
				exit = true;
			}else {
				System.out.println("Introduce un numero valido");
			}
		}
		
		for(int i = 1; i < num; i++) {
			
			if(i%2 != 0) {
				aux =aux + i;
				
			}
		
			System.out.print(aux+" ");
		}
		
	}

}
