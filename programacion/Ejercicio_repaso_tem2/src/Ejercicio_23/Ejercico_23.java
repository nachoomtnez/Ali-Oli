package Ejercicio_23;
import java.util.Scanner;
import java.util.Random;

public class Ejercico_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ramdom = new Random();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de veces que quieres lanzar el dado: \n");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			int numeroAleatorio = ramdom.nextInt(1,6);
		
			System.out.println(" El numero que ha salido es: \n"+numeroAleatorio);
		}
	}

}
