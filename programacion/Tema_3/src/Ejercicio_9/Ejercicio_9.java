package Ejercicio_9;

import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce cuantos numeros va a decir: ");
		int num = sc.nextInt();
		
		int[] numero = new int[num];
		
		int max = 0;
		
	
		
		for(int i = 0; i < num ; i++) {
			System.out.println("Introduzca el numero");
			 numero[i] = sc.nextInt();
			 
			
		}
		
		for(int i = 0 ; i < num; i++) {
			System.out.print(numero[i]+" ");
		}
		
		for(int i = 0; i < numero.length-1 ; i++) {
			for(int j = i+1; j < numero.length-1; j++) {
				if ( numero[i]> numero[j]) {
					max = numero[i];
					numero[i] = numero[j];
					numero[j] = max;
					
				}
				
			}

	
		}
		
		for(int i = 0; i < numero.length; i++) {
			System.out.print(numero[i]+ " ");
		}
		sc.close();
	}

}
