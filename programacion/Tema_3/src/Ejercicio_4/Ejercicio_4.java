package Ejercicio_4;
import java.util.Scanner;

public class Ejercicio_4 {

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
		
		for(int i = num-1 ; i > -1; i--) {
			System.out.print(numero[i]+" ");
		}
	}
	}


