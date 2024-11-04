package Ejercicio_5;

import java.util.Scanner;

class Ejercicio_5 {

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
		int max = numero[0];
		int min = numero[0];
		
		for(int i = num-1 ; i > -1; i--) {
			System.out.print(numero[i]+" ");
		}
		
		for(int i = num; i < num; i++) {
			if(numero[i] > max) {
				max = numero[i];
				
			}else if(numero[i] < min) {
				min = numero[i];
				
			}
		}
		
		System.out.println("EL mayor es "+max+"y el minimo es"+min);
	}

}
