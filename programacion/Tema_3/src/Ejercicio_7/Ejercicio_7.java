package Ejercicio_7;

import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce cuantos numeros va a decir: ");
		int num = sc.nextInt();
		
		int[] numero = new int[num];
		int[] numero2 = new int[num];
		
		for(int i = 0; i < num ; i++) {
			System.out.println("Introduzca el numero");
			 numero[i] = sc.nextInt();
			 
			 
		}
		System.out.println("Numeros de mayor a menor");
		
		for(int i = 0 ; i < num; i++) {
			System.out.print(numero[i]+" ");
		}
		
		System.out.println("\n Numeros de menor a mayor");
		
		for(int i = 0; i < num ; i++) {
			numero2[i] = numero[num-i-1];
		}
		
		for(int i = 0; i < num ; i++) {
			
			System.out.print(numero2[i] +" ");
			
		}
	}

}
