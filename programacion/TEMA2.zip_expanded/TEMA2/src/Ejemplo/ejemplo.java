package Ejemplo;
import java.util.Scanner;

public class ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantas veces quieres ver javi malo");
		int num = sc.nextInt();
		int i = 0;
		
		while(i<num){
			System.out.println("javi malo");
			i++;
		}
	}

}
