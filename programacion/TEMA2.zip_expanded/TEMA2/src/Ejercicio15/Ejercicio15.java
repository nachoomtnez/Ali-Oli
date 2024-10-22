package Ejercicio15;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero que quieras ve rsu tabla: ");
		int numero = sc.nextInt();
		sc.close();
		
		for(int i = 0; i<=10 ; i++) {
			int mul = numero * i;
			System.out.println(numero+" x "+i+" = "+mul);
		}
	}

}
