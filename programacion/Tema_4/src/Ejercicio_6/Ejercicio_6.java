package Ejercicio_6;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un primer numero");
		int numero1 = sc.nextInt();

		System.out.println("Introduce un segundo numero");
		int numero2 = sc.nextInt();
		
		int suma = Calculadora.suma(numero1,numero2);
		
		System.out.println(suma);
	}

}
