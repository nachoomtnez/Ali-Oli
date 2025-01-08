package Ejercicio_7;

import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un primer numero");
		int numero1 = sc.nextInt();

		System.out.println("Introduce un segundo numero");
		int numero2 = sc.nextInt();
		
		
		int resul1 = Calculadora.suma(numero1, numero2);
		int resul2 = Calculadora.resta(numero1, numero2);
		int resul3 = Calculadora.resta(numero1, numero2);
		int resul4 = Calculadora.div(numero1, numero2);
		
		
		
		
	}
	

}
