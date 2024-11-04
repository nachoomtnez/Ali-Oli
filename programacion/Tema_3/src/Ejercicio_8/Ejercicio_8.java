package Ejercicio_8;

import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce cuantos numeros va a decir: ");
		int num = sc.nextInt();
		
		int[] numero = new int[num];
		
		for(int i = 0; i < num ; i++) {
			System.out.println("Introduzca el numero");
			 numero[i] = sc.nextInt();
			 
		
		}
		
		System.out.println("\n Numeros de menor a mayor");
		for(int i = num-1 ; i > -1; i--) {
			System.out.print(numero[i]+" ");
		}
	}

}
