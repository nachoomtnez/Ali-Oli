package Ejercicio_2_avanzado;
import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = sc.nextInt();
		
		int cont = num;
		
		for(int i = 0; i < num; i++) {
			cont--;
			for(int j = 0; j<num ; j++) {
				if(i == j || j == cont) {
					System.out.print("* ");
				}else {
					System.out.print("- ");
				}
			}
		
			System.out.println();
		}
	}

}
