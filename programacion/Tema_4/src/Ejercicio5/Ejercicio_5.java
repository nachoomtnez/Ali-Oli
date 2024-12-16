package Ejercicio5;
import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un primer numero");
		int numero1 = sc.nextInt();
		
		System.out.println("Introduce un segundo numero");
		int numero2 = sc.nextInt();
		
		int suma = suma(numero1,numero2);
		
		System.out.println(suma);
		sc.close();
		
	}
	
	public static Integer suma(int num1,int num2) {
		int suma = 0;
		
		return suma = num1+num2;
	}

}
