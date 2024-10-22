package Ejercicio14;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
	
		int i = 0;
		
		System.out.println("Introduzca un numero para ver su tabla de multiplicar: ");
		int num = sc.nextInt();
		sc.close();
		
		while(i <= 10) {
			int mul = num * i;
			System.out.println(num+" x "+i+" = "+mul);
			i++;
		}
	}

}
