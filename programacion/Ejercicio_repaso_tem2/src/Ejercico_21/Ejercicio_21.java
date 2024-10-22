package Ejercico_21;
import java.util.Scanner;

public class Ejercicio_21 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		int num = 0;
		
		while(!exit) {
			System.out.println("Introduzca un numero mayor a 0\n");
			num = sc.nextInt();
			
			if(num != 0) {
				exit = true;
			}else {
				System.out.println("Introduce un numero correcto");
			}
		}
		if( exit == true) {
			for(int i = 0; i < num; i++) {
				
				for(int j = 0; j < num; j++) {
					if(i == j) {
						System.out.print("* ");
					}else {
						System.out.print("- ");
					}
				}
				System.out.println();
			}
			
			
		}
	}

}
